package sept.ex_23092024_Condition;

public class lab079 {
    public static void main(String[] args) {
        // In web automation if user ask : which browser you want to start
        //if chrome--> execute chrome
        //if firefox--> execute firefox
        //if edge-- > execute edge

        String browser = "chrome";
        switch (browser){

            case "chrome":
                System.out.println("Starting the chrome browser");
                //further code to start the chrome
                //Webdriver driver = new chrome();   //selenium code
                break;

            case "edge":
                System.out.println("Starting the edge browser");
               break;
                //furthermore code to start the edge
            // webdriver driver = new edge();    // selenium code

            case "firefox":
                System.out.println("Starting the firefox browser");
                break;
            default:
                System.out.println("I have no idea which browser is this");
                break;
        }


    }
}
