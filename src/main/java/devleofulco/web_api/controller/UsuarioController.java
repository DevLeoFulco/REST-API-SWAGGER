package devleofulco.web_api.controller;

import devleofulco.web_api.model.Usuario;
import devleofulco.web_api.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.List;

@RestController
@RequestMapping("/usuarios")
@Tag(name = "Usuario", description = "API para gerenciamento de usuários")
public class UsuarioController {

    @Autowired
    private UsuarioRepository repository;

    @PostMapping
    @Operation(summary = "Criar usuário", description = "Cria um novo usuário")
    public void post(@RequestBody Usuario usuario){
        repository.save(usuario);
    }

    @PutMapping
    @Operation(summary = "Atualizar usuário", description = "Atualiza um usuário existente")
    public void put(@RequestBody Usuario usuario){
        repository.update(usuario);
    }

    @GetMapping
    @Operation(summary = "Listar usuários", description = "Lista todos os usuários")
    public List<Usuario> getAll(){
        return repository.listAll();
    }

    @GetMapping("/{id}")
    @Operation(summary = "Obter usuário", description = "Obtém um usuário pelo ID")
    public Usuario getOne(@PathVariable("id") Integer id){
        return repository.finById(id);
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "Excluir usuário", description = "Exclui um usuário pelo ID")
    public void delete(@PathVariable("id") Integer id){
        repository.remove(id);
    }
}
