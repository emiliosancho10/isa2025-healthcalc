package healthcalc.stats;

public class Paciente {
    public float weight;
    public int height;
    public char gender;
    public int age;
    public float bmr;

    public Paciente(float weight, int height, char gender, int age, float bmr) {
        this.weight = weight;
        this.height = height;
        this.gender = gender;
        this.age = age;
        this.bmr = bmr;
    }
}
