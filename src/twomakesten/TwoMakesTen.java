package twomakesten;

import org.junit.jupiter.api.Test;

public class TwoMakesTen {

    public boolean findTwoMakesTen(int a, int b) {
        if(a + b == 10 || a == 10 || b == 10 ) {
            return true;
        } else {
            return false;
        }
    }
}
