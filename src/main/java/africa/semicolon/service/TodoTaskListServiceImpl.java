package africa.semicolon.service;

import africa.semicolon.data.model.TodoTaskList;
import africa.semicolon.dto.request.*;
import africa.semicolon.dto.response.CreateTaskResponse;
import africa.semicolon.dto.response.DeleteTodoListResponse;
import africa.semicolon.dto.response.EditTodolistUserResponse;
import org.springframework.stereotype.Service;

@Service
public class TodoTaskListServiceImpl implements TodoTaskListService{
    @Override
    public TodoTaskList startTaskWith(StartTaskRequest startTaskRequest) {
        return null;
    }

    @Override
    public TodoTaskList assignTask(AssignTaskRequest assignTaskRequest) {
        return null;
    }

    @Override
    public TodoTaskList markTaskStatus(MarkTaskRequest markTaskRequest) {
        return null;
    }

    @Override
    public CreateTaskResponse createList(CreateTaskRequest createTaskRequest) {
        return null;
    }

    @Override
    public TodoTaskList findById(String taskId) {
        return null;
    }

    @Override
    public EditTodolistUserResponse editList(EditTodolistRequest editTodolistRequest, TodoTaskList userList) {
        return null;
    }

    @Override
    public DeleteTodoListResponse deleteList(DeleteListRequest deleteTodolistRequest, TodoTaskList task) {
        return null;
    }
}
