package mx.com.cj.services.controller;

import mx.com.cj.services.model.Post;
import mx.com.cj.services.service.IPostService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/post")
public class PostController {

    private IPostService postService;

    public PostController(@Qualifier("test2") IPostService postService) {
        this.postService = postService;
    }

    @GetMapping()
    public List<Post> getAll() {
        return postService.getAll();
    }
}
