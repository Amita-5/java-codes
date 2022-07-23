class employee{
    String empName;
    int empId;
}

public class custom_class {
    public static void main(String[] args) {
    employee shruti = new employee();
    shruti.empId = 100;
    shruti.empName= "rohan";
    System.out.println(shruti.empId+ " " +shruti.empName);
    }
}
