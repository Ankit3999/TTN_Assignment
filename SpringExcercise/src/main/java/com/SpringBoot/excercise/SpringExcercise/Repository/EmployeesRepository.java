package com.SpringBoot.excercise.SpringExcercise.Repository;

import com.SpringBoot.excercise.SpringExcercise.Model.EmployeesModel;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Component
public class EmployeesRepository{
    private static List<EmployeesModel> list=new ArrayList<>();
    static {
        list.add(new EmployeesModel(3999, "ankit", 23));
        list.add(new EmployeesModel(4000, "sagar", 22));
        list.add(new EmployeesModel(4140, "him", 25));
        list.add(new EmployeesModel(4141, "himeen", 21));
        list.add(new EmployeesModel(4142, "himan", 18));

    }

    public static List<EmployeesModel> getList()
    {
        return list;
    }

}
