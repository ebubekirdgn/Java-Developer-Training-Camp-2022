package Kodlama.io.Devs.Kodlama.io.Devs.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import Kodlama.io.Devs.Kodlama.io.Devs.dataAccess.abstracts.ProgrammingLanguageRepository;
import Kodlama.io.Devs.Kodlama.io.Devs.entities.concretes.ProgrammingLanguage;

@Repository
public class InMemoryProgrammingLanguageRepository implements ProgrammingLanguageRepository{

	List<ProgrammingLanguage> programmingLanguages;
	ProgrammingLanguageRepository programmingLanguageRepository;
	
	
	public InMemoryProgrammingLanguageRepository() {
		programmingLanguages = new ArrayList<ProgrammingLanguage>();
		programmingLanguages.add(new ProgrammingLanguage(1,"Java"));
		programmingLanguages.add(new ProgrammingLanguage(2,"C#"));
		programmingLanguages.add(new ProgrammingLanguage(3,"Python"));
	}

	@Override
	public void add(ProgrammingLanguage programmingLanguage) {
		programmingLanguages.add(programmingLanguage);
	}

	@Override
	public void delete(ProgrammingLanguage programmingLanguage) {
		// TODO Auto-generated method stub
		programmingLanguages.remove(programmingLanguage.getId());
	}

	@Override
	public void update(ProgrammingLanguage programmingLanguage) {
		ProgrammingLanguage pLanguage =programmingLanguageRepository.findById(programmingLanguage.getId());
		pLanguage.setLanguageName(programmingLanguage.getLanguageName());
	}

	@Override
	public List<ProgrammingLanguage> getAll() {
		return programmingLanguages;
	}

	@Override
	public ProgrammingLanguage findById(int id) {
		ProgrammingLanguage pLang = null;
		for(ProgrammingLanguage pLanguage : programmingLanguages ) {
			if(pLanguage.getId() == id) {
				pLang = pLanguage;
			}
		}
		return pLang;
	}
}