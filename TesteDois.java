import javax.swing.*;

public class TesteDois {
    public static void main(String[] args) {
        int q,n;
        n = Integer.parseInt(JOptionPane.showInputDialog("Entre com o número:"));
        q = n*n;
        JOptionPane.showMessageDialog(null, "O quadrado de " + n + " é " + q);
    }
    
}
