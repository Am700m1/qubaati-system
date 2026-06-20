package com.example.qubaatisystem.Repository;

import com.example.qubaatisystem.Model.StudentSkill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentSkillRepository extends JpaRepository<StudentSkill, Integer> {

    StudentSkill findStudentSkillById(Integer id);

    StudentSkill findStudentSkillByStudentIdAndSkillId(Integer studentId, Integer skillId);

    List<StudentSkill> findStudentSkillsByStudentId(Integer studentId);
}
