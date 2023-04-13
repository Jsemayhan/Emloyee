package ayhan.service;

import ayhan.model.Devoloper;
import ayhan.util.SalaryCalculation;

public class DevoloperService extends SalaryCalculation {
    @Override
    public double calculateSalary(int workExperience, double defaultsalary) {
if(workExperience>=5)
{
    double salary = defaultsalary / 2*3;
return salary;
}
        return 0;
    }
    public Devoloper getDevoloperInfo(String name,
                                      int age,
                                      int workExperience,
                                      double defalultsalary){
Devoloper devoloper=new Devoloper();
devoloper.setName(name);
devoloper.setAge(age);
devoloper.setWorkExperience(workExperience);
double devSalary = calculateSalary(workExperience,defalultsalary);
devoloper.setSalary(devSalary);
return devoloper;
    }
}
