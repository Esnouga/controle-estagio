package com.faculdade.controleestagio.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.faculdade.controleestagio.models.Usuarios;
import com.faculdade.controleestagio.services.UsuariosService;

@Controller
@RequestMapping("/usuarios")
public class UsuariosController {

	@Autowired
	private UsuariosService usuariosService;

	@GetMapping
	public ModelAndView getUsuarios() {

		ModelAndView mv = new ModelAndView("usuarios/listar");

		List<Usuarios> listaUsuarios = usuariosService.getTodosUsuarios();

		mv.addObject("listaUsuarios", listaUsuarios);

		return mv;
	}

	@GetMapping("/novo")
	public ModelAndView novoUsuario(Usuarios usuario) {
		ModelAndView mv = new ModelAndView("usuarios/gerenciar");
		return mv;
	}
	
	@GetMapping("/alterar")
	public ModelAndView alterarUsuario(@RequestParam("id") String codigo) {
		ModelAndView mv = new ModelAndView("usuarios/gerenciar");
		
		Usuarios usuario = new Usuarios("Alessandro", 25, "teste@gmail.com");
		usuario.setCodigo(1);
		
		mv.addObject("usuarios", usuario);
		return mv;
	}

	@PostMapping("/novo")
	public ModelAndView gerenciarUsuario(Usuarios usuario, BindingResult result, RedirectAttributes attributes) {

		try {
			usuariosService.salvarUsuario(usuario);

			attributes.addAttribute("sucesso", "Usuário salvo com sucesso!");

		} catch (Exception e) {
			e.printStackTrace();
			attributes.addAttribute("erro", "Ocorreu erro ao salvar usuário!!");
		}

		return new ModelAndView("redirect:/usuarios");
	}

}
