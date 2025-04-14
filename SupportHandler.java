import java.util.logging.Logger;

public abstract class SupportHandler {
    protected SupportHandler next;
    protected static final Logger logger = Logger.getLogger(SupportHandler.class.getName());

    public SupportHandler setNext(SupportHandler handler) {
        this.next = handler;
        return handler;
    }

    public void handle(String issue) {
        if (!canHandle(issue)) {
            if (next != null) {
                logger.info("I am passing the request to the next level " + issue);
                next.handle(issue);
            } else {
                logger.warning("The request could not be processed " + issue);
                System.out.println("[System] No one can process the request " + issue);
            }
        } else {
            handleIssue(issue);
        }
    }

    protected abstract boolean canHandle(String issue);
    protected abstract void handleIssue(String issue);
}