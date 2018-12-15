
package com.coderbd;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@SessionScoped
@ManagedBean
public class StudentControl {
    
  private Student student;

    public Student getStudent() {
        
        if(student==null){
            student=new Student();
        }
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
  
//    public void saveStu 
    
}
