package caed.bean;

import caed.dao.CaedDAO;
import caed.entidade.Escola;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped

public class CaedBean extends CrudBean<Escola, CaedDAO> {

    private CaedDAO caedDAO;
     private List<Escola> lista = new ArrayList<Escola>();
    
    @Override
    public CaedDAO getDao() {
        if(caedDAO == null){
            caedDAO = new CaedDAO();
        }
        return caedDAO;
    }

    @Override
    public Escola criarNovaEntidade() {
        return new Escola();
    }
    
    public void gerarRelatorioAction() {
        Relatorio relatorio = new Relatorio();
        relatorio.getRelatorio();
    }
}