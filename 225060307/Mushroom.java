import java.util.Scanner;
 public class Mushroom{
    public static void main(String[] args) {
 Scanner p =new Scanner(System.in);
 int forest;
 int convex;
int ring;
int gills;
//Ask the three questions
 System.out.println("Does the mushroom grow in forest?(1=yes,0=no): ");
 forest=p.nextInt();
 System.out.println("Does the mushroom have a convex cup?(1=yes,0=no): ");
 convex=p.nextInt();
//the third question depends on the first two
if(forest ==0 && convex ==1 ){
   System.out.println("your mushroom is Agaric jaunissant");
}
else if (forest==0 && convex ==0){
   System.out.println(" your mushroom is Coprin chevelu");
}
else if(forest==1 && convex==1){
      System.out.println(" Does it have a ring?(1=yes,0=no): ");
      ring= p.nextInt();
      if (ring ==1){
         System.out.println(" your mushroom is Amanite tue-mouche");
      }
         else if(ring ==0){
           System .out.println(" your mushroom is pied bleu");
         }
      }

      else if (forest ==1 && convex ==0){
         System.out.println("Does it have gills?(1=yes,0=no):");
         gills=p.nextInt();
         if(gills==1){
           System .out.println(" your mushroom is Girolle");
         }
         else{
              System .out.println(" your mushroom is Cepe fe bordeaux");
      }
      }
   }
}
 
