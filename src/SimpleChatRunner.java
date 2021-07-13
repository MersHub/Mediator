public class SimpleChatRunner {
    public static void main(String[] args) {

        SimpleTextChat chat = new SimpleTextChat();

        User admin = new Admin(chat,"Admin");
        User user1 = new SimpleUser(chat, "User1");
        User user2 = new SimpleUser(chat , "User2");

        chat.setAdmin(admin);
        chat.addUserToChat(user1);
        chat.addUserToChat(user2);

        user1.sendMessage("Hello I am User 1");
        admin.sendMessage("Roget that. I am admin");

    }
}
