import entity.Employee;

public class Main {
    public static void main(String[] args) {
        List<Employee> employee = new LinkedList<>();
        employee.add(new Employee(1,"Ali", "Ali"));
        employee.add(new Employee(2,"Ali2", "Ali2"));
        employee.add(new Employee(2,"Ali3", "Ali3"));
        employee.add(new Employee(3,"Ali4", "Ali4"));
        employee.add(new Employee(3,"Ali5", "Ali5"));
        employee.add(new Employee(3,"Ali6", "Ali6"));
        employee.add(new Employee(4,"Ali7", "Ali7"));


        Map<Integer, Employee> employeeMap= new HashMap<>();
        List<Employee> removedList = new List<>();

        Iterator<Employee> iterator= employee.iterator();
        while(iterator.hasNext()){
            if(employee == null){
                System.out.println("Null var tekrar dende");
                continue;
            }

           if(employeeMap.containsKey(employee.getId())){
               removedList.add(employee1);
           iterator.remove();
            }
           else {
               employeeMap.put(employee.getId(), employee);
           }
            System.out.println(employee);
        }
    }
}