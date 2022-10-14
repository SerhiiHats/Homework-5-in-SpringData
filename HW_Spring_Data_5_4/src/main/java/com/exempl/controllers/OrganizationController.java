package com.exempl.controllers;

import com.exempl.entities.Organization;
import com.exempl.services.OrganizationService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.websocket.server.PathParam;
import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/")
public class OrganizationController {

    OrganizationService organizationService;

    public OrganizationController(OrganizationService organizationService) {
        this.organizationService = organizationService;
    }

    @GetMapping
    public ModelAndView getAllOrganization(ModelAndView model) {
        List<Organization> list = organizationService.getAllOrganization();
        model.addObject("organization", list);
        model.setViewName("organization");
        return model;
    }
    @GetMapping(path = {"/edit", "/edit/{id}"})
    public String editOrganizationById(Model model, @PathVariable("id") Optional <Long> idOrganization) {
        if(idOrganization.isPresent()) {
            Optional<Organization> tempOrganization = organizationService.getOrganizationBuId(idOrganization.get());
            if (tempOrganization.isPresent()){
                Organization newOrganization = tempOrganization.get();
                model.addAttribute("newOrganization", newOrganization);
                model.addAttribute("actionName", "Edit organization");
            }

        } else {
            model.addAttribute("newOrganization", new Organization());
            model.addAttribute("actionName", "Add new organization");
        }

        return "add-update-organization";
    }

    @GetMapping(path = "/delete/{id}")
    public String deleteOrganizationById (@PathVariable("id") Long idOrganization){
        organizationService.deleteOrganizationById(idOrganization);
        return "redirect:/";
    }

    @PostMapping(path = "/addOrganization")
    public String createOrganization (Organization organization){
        organizationService.createOrUpdateOrganization(organization);
        return "redirect:/";
    }

    @GetMapping(path = "/search-starts")
    public ModelAndView findOrganizationNameStartWith(@RequestParam("search") String nameOrganization, ModelAndView model){
        List<Organization> list = organizationService.findOrganizationNameIsWith(nameOrganization);
        model.addObject("organization", list);
        model.setViewName("organization");
        return model;
    }

    @GetMapping(path = "/search-containing")
    public ModelAndView findOrganizationNameContaining(@RequestParam("search") String nameOrganization, ModelAndView model){
        List<Organization> list = organizationService.findOrganizationNameContaining(nameOrganization);
        model.addObject("organization", list);
        model.setViewName("organization");
        return model;
    }


}
