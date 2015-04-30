package br.com.teste.bo.escola;

import com.xpert.core.crud.AbstractBusinessObject;
import br.com.teste.dao.escola.AlunoDAO;
import com.xpert.core.validation.UniqueField;
import com.xpert.core.exception.BusinessException;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import br.com.teste.modelo.escola.Aluno;

/**
 *
 * @author levi
 */
@Stateless
public class AlunoBO extends AbstractBusinessObject<Aluno> {

    @EJB
    private AlunoDAO alunoDAO;
    
    @Override
    public AlunoDAO getDAO() {
        return alunoDAO;
    }

    @Override
    public List<UniqueField> getUniqueFields() {
        return null;
    }

    @Override
    public void validate(Aluno aluno) throws BusinessException {
    }

    @Override
    public boolean isAudit() {
        return true;
    }

}
