package controllers;

import models.Paper;
import services.PaperService;

import java.util.List;

public class PaperController {
    private final PaperService paperService;

    public PaperController() {
        this.paperService = new PaperService();
    }

    public void addPaper(Paper paper) {
        paperService.addPaper(paper);
    }

    public List<Paper> getAllPapers() {
        return paperService.getAllPapers();
    }

    public Paper getPaperById(int id) {
        return paperService.getPaperById(id);
    }

    public void updatePaper(Paper paper) {
        paperService.updatePaper(paper);
    }

    public void deletePaper(int id) {
        paperService.deletePaper(id);
    }
}
