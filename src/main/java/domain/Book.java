package domain;

import javax.persistence.Entity;

@Entity
public class Book extends Product{
    private String isbn;
}
