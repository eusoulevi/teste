package br.com.teste.mb.exemplo;


import java.io.Serializable;
import com.xpert.core.crud.AbstractBaseBean;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import br.com.teste.bo.exemplo.PessoaExemploBO;
import br.com.teste.modelo.exemplo.PessoaExemplo;

/**
 *
 * @author ayslan
 */
@ManagedBean
@ViewScoped
public class PessoaExemploMB extends AbstractBaseBean<PessoaExemplo> implements Serializable {

    @EJB
    private PessoaExemploBO pessoaExemploBO;

    @Override
    public PessoaExemploBO getBO() {
        return pessoaExemploBO;
    }

    @Override
    public String getDataModelOrder() {
        return "id";
    }
}
