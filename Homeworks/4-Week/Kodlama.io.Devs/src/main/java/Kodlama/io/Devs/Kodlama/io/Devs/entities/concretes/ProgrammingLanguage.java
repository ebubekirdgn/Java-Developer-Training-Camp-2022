package Kodlama.io.Devs.Kodlama.io.Devs.entities.concretes;

import lombok.Data;

@Data
public class ProgrammingLanguage {
	private int id;
	private String languageName;
	
	public ProgrammingLanguage() {
		super();
	}

	public ProgrammingLanguage(int id, String languageName) {
		super();
		this.id = id;
		this.languageName = languageName;
	}
}