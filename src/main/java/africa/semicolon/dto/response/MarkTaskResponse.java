package africa.semicolon.dto.response;

import lombok.Data;

import java.time.LocalDate;

@Data
public class MarkTaskResponse {
    private String listId;
    private String title;
    private String taskPriority;
    private LocalDate localDate;
}
