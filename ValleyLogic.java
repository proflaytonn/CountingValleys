package dumpFile_Challenge;

public class ValleyLogic {
    public static void main(String[] args) {
        //HackerRank case : https://www.hackerrank.com/challenges/counting-valleys/problem?isFullScreen=true

//        int steps = 8;
//        String path = "UDDDUDUU";
        int steps = 12;
        String path = "DDUUDDUDUUUD";
        int startPoint = 0;
        int count = 0;
        int halfwayToTheValley = 0; //for checker if the startPoint is below the sea level

        char[] pathArray = path.toCharArray();
        for(int i = 0 ; i< steps ; i++)
        {
            if(pathArray[i] == 'U')
            {
                startPoint++;
            }
            else
            {
                startPoint--;
            }

            if(startPoint<0)
            {
                halfwayToTheValley++;
            }
            else if(halfwayToTheValley > 0 && startPoint == 0 && pathArray[i] != 'D')
            {
                count++;
            }
        }

        System.out.println(count);
    }
}
