package Main;

import Classes.Departamento;
import Classes.Empresa;
import Classes.Estrutura;
import Classes.Operador;
import Classes.Programador;
import Classes.Setor;

public class Main {

	public static void main(String[] args) {
		//PROGRAMADOR
		Programador p 		= new Programador();
		p.matricula			= 101010;
		p.nome				= "Jonas Paulino";
		p.CPF				= "333.333.333-33";
		p.dataNascimento 	= "16/11/1988";
		p.Cargo				= "Desenvolvedor backend/frontend";
		p.cargaHoraria 		= "160hs";
		p.salario			= "10.000,00";
		
		Programador p1 		= new Programador();
		p1.matricula		= 404040;
		p1.nome				= "Gustavo Pedro";
		p1.CPF				= "444.444.444-44";
		p1.dataNascimento 	= "27/01/1983";
		p1.Cargo			= "Coordenadora Software";
		p1.cargaHoraria 	= "160hs";
		p1.salario			= "20.000,00";
		
		//OPERADOR		
		Operador o 			= new Operador();
		o.matricula 		= 202020;
		o.nome				= "João Oliveira";
		o.CPF				= "111.111.111-11";
		o.dataNascimento	= "22/10/2007";
		o.Cargo				= "Empilhador";
		o.cargaHoraria		= "160hs";
		p.salario			= "1.916,00";
		
		Operador o1 			= new Operador();
		o1.matricula 		= 303030;
		o1.nome				= "Maria Silva  ";
		o1.CPF				= "222.222.222-22";
		o1.dataNascimento	= "12/12/1990";
		o1.Cargo				= "Operador 1";
		o1.cargaHoraria		= "160hs";
		o1.salario			= "1.400,00";
		
		//SETOR
		Setor op			= new Setor();
		op.codigo			= 0001;
		op.descricao			= "OPERACIONAL";
		op.pessoas.add(o);
		op.pessoas.add(o1);

		Setor ad			= new Setor();
		ad.codigo			= 0002;
		ad.descricao			= "TECNOLOGIA ";
		ad.pessoas.add(p);
		
		Setor coor			= new Setor();
		coor.codigo			= 0003;
		coor.descricao			= "TECNOLOGIA ";
		coor.pessoas.add(p1);
		
		//DEPARTAMENTO
		Departamento d		= new Departamento();
		d.codigo			= 55;
		d.setores.add(op);
		d.setores.add(ad);
		
		Departamento d1		= new Departamento();
		d1.codigo			= 65;
		d1.setores.add(coor);
		
		//ESTRUTURA
		Estrutura e			= new Estrutura();
		e.codigo			= 8888;
		e.nome				= "FILIAL 35";
		e.departamentos.add(d);
		e.departamentos.add(d1);
		
		//EMPRESA
		Empresa emp 		= new Empresa();
		emp.CNPJ			= "00.000.000/0000-00";
		emp.nome			= "VITAMASSA LTDA";
		emp.Endereco		= "Rua vira a direita";
		emp.Estrutura		= e;
		emp.pessoas.add(p);
		emp.pessoas.add(o);
		
		System.out.printf("####################################################################%n");
		System.out.printf("##############   ** EMPRESA: %s **  ####################%n",emp.nome);
		System.out.printf("####################################################################%n");
		System.out.printf("#                                                                  #%n");
		System.out.printf("# ->Estrutura: %s                                           #%n",
							emp.Estrutura.nome);
		
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
		System.out.printf("#                                                                  #%n");
		System.out.printf("############################# FIM ##################################%n");

	}
}
