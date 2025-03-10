package services;

import java.time.LocalDate;

import entities.Contract;
import entities.Installment;
import interfaces.OnlinePaymentService;

public class ContractService {
	
	private OnlinePaymentService onlinePaymentService;

	public ContractService(OnlinePaymentService onlinePaymentService) {
		this.onlinePaymentService = onlinePaymentService;
	}
	
	public void processContract(Contract contract, Integer months) {
		double pricePerInstallment = contract.getTotalValue() / months; // installment without fee/interest
		
		for(int i = 1; i <= months; i++) {
			LocalDate dueDate = contract.getDate().plusMonths(i);	
			double interest = onlinePaymentService.interest(pricePerInstallment, i);// interest = juros
			double fee = onlinePaymentService.paymentFee(pricePerInstallment + interest); // fee = taxa
			double totalToPayPerInstallment = pricePerInstallment + interest+ fee; // installment with fee + interest
			
			contract.getInstallments().add(new Installment(dueDate, totalToPayPerInstallment));
			// get installments() to first get the list then add it
			
 		}

	}
}
