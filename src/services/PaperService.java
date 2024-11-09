package services;

import models.Paper;

import java.util.ArrayList;
import java.util.List;

public class PaperService {
    private List<Paper> papers = new ArrayList<>();

    public void addPaper(Paper paper) {
        papers.add(paper);
    }

    public List<Paper> getAllPapers() {
        return new ArrayList<>(papers);
    }

    public Paper getPaperById(int id) {
        return papers.stream()
                .filter(paper -> paper.getId() == id)
                .findFirst()
                .orElse(null);
    }

    public void updatePaper(Paper updatedPaper) {
        for (int i = 0; i < papers.size(); i++) {
            if (papers.get(i).getId() == updatedPaper.getId()) {
                papers.set(i, updatedPaper);
                return;
            }
        }
    }

    public void deletePaper(int id) {
        papers.removeIf(paper -> paper.getId() == id);
    }
}
