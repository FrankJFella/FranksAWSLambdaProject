package frankslambdaapp;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.amazonaws.services.lambda.runtime.events.SQSEvent;

public class LambdaHandler implements RequestHandler<SQSEvent, String> {
    @Override
    public String handleRequest(SQSEvent input, Context context) {

        new AppFunctions().appMain();

        return "finito";
    }
}
