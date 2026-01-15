package ui;

import java.awt.*;
import javax.swing.*;

public class CashierDashboard extends JFrame {

    public CashierDashboard() {
        setTitle("Cashier Dashboard");
        setSize(420,260);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JPanel main = new JPanel(new BorderLayout());
        main.setBackground(UIStyle.BG_COLOR);

        JLabel title = new JLabel("CASHIER PANEL", JLabel.CENTER);
        title.setFont(UIStyle.TITLE_FONT);
        title.setForeground(Color.WHITE);

        JPanel header = new JPanel();
        header.setBackground(UIStyle.HEADER_COLOR);
        header.add(title);

        JPanel center = new JPanel(new GridLayout(2,1,15,15));
        center.setBorder(BorderFactory.createEmptyBorder(40,120,40,120));
        center.setBackground(UIStyle.BG_COLOR);

        JButton startBilling = styledButton("Start Billing");
        JButton logout = styledButton("Logout");

        startBilling.addActionListener(e -> new BillingUI());
        logout.addActionListener(e -> {
            dispose();
            new LoginUI();
        });

        center.add(startBilling);
        center.add(logout);

        main.add(header, BorderLayout.NORTH);
        main.add(center, BorderLayout.CENTER);
        add(main);

        setVisible(true);
    }

    private JButton styledButton(String text) {
        JButton btn = new JButton(text);
        btn.setFont(UIStyle.BUTTON_FONT);
        btn.setBackground(UIStyle.BUTTON_COLOR);
        btn.setForeground(Color.WHITE);
        return btn;
    }
}
