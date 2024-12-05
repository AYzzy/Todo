package africa.semicolon.dto.request;

import lombok.Data;

@Data
public class EditTodolistRequest {
    private String author;
    private String title;
    private String taskPriority;
    private String listId;
}
