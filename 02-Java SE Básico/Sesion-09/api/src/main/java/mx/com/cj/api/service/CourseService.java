package mx.com.cj.api.service;

import mx.com.cj.api.dto.CourseDTO;

import java.util.List;
import java.util.Optional;

public interface CourseService {

    List<CourseDTO> finAll();

    Optional<CourseDTO> findById(long id);

    CourseDTO save(CourseDTO course);

    void update(long id, CourseDTO course) throws Exception;

    void delete(long id) throws Exception;

}
