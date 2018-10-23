package Behavioral.Mediator;

public class ChatClient {
    public static void main(String[] args) {
        ChatMediator mediator = new ChatMediatorImpl();
        User user1 = new UserImpl(mediator, "VanPhu");
        User user2 = new UserImpl(mediator, "NgoNam");
        User user3 = new UserImpl(mediator, "HuyNguyen");
        User user4 = new UserImpl(mediator, "Pham Thu");
        mediator.addUser(user1);
        mediator.addUser(user2);
        mediator.addUser(user3);
        mediator.addUser(user4);
        user1.send("I miss You");
        user2.send("I need you");
    }
}
