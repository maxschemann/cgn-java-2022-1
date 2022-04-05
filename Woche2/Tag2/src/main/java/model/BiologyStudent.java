package model;

public class BiologyStudent extends Student implements Citizen{

    boolean likesTrees;
    private String adress;
    private int identityCardNumber;

    public BiologyStudent (String name, int id, boolean likesTrees ) {
        super(name, id);
        this.likesTrees = likesTrees;
    }

    @Override
    public String toString() {
        return "BiologyStudent{" +
                "likesTrees=" + likesTrees +
                ", name='" + name + '\'' +
                ", id=" + id +
                '}';
    }

    @Override
    public String getName() {
        return name + " is a Biology Student.";
    }

    @Override
    public String getAdress() {
        return this.name + "; " + this.adress;
    }

    @Override
    public int getIdentityCardNumber() {
        return this.identityCardNumber;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public void setIdentityCardNumber(int id) {
        this.identityCardNumber = id;
    }
}
