package com.sbp.Spring5Revision;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Spring5RevisionApplication
{
	public static void main(String[] args)
	{
		SpringApplication.run(Spring5RevisionApplication.class, args);

		RuntimePolymorphismBank bank = new RuntimePolymorphismBank();

		System.out.println("1.1: Calling static method: " + bank.myClassName());
		System.out.println("1.2: Calling static method: " + bank.getRateOfInterest());

		bank = new RuntimePolymorphismSBI();

		System.out.println("1.3: Calling static method: " + bank.myClassName());
		System.out.println("1.4: Calling static method: " + bank.getRateOfInterest());
	}
}
