

import java.util.*;


public class Stars {
    public static void main(String[] args) {

        int x;
        do {

            Scanner stars = new Scanner(System.in);
            System.out.println("Sapin et guirlande");
            x = stars.nextInt();

        } while ( x > 35 || x < 8 );
        Lostars.log(x);


    }


}


