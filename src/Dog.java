public class Dog {
    private int age;
    private String name;
    private String color;

    public Dog(int age, String name, String color) {
        this.age = age;
        this.name = name;
        this.color = color;
    }

    public int getAge(){
        return age;
    }

    public String getName(){
        return name;
    }

    public String getColor(){
        return color;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String setName(String name) {
        this.name = name;
        return name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    private void addOneAge(){
        age++;
    }

    public int birthday(){
        addOneAge();
        return age;
    }

    public String toString(){
        return "The dog is named " + name + " and is " + age + " years old. This dog is " + color + ".";
    }
    // "The dog is named Marlo and is 5 years old. This dog is black."
}

