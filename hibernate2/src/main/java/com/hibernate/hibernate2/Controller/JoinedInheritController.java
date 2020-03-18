package com.hibernate.hibernate2.Controller;

import com.hibernate.hibernate2.Model.CollegeJoined;
import com.hibernate.hibernate2.Model.CollegeSingle;
import com.hibernate.hibernate2.Model.CompanyJoined;
import com.hibernate.hibernate2.Repository.JoinedInheritRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class JoinedInheritController {
    @Autowired
    JoinedInheritRepository joinedInheritRepository;

    @GetMapping("/joinedinherit")
    void setData(){
        CompanyJoined companyJoined =new CompanyJoined();
        companyJoined.setName("ankit");
        companyJoined.setAge(23);
        companyJoined.setCompany("TTN");

        CollegeJoined collegeJoined =new CollegeJoined();
        collegeJoined.setName("sagar");
        collegeJoined.setAge(24);
        collegeJoined.setCollege("CDAC");

        joinedInheritRepository.save(companyJoined);
        joinedInheritRepository.save(collegeJoined);
    }
}
