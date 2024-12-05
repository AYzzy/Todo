package africa.semicolon.data.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
@Data
@Document
public class TodoTaskList {


        @Id
        private String id;
        private String author;

        private String title;
        private String Priority;
        private String body;
       private LocalDateTime localDateTime;
}
