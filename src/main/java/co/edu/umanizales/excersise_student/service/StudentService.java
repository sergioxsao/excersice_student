package co.edu.umanizales.excersise_student.service;

import co.edu.umanizales.excersise_student.model.Student;
import jakarta.annotation.PostConstruct;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Data
@Service
public class StudentService {
    private ArrayList<Student> students;

    //private Student[]

    @PostConstruct
    public void init(){
        //students = new Student[50];
        students = new ArrayList<>();


        Student valentinaV= new Student("1053678456",
                "valentina Vargas",(byte)1,(byte)1, 2500000);
        //students[3] = valentinaV;
        students.add(valentinaV);

        students.add(new Student("137873","Yeison Gonzales",
                (byte)0,(byte)1, 5500000));


    }
    public float getPercentageMales(){
        int contMales = 0;
        for (Student student : students) {
            if(student.getGender()==0){
                contMales++;
            }
        }
        return (float)contMales/students.size();
    }

    public float getPercentageFemales(){
        int contFemales = 0;
        for (Student student : students) {
            if(student.getGender()==1){
                contFemales++;
            }
        }
        return (float)contFemales/students.size();
    }

    public float getPercentageMalesWork(){
        int contMalesWork = 0;

        for (Student student : students) {
            if(student.getGender()==0 && student.getWork()==1){
                contMalesWork++;
            }
        }
        return (float)contMalesWork/students.size();
    }
    public float getPromMaleSalary(){
        float contMaleSalary = 0;
        float promMaleSalary = 0;
        for (Student student : students) {
            if(student.getGender()==0 && student.getWork()==1){
                contMaleSalary++;
                promMaleSalary += student.getSalary();
            }
        }
        return promMaleSalary/contMaleSalary;
    }
    public float getPromFemaleSalary(){
        float contFemaleSalary = 0;
        float promFemaleSalary = 0;
        for (Student student : students) {
            if(student.getGender()==1 && student.getWork()==1){
                contFemaleSalary++;
                promFemaleSalary += student.getSalary();
            }
        }
        return promFemaleSalary/contFemaleSalary;
    }

}

