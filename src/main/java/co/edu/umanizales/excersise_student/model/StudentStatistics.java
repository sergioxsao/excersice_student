package co.edu.umanizales.excersise_student.model;
import lombok.AllArgsConstructor;
import lombok.Data;
@Data
@AllArgsConstructor
public class StudentStatistics {
    private float percentageMalesWork;
    private float promMaleSalary;
    private float promFemaleSalary;
    private float percentageFemalesWork;

    public StudentStatistics(float percentage, float prom) {
        this.percentageMalesWork = percentage;
        this.promMaleSalary = prom;
    }


}


