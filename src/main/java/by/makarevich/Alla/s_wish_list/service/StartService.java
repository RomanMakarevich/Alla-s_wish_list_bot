package by.makarevich.Alla.s_wish_list.service;

import by.makarevich.Alla.s_wish_list.dto.RequestDTO;
import by.makarevich.Alla.s_wish_list.dto.ResponseDTO;

public class StartService {
    public ResponseDTO start(RequestDTO requestDTO) {


        return new ResponseDTO(requestDTO.getChatID(), "Это список желаний Аллы Шпаковской!\n\n" +
                "Нажми /list , чтобы просмотреть список желаний.\n" +
                "Напиши как в примере, чтобы добавить желание: \"/add стиральная машина\".\n" +
                "Напиши /del и номер желания, если решишь осуществить его.");
    }
}
