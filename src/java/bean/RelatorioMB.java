package bean;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

@Named
@ApplicationScoped //Application, pois os usu�rios cadastrados dever�o permanecer mesmo se fizer logout.
public class RelatorioMB {

    public RelatorioMB() {
        
    }
    
    public String mostrarRelatorios(){        
        return("/admin/relatorios/relatorios?faces-redirect=true");
    }
    
    public String mostrarRelatoriosUsuario(){        
        return("/usuario/relatorios/relatorios?faces-redirect=true");
    }   

}
