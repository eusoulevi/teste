package br.com.teste.modelo.escola;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.SequenceGenerator;
import org.hibernate.validator.constraints.NotBlank;

/**
 *
 * @author levi
 */
@Entity
public class Aluno implements Serializable {
    
    @Id
    @SequenceGenerator(name="sequence", sequenceName="aluno_id_seq")
    @GeneratedValue(generator = "sequence", strategy = GenerationType.SEQUENCE)
    private Long id;
    
    @NotBlank
    private String nome;

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
    
    
}
