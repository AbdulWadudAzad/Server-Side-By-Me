
package service;

import entity.Student;
import org.hibernate.Session;
import util.HibernateUtil;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;


public class StudentServ {
    public static void saoveorUpdate(Student  student) {
        SessionFactory sessionFactory=HibernateUtil.getSessionFactory();
        Session session=sessionFactory.getCurrentSession();
        Transaction tr=session.beginTransaction();
        
                
        
    }
}
