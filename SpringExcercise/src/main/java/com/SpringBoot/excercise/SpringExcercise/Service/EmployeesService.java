package com.SpringBoot.excercise.SpringExcercise.Service;

import com.SpringBoot.excercise.SpringExcercise.Model.EmployeesModel;
import com.SpringBoot.excercise.SpringExcercise.Repository.EmployeesRepository;
import com.fasterxml.jackson.databind.util.ArrayIterator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
@Component
public class EmployeesService {
    private List<EmployeesModel> list=new ArrayList<>();
    EmployeesService(){
        list=EmployeesRepository.getList();
    }

    public List<EmployeesModel> getAll(){
        return list;
    }
    public EmployeesModel getOne(int id){
        for(EmployeesModel employeesModel:list){
            if(employeesModel.getId()==id)
                return employeesModel;
        }
        return null;
    }
    public EmployeesModel addUser(EmployeesModel employeesModel){
        int a=list.size();
        if((Integer)employeesModel.getId()==null){
            employeesModel.setId(++a);
        }
        list.add(employeesModel);
        return employeesModel;
    }
    public EmployeesModel deleteUser(int id){
        Iterator<EmployeesModel> iterator=list.iterator();
        while(iterator.hasNext()){
            EmployeesModel employeesModel= iterator.next();
            if(employeesModel.getId()==id){
                iterator.remove();
                return employeesModel;
            }
        }
        return null;

    }

    public void updateRecord(int id, EmployeesModel employeesModel) {
        Iterator<EmployeesModel> iterator=list.iterator();
        while (iterator.hasNext()){
           EmployeesModel employeesModel1=iterator.next();
            if(employeesModel.getId()==id){
                employeesModel.setId(employeesModel.getId());
                employeesModel1.setName(employeesModel.getName());
                employeesModel1.setAge(employeesModel.getAge());
            }
        }
    }
}
