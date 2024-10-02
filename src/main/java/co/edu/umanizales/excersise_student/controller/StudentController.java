package co.edu.umanizales.excersise_student.controller;

import co.edu.umanizales.excersise_student.model.Student;
import co.edu.umanizales.excersise_student.model.StudentStatistics;
import co.edu.umanizales.excersise_student.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/students")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @GetMapping("/list")
    public List<Student> getStudents() {
        return studentService.getStudents();
    }

    @PostMapping("/add")
    public String addStudent(@RequestBody Student student) {
        studentService.getStudents().add(student);
        return "Estudiante añadido exitosamente";
    }
    @GetMapping("/porcentagemales")
    public float getPercentage() {
        return studentService.getPercentageMales();
    }
    @GetMapping("/porcentagefemale")
    public float getPercentageFemale() {
        return studentService.getPercentageFemales();
    }
    @GetMapping("/percentagemalework")
    public StudentStatistics getStudentStatistics() {
        float percentage = studentService.getPercentageMales();
        float prom = studentService.getPromMaleSalary();
        float percentageFemale = studentService.getPercentageFemales();
        float promfemale = studentService.getPromFemaleSalary();

        return new StudentStatistics(percentage, prom, percentageFemale, promfemale);
    }




}
