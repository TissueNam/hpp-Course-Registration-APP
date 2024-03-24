package hpp.hpp_enrollment.service;

import hpp.hpp_enrollment.dto.entity.Enrollment;

public interface EnrollmentServiceImpl {
    Enrollment getEnrollmentStateByUserId(Integer courseId, Integer userId);
    Enrollment postEnrollment(Enrollment enrollment);
}
