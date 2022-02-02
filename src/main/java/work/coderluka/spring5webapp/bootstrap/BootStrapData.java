package work.coderluka.spring5webapp.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import work.coderluka.spring5webapp.domain.Author;
import work.coderluka.spring5webapp.domain.Book;
import work.coderluka.spring5webapp.domain.Publisher;
import work.coderluka.spring5webapp.repositories.AuthorRepository;
import work.coderluka.spring5webapp.repositories.BookRepository;
import work.coderluka.spring5webapp.repositories.PublisherRepository;

import java.awt.desktop.SystemEventListener;

@Component
public class BootStrapData implements CommandLineRunner {

    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;
    private final PublisherRepository publisherRepository;

    public BootStrapData(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Author dan = new Author("Dan", "Brown");
        Book tdc = new Book("The Da Vinci Code", "1234567890");
        Publisher p = new Publisher("Some publisher", "Ortschaft", "Stadt", "State", "1234");

        publisherRepository.save(p);

        System.out.println("Number of publishers: " + publisherRepository.count());

        dan.getBooks().add(tdc);
        tdc.getAuthors().add(dan);

        authorRepository.save(dan);
        bookRepository.save(tdc);

        Author robert = new Author("Robert", "Martin");
        Book cc = new Book("Clean Code", "0987654321");

        robert.getBooks().add(cc);
        cc.getAuthors().add(robert);

        authorRepository.save(robert);
        bookRepository.save(cc);

        System.out.println("Sterted in Bootstrap");
        System.out.println("Number of Books: " + bookRepository.count());
    }
}
