import java.util.*;

public class SaveStarShip {
    public int calculateDistance(int distance) {
        if (distance < 0) {
            return distance * -1;
        }

        return distance;
    }

    public String[] getPlanets(String galaxy){
        String[] galaxys = {"Miaru", "Milkyway", "DangerBanger"};
        String[][] planets = {{"Maux", "Reux", "Piax"}, {"Earth", "Mars", "Jupiter"}, {"Fobius", "Demius"}, {}};

        int flag = -1;
        for (int i = 0; i < 3; i++) {
            if (galaxy.equals(galaxys[i])) {
                flag = i;
            }
        }
        if (flag > -1) {
            return planets[flag];
        } else {
            return planets[3];
        }
    }



    //Test output
    public static void main(String[] args) {
        SaveStarShip ship = new SaveStarShip();

        //Should be 10
        System.out.println(ship.calculateDistance(-10));

        //Should be [Fobius, Demius]
        System.out.println(Arrays.toString(ship.getPlanets("DangerBanger")));
    }
}