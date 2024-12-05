package africa.semicolon.dto.response;

import lombok.Data;

@Data
public class AssignTaskResponse {
    private String listId;
    private String title;
    private String taskPriority;
    private String DateUpdated;
}
