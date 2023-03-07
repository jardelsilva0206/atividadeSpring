package devs2blu.atividadefullstack.model;

import devs2blu.atividadefullstack.enums.TipoTratamento;
import jakarta.persistence.*;

import java.io.Serializable;

@Entity
public class Animal implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false,  updatable = false)
    private Long id;
    private String nome;
    private String especie;
    private String raca;
    private String altura;
    private String peso;

    private String tipoPelagemPlumagem;

    private TipoTratamento tipoTratamento;

    public Animal(Long id, String nome, String especie, String raca, String altura, String peso, String tipoPelagemPlumagem, TipoTratamento tipoTratamento) {
        this.id = id;
        this.nome = nome;
        this.especie = especie;
        this.raca = raca;
        this.altura = altura;
        this.peso = peso;
        this.tipoPelagemPlumagem = tipoPelagemPlumagem;
        this.tipoTratamento = tipoTratamento;
    }

    public Animal(){}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getAltura() {
        return altura;
    }

    public void setAltura(String altura) {
        this.altura = altura;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    public String getTipoPelagemPlumagem() {
        return tipoPelagemPlumagem;
    }

    public void setTipoPelagemPlumagem(String tipoPelagemPlumagem) {
        this.tipoPelagemPlumagem = tipoPelagemPlumagem;
    }

    public TipoTratamento getTipoTratamento() {
        return tipoTratamento;
    }

    public void setTipoTratamento(TipoTratamento tipoTratamento) {
        this.tipoTratamento = tipoTratamento;
    }
}
