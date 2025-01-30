package pt.estgd.api.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class StudentsController {
/*
    private final UserService userService;

    @PreAuthorize("hasAuthority('DOCENTE')")
    @GetMapping
    public ResponseEntity<List<UserDto>> getAllStudents() {
        List<UserDto> users = userService.getAllUsers();
        return ResponseEntity.ok(users);
    }*/
}
