package javaiosttream;


import java.io.Serializable;

public class Marksheet implements Serializable {
public int id;
public String name;
public int physics;
public int maths;
  public int chemistry;
  public transient int total = 0;

		


}
