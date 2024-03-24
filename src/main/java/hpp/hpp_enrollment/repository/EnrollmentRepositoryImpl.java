package hpp.hpp_enrollment.repository;

import hpp.hpp_enrollment.dto.entity.Enrollment;

public interface EnrollmentRepositoryImpl {
    Enrollment findByUserId(Integer userId);
    void save(Enrollment enrollment);
}
