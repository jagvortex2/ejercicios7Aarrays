package ejercicios;

/**
 * Created by Jhonatan on 08/05/2015.
 */
public class Employee {

    private int empNum;
    private String lastName;
    private String firstName;
    private double salary;

    //metodo para mostrar el numero de empleado
    public int getEmpNum(){
        return empNum;
    }

    //metodo para asigmar numero de empleado
    public void setEmpNum(int empNum){
        this.empNum = empNum;
    }

    //metodo para mostrar el apellido
    public String getLastName(){
        return lastName;
    }

    //metodo para asignar apellido
    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    //metodo para mostrar apellido
    public String getFirstName(){
        return firstName;
    }

    //metodo para asignar nombre
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    //metodo para mostrar el salario
    public double getSalary(){
        return salary;
    }

    public void setSalary(double salary){
        this.salary = salary;
    }
}
