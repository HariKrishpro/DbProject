package com.SpringBot.springBoot;

import com.FeignClient.feignClient.SampleFeign;
import com.FeignClient.feignClient.TodoModel;
import com.MyJdbc.myJdbc.StudentModel;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class StudentController {

    @Autowired
    private StudentModelBusiness studentModelBusiness;

    @Autowired
    SampleFeign sampleFeign;

//    Logger logger = LoggerFactory.getLogger(StudentController.class);

    @RequestMapping(value = "/hey")
    public String sayHello(){
        return "HEY";
    }

    @RequestMapping("/showStudent")
    public List<StudentModel> showStudentModel(){
        return studentModelBusiness.getStudentModels();
    }

    @RequestMapping("/showStudent/{roll}")
    public StudentModel showStudentModelByRollNumber(@PathVariable("roll") String rollNumber){
//        logger.info("Student with RollNumber : "+rollNumber+" is Requested"+"\n");
        StudentModel studentModel =  studentModelBusiness.getSpecificStudentModel(rollNumber);

//        if(studentModel==null)
//            logger.error("The Given RollNumber is not Valid : "+rollNumber+"\n");

        return studentModel;
    }

    @RequestMapping(value = "/addStudent", method = RequestMethod.POST)
    public void addStudentModel(@RequestBody StudentModel studentModel){
//        logger.info("Student added : "+studentModel+"\n");
        studentModelBusiness.addSpecificStudentModel(studentModel);
    }

    @RequestMapping(value = "/updateStudent/{id}" , method = RequestMethod.PUT)
    public void updateStudentModel(@RequestBody StudentModel studentModel, @PathVariable String id){
//        logger.info("Student With "+id+" is updated To "+ studentModel+"\n");
        studentModelBusiness.updateSpecificStudentModel(studentModel,id);
    }

    @RequestMapping(value = "/deleteStudent/{id}", method = RequestMethod.DELETE)
    public void deleteStudentModel(@PathVariable String id){
//        logger.info("Student with RollNumber : "+id+" is Deleted From DB \n ");
        studentModelBusiness.deleteSpecificStudentModel(id);
    }

    @RequestMapping(value = "/todo")
    public List<TodoModel> getFeign(){
        return sampleFeign.getTodo();
    }


}
