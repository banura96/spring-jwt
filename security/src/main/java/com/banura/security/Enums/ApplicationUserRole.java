package com.banura.security.Enums;

import java.util.Set;

public enum ApplicationUserRole {
//    STUDENT(),
//    ADMIN(p);

    private final Set<ApplicationUserPermission> p;

    ApplicationUserRole(Set<ApplicationUserPermission> p) {
        this.p = p;
    }
}
