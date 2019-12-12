package app;

class Character {

  private  int lives;
 private boolean isBig;
    public  int getLives(){
  return lives;
    }

    public void  addLife (){
       lives ++;
    }
    public void loseLife(){
    lives --;
    }
    public boolean hasLives(){
        if (lives < 0){
        return true; }
        else{
        return false;}
    }
      

       public  boolean  getIsBig (){
           return isBig;
       }
       public void pickUpMushroom(){
        isBig = true;
       }
        public void takeHit(){
          isBig = false;
        }
}