package com.app.noteitapi.model;

import com.app.noteitapi.repository.NoteRepository;
import com.app.noteitapi.repository.NotebookRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DbSeeder implements CommandLineRunner {
    private NotebookRepository notebookRepository;
    private NoteRepository noteRepository;

    public DbSeeder(NotebookRepository notebookRepository, NoteRepository noteRepository) {
        this.notebookRepository = notebookRepository;
        this.noteRepository = noteRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        this.notebookRepository.deleteAll();
        this.noteRepository.deleteAll();

        var defaultNotebook = new Notebook("Default");
        this.notebookRepository.save(defaultNotebook);

        var quotesNotebook = new Notebook("Quotes");
        this.notebookRepository.save(quotesNotebook);

        var testingNotebook = new Notebook("Testing");
        this.notebookRepository.save(testingNotebook);

        var testingNotebook2 = new Notebook("Testing2");
        this.notebookRepository.save(testingNotebook2);


        var note = new Note("Hello", "Welcome to Note It", defaultNotebook);
        this.noteRepository.save(note);

        var note2 = new Note("Buhuhu", "Bine ati venit in aplicatia mea", defaultNotebook);
        this.noteRepository.save(note2);

        var note3 = new Note("Ciao, bella", "Una Peroni per te", defaultNotebook);
        this.noteRepository.save(note3);


        System.out.println("Initialized database");

    }
}
