package telran.java45.book.dto;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Getter
@Setter
@ToString
public class BookDto {
	String isbn;
	String title;
	Set<AuthorDto> authors;
	String publisher;
	
	public BookDto() {
		this.authors = new HashSet<>();
	}

	public BookDto(String isbn, String title, Set<AuthorDto> authors,  String publisher) {
		this();
		this.authors = authors;
		this.isbn = isbn;
		this.title = title;
		this.publisher = publisher;
	}
	

	
}
