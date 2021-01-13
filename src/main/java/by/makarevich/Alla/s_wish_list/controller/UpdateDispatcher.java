package by.makarevich.Alla.s_wish_list.controller;

import by.makarevich.Alla.s_wish_list.dto.ResponseDTO;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.Update;

public class UpdateDispatcher {
    CommandProcessor commandProcessor = new CommandProcessor();


    public ResponseDTO dispatch(Update update) {
        if (update.hasMessage()) {

            return processMessage(update.getMessage());
        }
        return new ResponseDTO();
    }

    public ResponseDTO processMessage(Message message) {
        if (message.hasText()) {
            return commandProcessor.processText(message);
        }
        return new ResponseDTO();
    }
}
