import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class MaSolution {
    static ArrayList<String> category = new ArrayList(Arrays.asList("CHANCE", "YATZY", "ONE", "TWO", "THREE", "FOUR", "FIVE", "SIXE","PAIR","TWO PAIRS",
        "THREE OF A KIND Three","FOUR OF A KIND","SMALL STRAIGHT","LARGE STRAIGHT","FULL HOUSE"));
    static int[]tour={1,1,1,1,1} ;
    static Yatzy yasty = new Yatzy(1, 1, 2, 4, 4);
    static Scanner sc = new Scanner(System.in);
    public static void main( String [] args ){
        AfficheCategorie();

    }

    public static void AfficheCategorie(){
        int index;//cette variable permet de recuperer les indices de la liste pour numeroter chaque categorie
        int cate;//recupere le numero du choix de la categorie entrée
        int score =0;
        do{
            index=0;
            System.out.println("choose the category from 1 to 15");
            //cette bouble affiche la liste ndes categorie
            for(String cat:category) {
                index++;
                System.out.println("category "+index+" : "+cat);
            }
            cate= sc.nextInt();
            System.out.println(category.get(cate-1));
            String categorie = category.get(cate-1);
            switch (categorie){
                case "CHANCE" : int totalCat1 = Yatzy.chance(4, 5, 5, 6, 1);
                    System.out.println("votre point pour cette partie est : "+totalCat1);
                    score=score+totalCat1;
                    break;
                case "YATZY" : int totalCat2 = Yatzy.yatzy(tour);
                    System.out.println("votre point pour cette partie est : "+totalCat2);
                    score=score+totalCat2;
                    break;
                case "ONE" :  int totalCat3 = Yatzy.ones(1, 1, 2, 4, 4 );
                    System.out.println("votre point pour cette partie est : "+totalCat3);
                    score=score+totalCat3;
                    break;
                case "TWO" : int totalCat4 = Yatzy.twos(1, 1, 2, 4, 4);
                    System.out.println("votre point pour cette partie est : "+totalCat4);
                    score=score+totalCat4;
                    break;
                case "THREE" : int totalCat5 = Yatzy.threes(1, 1, 2, 4, 4);
                    System.out.println("votre point pour cette partie est : "+totalCat5);
                    score=score+totalCat5;
                    break;
                case "FOUR" : int totalCat6 = yasty.fours();
                    System.out.println("votre point pour cette partie est : "+totalCat6);
                    score=score+totalCat6;
                    break;
                case "FIVE" : int totalCat7 = yasty.fives();
                    System.out.println("votre point pour cette partie est : "+totalCat7);
                    score=score+totalCat7;
                    break;
                case "SIXE" : int totalCat8 = yasty.sixes();
                    System.out.println("votre point pour cette partie est : "+totalCat8);
                    score=score+totalCat8;
                    break;
                case "PAIR" : int totalCat9 = Yatzy.score_pair(1,2,3,4,5 );
                    System.out.println("votre point pour cette partie est : "+totalCat9);
                    score=score+totalCat9;
                    break;
                case "TWO PAIRS" : int totalCat10 = Yatzy.two_pair(1,1,2,3,3);
                    System.out.println("votre point pour cette partie est : "+totalCat10);
                    score=score+totalCat10;
                    break;
                case "THREE OF A KIND" :  int totalCat11 = Yatzy.four_of_a_kind(2,2,2,2,5);
                    System.out.println("votre point pour cette partie est : "+totalCat11);
                    score=score+totalCat11;
                    break;
                case "FOUR OF A KIND" : int totalCat12 = Yatzy.three_of_a_kind(3,3,3,4,5);
                    System.out.println("votre point pour cette partie est : "+totalCat12);
                    score=score+totalCat12;
                    break;
                case "SMALL STRAIGHT" : int totalCat13 = Yatzy.smallStraight(1,2,3,4,5);
                    System.out.println("votre point pour cette partie est : "+totalCat13);
                    score=score+totalCat13;
                    break;
                case "LARGE STRAIGHT" :  int totalCat14 = Yatzy.largeStraight(2,3,4,5,6);
                    System.out.println("votre point pour cette partie est : "+totalCat14);
                    score=score+totalCat14;
                    break;
                case "FULL HOUSE" : int totalCat15 = Yatzy.fullHouse(1,1,2,2,2);
                    System.out.println("votre point pour cette partie est : "+totalCat15);
                    score=score+totalCat15;
                    break;
            }
            category.remove(category.get(cate-1));
        }while (category.size()!=0);
        System.out.println("Partie terminée vous avez obtenu un total de : "+score);

    }
}
