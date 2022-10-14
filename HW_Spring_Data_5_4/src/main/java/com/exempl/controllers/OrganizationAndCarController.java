package com.exempl.controllers;

import com.exempl.entities.dto.DTOOrganizationAndCar;
import com.exempl.entities.dto.DTOOrganizationAndEmployee;
import com.exempl.repositories.OrganizationAndCarRepository;
import com.exempl.services.OrganizationAndCarService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/cars")
public class OrganizationAndCarController {

    OrganizationAndCarService organizationAndCarService;

    public OrganizationAndCarController(OrganizationAndCarService organizationAndCarService) {
        this.organizationAndCarService = organizationAndCarService;
    }

    @GetMapping
    public ModelAndView findFullListOrganizationAndCar(ModelAndView model) {
        List<DTOOrganizationAndCar> dtocar = organizationAndCarService.findFullOrganizationAndCarDto();
        model.addObject("dtocar", dtocar);
        model.setViewName("cars-organization");
        return model;
    }

    @GetMapping("/search-starts")
    public ModelAndView findFullListOrganizationAndCarWithStartNameOrganization(@RequestParam("search") String likeName, ModelAndView model) {
        List<DTOOrganizationAndCar> dtocar = organizationAndCarService
                .findFullOrganizationAndCarDtoStartNameOrganization(likeName);
        model.addObject("dtocar", dtocar);
        model.setViewName("cars-organization");
        return model;
    }

    @GetMapping(path = "/search-containing")
    public ModelAndView findFullListOrganizationAndCarOrganizationNameContaining(@RequestParam("search") String likeName, ModelAndView model) {
        List<DTOOrganizationAndCar> dtocar = organizationAndCarService
                .findFullOrganizationAndCarDtoOrganizationNameContaining(likeName);
        model.addObject("dtocar", dtocar);
        model.setViewName("cars-organization");
        return model;
    }

//    @GetMapping(path = "/{id}")
//    public ModelAndView findFullListOrganizationAndEmployeePoKluchu(@PathVariable("id") Long idOrganization, ModelAndView model) {
//        List<DTOOrganizationAndEmployee> dtoorganization = organizationAndEmployeeService.
//                findFullOrganizationAndEmployeePoKluchu(idOrganization);
//        model.addObject("dtoorganization", dtoorganization);
//        model.setViewName("full-organization");
//        return model;
//    }


}
