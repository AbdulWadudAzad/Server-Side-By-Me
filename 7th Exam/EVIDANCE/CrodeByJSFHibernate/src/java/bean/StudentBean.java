package bean;

import Service.StudentService;
import com.sun.javafx.scene.control.skin.VirtualFlow;
import entity.Student;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
public class StudentBean {

    private StudentService service = new StudentService();
    private Student student;
    private List<Student> list;
    private String[] completed;

    public void save() {
        String cc = "";
        for (String s : completed) {
            cc += s + ", ";
        }
        student.setCourse(cc);
        service.saveOrUpdate(student);
        student = new Student();
    }

    public void edit() {
        String cc = "";
        for (String s : completed) {
            cc += s + ", ";
        }
        student.setCourse(cc);
        service.saveOrUpdate(student);
        student = new Student();
    }
    
    public void delete() {
       
        service.delete(student);
        student = new Student();

    }
    public StudentService getService() {
        return service;
    }

    public void setService(StudentService service) {
        this.service = service;
    }

    public Student getStudent() {
         if(student==null){
            student=new Student();
        }
        return student;
    }

    public void setStudent(Student student) {
       
        this.student = student;
    }

    public List<Student> getList() {
        list=new ArrayList<>();
        list=service.getList();
        return list;
    }

    public void setList(List<Student> list) {
        this.list = list;
    }

    public String[] getCompleted() {
        return completed;
    }

    public void setCompleted(String[] completed) {
        this.completed = completed;
    }

    public void reset() {
        student = new Student();
    }
}
