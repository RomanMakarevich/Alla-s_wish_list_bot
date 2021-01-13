package by.makarevich.Alla.s_wish_list.dto;

public class ResponseDTO {

        private Long chatId;
        private String response;

        public ResponseDTO(Long chatId, String response) {
            this.chatId = chatId;
            this.response = response;
        }

        public ResponseDTO() {
            response = "Неизвестная команда";
        }

        public Long getChatId() {
            return chatId;
        }

        public void setChatId(Long chatId) {
            this.chatId = chatId;
        }

        public String getResponse() {
            return response;
        }

        public void setResponse(String response) {
            this.response = response;
        }
}
