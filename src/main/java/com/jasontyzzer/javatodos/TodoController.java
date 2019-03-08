package com.jasontyzzer.javatodos;


import com.jasontyzzer.javatodos.models.Todo;
import com.jasontyzzer.javatodos.models.Users;
import com.jasontyzzer.javatodos.repos.TodoRepository;
import com.jasontyzzer.javatodos.repos.UsersRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Api(value = "Todo Sprint Application", description = "Backend for todo sprint")
@RestController
@RequestMapping(path = {}, produces = MediaType.APPLICATION_JSON_VALUE)
public class TodoController {
    @Autowired
    TodoRepository todoRepo;

    @Autowired
    UsersRepository userRepo;

    @ApiOperation(value = "Get all users", response = List.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "User resource retrieved"),
            @ApiResponse(code = 401, message = "Not authorized to view user resource"),
            @ApiResponse(code = 403, message = "Forbidden to access user resource"),
            @ApiResponse(code = 404, message = "User resource not found")
    })

    @GetMapping("/users")
    public List<Users> getAllUsers() {
        return userRepo.findAll();
    }

    @ApiOperation(value = "Get all ToDos", response = List.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Todo resource retrieved"),
            @ApiResponse(code = 401, message = "Not authorized to view todo resource"),
            @ApiResponse(code = 403, message = "Forbidden to access todo resource"),
            @ApiResponse(code = 404, message = "Todo resource not found")
    })

    @GetMapping("/todos")
    public List<Todo> getAllTodos(){
        return todoRepo.findAll();
    }

}
