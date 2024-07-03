public enum Direction {
  North(2),East(1),South(-2),West(-1);

  private int directionnumber;

  private Direction(int directionnumber){
    this.directionnumber = directionnumber;
  }

  public int getValue(){
    return this.directionnumber;
  }

  //Advantage: Able to present some relationship a among the enum objects
  // public boolean isOppsite(Direction direction){
  // return this.getValue() == direction.getValue() * -1;}

  public static boolean isOppsite(Direction direction,Direction direction2){
    return direction.directionnumber + direction2.directionnumber == 0;
    }

    public boolean isOppsite(Direction direction){
      return this.directionnumber + direction.directionnumber == 0;
      }

      public Direction oppsite(){
        for(Direction d : Direction.values()){
        if(this.directionnumber + d.directionnumber == 0)
        //if(d.getValue() == this.getValue() * -1)
        return d;
      }
      return null;
      }

      public static Direction oppsite(Direction direction){
        for(Direction D : Direction.values()){
          if(D.getValue() == direction.getValue() * -1)
          return D;
        }
        return null;
      }

    public static void main(String[] args) {
      System.out.println(Direction.East.isOppsite(Direction.North));
      System.out.println(isOppsite(Direction.East,Direction.West));
      System.out.println(Direction.East.oppsite());
      System.out.println(Direction.oppsite(East));
    }
  }