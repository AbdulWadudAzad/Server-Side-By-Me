package been;

import entity.Student;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import service.Studentservice;

@ManagedBean
@SessionScoped
public class Studentbeen {

    private Studentservice service = new Studentservice();
    private Student student;
    private List<Student> list;
    private String[] ccomplete;
    public void save(){
        String cc="";
        for(String s:ccomplete){
            cc+= s+", ";
        }
        student.setCourseComplete(cc);
        service.saveorUpate(student);
    }

    public Studentservice getService() {
        return service;
    }
public void edit(){
    service.saveorUpate(student);
}
public void delete(){
    service.delete(student);
}
public Student searchbyId(int id){
    Student s=new Student();
    s=service.getbyId(id);
    return s;
    
}

    public void setService(Studentservice service) {
        this.service = service;
    }

    public Student getStudent() {
        if (student == null) {
            student = new Student();
        }
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public List<Student> getList() {
        list = new ArrayList<>();
        list = service.getList();
        return list;
    }

    public void setList(List<Student> list) {
        this.list = list;
    }

    public String[] getCcomplete() {
        return ccomplete;
    }

    public void setCcomplete(String[] ccomplete) {
        this.ccomplete = ccomplete;
    }

    public void reset() {
        student = new Student();
    }
}
