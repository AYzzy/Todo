package africa.semicolon.dto.response;

import lombok.Data;

import java.time.LocalDate;
@Data
public class TodoListResponse {
    private String listId;
    private String Id;
    private String    title;
    private String taskPriority;
        private LocalDate localDate;
}
