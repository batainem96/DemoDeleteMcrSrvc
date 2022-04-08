package com.demo.mcrsrvc.controllers;

import com.demo.mcrsrvc.services.RecordsService;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import static org.mockito.Mockito.*;

@SpringBootTest
public class DeleteControllerTests {

    @InjectMocks
    DeleteController deleteController;

    @Mock
    RecordsService recordsService;

    @Test
    public void deleteRecordById_whenEmpIdGiven_thenAssertionSucceeds() {

        String testEmpId = "123";

        doNothing().when(recordsService).deleteRecordByEmpId(testEmpId);

        recordsService.deleteRecordByEmpId(testEmpId);

        verify(recordsService, times(1)).deleteRecordByEmpId(testEmpId);

    }

}
