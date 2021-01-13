package by.makarevich.Alla.s_wish_list.service;

import by.makarevich.Alla.s_wish_list.dto.RequestDTO;
import by.makarevich.Alla.s_wish_list.dto.ResponseDTO;
import by.makarevich.Alla.s_wish_list.repository.Repository;

public class AddService {
    public ResponseDTO add(RequestDTO requestDTO) {
        Repository repository = new Repository();
        String text = requestDTO.getText().substring(4).trim();

        repository.save(text);
        return new ResponseDTO(requestDTO.getChatID(), "В вишлист добавлен пункт " + text);
    }
}
