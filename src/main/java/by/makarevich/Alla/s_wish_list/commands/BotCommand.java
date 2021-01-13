package by.makarevich.Alla.s_wish_list.commands;

public enum BotCommand {
    START("/start", "Старт"),
    ADD("/add", "Добавить желание"),
    LIST("/list", "список желаний"),
    DELETE("/del", "удалить желание"),
    NONE("", "");

    final String command;
    final String description;

    BotCommand(String command, String description) {
        this.command = command;
        this.description = description;
    }

    public String getCommand() {
        return command;
    }

    public String getDescription() {
        return description;
    }

    public static BotCommand toCommand(String command) {
        if (command.startsWith("/add") && command.length() > 4) {
            return ADD;
        }else if (command.startsWith("/del")&& command.length() > 4){
            return DELETE;
        }
        switch (command) {
            case "/start":
                return START;
            case "/list":
                return LIST;
            default:
                return NONE;
        }
    }
}
