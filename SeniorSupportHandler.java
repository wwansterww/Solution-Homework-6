//PART1-----------------------------------------------------------------------------------------------------------------

public class SeniorSupportHandler extends SupportHandler {
    protected boolean canHandle(String issue) {
        return issue.equals("account_ban") || issue.equals("data_loss");
    }

    protected void handleIssue(String issue) {
        logger.info("SeniorSupport successfully resolved the request " + issue);
        System.out.println("[SeniorSupport] Request resolved " + issue);
    }

    @Override
    public void handle(String issue) {
        if (!canHandle(issue)) {
            logger.warning("SeniorSupport cannot resolve request (escalation required) " + issue);
            System.out.println("[SeniorSupport] I can't solve the problem (" + issue + ") – manual escalation required");
        } else {
            handleIssue(issue);
        }
    }
}