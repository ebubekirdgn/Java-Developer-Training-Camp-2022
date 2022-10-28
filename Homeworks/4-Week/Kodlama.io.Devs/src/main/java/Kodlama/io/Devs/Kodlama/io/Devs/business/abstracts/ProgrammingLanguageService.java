package Kodlama.io.Devs.Kodlama.io.Devs.business.abstracts;

import java.util.List;

import Kodlama.io.Devs.Kodlama.io.Devs.entities.concretes.ProgrammingLanguage;

public interface ProgrammingLanguageService {
	void add(ProgrammingLanguage programmingLanguage) throws Exception;

	void delete(ProgrammingLanguage programmingLanguage);

	void update(ProgrammingLanguage programmingLanguage);

	List<ProgrammingLanguage> getAll();

	ProgrammingLanguage findById(int id);
}
