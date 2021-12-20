package one.digitalinnovation.personApi.service;

import one.digitalinnovation.personApi.dto.MessageResponseDTO;
import one.digitalinnovation.personApi.entity.Person;
import one.digitalinnovation.personApi.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {
    private PersonRepository personRepository;

    @Autowired
    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public MessageResponseDTO createPerson(Person person){
        Person savedPerson = personRepository.save(person);
        return MessageResponseDTO
                .builder()
                .message("Created person with id " + person.getId())
                .build();
    }
}