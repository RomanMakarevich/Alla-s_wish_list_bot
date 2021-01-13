package by.makarevich.Alla.s_wish_list.service;

import by.makarevich.Alla.s_wish_list.dto.RequestDTO;
import by.makarevich.Alla.s_wish_list.dto.ResponseDTO;
import by.makarevich.Alla.s_wish_list.repository.Repository;

import java.util.ArrayList;

public class DelService {
    public ResponseDTO del(RequestDTO requestDTO){

        Repository repository = new Repository();
        String text = requestDTO.getText().substring(4).trim();
        ArrayList<String> list = new ArrayList<>(repository.get());
        String outputString = "Ты выбрал подарить Алле " + list.get(Integer.parseInt(text) - 1) + ", этот подарок удален из вишлиста!\n\n";
        list.remove(Integer.parseInt(text) - 1);

        repository.save(list);



        for (int i = 0; i < list.size(); i++) {
            outputString +=  String.valueOf(i+1) + " " + list.get(i) + "\n";
        }

        return new ResponseDTO(requestDTO.getChatID(), outputString);
    }
}
