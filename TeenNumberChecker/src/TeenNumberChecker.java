public class TeenNumberChecker {
    public static boolean hasTeen(int ilkSayi,int ikinciSayi,int ucuncuSayi){
        if((ilkSayi>=13&&ilkSayi<=19)||(ikinciSayi>=13&&ikinciSayi<=19)||(ucuncuSayi>=13&&ucuncuSayi<=19))
        {
            return true;
        }
        return false;
    }
    public static boolean isTeen(int Sayi){
        if(Sayi>=13&&Sayi<=19){
            return true;
        }
        else return false;
    }
}
