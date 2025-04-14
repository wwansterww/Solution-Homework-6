
public class FAQBotHandler extends SupportHandler {
    protected boolean canHandle(String issue) {
        return issue.equals("password_reset");
    }

    protected void handleIssue(String issue) {
        logger.info("FAQBot successfully processed the request " + issue);
        System.out.println("[FAQBot] I have processed the request " + issue);
    }
}