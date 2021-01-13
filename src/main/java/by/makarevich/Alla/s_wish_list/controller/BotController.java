package by.makarevich.Alla.s_wish_list.controller;

import by.makarevich.Alla.s_wish_list.dto.ResponseDTO;
import com.google.inject.internal.cglib.core.$CollectionUtils;
import org.springframework.stereotype.Component;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

@Component
public class BotController extends TelegramLongPollingBot {
    UpdateDispatcher updateDispatcher = new UpdateDispatcher();

    @Override
    public String getBotUsername() {
        return "Allas_wish_list_bot";
    }

    @Override
    public String getBotToken() {
        return "1390830604:AAE_3caOH1njNZcW6fgDUj-dIIgFx1KRPnc";
    }

    @Override
    public void onUpdateReceived(Update update) {
        sendMesg(updateDispatcher.dispatch(update));
    }

    public void sendMesg(ResponseDTO response) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(String.valueOf(response.getChatId()));
        sendMessage.setText(response.getResponse());

        try {
            execute(sendMessage);
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }

}
