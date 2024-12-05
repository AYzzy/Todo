package africa.semicolon.dto.request;

import africa.semicolon.data.model.TodoTaskList;
import lombok.Data;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

@Data
public class UpdateTaskRequest {

    private String author;
    private String body;
    private String title;

    private List<TodoTaskList> todoTaskListList = new ArrayList<>();

    private String finishDate(){
        LocalDateTime finished = LocalDateTime.now();

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yy HH:mm:ss");
        return finished.format(dateTimeFormatter);
    }

    private LocalDateTime localDateTime;
    private boolean isCompleted = false;


}
