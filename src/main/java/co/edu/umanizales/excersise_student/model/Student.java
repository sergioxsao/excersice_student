package co.edu.umanizales.excersise_student.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Student {
    private String identification;
    private String name;
    private byte gender;
    private byte work;
    private double salary;


}
