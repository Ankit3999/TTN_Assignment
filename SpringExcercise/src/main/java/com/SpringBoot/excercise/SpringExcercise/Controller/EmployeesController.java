package com.SpringBoot.excercise.SpringExcercise.Controller;
//Create a simple REST ful service in Spring Boot which returns the Response "Welcome to spring boot".
import com.SpringBoot.excercise.SpringExcercise.Exceptions.UserNotFoundException;
import com.SpringBoot.excercise.SpringExcercise.Model.EmployeesModel;
import com.SpringBoot.excercise.SpringExcercise.Repository.EmployeesRepository;
import com.SpringBoot.excercise.SpringExcercise.Service.EmployeesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.validation.Valid;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;

@RestController
public class EmployeesController {
    //List<EmployeesModel> employeesModels=new ArrayList<>();
    @Autowired
    private EmployeesRepository employeesRepository;
    @Autowired
    private EmployeesService employeesService;

    @GetMapping("/helloSpring")
    public String helloWorld(){
        return "Welcome to spring boot.";
    }

    @GetMapping("/employees")
    public List<EmployeesModel> retriveAll(){
        return employeesService.getAll();
    }

    @GetMapping("/employees/{id}")
    public EmployeesModel retriveOne(@PathVariable int id){
        EmployeesModel employeesModel=employeesService.getOne(id);
        if(employeesModel==null)
            throw new UserNotFoundException("id: "+ id);
        return employeesModel;
    }

    @PostMapping("/employees")
    public ResponseEntity<Object> addUser(@Valid @RequestBody EmployeesModel employeesModel){
        EmployeesModel employeesModel1=employeesService.addUser(employeesModel);

        URI location= ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(employeesModel1.getId()).toUri();
        return ResponseEntity.created(location).build();
    }

    @GetMapping("/employees/delete/{id}")
    public EmployeesModel deleteOne(@PathVariable int id){
        EmployeesModel employeesModel=employeesService.deleteUser(id);
        if(employeesModel==null)
            throw new UserNotFoundException("id: "+ id);
        return employeesModel;
    }

    @PutMapping("employees/update/{id}")
    public void updateOne(@PathVariable int id, @RequestBody EmployeesModel employeesModel){
        employeesService.updateRecord(id, employeesModel);
    }
}