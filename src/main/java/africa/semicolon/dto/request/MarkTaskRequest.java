package africa.semicolon.dto.request;

import lombok.Data;

@Data
public class MarkTaskRequest {
    private String username;
    private String title;
    private String taskPriority;
}