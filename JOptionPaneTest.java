package Java_LS2;
import javax.swing.JOptionPane;

public class JOptionPaneTest {
    public static void main(String[] args) {
        String radiusStr;
        double radius, area;
        radiusStr = JOptionPane.showInputDialog("Enter radius of the circle: ");
        radius = Double.parseDouble(radiusStr);
        radius = radius * radius * Math.PI;
        System.out.println("The area is : " + radius);
    }
}
