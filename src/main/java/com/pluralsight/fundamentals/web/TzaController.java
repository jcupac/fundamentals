package com.pluralsight.fundamentals.web;

import com.pluralsight.fundamentals.entity.Application;
import com.pluralsight.fundamentals.service.ApplicationService;
import com.pluralsight.fundamentals.service.ReleaseService;
import com.pluralsight.fundamentals.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TzaController {
    private ApplicationService applicationService;
    private TicketService ticketService;
    private ReleaseService releaseService;

    @Autowired
    public void setApplicationService(ApplicationService applicationService) {
        this.applicationService = applicationService;
    }

    @Autowired
    public void setTicketService(TicketService ticketService) {
        this.ticketService = ticketService;
    }

    @Autowired
    public void setReleaseService(ReleaseService releaseService) {
        this.releaseService = releaseService;
    }

    // HTTP request
    // the 'model' is what gets displayed on tha view
    @GetMapping("/applications")
    public String retrieveApplications(Model model) {
        model.addAttribute("applications", applicationService.listApplications());
        return "applications";
    }

    @GetMapping("/tickets")
    public String retrieveTickets(Model model) {
        model.addAttribute("tickets", ticketService.listTickets());
        return "tickets";
    }

    @GetMapping("/releases")
    public String retrieveReleases(Model model) {
        model.addAttribute("releases", releaseService.listReleases());
        return "releases";
    }


}