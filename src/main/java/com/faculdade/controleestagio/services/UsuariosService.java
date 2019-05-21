package com.faculdade.controleestagio.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.faculdade.controleestagio.models.Usuarios;

@Service
public class UsuariosService {
	
	public List<Usuarios> getTodosUsuarios() {
		List<Usuarios> lista = new ArrayList<Usuarios>();

		for (int i = 0; i < 10; i++) {

			Usuarios usuario = new Usuarios("Usuário " + i, 10 + i, "teste" + i + "@gmail.com");
			usuario.setCodigo(i);
			lista.add(usuario);

		}

		return lista;
	}

	public void salvarUsuario(Usuarios usuario) throws Exception {

		System.out.println(usuario.toString());
		System.out.println("Fingindo que estou salvando no banco de dados bla bla bla");

	}

}
