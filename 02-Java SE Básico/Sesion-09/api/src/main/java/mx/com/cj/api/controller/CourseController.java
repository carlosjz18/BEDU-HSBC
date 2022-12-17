package mx.com.cj.api.controller;

import mx.com.cj.api.dto.CourseDTO;
import mx.com.cj.api.service.CourseService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/courses")
public class CourseController {

    private CourseService courseService;

    public CourseController(CourseService courseService) {
        this.courseService = courseService;
    }

    @GetMapping
    public List<CourseDTO> findAll() {
        return courseService.finAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.ACCEPTED)
    public CourseDTO save(@RequestBody CourseDTO data) {
        return courseService.save(data);
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void update(@PathVariable("id") long id, @RequestBody CourseDTO data) throws Exception {
        courseService.update(id, data);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable("id") long id) throws Exception {
        courseService.delete(id);
    }

}
