package Principal;

/* Login dos Usuários - Profissionais e Clientes */

public class Usuario {
    public String Id;
    public String Email;
    public String Senha;
    public String Nome;
    public String UrlFoto;

    public Usuario(String Email, String Senha, String Nome, String UrlFoto) {
        this.Email = Email;
        this.Senha = Senha;
        this.Nome = Nome;
        this.UrlFoto = UrlFoto;
    }

    public Usuario() {
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getSenha() {
        return Senha;
    }

    public void setSenha(String senha) {
        Senha = senha;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getUrlFoto() {
        return UrlFoto;
    }

    public void setUrlFoto(String urlFoto) {
        UrlFoto = urlFoto;
    }
}
