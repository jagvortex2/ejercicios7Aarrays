package ejercicios;

/**
 * Created by Jhonatan on 08/05/2015.
 */
public class TestingEmployeeArray {
    public static void main(String[] args){
        Employee[] someEmps = new Employee[5];
        for(int a = 0; a < someEmps.length; ++a)
        {
          someEmps[a] = new Employee();
        }

       setPropertiesToEmployees(someEmps);

        getEmployeesData(someEmps);

        bubbleSort(someEmps);
        System.out.println();
        getEmployeesData(someEmps);
    }



    public static void setPropertiesToEmployees(Employee[] setEmps){
        for(int a = 0; a <setEmps.length; ++a)
        {
            setEmps[a].setEmpNum(a + 1);
        }
        //asignar de forma manual los nombres de cada empleado del array
        setEmps[0].setFirstName("juan");
        setEmps[1].setFirstName("manolo");
        setEmps[2].setFirstName("pancho");
        setEmps[3].setFirstName("jesus");
        setEmps[4].setFirstName("maria");


        //asignar de forma manual los salarios de cada empleado del array
        setEmps[0].setSalary(666.66);
        setEmps[1].setSalary(475.00);
        setEmps[2].setSalary(225.01);
        setEmps[3].setSalary(950.00);
        setEmps[4].setSalary(845.50);

        setEmps[0].setLastName("Gonzalez");
        setEmps[1].setLastName("Campos");
        setEmps[2].setLastName("Arce");
        setEmps[3].setLastName("Bernal");
        setEmps[4].setLastName("Lopez");
    }

    public static void bubbleSort(Employee[] array){
        int a, b;
        Employee temp;
        int highSusbcript = array.length - 1;

        for(a = 0; a < highSusbcript; ++a)
            for(b = 0; b < highSusbcript; ++b)
                if(array[b].getSalary() > array[b + 1].getSalary())
                {
                    temp = array[b];
                    array[b] = array[b + 1];
                    array[b + 1] = temp;
                }
    }


    public static void getEmployeesData(Employee[] emps2){
        for(int a = 0; a < emps2.length; ++a)
            System.out.print(emps2[a].getEmpNum() + " " + emps2[a].getFirstName() + " " +
            emps2[a].getLastName() + " " + emps2[a].getSalary() + "\n");
        System.out.println();
    }
}
