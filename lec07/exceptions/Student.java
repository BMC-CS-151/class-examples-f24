class Student {
  private String name;
  private double gpa;
  private String dorm;

  public Student(String name, double gpa, String dorm) {
      if (gpa < 0) {
            throw new NegativeGPAException("You can't have a negative GPA");
      }
    //TODO: If the GPA is negative, throw a NegativeGPAException
    //First, let's just throw a normal Exception.

    this.name = name;
    this.gpa = gpa;
    this.dorm = dorm;
  }

  public Student() {}

  public String getName() {
    return name;
  }

  public double getGpa() {
    return gpa;
  }

  public String getDorm() {
    return dorm;
  }

  public String toString() {
    return name + " " + gpa + " " + dorm;
  }

}
