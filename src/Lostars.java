

public class Lostars {


//    static void Triangle(int x) {
//        char lint[][] ;
//
//        for (int i = 0 ;   ){
//
//            for (){
//
//            }
//        }

//    }


    public static void log(int x){

        for(int col = 0 ; col <= x ; col = col + 2){

            for(int SP = x ; SP  > col  ; SP = SP - 2 ){
                System.out.print(" ");
            }

            for(int star = 1 ; star <= col - 1  ; star++){
                System.out.print("x");
            }
            System.out.println("");
        }
    }


















    static void remplirTriangle(char[][] triangle, char c) {
        int nbLigne = triangle.length;
        int nbColonne;

        for (int i = 0; i < nbLigne; ++i) {
            nbColonne = i*2 + 1;
            triangle[i] = new char[nbColonne];
            for (int j = 0; j < nbColonne; ++j) {
                triangle[i][j] = c;
            }
        }
    }
}
