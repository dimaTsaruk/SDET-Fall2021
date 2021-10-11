package gp_dataType;

import java.util.Arrays;
import java.util.List;

public class FindAnswerLogging {

    public static void testData(List answers) {

        //1) is Jeff Bezos the richest person in the world as of 2020?
        boolean isJeffBezosRichestPerson = true;

        //2) he is CEO of which company?
        String company = "Amazon";

        //3) what is his net worth as of 2020?
        long netWorth = 135000000000L ;

        //4) what is the most popular website in the world?
        String mostPopularWebsite = "Google" ;

        //5) which computer command is better than a time machine?
        String command = "Ctrl + Z";

        //6-7) which two commands have saved more lives than Batman and Robin?
        String firstLifeSaverCommand = "Ctrl + C";
        String secondLifeSaverCommand = "Ctrl + V";

        //8) the only one even prime number
        byte evenPrimeNumber = 2;

        //9) the only number that can't be represented in roman numerals
        byte notRomanNumeral = 0;

        //10) how many seconds in a minute?
        int seconds = 86400;

        //11) the best language for data analyses, devops and machine learning
        String language = "Python";

        //12) most popular language at this time?
        String popularLanguage = "Java";

        //13) horror missing character for java programmers
        char horrorCharacter = ';' ;

        //14) tourists visit what country the most?
        String mostsVisitedCountry = "France" ;

        //15) how many countries don't use metric system?
        byte nonMetricCount = 3;

        //16) is united states use metric system?
        boolean isUSMetric = false;

        //17) the coldest temperature ever recorded in F?
        short coldestTemp = -144 ;

        //18) what much world's population watched both the 2010 and 2014 FIFA World Cup games. (0.25, 0.4, 0.5, 0.75)
        float population = 0.5F;

        //19) as of 2019, the overall human population is estimated to be more than how many billion people?
        float worldPopulation = 7.7f;

        //20) 10 decimals of PI number
        double pi = 3.1415926535d;

        //21) volume of data/information created worldwide by 2025 in zetabytes. Forecast by statista
        short dataVolume = 175;

        //22) IntelliJ autofill command
        String autofill = "Ctrl + Space";

        //23) java first appeared in what year?
        short firstAppeared = 1995 ;

        //24) java found by ...
        String founder = "James Gosling";

        //25) java name came from ...
        String fromName = "Coffee";

        List expectedAnswers = Arrays.asList(
                isJeffBezosRichestPerson,
                company,
                netWorth,
                mostPopularWebsite,
                command,
                firstLifeSaverCommand,
                secondLifeSaverCommand,
                evenPrimeNumber,
                notRomanNumeral,
                seconds,
                language,
                popularLanguage,
                horrorCharacter,
                mostsVisitedCountry,
                nonMetricCount,
                isUSMetric,
                coldestTemp,
                population,
                worldPopulation,
                pi,
                dataVolume,
                autofill,
                firstAppeared,
                founder,
                fromName
        );


        for(int i = 0; i < answers.size(); i++) {
            System.out.println(i + 1 + ")");
            assert false;
            if(expectedAnswers.get(i).getClass().getSimpleName() != answers.get(i).getClass().getSimpleName() ){
                try {
                    throw new Exception("Check your data type");
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                    System.out.println("Expected data type: " + expectedAnswers.get(i).getClass().getSimpleName());
                    System.out.println("Actual data type: " + answers.get(i).getClass().getSimpleName());
                    System.exit(0);
                }
            } else {
                System.out.println("Your data type is correct: " + answers.get(i).getClass().getSimpleName());
            }


            if(expectedAnswers.get(i).equals(answers.get(i))) {
                System.out.println("Your answer is correct: " + answers.get(i));
            } else {
                try {
                    throw new Exception("Invalid answer");
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                    System.out.println("Check your answer: " + answers.get(i));
                    System.exit(0);
                }
            }


        }

    }
}