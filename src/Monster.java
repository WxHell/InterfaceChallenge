import java.util.ArrayList;
import java.util.List;

public class Monster implements ISaveable{
    private String name;
    private int hitPoints;
    private int strength;

    public Monster(String name, int hitPoints, int strength) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.strength = strength;
    }

    public String getName() {
        return name;
    }


    public int getHitPoints() {
        return hitPoints;
    }

    public int getStrength() {
        return strength;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }


    @Override
    public List<String> write() {
        List<String> monster = new ArrayList<>();
        monster.add(name);
        monster.add(" "+hitPoints);
        monster.add(" "+strength);
        return monster;
    }

    @Override
    public void read(List<String> list) {
        if (list !=null && list.size()>0){
            name = list.get(0);
            hitPoints=Integer.parseInt(list.get(1));
            strength = Integer.parseInt(list.get(2));
        }

    }

    @Override
    public String toString() {
        return  "Monster{" +
                "name='" + name + "', " + "hitPoints=" +
                hitPoints + ", " + "strength=" + strength +
                 "'}";
    }
}
