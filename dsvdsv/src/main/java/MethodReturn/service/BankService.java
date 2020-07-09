package MethodReturn.service;

import java.io.IOException;
import java.util.Scanner;

import org.omg.CORBA.Object;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import MethodReturn.accountentity;
import MethodReturn.bankentity;
import MethodReturn.branchentity;
import MethodReturn.custmorentity;

public class BankService {
	public bankentity getBankentity(ObjectMapper mapper, Scanner sc)
			throws JsonParseException, JsonMappingException, IOException {
		String s1 = sc.nextLine();
		bankentity be = mapper.readValue(s1, bankentity.class);
		return be;
	}

	public branchentity getBranchentity(ObjectMapper mapper, Scanner sc)
			throws JsonParseException, JsonMappingException, IOException {
		String s2 = sc.nextLine();
		branchentity be1 = mapper.readValue(s2, branchentity.class);
		return be1;
	}

	public custmorentity getCustmorentity(ObjectMapper mapper, Scanner sc)
			throws JsonParseException, JsonMappingException, IOException {
		String s3 = sc.nextLine();
		custmorentity ce = mapper.readValue(s3, custmorentity.class);
		return ce;

	}

	public accountentity getAccountentity(ObjectMapper mapper, Scanner sc)
			throws JsonParseException, JsonMappingException, IOException {
		String s4 = sc.nextLine();
		accountentity ac = mapper.readValue(s4, accountentity.class);
		return ac;

	}

	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
		BankService bs = new BankService();
		ObjectMapper mapper = new ObjectMapper();
		Scanner sc = new Scanner(System.in);
		System.out.println("bank information given below==");
		bankentity be = bs.getBankentity(mapper, sc);
		System.out.println(be);
		System.out.println("bank branch information given below==");
		branchentity be1 = bs.getBranchentity(mapper, sc);
		System.out.println(be1);
		System.out.println("bank custmor info given below ==");
		custmorentity ce = bs.getCustmorentity(mapper, sc);
		System.out.println(ce);
		System.out.println("bank account info given below ==");
		accountentity ac = bs.getAccountentity(mapper, sc);
		System.out.println(ac);

	}
}
