package com.hcc.services;

import com.hcc.entities.Assignment;
import com.hcc.entities.User;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class AssignmentService {
//    @Autowired
//    private AssignmentRepository assignmentRepository;

    public Set<Assignment> findAssignmentsByUser (User user) {

        return null;
    }
}
