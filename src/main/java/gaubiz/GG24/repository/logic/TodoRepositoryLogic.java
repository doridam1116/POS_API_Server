package gaubiz.GG24.repository.logic;

import gaubiz.GG24.model.Todo;
import gaubiz.GG24.repository.TodoRepository;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

@Repository
public class TodoRepositoryLogic implements TodoRepository {
    private final SqlSession session;

    public TodoRepositoryLogic(SqlSession session) {
        this.session = session;
    }

    @Override
    public int updateTodo(Todo todo) {
        return session.update("TodoMapper.updateTodo", todo);
    }
}
