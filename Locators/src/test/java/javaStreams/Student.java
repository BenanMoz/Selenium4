package javaStreams;

public class Student {
    int id;
    String name;
    Gender type;


public Student(int x,String name,Gender y) {
this.id = x;
this.name = name;
this.type=y;

}

int getId()
{
    return id;
}

String getName(){
    return name;
}

Gender getGender(){
    return type;
}

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", type=" + type +
                '}';
    }
}
