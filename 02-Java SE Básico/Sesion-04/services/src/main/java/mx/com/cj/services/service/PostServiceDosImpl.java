package mx.com.cj.services.service;

import mx.com.cj.services.model.Post;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;

@Service("test2")
public class PostServiceDosImpl implements IPostService {

    private List<Post> posts;

    public PostServiceDosImpl() {
        posts = new LinkedList<>();
        posts.add(new Post("Hello World Test 2", 1L));
        posts.add(new Post("Prueba 2", 2L));
    }

    @Override
    public List<Post> getAll() {
        return posts;
    }

}
