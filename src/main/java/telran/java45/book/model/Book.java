package telran.java45.book.model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import telran.java45.book.dto.AuthorDto;

@Getter
@Setter
@EqualsAndHashCode(of = "isbn")
@Entity
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Book implements Serializable {
	private static final long serialVersionUID = 804059174231169516L;
	@Id
	String isbn;
	String title;
	@ManyToMany
	Set<Author> authors;
	@ManyToOne
	Publisher publisher;
	
	
	
	
	
}
