package africa.semicolon.service;

import africa.semicolon.data.model.TodoTaskList;
import africa.semicolon.data.model.TodoUser;
import africa.semicolon.dto.request.*;
import africa.semicolon.dto.response.*;

import java.util.List;

public interface TodoUserService {

    RegisterUserResponse register(RegisterUserRequest registerRequest);

    LoginResponse login(LoginRequest loginRequest);

//    TodoListResponse createTodolist(TodoTaskListRequest todolistRequest);

    EditTodolistUserResponse editTodoListWith(EditTodolistRequest editTodolistRequest);

    DeleteTodoListResponse deleteTodoTaskWith(DeleteListRequest deleteTodolistRequest);

    List<TodoListResponse> viewAllTodoList(TodoTaskListRequest todolistRequest);


    LogoutUserResponse logout(LogoutRequest logoutRequest);

    TodoUser startTask(StartTaskRequest startTaskRequest);

//    List<TodoTaskList> viewAllPendingTasks(ViewAllPendingTaskRequest viewAllPendingTaskRequest);

    AssignTaskResponse assignTask(AssignTaskRequest assignTaskRequest);
//    RegisterUserResponse register(RegisterUserRequest registerUserRequest);
//
   TodoUser findByUserName(String username);
//
    long count();
//
    void deleteAll();
//    LoginResponse login(LoginRequest loginRequest);
//
//
    long getNumberOfUser();

    CreateTaskResponse createTask(CreateTaskRequest createTaskRequest);
    UpdateTaskResponse update(UpdateTaskRequest updateTaskRequest);

    void deleteTask(String title);

    MarkTaskResponse markTaskStatus(MarkTaskRequest markTaskRequest);
    List<TodoTaskList> viewAllPendingTasks(ViewAllPendingTaskRequest viewAllPendingTaskRequest);

    long getNumberOfTasks();

}
