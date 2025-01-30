package pt.estgd.api.dto;

import pt.estgd.api.domain.RoleType;

public record RegisterDTO(String name, String email, String password, RoleType role) {
}
