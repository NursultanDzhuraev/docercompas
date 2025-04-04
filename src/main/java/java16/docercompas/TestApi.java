package java16.docercompas;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class TestApi {
    private final UserService userService;

    @GetMapping("Users")
    public List<User> getUsers() {
        return userService.getUser();
    }
    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }
    @GetMapping("/bye")
    public String bye() {
        return "bye";
    }
}
