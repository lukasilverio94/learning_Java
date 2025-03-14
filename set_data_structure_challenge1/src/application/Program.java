package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.util.Date;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import entities.LogEntry;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter file full path: "); // /tmp/setJavaChallenge.txt
		String filePath = sc.nextLine();

		try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
			
			Set<LogEntry> usersSet = new HashSet<>();
			
			String line = br.readLine();
			while(line != null) {
				String[] fields = line.split(" ");
				String username = fields[0];
				Date moment = Date.from(Instant.parse(fields[1]));
				
				usersSet.add(new LogEntry(username, moment));
				// read next line
				line = br.readLine();
			}
			System.out.println("Total users: " + usersSet.size());
			
		} catch (IOException ex) {
			System.out.println("Error reading file: " + ex.getMessage());
		}
		
		sc.close();

	}

}
