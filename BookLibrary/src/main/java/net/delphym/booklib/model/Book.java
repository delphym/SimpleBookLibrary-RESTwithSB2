package net.delphym.booklib.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.GeneratedValue;

@Data
@NoArgsConstructor
@Builder
@AllArgsConstructor
@Entity
public class Book {

	@Id
	@GeneratedValue
	private long id;

	@NotNull
	private String title, isbn;

}
