package com.hcc.controllers;

import com.hcc.entities.Assignment;
import com.hcc.entities.User;
import com.hcc.services.AssignmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/api/assignments")
public class AssignmentController {
//get assignment
    @Autowired
    private AssignmentService assignmentService;

    //Get Assignments by User
    @GetMapping
    ResponseEntity<?> getAllAssignmentsByUser (@AuthenticationPrincipal User user) {
       Set<Assignment> assignmentSet = assignmentService.findAssignmentsByUser (user);
        return null;
    }
    //Get assignment by Id
    @GetMapping ("/{id}")
    ResponseEntity<?> getAssignmentById (@PathVariable Long id, @AuthenticationPrincipal User user) {
        return null;
    }
    @PutMapping ("/{id}")
    ResponseEntity<?> UpdateAssignmentById (@RequestBody Assignment assignment, @PathVariable Long id, @AuthenticationPrincipal User user) {
        return null;
    }
    @PostMapping
    ResponseEntity<?> createAssignment (@AuthenticationPrincipal User user) {
        return null;
    }
}
