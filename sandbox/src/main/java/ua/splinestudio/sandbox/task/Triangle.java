package ua.splinestudio.sandbox.task;

class Triangle implements Comparable{
  private float sideA;
  private float sideB;
  private float sideC;
  private float area;
  private String name;
  private double random;

  Triangle(String name, float sideA, float sideB, float sideC){
    this.name = name;
    this.sideA = sideA;
    this.sideB = sideB;
    this.sideC = sideC;
    this.random = Math.random()*10000;
    TriangleAreaCalculate area = ()->{
      float p = (this.sideA + this.sideB + this.sideC)/2;
      float triangleArea = (float)Math.sqrt(p*(p-this.sideA)*(p-this.sideB)*(p-sideC));
      return triangleArea;
    };
    this.area = area.calculateArea();
  }

  public float getArea() {
    return this.area;
  }

  public String getName() {
    return this.name;
  }

  @Override
  public String toString() {
    return "Triangle{" +
            "area=" + area + " " + "name=" + name +
            '}';
  }

  @Override
  public int compareTo(Object o) {
    int compare = (int)((Triangle)o).area - (int)this.area;
    if(compare == 0){
      return (int)this.random - (int)((Triangle)o).random;
    }else{
      return compare;
    }
  }
}
