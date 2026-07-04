import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AIChatbot {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Map<String, String> chatbot = new HashMap<>();

        // Predefined questions and responses
        chatbot.put("hello", "Hello! Welcome to our website. How can I help you?");
        chatbot.put("hi", "Hi! How may I assist you today?");
        chatbot.put("products", "We offer electronics, clothing, home appliances, and accessories.");
        chatbot.put("services", "We provide product sales, customer support, and online ordering.");
        chatbot.put("business hours", "Our business hours are 9:00 AM to 6:00 PM (Monday to Saturday).");
        chatbot.put("location", "Our office is located in Chennai, Tamil Nadu.");
        chatbot.put("contact", "You can contact us at support@example.com or call +91-9876543210.");
        chatbot.put("thank you", "You're welcome! Have a great day.");
        chatbot.put("bye", "Thank you for visiting. Goodbye!");

        System.out.println("========== AI CHATBOT ==========");
        System.out.println("Type 'bye' to exit.");

        while (true) {

            System.out.print("\nYou: ");
            String input = sc.nextLine().toLowerCase();

            if (chatbot.containsKey(input)) {
                System.out.println("Bot: " + chatbot.get(input));
            } else {
                System.out.println("Bot: Sorry! I don't understand your query.");
            }

            if (input.equals("bye")) {
                break;
            }
        }

        sc.close();
    }
}