package com.SpringBoot.excercise.SpringExcercise.Model;
//Create an Employee Bean(id, name, age) and service to  perform different operations related to employee.

import com.SpringBoot.excercise.SpringExcercise.Repository.EmployeesRepository;
import com.SpringBoot.excercise.SpringExcercise.Service.EmployeesService;

import javax.validation.constraints.Size;
import java.util.List;

public class EmployeesModel {
    private int id;
    @Size(min=2)
    private  String name;
    private int age;
    /*private List<EmployeesModel> list;
    private EmployeesRepository employeesRepository;*/
    public EmployeesModel(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
    public EmployeesModel()
    {

    }


    /*public EmployeesModel(){
        list=employeesRepository.getList();
    }*/

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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employees{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
