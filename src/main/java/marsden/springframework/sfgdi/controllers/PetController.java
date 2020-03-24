package marsden.springframework.sfgdi.controllers;


import marsden.springframework.sfgdi.services.PetService;
import org.springframework.stereotype.Service;

/**
 * Created by jt on 12/28/19.
 */
@Service
public class PetController {

    private final PetService petService;

    public PetController(PetService petService) {
        this.petService = petService;
    }

    public String whichPetIsTheBest(){
        return petService.getPetType();
    }
}
