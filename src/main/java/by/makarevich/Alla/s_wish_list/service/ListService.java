package by.makarevich.Alla.s_wish_list.service;

import by.makarevich.Alla.s_wish_list.dto.RequestDTO;
import by.makarevich.Alla.s_wish_list.dto.ResponseDTO;
import by.makarevich.Alla.s_wish_list.repository.Repository;

import java.util.ArrayList;

public class ListService {
    public ResponseDTO show(RequestDTO requestDTO){

        Repository repository = new Repository();
        ArrayList<String> list = new ArrayList<>(repository.get());

        String outputString = "";

        for (int i = 0; i < list.size(); i++) {
            outputString +=  String.valueOf(i+1) + " " + list.get(i) + "\n";
        }

        return new ResponseDTO(requestDTO.getChatID(), outputString);
    }
}
