package africa.semicolon.dto.request;

import lombok.Data;

@Data
public class ViewAllPendingTaskRequest {
    private String taskPriority;
    private String userName;
}
