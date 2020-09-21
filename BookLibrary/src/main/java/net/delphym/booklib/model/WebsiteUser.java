package net.delphym.booklib.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Builder
@AllArgsConstructor
@Entity
public class WebsiteUser {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	private String name, email;
}
