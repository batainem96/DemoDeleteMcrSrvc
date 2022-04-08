package com.demo.mcrsrvc.controllers;

import com.demo.mcrsrvc.models.EmployeeRecord;
import com.demo.mcrsrvc.services.RecordsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/record")
public class DeleteController {

    RecordsService recordsService;

    @Autowired
    public DeleteController(RecordsService recordsService) {
        this.recordsService = recordsService;
    }

    @DeleteMapping
    public String deleteRecordById(@RequestParam String empId) {
        recordsService.deleteRecordByEmpId(empId);
        return "Record with empId #" + empId + " successfully deleted.";
    }

}
