public class Employee {
    private int employee_id;
    private String employee_name;
    private int employee_salary;
    public String str= Integer.toString(employee_salary);

    public void setEmployee_id(int employee_id){
        this.employee_id=employee_id;
    }
    public int getEmployee_id(){
        return employee_id;
    }
    public void setEmployee_name(String employee_name){
        this.employee_name=employee_name;
    }
    public String getEmployee_name(){
        return employee_name;
    }
    public void setEmployee_salary(int employee_salary){
        this.employee_salary=employee_salary;
    }
    public String getEmployee_salary(){
        return str.formatted();
    }

    public void Employeemethod(){
        System.out.println(employee_id + "," + employee_name + "," + employee_salary );
    }
}
