package com.cenfotec.examen.controllers;

import com.cenfotec.examen.entities.Cliente;
import com.cenfotec.examen.entities.PersonaContacto;
import com.cenfotec.examen.entities.Trabajo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import java.util.Optional;
import com.cenfotec.examen.entities.Auditor;
import com.cenfotec.examen.service.AuditorService;
import com.cenfotec.examen.service.ClienteService;
import com.cenfotec.examen.service.PersonaContactoService;
import com.cenfotec.examen.service.TrabajoService;


@Controller
public class AppController {
    @Autowired
    AuditorService auditorService;

    @Autowired
    ClienteService clienteService;

    @Autowired
    PersonaContactoService personaContactoService;

    @Autowired
    TrabajoService trabajoService;

    @RequestMapping("/")
    public String home(Model model) {
        return "index";
    }

    @RequestMapping(value = "/registroAuditor", method = RequestMethod.GET)
    public String insertarPage(Model model) {
        model.addAttribute(new Auditor());
        return "registroAuditor";
    }

    @RequestMapping(value = "/registroAuditor", method = RequestMethod.POST)
    public String insertarAction(Auditor auditor, BindingResult result, Model model) {

        auditorService.save(auditor);
        return "index";
    }
    @RequestMapping("/listarAuditores")
    public String listarAuditores(Model model) {
        model.addAttribute("auditores", auditorService.getAll());
        return "listarAuditores";
    }

    @RequestMapping("/editarAuditor/{id}")
    public String findAuditorToEdit(Model model, @PathVariable long id) {
        Optional<Auditor> possibleData = auditorService.get(id);
        if (possibleData.isPresent()) {
            model.addAttribute("auditorToEdit",possibleData.get());
            return "editarAuditor";
        }
        return "notfound";
    }

    @RequestMapping(value = "/editarAuditor/{id}", method = RequestMethod.POST)
    public String guardarCambios(Auditor auditor, BindingResult result,Model model,
                                 @PathVariable long id) {
        auditorService.save(auditor);
        return "index";
    }

    @RequestMapping(value = "/registroCliente", method = RequestMethod.GET)
    public String insertarCliente(Model model) {
        model.addAttribute(new Cliente());
        return "registroCliente";
    }


    @RequestMapping(value = "/registroCliente", method = RequestMethod.POST)
    public String insertarClienteAction(Cliente cliente, BindingResult result, Model model) {

        clienteService.save(cliente);
        return "index";
    }
    @RequestMapping("/listarClientes")
    public String listarClientes(Model model) {
        model.addAttribute("clientes", clienteService.getAll());
        model.addAttribute("personaContacto",personaContactoService.getAll());
        return "listarClientes";
    }
    @RequestMapping(value = "/registrarContacto", method = RequestMethod.GET)
    public String insertarContacto(Model model) {
        model.addAttribute(new PersonaContacto());
        model.addAttribute("cliente", clienteService.getAll());
        return "registrarContacto";
    }
    @RequestMapping(value = "/registrarContacto", method = RequestMethod.POST)
    public String insertarAction(PersonaContacto personaContacto, BindingResult result, Model model) {

        personaContactoService.save(personaContacto);
        return "index";
    }
    @RequestMapping("/listarContactos")
    public String listarContactos(Model model) {
        model.addAttribute("personaContacto",personaContactoService.getAll());
        return "listarContactos";
    }

    @RequestMapping("/editarContacto/{id}")
    public String findContactoToEdit(Model model, @PathVariable long id) {
        Optional<PersonaContacto> possibleData = personaContactoService.get(id);
        if (possibleData.isPresent()) {
            model.addAttribute("contactoToEdit",possibleData.get());
            model.addAttribute("cliente", clienteService.getAll());
            return "editarContacto";
        }
        return "notfound";
    }

    @RequestMapping(value = "/editarContacto/{id}", method = RequestMethod.POST)
    public String guardarCambiosContacto(PersonaContacto contacto, BindingResult result,Model model,
                                 @PathVariable long id) {
        personaContactoService.save(contacto);
        return "index";
    }

    @RequestMapping(value = "/deleteContacto/{id}", method = RequestMethod.POST)
    public String deleteEdition(PersonaContacto contacto, Model model, @PathVariable long id) {
        personaContactoService.delete(contacto);
        return "index";
    }

    @RequestMapping("/deleteContacto/{id}")
    public String findCatToDelete(Model model, @PathVariable long id) {
        Optional<PersonaContacto> possibleData = personaContactoService.get(id);
        if (possibleData.isPresent()) {
            model.addAttribute("contacto", possibleData.get());
            return "deleteContacto";
        }
        return "notfound";
    }

    @RequestMapping(value = "/registrarTrabajo", method = RequestMethod.GET)
    public String insertarTrabajo(Model model) {
        model.addAttribute(new Trabajo());
        model.addAttribute("cliente", clienteService.getAll());
        model.addAttribute("auditor", auditorService.getAll());
        return "registrarTrabajo";
    }
    @RequestMapping(value = "/registrarTrabajo", method = RequestMethod.POST)
    public String insertarAction(Trabajo trabajo, BindingResult result, Model model) {

        trabajoService.save(trabajo);
        return "index";
    }
    @RequestMapping("/listarTrabajos")
    public String listarTrabajos(Model model) {
        model.addAttribute("trabajos", trabajoService.getAll());

        return "listarTrabajos";
    }


}
