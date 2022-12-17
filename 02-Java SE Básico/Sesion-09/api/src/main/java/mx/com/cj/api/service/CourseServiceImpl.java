package mx.com.cj.api.service;

import mx.com.cj.api.dto.CourseDTO;
import mx.com.cj.api.entity.Course;
import mx.com.cj.api.mapper.CourseMapper;
import mx.com.cj.api.repository.ICourseRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class CourseServiceImpl implements CourseService {

    private CourseMapper courseMapper;
    private ICourseRepository courseRepository;

    public CourseServiceImpl(CourseMapper courseMapper, ICourseRepository courseRepository) {
        this.courseMapper = courseMapper;
        this.courseRepository = courseRepository;
    }

    @Override
    public List<CourseDTO> finAll() {
        List<Course> courses = courseRepository.findAll();
        return courses.stream().map(courseMapper::toDTO).collect(Collectors.toList());
    }

    @Override
    public Optional<CourseDTO> findById(long id) {
        return Optional.empty();
    }

    @Override
    public CourseDTO save(CourseDTO course) {
        Course entity = courseMapper.toEntity(course);
        return courseMapper.toDTO(courseRepository.save(entity));
    }

    @Override
    public void update(long id, CourseDTO data) throws Exception {
        Optional<Course> result = courseRepository.findById(id);
        if (result.isEmpty()) {
            throw new Exception("No existe curso");
        }

        Course course = result.get();
        course.setName(data.getName());
        courseRepository.save(course);
    }


    public void delete(long id) throws Exception {
        Optional<Course> result = courseRepository.findById(id);
        if (result.isEmpty()) {
            throw new Exception("No existe curso");
        }
        courseRepository.deleteById(id);
    }
}
