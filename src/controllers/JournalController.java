package controllers;

import models.Journal;
import services.JournalService;

import java.util.List;

public class JournalController {
    private final JournalService journalService;

    public JournalController() {
        this.journalService = new JournalService();
    }

    public void addJournal(Journal journal) {
        journalService.addJournal(journal);
    }

    public List<Journal> getAllJournals() {
        return journalService.getAllJournals();
    }

    public Journal getJournalById(int id) {
        return journalService.getJournalById(id);
    }

    public void updateJournal(Journal journal) {
        journalService.updateJournal(journal);
    }

    public void deleteJournal(int id) {
        journalService.deleteJournal(id);
    }
}
