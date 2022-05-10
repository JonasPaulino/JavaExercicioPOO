package Main;

import java.util.ArrayList;
import java.util.List;

import Classes.Departamento;
import Classes.Empresa;
import Classes.Estrutura;
import Classes.Operador;
import Classes.Pessoa;
import Classes.Programador;
import Classes.Setor;

public class Main {

	public static void main(String[] args) {
		//PROGRAMADOR
		Programador p 		= new Programador();
		p.setMatricula(101010);
		p.setNome("Jonas Paulino");
		p.setCPF("333.333.333-33");
		p.setDataNascimento("16/11/1988");
		p.setCargo("Desenvolvedor backend/frontend");
		p.setCargaHoraria("160hs");
		p.setSalario("10.000,00");
		
		Programador p1 		= new Programador();
		p1.setMatricula(404040);
		p1.setNome("Gustavo Pedro");
		p1.setCPF("444.444.444-44");
		p1.setDataNascimento("27/01/1983");
		p1.setCargo("Coordenadora Software");
		p1.setCargaHoraria( "160hs");
		p1.setSalario("20.000,00");
		
		//OPERADOR		
		Operador o 			= new Operador();
		o.setMatricula(202020);
		o.setNome("João Oliveira");
		o.setCPF("111.111.111-11");
		o.setDataNascimento("22/10/2007");
		o.setCargo("Empilhador");
		o.setCargaHoraria("160hs");
		p.setSalario("1.916,00");
		
		Operador o1 			= new Operador();
		o1.setMatricula(303030);
		o1.setNome("Maria Silva  ");
		o1.setCPF("222.222.222-22");
		o1.setDataNascimento("12/12/1990");
		o1.setCargo("Operador 1");
		o1.setCargaHoraria("160hs");
		o1.setSalario("1.400,00");
		
		List<Pessoa> Operadores = new ArrayList<>();
		Operadores.add(o);
		Operadores.add(o1);
		
		List<Pessoa> Programadores = new ArrayList<>();
		Programadores.add(p);
		
		List<Pessoa> ProgramadoresAd = new ArrayList<>();
		ProgramadoresAd.add(p1);
////////////////////////////////////////////////////////////////////////////////////////////////
		
		//SETOR
		Setor op			= new Setor();
		op.setCodigo(0001);
		op.setDescricao("OPERACIONAL");
		op.setPessoas(Operadores); // add a lista completa
		
		Setor ad			= new Setor();
		ad.setCodigo(0002);
		ad.setDescricao("TECNOLOGIA ");
		ad.setPessoas(Programadores); // add a lista completa
		
		Setor coor			= new Setor();
		coor.setCodigo(0003);
		coor.setDescricao("TECNOLOGIA ");
		coor.setPessoas(ProgramadoresAd);
		
		List<Setor> Setor1 = new ArrayList<>();
		Setor1.add(op);
		Setor1.add(ad);
		
		List<Setor> Setor2 = new ArrayList<>();
		Setor2.add(coor);
////////////////////////////////////////////////////////////////////////////////////////////////
		
		//DEPARTAMENTO
		Departamento d		= new Departamento();
		d.setCodigo(55);
		d.setSetores(Setor1);
		
		Departamento d1		= new Departamento();
		d1.setCodigo(65);
		d1.setSetores(Setor2);
		
		List<Departamento> Departamentos = new ArrayList<>();
		Departamentos.add(d);
		Departamentos.add(d1);
////////////////////////////////////////////////////////////////////////////////////////////////
		
		//ESTRUTURA
		Estrutura e			= new Estrutura();
		e.setCodigo(8888);
		e.setNome("FILIAL 35");
		e.setDepartamentos(Departamentos);

////////////////////////////////////////////////////////////////////////////////////////////////
		
		//EMPRESA
		Empresa emp 		= new Empresa();
		emp.setCNPJ("00.000.000/0000-00");
		emp.setNome("VITAMASSA LTDA");
		emp.setEndereco("Rua vira a direita");
		emp.setEstrutura(e);
		emp.setPessoas(Operadores);
		emp.setPessoas(Programadores);
		emp.setPessoas(ProgramadoresAd);
		
		System.out.printf("####################################################################%n");
		System.out.printf("##############   ** EMPRESA: %s **  ####################%n",emp.getNome());
		System.out.printf("####################################################################%n");
		System.out.printf("#                                                                  #%n");
		System.out.printf("# ->Estrutura: %s                                           #%n",
							emp.getEstrutura().getNome());
		
		
		//varre o departamento dentro de estrutura
		for (Departamento dep : emp.getEstrutura().getDepartamentos()) {
			System.out.printf("# ----->Departamento código: %s                                    #%n",dep.getCodigo());	
			
			//varre o setor de depertamentos
			for (Setor set : dep.getSetores()) {
				System.out.printf("# ------------>Setor código: %s Nome: %s                   #%n", set.getCodigo(), set.getDescricao());	
				
				//varre as pessoas de setores
				for (Pessoa pes : set.getPessoas()) {
					System.out.printf("# ---------------->Pessoa CPF: %s Nome: %s  #%n",pes.getCPF(),pes.getNome());
					
				}
			}
		}
		
		System.out.printf("#                                                                  #%n");
		System.out.printf("############################# FIM ##################################%n");

	}
}




/*		
for(int i = 0; i< emp.Estrutura.departamentos.size(); i++) {
	System.out.printf("# ----->Departamento código: %s                                    #%n",
			emp.Estrutura.departamentos.get(i).codigo);
	
	for(int j = 0; j< emp.Estrutura.departamentos.get(i).setores.size(); j++) {	
		System.out.printf("# ------------>Setor código: %s Nome: %s                   #%n",
				emp.Estrutura.departamentos.get(i).setores.get(j).codigo,
				emp.Estrutura.departamentos.get(i).setores.get(j).descricao);
		
		for(int h = 0; h< emp.Estrutura.departamentos.get(i).setores.get(j).pessoas.size(); h++) {
			System.out.printf("# ---------------->Pessoa CPF: %s Nome: %s  #%n",
					emp.Estrutura.departamentos.get(i).setores.get(j).pessoas.get(h).CPF,
					emp.Estrutura.departamentos.get(i).setores.get(j).pessoas.get(h).nome);
			
		}
		
	}
	
}

*/


/*
if(ad.getPessoas()!= null) { //valida se está diferente de vazio
	ad.getPessoas().add(p);

}else {
	ad.setPessoas(new ArrayList<Pessoa>()); //se estiver vazio instancie a lista crie a lista
	ad.getPessoas().add(p);

}*/	
