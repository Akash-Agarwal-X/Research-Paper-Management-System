package ui;

import javax.swing.*;
import java.awt.*;
import controllers.PaperController;
import models.Paper;
import java.util.ArrayList;

public class MainFrame extends JFrame {
    private PaperController paperController = new PaperController();

    public MainFrame() {
        setTitle("Research Paper Management System");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        initializeUI();
    }

    private void initializeUI() {
        JButton addButton = new JButton("Add Paper");
        addButton.addActionListener(e -> addPaper());

        JButton viewButton = new JButton("View Papers");
        viewButton.addActionListener(e -> viewPapers());

        JButton deleteButton = new JButton("Delete Paper");
        deleteButton.addActionListener(e -> deletePaper());

        JPanel panel = new JPanel();
        panel.add(addButton);
        panel.add(viewButton);
        panel.add(deleteButton);
        add(panel, BorderLayout.CENTER);
    }

    private void addPaper() {
        String title = JOptionPane.showInputDialog(this, "Enter Paper Title");

    // Check if the title dialog was canceled or closed
    if (title == null) {
        return; // Exit the method if the title dialog is canceled
    }

    try {
        String yearStr = JOptionPane.showInputDialog(this, "Enter Publication Year");
        
        // Check if the year dialog was canceled or closed
        if (yearStr == null) {
            return; // Exit the method if the year dialog is canceled
        }
        
        int year = Integer.parseInt(yearStr);
        
        Paper paper = new Paper(paperController.getAllPapers().size() + 1, title, new ArrayList<>(), year, null, new ArrayList<>());
        paperController.addPaper(paper);

        JOptionPane.showMessageDialog(this, "Paper Added Successfully!");
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Invalid Year. Please enter a valid number.", "Error", JOptionPane.ERROR_MESSAGE);
    }
    }

    private void viewPapers() {
        StringBuilder paperList = new StringBuilder();
        for (Paper paper : paperController.getAllPapers()) {
            paperList.append(paper.getId()).append(". ").append(paper.getTitle()).append(" (").append(paper.getYear()).append(")\n");
        }
        JOptionPane.showMessageDialog(this, paperList.toString(), "All Papers", JOptionPane.INFORMATION_MESSAGE);
    }

    private void deletePaper() {
        String idStr = JOptionPane.showInputDialog(this, "Enter Paper ID to Delete");

    // Check if the ID dialog was canceled or closed
    if (idStr == null) {
        return; // Exit the method if the ID dialog is canceled or closed
    }

    try {
        int id = Integer.parseInt(idStr);
        paperController.deletePaper(id);
        JOptionPane.showMessageDialog(this, "Paper Deleted Successfully!");
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Invalid ID. Please enter a valid number.", "Error", JOptionPane.ERROR_MESSAGE);
    }
    }
}
