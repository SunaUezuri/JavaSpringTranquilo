package br.com.fiap.TranquiloWeb.controler;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloSpringController {

    //Conexão GET HTTP
    @RequestMapping("/hello")
    public String index() {return "<h1>Hello World!</h1>";}

    @RequestMapping("/cadastro/{nome}")
    public String dizerNome(@PathVariable String nome) {return "Olá meu nome é: " + nome;}

    @RequestMapping("/info")
    public String apresentar(@RequestParam("nome") String nome, @RequestParam("idade") int idade) {
        return "<h1>Olá pessoal meu nome é: " + nome + " e eu tenho: " + idade + " anos";
    }

    @PostMapping("/cadastrar")
    public String cadastrar() {
        return "Usuário cadastrado com sucesso";
    }
}
