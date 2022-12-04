package dumpFile_Challenge;

public class MountainLogic {
    public static void main(String[] args) {
        
        //same case just a different logic for counting mountains
        int steps = 12;
        String path = "DDUUDDUDUUUD";
        int startPoint = 0;
        int count = 0;
        int halfwayToTheMountain = 0; //for checker if the startPoint is above the sea level

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

            if(startPoint>0)
            {
                halfwayToTheMountain++;
            }
            else if(halfwayToTheMountain > 0 && startPoint == 0 && pathArray[i] != 'U')
            {
                count++;
            }
        }

        System.out.println(count);
    }
}
