package com.ttn;

import com.google.gson.Gson;

class Employee{
    int id;
    String name;

    Employee(String name,int id){
        this.name=name;
        this.id=id;
    }
}
public class GsonExample {
    public static void main(String[] args) {
        Gson gson=new Gson(); // dependencies which i have included
        Employee employee=new Employee("Zaid",12);
        String result=gson.toJson(employee);
        System.out.println(result);
    }

}
