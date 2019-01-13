package service;

import entity.Student;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import util.HibernateUtil;

public class StudentService {

    public static void saveorUpdate(Student student) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.getCurrentSession();
        Transaction tr = session.beginTransaction();
        session.saveOrUpdate(student);
        System.out.println("success");
        tr.commit();
    }

    public static void delete(Student student) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.getCurrentSession();
        Transaction tr = session.beginTransaction();
        session.delete(student);
        System.out.println("delete success");
        tr.commit();
    }

//        public static void getbyId(int id) {
//            Student student=new Student();
//        SessionFactory sessionFactory=HibernateUtil.getSessionFactory();
//        Session session=sessionFactory.getCurrentSession();
//        Transaction tr=session.beginTransaction();
//        student=(Student) session.get(Student.class, id);
//        System.out.println("delete success");
//        tr.commit();
//    }  
    public List<Student> getList() {
        List<Student> list = new ArrayList<>();
        try {
            SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
            Session session = sessionFactory.getCurrentSession();
            Transaction tr = session.beginTransaction();
            list = session.createQuery("FROM Student").list();
            tr.commit();
        } catch (Exception e) {
            System.out.println("something wrong");
        }
        return list;

    }
}
