package yomisco.com;



/**
 * Created by kogbe on 13/06/2018.
 */

public class StudentEqualPattern {
    private int id;
    private String name;
    public StudentEqualPattern(int id, String name) {
        this.name = name;
        this.id = id;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * Over
     *
     */

    /*
     * Override your default implementation equal to implement your own business rule of equals
     */

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (!(obj instanceof StudentEqualPattern))
            return false;
        if (obj == this)
            return true;
        return this.getId() == ((StudentEqualPattern) obj).getId();
    }

    /**
     * Override hashcode so that object of same id can be compared in HashSet
     * This is needed because Java default implementation of hashcode is to return different hashcode
     * for same object
     */

    /**
     *
     *
     */

    @Override
    public int hashCode() {
        return id;
    }
}
