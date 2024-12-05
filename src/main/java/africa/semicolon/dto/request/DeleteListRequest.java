package africa.semicolon.dto.request;

import lombok.Data;

@Data
public class DeleteListRequest {
    private String listId;
    private String author;
}
