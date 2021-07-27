package Principal;

import java.util.Date;

/* Agenda do Profissional */

public class Agenda {
    public Integer Id;
    public Date DiaSemanaDisponivel;
    public Date HoraInicio;
    public Date HoraFim;

    public Agenda(Integer Id, Date DiaSemanaDisponivel, Date HoraInicio, Date HoraFim) {
        this.Id = Id;
        this.DiaSemanaDisponivel = DiaSemanaDisponivel;
        this.HoraInicio = HoraInicio;
        this.HoraFim = HoraFim;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public Date getDiaSemanaDisponivel() {
        return DiaSemanaDisponivel;
    }

    public void setDiaSemanaDisponivel(Date diaSemanaDisponivel) {
        DiaSemanaDisponivel = diaSemanaDisponivel;
    }

    public Date getHoraInicio() {
        return HoraInicio;
    }

    public void setHoraInicio(Date horaInicio) {
        HoraInicio = horaInicio;
    }

    public Date getHoraFim() {
        return HoraFim;
    }

    public void setHoraFim(Date horaFim) {
        HoraFim = horaFim;
    }

}