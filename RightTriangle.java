public class RightTriangle
{


//This is the Instance Data - Declaring Variables
private double base;
private double height;

//Constructors-
public RightTriangle() // This is the Default Constructor
{
  base = 1.0;
  height = 1.0;
}

public RightTriangle(double bs, double ht) // Constructor with Height and Base valuse
{

  if(bs>0)
  {
    base = bs;
  }
  else
  {
    base = 1;
  }
  if(ht>0)
  {
    height = ht;
  }
  else
  {

    height = 1;
  }
}


//Mutators















}