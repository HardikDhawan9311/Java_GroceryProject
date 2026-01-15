package ui;

import java.awt.*;
import javax.swing.*;

public class AdminDashboard extends JFrame {

    public AdminDashboard() {
        setTitle("Admin Dashboard");
        setSize(520,360);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JPanel main = new JPanel(new BorderLayout());
        main.setBackground(UIStyle.BG_COLOR);

        JLabel title = new JLabel("ADMIN PANEL", JLabel.CENTER);
        title.setFont(UIStyle.TITLE_FONT);
        title.setForeground(Color.WHITE);

        JPanel header = new JPanel();
        header.setBackground(UIStyle.HEADER_COLOR);
        header.add(title);

        JPanel center = new JPanel(new GridLayout(4,1,15,15));
        center.setBorder(BorderFactory.createEmptyBorder(30,120,30,120));
        center.setBackground(UIStyle.BG_COLOR);

        JButton addProduct = styledButton("Add Product");
        JButton updateStock = styledButton("Update Stock");
        JButton viewSales = styledButton("View Sales Report");
        JButton logout = styledButton("Logout");

        logout.addActionListener(e -> {
            dispose();
            new LoginUI();
        });

        center.add(addProduct);
        center.add(updateStock);
        center.add(viewSales);
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
