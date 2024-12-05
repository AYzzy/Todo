package africa.semicolon.data.repository;

import africa.semicolon.data.model.TodoTaskList;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TodoTaskListRepository extends MongoRepository<TodoTaskList, String > {
    void deleteByTitle(String title);
}
