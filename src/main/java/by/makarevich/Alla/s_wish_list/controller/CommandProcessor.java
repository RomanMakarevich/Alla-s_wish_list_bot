package by.makarevich.Alla.s_wish_list.controller;

import by.makarevich.Alla.s_wish_list.commands.BotCommand;
import by.makarevich.Alla.s_wish_list.dto.RequestDTO;
import by.makarevich.Alla.s_wish_list.dto.ResponseDTO;
import by.makarevich.Alla.s_wish_list.service.AddService;
import by.makarevich.Alla.s_wish_list.service.DelService;
import by.makarevich.Alla.s_wish_list.service.ListService;
import by.makarevich.Alla.s_wish_list.service.StartService;
import org.telegram.telegrambots.meta.api.objects.Message;

public class CommandProcessor {
    private StartService startService = new StartService();
    private AddService addService = new AddService();
    private ListService listService = new ListService();
    private DelService delService = new DelService();

    public ResponseDTO processText(Message message) {

        BotCommand command = BotCommand.toCommand(message.getText());

        switch (command) {
            case START:
                return startService.start(new RequestDTO(message));
            case ADD:
                return addService.add(new RequestDTO(message));
            case LIST:
                return listService.show(new RequestDTO(message));
            case DELETE:
                return delService.del(new RequestDTO(message));
            case NONE:
            default:
                return new ResponseDTO(message.getChatId(), "Неизвестная команда.");
        }
    }
}
