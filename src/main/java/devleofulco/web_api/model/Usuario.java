package devleofulco.web_api.model;

import io.swagger.v3.oas.annotations.media.Schema;

@Schema(description = "Modelo de dados para um usuário")
public class Usuario {
    @Schema(description = "Login do usuário", example = "Leandresson")
    private String login;

    @Schema(description = "Senha do usuário", example = "senha123")
    private String password;

    public Usuario() {}

    public Usuario(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "login='" + login + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
