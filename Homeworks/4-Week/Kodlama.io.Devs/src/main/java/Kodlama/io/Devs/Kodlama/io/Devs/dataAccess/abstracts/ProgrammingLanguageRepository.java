package Kodlama.io.Devs.Kodlama.io.Devs.dataAccess.abstracts;

import java.util.List;
import org.springframework.stereotype.Repository;
import Kodlama.io.Devs.Kodlama.io.Devs.entities.concretes.ProgrammingLanguage;

@Repository
public interface ProgrammingLanguageRepository {
	void add(ProgrammingLanguage programmingLanguage);

	void delete(ProgrammingLanguage programmingLanguage);

	void update(ProgrammingLanguage programmingLanguage);

	List<ProgrammingLanguage> getAll();

	ProgrammingLanguage findById(int id);
}
