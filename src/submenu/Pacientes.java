//package submenu;
//
//import model.Medico;
//import model.Paciente;
//
//import java.util.ArrayList;
//
//public class Pacientes {
//    private ArrayList<Paciente> pacientes = new ArrayList<Paciente>();
//
//    public void incluir(Paciente paciente){
//        pacientes.add(paciente);
//    }
//
//    public void listarTodos(){
//        System.out.println(pacientes);
//    }
//
//    public void listarUm(String CPF){
//        for(Paciente paciente : pacientes){
//            if (paciente.getCPF() == CPF){
//                System.out.println(paciente);
//            }
//        }
//    }
//
//    public void alterar(String CPF){
//        for(Paciente paciente : pacientes){
//            if (paciente.getCPF() == CPF){
//                System.out.println("Temq alterar");
//            }
//        }
//    }
//
//    public void excluir(String CPF){
//        for(Paciente paciente : pacientes){
//            if (paciente.getCPF() == CPF){
//                pacientes.remove(paciente);
//            }
//    }
//}
