package fr.lernejo.travelsite;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class TravelController {
    final List<Travel> travelsList = new ArrayList<>();
    final List<User> usersList = new ArrayList<>();

    @PostMapping("/api/inscription")
    public void userInscription(@RequestBody User newUser){
        usersList.add(newUser);
        System.out.println("POST from /api/inscription for " + newUser);
    }

    @GetMapping("/api/travels")
    @ResponseBody
    public List<Travel> getTravelFromUser(@RequestParam String userName){

        for(User userFromList: usersList){
            if(userFromList.userName().equals(userName)){
                travelsList.add(new Travel("Caribbean",32.4));
                travelsList.add(new Travel("Australia",35.1));
            }
        }
        return travelsList;
    }



}
