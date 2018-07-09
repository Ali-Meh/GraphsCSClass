import java.util.Scanner;

public class golam {
    public static void main(String[] args) {
        int numberOfTiles,numberOfSteps,pos=0,Numbertoadd=+1;


        Scanner sc=new Scanner(System.in);
        numberOfTiles=sc.nextInt();
        numberOfSteps=sc.nextInt();

        int[] tiles=new int[numberOfTiles];

        for(int i=0;i<numberOfTiles;i++)
        {
            tiles[i]=sc.nextInt();
            if(tiles[i]==2||tiles[i]==3)
            {
                pos=i;
                if(tiles[i]==2)
                    Numbertoadd=+1;
                else
                    Numbertoadd=-1;
            }
        }
        int count=0;
        for(int i=0;i<numberOfSteps;i++)
        {
            if(tiles[pos]==0)
                count++;
            pos+=Numbertoadd;
            if(pos==0||pos==numberOfTiles-1)
            {
                if(tiles[pos]==0)
                    count++;
                Numbertoadd=-Numbertoadd;
                pos+=Numbertoadd;
            }

        }
        System.out.println(count);
    }
}
