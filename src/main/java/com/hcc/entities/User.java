package com.hcc.entities;

import java.util.Date;
import java.util.List;

public class User {
    Long id;
    Date cohortStartDate;
    String username;
    String password;
    List<String> authorities;

}
