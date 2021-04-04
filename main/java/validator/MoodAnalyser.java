package validator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MoodAnalyser {
    public static void main(String[] args){

    }
    public String analyseMood(String message){
        if (message.contains("sad"))
            return "SAD";
        else
            return "HAPPY";
    }

}
