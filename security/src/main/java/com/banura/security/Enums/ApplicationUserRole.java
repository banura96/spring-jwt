package com.banura.security.Enums;

import com.google.common.collect.Sets;

import java.util.ArrayList;
import java.util.Set;

public enum ApplicationUserRole {
    STUDENT(Sets.newHashSet()),
    ADMIN(Sets.newHashSet(ApplicationUserPermission.COURSE_READ, ApplicationUserPermission.COURSE_WRITE, ApplicationUserPermission.STUDENT_READ, ApplicationUserPermission.STUDENT_WRITE)),
    ADMINTRAINEE(Sets.newHashSet(ApplicationUserPermission.COURSE_READ, ApplicationUserPermission.STUDENT_READ, ApplicationUserPermission.STUDENT_WRITE));


    private final Set<ApplicationUserPermission> p;

    ApplicationUserRole(Set<ApplicationUserPermission> p) {
        this.p = p;
    }

    public Set<ApplicationUserPermission> getP() {
        return p;
    }
}
