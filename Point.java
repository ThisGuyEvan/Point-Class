public class Point {

    private double x;
    private double y;

    public Point(double x, double y) {
      this.x = x;
      this.y = y;
    }



    public double distance(double x, double y){
      //Distance formula.
      double distance = Math.sqrt((Math.pow((this.x - x), 2)) + (Math.pow((this.y - y), 2)));

      return distance;
      
    }

    //Original point.
    public String original(){
      return "(" + this.x + ", " + this.y + ")";

    }

    public String translate(String[] directions, double[] pos){
      double posX = x;
      double posY = y;

      //Loop (Future Usage).
      for (int i = 0; i < directions.length; i++){
        String s = directions[i];
        double movement = pos[i];
        //Classify and change.
        switch (s.toUpperCase()){
          case ("UP"):  posY += movement; break;
          case ("RIGHT"): posX -= movement; break;
          case ("LEFT"): posX += movement; break;
          case ("DOWN"): posY -= movement; break;
        }
      }


      return "(" + posX + ", " + posY + ")";
    }

    public String reflection(String axis){
      double posX = x;
      double posY = y;
      //Conditions on identifying which axis and modifying.
      if (axis.equalsIgnoreCase("x")){
        posX *= -1;
      }
      else{
        posY *= -1;
      }

      return "(" + posX + ", " + posY + ")";
    }

    public String quadrants(double x, double y){
      //Conditionals to identify.
      String loc = "Unidentified";

      if (x > 0 && y > 0){
        loc = "First.";
      }
      else if (x < 0 && y > 0){
        loc = "Second.";
      }
      else if (x < 0 && y < 0){
        loc = "Third.";
      }
      else if (x > 0 && y < 0){
        loc = "Fourth.";
      }

      return loc;
    }


   
}