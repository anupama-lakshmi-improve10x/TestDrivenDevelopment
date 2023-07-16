package namegreeting;

public class NameGreeting {

    public String helloName(String name) {
        if(name == "") {
            return "";
        } else {
            String nameGreeting = "Hello " + name + "!";
            return nameGreeting;
        }
        }

    }
