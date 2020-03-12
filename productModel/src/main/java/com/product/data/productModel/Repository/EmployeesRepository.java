package com.product.data.productModel.Repository;

import com.product.data.productModel.Model.EmployeesModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface EmployeesRepository extends PagingAndSortingRepository<EmployeesModel, Integer> {
    List<EmployeesModel> findByName(String name);
    List<EmployeesModel> findByNameLike(String name);
    List<EmployeesModel> findByAgeBetween(int age1, int age2);
}
