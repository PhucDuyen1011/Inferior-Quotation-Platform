package com.phucduyen.database.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import java.util.Collections;
import java.util.List;
import java.util.Set;

@RequiredArgsConstructor
public enum Role {
    GUEST(
            Collections.emptySet()
    ),

    CUSTOMER(
            Set.of(
                    Permission.CUSTOMER_CREATE,
                    Permission.CUSTOMER_READ,
                    Permission.CUSTOMER_UPDATE,
                    Permission.CUSTOMER_DELETE
            )
    ),

    STAFF(
            Set.of(
                    Permission.STAFF_CREATE,
                    Permission.STAFF_READ,
                    Permission.STAFF_UPDATE,
                    Permission.STAFF_DELETE
            )
    ),

    MANAGER(
            Set.of(
                    Permission.MANAGER_CREATE,
                    Permission.MANAGER_READ,
                    Permission.MANAGER_UPDATE,
                    Permission.MANAGER_DELETE
            )
    ),

    ADMIN(
            Set.of(
                    Permission.ADMIN_CREATE,
                    Permission.ADMIN_READ,
                    Permission.ADMIN_UPDATE,
                    Permission.ADMIN_DELETE
            )
    );

    @Getter
    private final Set<Permission> permissions;

    public List<SimpleGrantedAuthority> getAuthorities(){
        var author = new java.util.ArrayList<>(getPermissions()
                .stream()
                .map(permission -> new SimpleGrantedAuthority(permission.getPermission()))
                .toList());

        author.add(new SimpleGrantedAuthority("ROLE_" + this.name()));
        return author;
    }
}
