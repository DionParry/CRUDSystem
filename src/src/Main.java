import java.sql.Connection;

public class Main {
    public static void main(String[] args) {
//        Connection connection = connectionFactory.getConnection();
        Student student = new Student("Dion", "Parry", 22);

        System.out.println("Name: " + student.getName());

        student.setName("Craig");

        System.out.println("Name: " + student.getName());


    }
}
