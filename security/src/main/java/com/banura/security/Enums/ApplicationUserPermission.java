package com.banura.security.Enums;

public enum ApplicationUserPermission {
    STUDENT_READ("student:read"),
    STUDENT_WRITE("student:write"),
    COURSE_READ("course:read"),
    COURSE_WRITE("course:write");

    private final String permission;

    ApplicationUserPermission(String p){
        permission = p;
    }

    public String getPermission() {
        return permission;
    }
}
