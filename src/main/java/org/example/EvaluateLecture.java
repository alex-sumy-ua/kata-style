package org.example;

public class EvaluateLecture {

    public PressResult evaluate(PressResult[] input) {
        PressResult result = PressResult.NEUTRAL;
        // temporary variable
        int tmp = 0;
        int tmpLike = 0;
        int tmpDislike = 0;
        // go through input[]
        for (PressResult pr : input) {
            if (pr == PressResult.LIKE) { tmpLike++; }
            else if (pr == PressResult.DISLIKE) { tmpDislike--; }
        }
        // interpret the result
        tmpLike = tmpLike % 2;
        tmpDislike = tmpDislike % 2;
        // tmp can be > 0 or < 0
        tmp = tmpLike + tmpDislike;
        if (tmp < 0) result = PressResult.DISLIKE;
        else if (tmp == 0) result = PressResult.NEUTRAL;
        else result = PressResult.LIKE;

        return result;
    }

}
