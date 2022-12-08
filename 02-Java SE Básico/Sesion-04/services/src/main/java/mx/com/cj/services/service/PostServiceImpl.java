package mx.com.cj.services.service;

import mx.com.cj.services.model.Post;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;

@Service("test1")
public class PostServiceImpl implements IPostService {

    private List<Post> posts;

    public PostServiceImpl() {
        posts = new LinkedList<>();
        posts.add(new Post("Hello World", 1L));
        posts.add(new Post("Prueba", 2L));
    }

    @Override
    public List<Post> getAll() {
        return posts;
    }

}
