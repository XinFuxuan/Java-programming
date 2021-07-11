package day61_exceptions_collections;

public class ElementaryStudents {
    private String name;
    private int age;

    public ElementaryStudents(){ // sometimes we just have an empty constructor, since we already added contructor we will need to add empty manuelly

    }

    public ElementaryStudents(String name, int age) {
       setName(name);
       setAge(age);

    }

    @Override
    public String toString() {
        return "ElementaryStudents{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name == null || name.isEmpty()){ // always check if string is null first on the left
            throw new IllegalArgumentException("Name cannot be empty or null");

        }else{
            this.name = name;
        }

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age<5 || age>12){
            throw new IllegalArgumentException("Age cannot be less than 5, or greater than 12");

        }else {
            this.age = age;
        }
    }
}
