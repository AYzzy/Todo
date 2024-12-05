package africa.semicolon.service;

import africa.semicolon.data.model.TodoTaskList;
import africa.semicolon.dto.request.*;
import africa.semicolon.dto.response.CreateTaskResponse;
import africa.semicolon.dto.response.DeleteTodoListResponse;
import africa.semicolon.dto.response.EditTodolistUserResponse;

public interface TodoTaskListService {
    TodoTaskList startTaskWith(StartTaskRequest startTaskRequest);

    TodoTaskList assignTask(AssignTaskRequest assignTaskRequest);

    TodoTaskList markTaskStatus(MarkTaskRequest markTaskRequest);

    CreateTaskResponse createList(CreateTaskRequest createTaskRequest);

    TodoTaskList findById(String taskId);

    EditTodolistUserResponse editList(EditTodolistRequest editTodolistRequest, TodoTaskList userList);

    DeleteTodoListResponse deleteList(DeleteListRequest deleteTodolistRequest, TodoTaskList task);

    long getNumberOfTask();

    void delete(String title);
}
