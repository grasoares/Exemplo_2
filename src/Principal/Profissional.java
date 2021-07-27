package Principal;

/* Dados Pessoais do Profissional */

public class Profissional extends Usuario {
    public String Id;
    public String Telefone;
    public Integer Avaliacao;
    public String UrlRedeSocial;
    public String Biografia;
    public String NomeAtividade;
    public Float CustoAtividade;

    public Profissional(String Id, String Telefone, Integer Avaliacao, String UrlRedeSocial, String Biografia, String NomeAtividade, Float CustoAtividade) {
        this.Id = Id;
        this.Telefone = Telefone;
        this.Avaliacao = Avaliacao;
        this.UrlRedeSocial = UrlRedeSocial;
        this.Biografia = Biografia;
        this.NomeAtividade = NomeAtividade;
        this.CustoAtividade = CustoAtividade;

    }

    @Override
    public String getId() {
        return Id;
    }

    @Override
    public void setId(String id) {
        Id = id;
    }

    public String getTelefone() {
        return Telefone;
    }

    public void setTelefone(String telefone) {
        Telefone = telefone;
    }

    public Integer getAvaliacao() {
        return Avaliacao;
    }

    public void setAvaliacao(Integer avaliacao) {
        Avaliacao = avaliacao;
    }

    public String getUrlRedeSocial() {
        return UrlRedeSocial;
    }

    public void setUrlRedeSocial(String urlRedeSocial) {
        UrlRedeSocial = urlRedeSocial;
    }

    public String getBiografia() {
        return Biografia;
    }

    public void setBiografia(String biografia) {
        Biografia = biografia;
    }

    public String getNomeAtividade() {
        return NomeAtividade;
    }

    public void setNomeAtividade(String nomeAtividade) {
        NomeAtividade = nomeAtividade;
    }

    public Float getCustoAtividade() {
        return CustoAtividade;
    }

    public void setCustoAtividade(Float custoAtividade) {
        CustoAtividade = custoAtividade;
    }
}
