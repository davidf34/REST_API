package com.api.crud.Controller;

import com.api.crud.Model.Task;
import com.api.crud.Repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TodoController {
    @Autowired
    private TodoRepository todoRepository;
    @GetMapping(value = "/") //esta anotacion indica en donde va a iniciar
    public String holaMundo(){
        return "Hola mundo!";
    }

    @GetMapping(value = "/task")
    public List<Task> getTasks(){
        return todoRepository.findAll();
    }

    @PostMapping(value = "/savetask")
    public String saveTask(@RequestBody Task task){ //se debe deserializar
        todoRepository.save(task);
        return "Saved task";
    }
    @PutMapping(value = "/update/{id}")
    public String updateTask(@PathVariable int id, @RequestBody Task task){
        Task updatedTask = todoRepository.findById(id).get();
        updatedTask.setAge(task.getAge());
        updatedTask.setName(task.getName());
        updatedTask.setPosition(task.getPosition());
        todoRepository.save(updatedTask);
        return "Updated task";
    }

    @DeleteMapping(value = "/delete/{id}")
        public String deletedTask(@PathVariable int id){
            Task deletedTask = todoRepository.findById(id).get();
            todoRepository.delete(deletedTask);
            return "Deleted task";
    }

}
