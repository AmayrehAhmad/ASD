package edu.miu.cs489.lab10.surgery.controller;

import edu.miu.cs489.lab10.surgery.dto.patient.PatientRequest;
import edu.miu.cs489.lab10.surgery.dto.patient.PatientResponse;
import edu.miu.cs489.lab10.surgery.exception.PatientNotFoundException;
import edu.miu.cs489.lab10.surgery.service.PatientService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/adsweb/api/v1/patient")
public class PatientController {

    private PatientService patientService;

    public PatientController(PatientService patientService) {
        this.patientService = patientService;
    }

    @GetMapping("/list")
    public ResponseEntity<List<PatientResponse>> findAllPatientIncludeAddress(){
        return new ResponseEntity<>(patientService.getAllPatients(),
                HttpStatus.OK);
    }

    @PostMapping("/new")
    public ResponseEntity<PatientResponse> addNewPatient(@RequestBody PatientRequest patientRequest){
        return new ResponseEntity<>(patientService.addNewPatient(patientRequest),
                HttpStatus.CREATED);
    }

    @GetMapping("/{patientId}")
    public ResponseEntity<PatientResponse> findPatientById(@PathVariable int patientId) throws PatientNotFoundException {
        return new ResponseEntity<>(patientService.getPatientById(patientId), HttpStatus.FOUND);
    }

    @PutMapping("/update/{patientId}")
    public ResponseEntity<PatientResponse> updatePatientById(@RequestBody PatientRequest patientRequest, @PathVariable int patientId)
    throws PatientNotFoundException{
        return new ResponseEntity<>(patientService.updatePatientById(patientRequest,patientId),
                HttpStatus.ACCEPTED);
    }

    @DeleteMapping("/delete/{patientId}")
    public ResponseEntity<Void> deletePatientById(@PathVariable int patientId) throws PatientNotFoundException{
        patientService.deletePatientById(patientId);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }


}
