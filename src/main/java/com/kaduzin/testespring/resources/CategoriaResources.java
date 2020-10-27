package com.kaduzin.testespring.resources;

import com.kaduzin.testespring.domain.Categoria;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value="/categorias")
public class CategoriaResources {

    @RequestMapping(method= RequestMethod.GET)
    public List<Categoria> listar() {
        Categoria cat = new Categoria(1, "Informatica");
        Categoria cat2 = new Categoria(2, "Escritorio");

        List<Categoria> lista = new ArrayList<>();
        lista.add(cat);
        lista.add(cat2);

        return lista;
    }

}
