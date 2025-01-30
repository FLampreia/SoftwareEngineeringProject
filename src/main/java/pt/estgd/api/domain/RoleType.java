package pt.estgd.api.domain;

public enum RoleType {
    ADMIN("Docente"),
    USER("Student");

    private String role;

    RoleType(String role){
        this.role = role;
    }

    public String getRole(){
        return role;
    }
}
