package by.belhard.j26.lessons.lesson12.jdbcExample;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class JdbcExample {

    private static final String INSERT_NEW_EMPLOYEE =
            "insert into employees value (null, '%s', date(now()), 1)";
    private static final String INSERT_NEW_EMPLOYEE2 =
            "insert into employees value (null, ?, date(now()), ?)";

    public static void main(String[] args) throws SQLException {

        String url = "jdbc:mysql://localhost:3306/bh26?serverTimezone=UTC";
        String username = "root";
        String password = "root";

        Connection connection = DriverManager.getConnection(url, username, password);
        String name = "Vasily";
        int department = 1;

        //
        /*try (BufferedReader rdr = new BufferedReader(new InputStreamReader(System.in))) {
            name = rdr.readLine();
            department = Integer.parseInt(rdr.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }*/

        //

        /*PreparedStatement statement = connection.prepareStatement(INSERT_NEW_EMPLOYEE2);
        statement.setString(1, name);
        statement.setInt(2, department);

        int i = statement.executeUpdate();

        System.out.println(i); */

        //
        List<Employee> employeeList = new ArrayList<>();

        Statement statement = connection.createStatement();

        ResultSet resultSet = statement.executeQuery(
                "select e.id as 'eid', e.name, e.date, " +
                        "d.id as 'did', d.department as 'dep', d.salary" +
                        " from employees e left join departments d" +
                        " on e.department_id = d.id" +
                        " order by name;");

        while (resultSet.next()) {
            int emplId = resultSet.getInt("eid");
            String employeeName = resultSet.getString("name");
            java.util.Date date = resultSet.getDate("date");
            int departmentId = resultSet.getInt("did");
            String departmentName = resultSet.getString("dep");
            int salary = resultSet.getInt("salary");

            Department departmentEntity = new Department(departmentId, departmentName, salary);
            Employee employee = new Employee(emplId, employeeName, date, departmentEntity);

            employeeList.add(employee);
        }

//        employeeList.forEach(e -> System.out.println(e));
        employeeList.forEach(System.out::println);

        Employee employee1 = employeeList.get((int)
                Math.floor(Math.random() * employeeList.size()));
        Employee employee2 = employeeList.get((int)
                Math.floor(Math.random() * employeeList.size()));

        System.out.println();
        System.out.println(employee1);
        System.out.println(employee2);
        System.out.println(employee1.getDepartment().equals(employee2.getDepartment()));
    }
}
