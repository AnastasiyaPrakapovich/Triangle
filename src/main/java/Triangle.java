
public class Triangle {

    public static String getTriangle(int a, int b, int c) {
//        if(a >= (b+c) || c >= (b+a) || b >= (a+c) ) {
//            return "Not a Triangle";
//        }
          if((a==b && b==c) || a>1 || b>1 || c>1 ) {
            return "Equilateral Triangle";
        }  else if((a!=b && b!=c && c!=a) || a>1 || b>1 || c>1  ){
            return "Scalene Triangle" ;
        } else if ((a==b && b!=c ) || (a!=b && c==a) || (c==b && c!=a) || a>1 || b>1 || c>1 ) {
            return"Isosceles Triangle";
        }
          else
              return "Not a Triangle";
    }
}