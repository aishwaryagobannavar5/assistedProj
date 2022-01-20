package customException;
class CustomException extends Exception
{
 String s1;
 
  CustomException(String s2) {
  s1=s2;
 }
 public String toString() {
  return ("CustomException defines: "+s1) ;
 }
 public static void main(String args[]){
  try {
   throw new CustomException("E – R – R – O - R ");
  }
  catch(CustomException e1) {
   System.out.println(e1) ;
  }
 }
}