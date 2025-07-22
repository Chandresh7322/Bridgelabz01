interface Role {
    void access();
}

class AdminRole implements Role {
    public void access() {
        System.out.println("Admin access granted");
    }
}

class AuthSystem {
    HashMap<String, Role> userRoles = new HashMap<>();

    void assignRole(String user, Role role) {
        userRoles.put(user, role);
    }

    void checkAccess(String user) {
        if (userRoles.containsKey(user)) {
            userRoles.get(user).access();
        } else {
            System.out.println("No access");
        }
    }
}
