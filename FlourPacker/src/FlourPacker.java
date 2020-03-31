public class FlourPacker {
    public static boolean canPack(int bigCount,int smallCount,int goal)
    {
        if(bigCount<0||smallCount<0||goal<0){
           return false;
       }
        if(bigCount>0) {
            for (; goal >= bigCount; goal -= 5) {

                if (goal < 5|| bigCount<=0) {
                    break;
                }
                bigCount--;
            }
        }
        int remainder=goal;
        if(remainder<=smallCount){
            return true;
        }
        else return false;

    }
}
