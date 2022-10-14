package com.exempl.controllers;

import com.exempl.entities.Organization;
import com.exempl.entities.OrganizationAndEmployee;
import com.exempl.entities.dto.DTOOrganizationAndEmployee;
import com.exempl.services.OrganizationAndEmployeeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/all")
public class OrganizationAndEmployeeController {

    OrganizationAndEmployeeService organizationAndEmployeeService;

    public OrganizationAndEmployeeController(OrganizationAndEmployeeService organizationAndEmployeeService) {
        this.organizationAndEmployeeService = organizationAndEmployeeService;
    }

    @GetMapping
    public ModelAndView findFullListOrganizationAndEmployee(ModelAndView model) {
        List<DTOOrganizationAndEmployee> dtoorganization = organizationAndEmployeeService.findFullOrganizationAndEmployeeDto();
        model.addObject("dtoorganization", dtoorganization);
        model.setViewName("full-organization");
        return model;
    }


//    @GetMapping(path = {"/edit", "/edit/{id}"})
//    public String editCarById(Model model, @PathVariable("id") Optional<Long> idOrganization) {
//        if(idOrganization.isPresent()) {
//            Optional<Organization> tempOrganization = organizationService.getOrganizationBuId(idOrganization.get());
//            if (tempOrganization.isPresent()){
//                Organization newOrganization = tempOrganization.get();
//                model.addAttribute("newOrganization", newOrganization);
//                model.addAttribute("actionName", "Edit organization");
//            }
//
//        } else {
//            model.addAttribute("newOrganization", new Organization());
//            model.addAttribute("actionName", "Add new organization");
//        }
//
//        return "add-update-car";
//    }

    @GetMapping("/search-starts")
    public ModelAndView findFullListOrganizationAndEmployeeWithStartNameOrganization(@RequestParam("search") String likeName, ModelAndView model) {
        List<DTOOrganizationAndEmployee> dtoorganization = organizationAndEmployeeService.
               findFullOrganizationAndEmployeeDtoStartNameOrganization(likeName);
        model.addObject("dtoorganization", dtoorganization);
        model.setViewName("full-organization");
        return model;
    }

    @GetMapping(path = "/search-containing")
    public ModelAndView findFullListOrganizationAndEmployeeOrganizationNameContaining(@RequestParam("search") String likeName, ModelAndView model) {
        List<DTOOrganizationAndEmployee> dtoorganization = organizationAndEmployeeService.
                findFullOrganizationAndEmployeeDtoOrganizationNameContaining(likeName);
        model.addObject("dtoorganization", dtoorganization);
        model.setViewName("full-organization");
        return model;
    }
    @GetMapping(path = "/{id}")
    public ModelAndView findFullListOrganizationAndEmployeePoKluchu(@PathVariable("id") Long idOrganization, ModelAndView model) {
        List<DTOOrganizationAndEmployee> dtoorganization = organizationAndEmployeeService.
                findFullOrganizationAndEmployeePoKluchu(idOrganization);
        model.addObject("dtoorganization", dtoorganization);
        model.setViewName("full-organization");
        return model;
    }


}
