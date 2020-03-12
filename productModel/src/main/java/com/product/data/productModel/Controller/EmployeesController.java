package com.product.data.productModel.Controller;

import com.product.data.productModel.Model.EmployeesModel;
import com.product.data.productModel.Repository.EmployeesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class EmployeesController {
    List<EmployeesModel> list=new ArrayList<>();

    @Autowired
    EmployeesRepository employeesRepository;

    @GetMapping("/create")
    public List<EmployeesModel> addUser(){
        EmployeesModel employeesModel=new EmployeesModel();
        EmployeesModel employeesModel1=new EmployeesModel();
        EmployeesModel employeesModel2=new EmployeesModel();
        employeesModel.setName("ankit");
        employeesModel.setId(001);
        employeesModel.setAge(29);
        employeesModel.setLocation("Delhi");
        employeesRepository.save(employeesModel);
        list.add(employeesModel);
        employeesModel1.setName("himanshu");
        employeesModel1.setId(002);
        employeesModel1.setAge(25);
        employeesModel1.setLocation("Noida");
        employeesRepository.save(employeesModel1);
        list.add(employeesModel1);
        employeesModel2.setName("neha");
        employeesModel2.setId(005);
        employeesModel2.setAge(20);
        employeesModel2.setLocation("Delhi");
        employeesRepository.save(employeesModel2);
        list.add(employeesModel2);
        return list;
    }

    @PostMapping("/update")
    public EmployeesModel updateUser(EmployeesModel employeesModel){
        employeesRepository.save(employeesModel);
        return employeesModel;
    }

    @GetMapping("/delete/{id}")
    public void deleteUser(@PathVariable int id){
        employeesRepository.deleteById(id);
    }


    @GetMapping("/read")
    public Iterable<EmployeesModel> readUser(){
        return employeesRepository.findAll();
    }

    @GetMapping("/sortage")
    public void sortAge(){
        Pageable pageable= PageRequest.of(0,2, Sort.Direction.DESC, "age");
        employeesRepository.findAll(pageable).forEach(p-> System.out.println(p.getName()));
    }

    @GetMapping("/count")
    public String countTotal(){
    return "Total emplooyees are: "+employeesRepository.count();
    }


    @GetMapping("/findName/{name}")
    public List<EmployeesModel> findName(@PathVariable String name){
        return employeesRepository.findByName(name);
    }

    @GetMapping("/findAlike")
    public List<EmployeesModel> findALike(){
        return employeesRepository.findByNameLike("A%");
    }

    @GetMapping("/findAgeBetween")
    public List<EmployeesModel> findagebetn(){
        return employeesRepository.findByAgeBetween( 28, 32);
    }
}
