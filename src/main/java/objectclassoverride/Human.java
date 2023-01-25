package objectclassoverride;

public class Human {
    public String name;
    public int age;
    public int height;

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {

        if (obj instanceof Human) {
            if (((Human) obj).name.equals(this.name) && ((Human)obj).age == this.age) {
                return true;
            }
        }

        return false;
    }
}
