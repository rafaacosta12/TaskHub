import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import models.Usuario;

import javax.swing.*;
import java.awt.*;

public class GerenciadorProjetosApp extends JFrame{
    private final CardLayout cardLayout;
    private JPanel mainPanel;

    private final String EMPTY_SCREEN = "EMPTY_SCREEN";
    public GerenciadorProjetosApp(){
        setTitle("Gerenciador de Projetos");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        this.cardLayout = new CardLayout();
        this.mainPanel = new JPanel(cardLayout);

        JPanel emptyPanel = new JPanel(new BorderLayout());
        emptyPanel.add(new JLabel("Bem vindo! Use o main para navegar.",
                         SwingConstants.CENTER) , BorderLayout.CENTER);

        this.mainPanel.add(emptyPanel, EMPTY_SCREEN);

        JMenuBar menuBar = new JMenuBar();
        JMenu menu = new JMenu("Menu");

        JMenuItem listUserItem = new JMenuItem("Lista Usuários");
        JMenuItem exitItem = new JMenuItem("Sair");

        menu.add(listUserItem);
        menu.add(exitItem);

        menuBar.add(menu);
        setJMenuBar(menuBar);

        add(mainPanel);


    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new GerenciadorProjetosApp().setVisible(true);
        });
    }
}
