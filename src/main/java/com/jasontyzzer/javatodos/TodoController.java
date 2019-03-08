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
import org.springframework.web.bind.annotation.*;

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

    @ApiOperation(value = "Get user based on user id", response = List.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Todo resource retrieved"),
            @ApiResponse(code = 401, message = "Not authorized to view todo resource"),
            @ApiResponse(code = 403, message = "Forbidden to access todo resource"),
            @ApiResponse(code = 404, message = "Todo resource not found")
    })

    @GetMapping ("/users/userid/{userid}")
    public Users getUserBasedOnUserId(@PathVariable Integer userid){
        return something;

    }    @ApiOperation(value = "return the user based off of the user name", response = List.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Todo resource retrieved"),
            @ApiResponse(code = 401, message = "Not authorized to view todo resource"),
            @ApiResponse(code = 403, message = "Forbidden to access todo resource"),
            @ApiResponse(code = 404, message = "Todo resource not found")
    })

    @GetMapping ("/users/username/{username}")
    public Users getUserBasedOnUserId(@PathVariable Integer userid){
        return something;

    }    @ApiOperation(value = "return the todo based off of the todo id", response = List.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Todo resource retrieved"),
            @ApiResponse(code = 401, message = "Not authorized to view todo resource"),
            @ApiResponse(code = 403, message = "Forbidden to access todo resource"),
            @ApiResponse(code = 404, message = "Todo resource not found")
    })

    @GetMapping ("/todos/todoid/{todoid}")
    public Users getUserBasedOnUserId(@PathVariable Integer userid){
        return something;

    }    @ApiOperation(value = "return a listing of the todos with its assigned user's name", response = List.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Todo resource retrieved"),
            @ApiResponse(code = 401, message = "Not authorized to view todo resource"),
            @ApiResponse(code = 403, message = "Forbidden to access todo resource"),
            @ApiResponse(code = 404, message = "Todo resource not found")
    })

    @GetMapping ("/todos/users")
    public Users getUserBasedOnUserId(@PathVariable Integer userid){
        return something;

    }    @ApiOperation(value = "return a listing of the todos not yet completed. // adding this is now a stretch goal", response = List.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Todo resource retrieved"),
            @ApiResponse(code = 401, message = "Not authorized to view todo resource"),
            @ApiResponse(code = 403, message = "Forbidden to access todo resource"),
            @ApiResponse(code = 404, message = "Todo resource not found")
    })

    @GetMapping ("/todos/active")
    public Users getUserBasedOnUserId(@PathVariable Integer userid){
        return something;

    }    @ApiOperation(value = "adds a user", response = List.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Todo resource retrieved"),
            @ApiResponse(code = 401, message = "Not authorized to view todo resource"),
            @ApiResponse(code = 403, message = "Forbidden to access todo resource"),
            @ApiResponse(code = 404, message = "Todo resource not found")
    })

    @PostMapping("/users")
    public Users getUserBasedOnUserId(@PathVariable Integer userid){
        return something;

    }    @ApiOperation(value = " adds a todo", response = List.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Todo resource retrieved"),
            @ApiResponse(code = 401, message = "Not authorized to view todo resource"),
            @ApiResponse(code = 403, message = "Forbidden to access todo resource"),
            @ApiResponse(code = 404, message = "Todo resource not found")
    })

    @PostMapping ("/todo")
    public Users getUserBasedOnUserId(@PathVariable Integer userid){
        return something;

    }    @ApiOperation(value = " updates a user based on userid", response = List.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Todo resource retrieved"),
            @ApiResponse(code = 401, message = "Not authorized to view todo resource"),
            @ApiResponse(code = 403, message = "Forbidden to access todo resource"),
            @ApiResponse(code = 404, message = "Todo resource not found")
    })

    @PutMapping ("/users/userid/{userid}")
    public Users getUserBasedOnUserId(@PathVariable Integer userid){
        return something;

    }    @ApiOperation(value = "updates a todo based on todoid", response = List.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Todo resource retrieved"),
            @ApiResponse(code = 401, message = "Not authorized to view todo resource"),
            @ApiResponse(code = 403, message = "Forbidden to access todo resource"),
            @ApiResponse(code = 404, message = "Todo resource not found")
    })

    @PutMapping ("/todos/todoid/{todoid}")
    public Users getUserBasedOnUserId(@PathVariable Integer userid){
        return something;

    }    @ApiOperation(value = " Deletes a user based off of their userid and deletes all their associated todos", response = List.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Todo resource retrieved"),
            @ApiResponse(code = 401, message = "Not authorized to view todo resource"),
            @ApiResponse(code = 403, message = "Forbidden to access todo resource"),
            @ApiResponse(code = 404, message = "Todo resource not found")
    })

    @DeleteMapping ("/users/userid/{userid}")
    public Users getUserBasedOnUserId(@PathVariable Integer userid){
        return something;

    }    @ApiOperation(value = "deletes a todo based off its todoid", response = List.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Todo resource retrieved"),
            @ApiResponse(code = 401, message = "Not authorized to view todo resource"),
            @ApiResponse(code = 403, message = "Forbidden to access todo resource"),
            @ApiResponse(code = 404, message = "Todo resource not found")
    })

    @DeleteMapping ("/todos/todoid/{todoid}")
    public Users getUserBasedOnUserId(@PathVariable Integer userid){
        return something;
    }

}
