import java.sql.SQLOutput;
import java.util.*;
import java.util.stream.Collectors;

public class XcT {


    //10,15,55,32,17,88,null
    public static void main(String[] args)
    {
        List<Integer> list =Arrays.asList(10,15,55,32,17,88,null);
        list.stream().filter(i->(i!=null && Integer.toString(i).startsWith("1"))).forEach(System.out::println);
   /*class: Employee
variables: empId, empName, salary, department
Group employees by department.
Find the highest paid employee per department.*/

        List<EmployeeX> emp =new ArrayList<>();
        emp.add(new EmployeeX("Alok",1,432435,"eng"));
        emp.add(new EmployeeX("Ama",6,430035,"hr"));
        emp.add(new EmployeeX("Ram",121,2435,"hr"));
        emp.add(new EmployeeX("Rama",10,35,"eng"));
       // System.out.println(emp.stream().collect(Collectors.groupingBy(EmployeeX::getDep)));
       Map<String,List<EmployeeX>> map = emp.stream().collect(Collectors.groupingBy(EmployeeX::getDep));
       map.entrySet().stream().forEach(i->
       {
          // i.getValue();
           //System.out.println(i.getValue());
           int[] ma =new int[1];
           ma[0] =Integer.MIN_VALUE ;
           i.getValue().stream().forEach(k->{

               if(ma[0]<k.getSalary())
               {
                   ma[0]=k.getSalary();
               }
           });
         //  System.out.println("For department==>"+""+i.getKey()+"  gretest salary is "+ma[0]);
       });

        //System.out.println(emp.stream().collect(Collectors.groupingBy(EmployeeX::getDep,Collectors.maxBy(Comparator.comparingInt(EmployeeX::getSalary)))));
        emp.stream().collect(Collectors.groupingBy(EmployeeX::getDep,Collectors.maxBy(Comparator.comparingInt(EmployeeX::getSalary))));
        System.out.println( emp.stream().collect(Collectors.groupingBy(EmployeeX::getDep,Collectors.maxBy(Comparator.comparingInt(EmployeeX::getSalary)))));
        emp.stream().collect(Collectors.groupingBy(EmployeeX::getDep,Collectors.maxBy(Comparator.comparingInt(EmployeeX::getSalary)))).forEach((e,optDept)->
        {
            System.out.println("Alok");
            System.out.println(e);
            System.out.println("Mishra");
            System.out.println(optDept.get().getSalary());


        });


    }
}

class EmployeeX
{
    private int empId;

    public EmployeeX(String empName, int empId, int salary, String dep) {
        this.empName = empName;
        this.empId = empId;
        this.salary = salary;
        this.dep = dep;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDep() {
        return dep;
    }

    public void setDep(String dep) {
        this.dep = dep;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof EmployeeX employeeX)) return false;
        return empId == employeeX.empId && salary == employeeX.salary && Objects.equals(empName, employeeX.empName) && Objects.equals(dep, employeeX.dep);
    }

    @Override
    public int hashCode() {
        return Objects.hash(empId, empName, salary, dep);
    }

    @Override
    public String toString() {
        return "EmployeeX{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", salary=" + salary +
                ", dep='" + dep + '\'' +
                '}';
    }

    private String empName;
    private int salary;
    private String dep;

}
