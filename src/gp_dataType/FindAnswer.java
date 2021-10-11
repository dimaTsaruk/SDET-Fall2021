package gp_dataType;

import java.util.Arrays;
import java.util.List;

    public class FindAnswer {
        public static void main(String[] args) {
            /**

             Fix program.
             Add the best data type and find answers for the following questions.

             Update following characters =>
             ***    = DATA_TYPE (primitive: boolean, char, byte, short, int, long, float, double; object: String)
             ???  = ANSWER

             Then run the main method

             Example:
             // Which programming language is the best?
             *** bestLanguage = ???;

             Answer:
             // Which programming language is the best?
             String bestLanguage = “Java”;
             */

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


















            // IGNORE THIS

            List answers = Arrays.asList(
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
            FindAnswerLogging.testData(answers);
        }

}
