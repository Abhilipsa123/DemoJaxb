
public enum Continent {

  NORTH_AMERICA (23, 247090001),
  // ...
  EUROPE (50, 393100000);

  public int countryCount;  // Noncompliant
  private int landMass;

  Continent(int countryCount, int landMass) {
    // ...
  }

  public void setLandMass(int landMass) {  // Noncompliant
    this.landMass = landMass;
  }
}
