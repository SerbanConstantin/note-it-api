package com.app.noteitapi.controller;

import com.app.noteitapi.Mapper;

import com.app.noteitapi.controller.viewmodel.NotebookViewModel;
import com.app.noteitapi.model.Notebook;
import com.app.noteitapi.repository.NotebookRepository;

import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;



import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/notebooks")
@CrossOrigin
public class NotebookController {
    private NotebookRepository notebookRepository;
    private Mapper mapper;

    public NotebookController(NotebookRepository notebookRepository, Mapper mapper) {
        this.notebookRepository = notebookRepository;
        this.mapper = mapper;
    }

    @GetMapping("/all")
    public List<Notebook> all() {
        var allCategories = this.notebookRepository.findAll();
        return allCategories;
    }

    @PostMapping
    public Notebook save(@RequestBody NotebookViewModel notebookViewModel,
                         BindingResult bindingResult) {
//        if (bindingResult.hasErrors()) {
//            throw new ValidationException();
//        }

        var notebookEntity = this.mapper.convertToNotebookEntity(notebookViewModel);

        // save notebookEntity instance to db
        this.notebookRepository.save(notebookEntity);

        return notebookEntity;
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable String id) {
        this.notebookRepository.deleteById(UUID.fromString(id));
    }
}
