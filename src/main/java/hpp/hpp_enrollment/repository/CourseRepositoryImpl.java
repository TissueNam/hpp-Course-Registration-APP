package hpp.hpp_enrollment.repository;

import hpp.hpp_enrollment.dto.entity.Course;

public interface CourseRepositoryImpl {
    Course findByCourseId(Integer courseId);
    void updateByCourseId(Integer courseId);
}
