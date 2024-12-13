package foms.foms_api.controller;

import foms.foms_api.model.WebResponse;
import foms.foms_api.model.payload.RegisterUserPayload;
import foms.foms_api.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping(path = "/api/users", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public WebResponse<String> register(@RequestBody RegisterUserPayload payload) {
        userService.register(payload);

        return WebResponse.<String>builder().data("OK").build();
    }
}
