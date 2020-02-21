package ua.splinestudio.sandbox.task;

class ValidateDataForTriangle {
  public String name;
  public float sideA;
  public float sideB;
  public float sideC;

  ValidateDataForTriangle(String name, float sideA, float sideB, float sideC){
    this.name = name;
    this.sideA = sideA;
    this.sideB = sideB;
    this.sideC = sideC;
  }

  static ValidateDataForTriangle checkValidData(String[] triangleData){
    if(triangleData.length != 4){
      System.out.println("Inputted data is incorrect");
      return new ValidateDataForTriangle("", 0, 0, 0);
    }
    String validName = ValidateDataForTriangle.getValidateName(triangleData[0]);
    float[] lengthSides = ValidateDataForTriangle.checkValidLength(triangleData);
    return new ValidateDataForTriangle(validName, lengthSides[0], lengthSides[1], lengthSides[2]);
  }

  static String getValidateName(String name){
    if(name.isEmpty()){
      return  "withoutName";
    }
    return name;
  }

  static float[] checkValidLength(String[] triangleData){
    float[] validateData = new float[3];
    try {
      validateData[0] = Float.parseFloat(triangleData[1]);
      validateData[1] = Float.parseFloat(triangleData[2]);
      validateData[2] = Float.parseFloat(triangleData[3]);
      return validateData;
    }catch (NumberFormatException e){
      System.out.println("Inputted data is incorrect");
      return new float[3];
    }
  }
}
