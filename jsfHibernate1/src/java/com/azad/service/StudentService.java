
package com.azad.service;

import com.azad.entity.Student;
import com.azad.util.NewHibernateUtil;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class StudentService {
    public static void saveorUpdate(Student student) {
        SessionFactory sessionFactory=NewHibernateUtil.getSessionFactory();
        Session session=sessionFactory.getCurrentSession();
        Transaction tr=session.beginTransaction();
        session.saveOrUpdate(student);
        tr.commit();   
    }
   
//    public static List<Student> grtList() {
//      SessionFactory sessionFactory=NewHibernateUtil.getSessionFactory();
//        Session session=sessionFactory.getCurrentSession();
//        List<Student> students=session.getA(Student.class).1;
//        Transaction tr=session.beginTransaction();
//    }
}
