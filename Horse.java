//Create the Horse class here.

class Horse{

  private String name;
  private Double weight;
  private Boolean tame;

public Horse (String name, Double weight, Boolean tame){
  
  this.name = name;
  this.weight = weight;
  this.tame = tame;
  
}

public String horseName(){
  return this.name;
}

public Double horseWeight(){
  return this.weight;
}

public Boolean horseTame(){
  return this.tame;
}
  
}