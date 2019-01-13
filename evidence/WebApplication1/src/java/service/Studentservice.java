
package service;

import entity.Student;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import util.HibernateUtil;
public class Studentservice {
    public static void saveorUpate(Student student) {
        SessionFactory sessionFactory=HibernateUtil.getSessionFactory();
        Session session=sessionFactory.getCurrentSession();
        Transaction tr=session.beginTransaction();
        session.save(student);
        System.out.println("Success");
        tr.commit();
    }
      public static void delete(Student student) {
        SessionFactory sessionFactory=HibernateUtil.getSessionFactory();
        Session session=sessionFactory.getCurrentSession();
        Transaction tr=session.beginTransaction();
        session.delete(student);
        System.out.println("delete Success");
        tr.commit();
    }
 
 public static Student getbyId(int id){
     Student student=new Student();
     try {
         SessionFactory sessionFactory=HibernateUtil.getSessionFactory();
        Session session=sessionFactory.getCurrentSession();
        Transaction tr=session.beginTransaction();
      student=(Student) session.get(Student.class, id);
        tr.commit();
     } catch (Exception e) {
         System.out.println("something Wrong");
     }
     
        return student;     
 }
 
 public static List<Student> getList(){
     List<Student> student=new ArrayList<>();
    try {
         SessionFactory sessionFactory=HibernateUtil.getSessionFactory();
        Session session=sessionFactory.getCurrentSession();
        Transaction tr=session.beginTransaction();
      student=session.createQuery("FROM Student").list();
        tr.commit();
     } catch (Exception e) {
      
     }  
     return student; 
 }
 
 
}
