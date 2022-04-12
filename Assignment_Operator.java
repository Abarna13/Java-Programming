class Assignment_Operator{
  public static void main(String[] args)
  {
    int a = 4;
    int var;

    
    var = a;
    System.out.println("var using =: " + var);

    
    var += a; //var = 4+4
    System.out.println("var using +=: " + var);
    
    var -= a;//var = 8-4
    System.out.println("var using -=: " + var);

    
    var *= a;//var = 4*4
    System.out.println("var using *=: " + var);
    
    var /= a;//var = 16/4
    System.out.println("var using /=: " + var);
    
    var %= a;//var = 4%4
    System.out.println("var using %=: " + var);
    
    
    
    
  }
}
