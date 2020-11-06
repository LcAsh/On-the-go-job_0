package com.db.stu;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.Vector;

public class Student {
    private  int id;
    private  String name;
    private  String sex;
    private  String date;
public Student(){
    id = 0;
    name = "无名氏";
    sex="未知";
    date="0000";
}
    public Student (int Id, String Name, String Sex, String d){
        id = Id;
        name = Name;
        sex = Sex;
        date = d;
    }
    //来自object基类的重载
    public String toString(){
        return "学号："+id+ "姓名：" +name+ "性别：" +sex + "生日："+ date;
    }
    public static void  main(String[] args) {
        Student stu = new Student();
        //Student stu = new Graduate();
        Student stu1 = new Student();
        Set<Student> setStu = new HashSet<Student>();
        stu1.setId(123);
                setStu.add(stu);
                setStu.add(stu1);
        Vector<Student> vecStu =  new Vector<Student>();
        vecStu.add(stu);
        vecStu.add(stu1);
        System.out.println("Set Size:"+setStu.size());
        System.out.println("Set Size:"+vecStu.size());
                //System.out.println(stu);
        int n = 10,m = 3;
        System.out.println(setStu.size());
        for (int i = 0; i < n; i++) {
            Student stu2 = new Student(i,"张"+i,i%2==0?"男":"女","20201015");
            vecStu.add(stu2);
        }
        int pos = 0;
        for (int i = 0; i < n-1; i++) {
            pos = (pos+m-1)%vecStu.size();
            //删除指定位置的元素，并且把后面一个元素向前移动
            vecStu.removeElementAt(pos);
        }
        System.out.println("获胜者为："+vecStu.get(0));
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id &&
                Objects.equals(name, student.name) &&
                Objects.equals(sex, student.sex) &&
                Objects.equals(date, student.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, sex, date);
    }
}
