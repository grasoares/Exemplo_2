package Principal;

/* Agenda do Profissional */

import java.util.Date;

public class Endereco {
   public Integer Cep;
   public String Uf;
   public String Cidade;
   public String Bairro;
   public String Logradouro;


    public Endereco(Integer Cep, String Uf, String Cidade, String Bairro, String Logradouro) {
        this.Cep = Cep;
        this.Uf = Uf;
        this.Cidade = Cidade;
        this.Bairro = Bairro;
        this.Logradouro = Logradouro;
    }


    public Integer getCep() {
        return Cep;
    }

    public void setCep(Integer cep) {
        Cep = cep;
    }

    public String getUf() {
        return Uf;
    }

    public void setUf(String uf) {
        Uf = uf;
    }

    public String getCidade() {
        return Cidade;
    }

    public void setCidade(String cidade) {
        Cidade = cidade;
    }

    public String getBairro() {
        return Bairro;
    }

    public void setBairro(String bairro) {
        Bairro = bairro;
    }

    public String getLogradouro() {
        return Logradouro;
    }

    public void setLogradouro(String logradouro) {
        Logradouro = logradouro;
    }
}
