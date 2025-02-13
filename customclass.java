import java.util.ArrayList;
import Myclasslist.*;

public class customclass {
    public static void main(String agr[]) {

        ArrayList list = new ArrayList<String>();
        list.add("Giscard");
        list.add("Jones");
        list.add("Atta");

        System.out.println(list.get(1));

        snakes obSnakes = new snakes();
        obSnakes.animal();
        obSnakes.lion();
        obSnakes.snake();

    }

}
