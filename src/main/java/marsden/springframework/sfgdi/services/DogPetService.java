package marsden.springframework.sfgdi.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * Created by jt on 12/28/19.
 */
@Profile({"dog", "default"})
//@Primary
@Service
public class DogPetService implements PetService{
    @Autowired
    public String getPetType(){
        return "Dogs are the best!";
    }
}
