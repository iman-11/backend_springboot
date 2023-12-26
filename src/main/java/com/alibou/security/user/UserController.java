package com.alibou.security.user;

import com.alibou.security.detailsdoctor.doctordto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/v1/users")
@RequiredArgsConstructor
@CrossOrigin(origins = "http://localhost:4200")

public class UserController {

    private final UserService service;
    private final UserRepository userRepository;
    private  final searchrepository srepo;


    @PatchMapping
    public ResponseEntity<?> changePassword(
            @RequestBody ChangePasswordRequest request,
            Principal connectedUser
    ) {
        service.changePassword(request, connectedUser);
        return ResponseEntity.ok().build();
    }

    @PutMapping("/{userId}")
    public ResponseEntity<Map<String, String>> updateDoctor(@PathVariable String userId, @RequestBody doctordto doctordto) {
        service.updateDoctor(userId, doctordto);

        Map<String, String> response = new HashMap<>();
        response.put("message", "Doctor updated successfully.");

        return ResponseEntity.ok().contentType(MediaType.APPLICATION_JSON).body(response);
    }
    @GetMapping("/get/getall")
    public List<User> getallUsers() {
        return userRepository.findAll();
    }
    @GetMapping("search/{text}")
    public List<User> search(@PathVariable String text)
    {
        return srepo.findByText(text);
    }







}
