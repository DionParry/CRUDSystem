public class Student {
    private String name;
    private String surname;
    private int age;

    public Student(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String n) {
        name = n;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurnname(String s) {
        surname = s;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int a) {
        age = a;
    }

    public String toString() {
        return "[name: " + name + " surname: " + surname + "age: " + age + "]";
    }
}
