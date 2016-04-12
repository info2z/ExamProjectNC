package main;

import java.sql.Date;

import ExamProjectNC.shared.dto.ExamDTO;
import ExamProjectNC.shared.dto.GroupDTO;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ExamProjectNC.server.dao.*;

/*
Тестовый класс для ExamService
 */
public class TestExamDAOSH {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

        ExamDAO examDAO = context.getBean(ExamDAO.class);

        //тестируем методы здесь

        ExamDTO exam = new ExamDTO();
        exam.setExam_subject("math");
        //текущая дата
        exam.setExam_date(new Date(new java.util.Date().getTime()));
        exam.setExam_theme("my_theme");
        GroupDTO group = new GroupDTO();
        group.setGroup_id(3);
        group.setGroup_name("third");
        /*
        exam.setGroup(group);
        UserDTO teacher = new UserDTO();
        teacher.setUser_id(1);
        exam.setTeacher(teacher);
        */

        examDAO.persist(exam);



        context.close();


        context.close();
    }
}
