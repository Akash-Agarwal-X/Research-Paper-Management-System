package services;

import models.Journal;

import java.util.ArrayList;
import java.util.List;

public class JournalService {
    private List<Journal> journals = new ArrayList<>();

    public void addJournal(Journal journal) {
        journals.add(journal);
    }

    public List<Journal> getAllJournals() {
        return new ArrayList<>(journals);
    }

    public Journal getJournalById(int id) {
        return journals.stream()
                .filter(journal -> journal.getId() == id)
                .findFirst()
                .orElse(null);
    }

    public void updateJournal(Journal updatedJournal) {
        for (int i = 0; i < journals.size(); i++) {
            if (journals.get(i).getId() == updatedJournal.getId()) {
                journals.set(i, updatedJournal);
                return;
            }
        }
    }

    public void deleteJournal(int id) {
        journals.removeIf(journal -> journal.getId() == id);
    }
}
