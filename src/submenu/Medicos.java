package submenu;

import model.Medico;

import java.util.ArrayList;

public class Medicos {
    private ArrayList<Medico> medicos = new ArrayList<Medico>();

    public ArrayList<Medico> getMedicos() {
        return medicos;
    }

    public void incluir(Medico medico){
        medicos.add(medico);
    }

    public void listarTodos(){
        System.out.println("Listando todos os MÉDICOS");
        System.out.println("");
        for (Medico medico : medicos){
            listarUm(medico.getCRM());
        }
    }

    public void listarUm(String CRM){
        for(Medico medico : medicos){
            if (medico.getCRM() == CRM){
                System.out.println("Medico: "+ medico.getNome());
                System.out.println("CRM: " + medico.getCRM());
                System.out.println("Especialidade: " + medico.getEspecialidade());
                System.out.println("Universidade de formação: " + medico.getUniversidade());
                System.out.println("");
            }
        }
    }

    public void alterar(String CRM){
        for(Medico medico : medicos){
            if (medico.getCRM() == CRM){
                System.out.println("alterar");
            }
        }
    }

    public void excluir(String CRM){
        for(Medico medico : medicos){
            if (medico.getCRM() == CRM){
                medicos.remove(medico);
            }
        }
    }

}