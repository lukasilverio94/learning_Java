package application;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import entities.Contract;
import entities.Installment;
import services.ContractService;
import services.PaypalService;

public class Program {

	public static void main(String[] args) throws IOException {
		
		Scanner sc = new Scanner(System.in);
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		System.out.println("Entre os dados do contrato:");
		System.out.print("Numero: ");
		int numero = sc.nextInt();
		System.out.print("Data (dd/MM/yyyy): ");
		LocalDate date = LocalDate.parse(sc.next(), fmt);
		System.out.print("Valor do contrato: ");
		double contractValue = sc.nextDouble();
		
		Contract contract = new Contract(numero, date, contractValue);
		
		System.out.println("Entre com o número de parcelas: ");
		int nOfInstallments = sc.nextInt();
		
		ContractService contractService = new ContractService(new PaypalService());
		contractService.processContract(contract, nOfInstallments);
		
		System.out.println("Parcelas:");
		for(Installment installment: contract.getInstallments()) {
			System.out.println(installment);
		}
		
		sc.close();
	}

}
