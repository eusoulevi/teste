package br.com.teste.mb.padrao;

import br.com.teste.modelo.controleacesso.Permissao;
import br.com.teste.modelo.controleacesso.Usuario;
import br.com.teste.modelo.configuracao.ErroSistema;
import br.com.teste.modelo.controleacesso.SituacaoUsuario;
import br.com.teste.modelo.controleacesso.AcessoSistema;
import br.com.teste.modelo.email.ConfiguracaoEmail;
import br.com.teste.modelo.controleacesso.Perfil;
import br.com.teste.modelo.controleacesso.HistoricoSituacaoUsuario;
import br.com.teste.modelo.email.ModeloEmail;
import br.com.teste.modelo.controleacesso.SolicitacaoRecuperacaoSenha;
import br.com.teste.modelo.email.TipoAssuntoEmail;
import br.com.teste.modelo.controleacesso.TipoRecuperacaoSenha;
import javax.faces.bean.ManagedBean;

@ManagedBean
public class ClassMB {

    public Class getAcessoSistema() {
        return AcessoSistema.class;
    }

    public Class getErroSistema() {
        return ErroSistema.class;
    }

    public Class getHistoricoSituacaoUsuario() {
        return HistoricoSituacaoUsuario.class;
    }

    public Class getPerfil() {
        return Perfil.class;
    }

    public Class getPermissao() {
        return Permissao.class;
    }

    public Class getSituacaoUsuario() {
        return SituacaoUsuario.class;
    }

    public Class getUsuario() {
        return Usuario.class;
    }

    public Class getTipoAssuntoEmail() {
        return TipoAssuntoEmail.class;
    }

    public Class getModeloEmail() {
        return ModeloEmail.class;
    }

    public Class getSolicitacaoRecuperacaoSenha() {
        return SolicitacaoRecuperacaoSenha.class;
    }

    public Class getTipoRecuperacaoSenha() {
        return TipoRecuperacaoSenha.class;
    }

    public Class getConfiguracaoEmail() {
        return ConfiguracaoEmail.class;
    }
}
