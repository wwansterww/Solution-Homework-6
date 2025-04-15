//PART1-----------------------------------------------------------------------------------------------------------------

public class JuniorSupportHandler extends SupportHandler {
    protected boolean canHandle(String issue) {
        return issue.equals("refund_request") || issue.equals("billing_issue");
    }

    protected void handleIssue(String issue) {
        logger.info("JuniorSupport processed the request " + issue);
        System.out.println("[JuniorSupport] I figured it out " + issue);
    }
}
