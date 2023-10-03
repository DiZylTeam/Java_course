package Java_course;// 1. Продумайте структуру класса Кот. Какие поля и методы будут актуальны для приложения, которое является
// а) информационной системой ветеринарной клиники
// б) архивом выставки котов
// в) информационной системой Театра кошек Ю. Д. Куклачёва

// Можно записать в текстовом виде, не обязательно реализовывать в java.

import java.util.ArrayList;
import java.util.Date;

public class Cat {
    private static int id = 0;
    private String name;
    ArrayList<String> vaccines;
    private String breed;
    private int age;
    private Date date;
    private String sex;
    private Boolean state;

    public Cat(String name, ArrayList<String> vaccines, String breed, int age, Date date, String sex, boolean state) {
        this.name = name;
        this.vaccines = vaccines;
        this.breed = breed;
        this.age = age;
        this.date = date;
        this.sex = sex;
        this.state = state;
        id++;
    }

//    public static int getId() {
//        return id;
//    }
//
//    public static void setId(int id) {
//        Cat.id = id;
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<String> getVaccines() {
        return vaccines;
    }

    public void setVaccines(ArrayList<String> vaccines) {
        this.vaccines = vaccines;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setState(Boolean state) {
        this.state = state;
    }


    public boolean getState() {
        return state;
    }

    @Override
    public String toString() {
        return "Cat {" +
                "name='" + name + '\'' +
                ", vaccines=" + vaccines +
                ", breed='" + breed + '\'' +
                ", age=" + age +
                ", date=" + date +
                ", sex='" + sex + '\'' +
                ", state=" + state +
                '}';
    }
}


