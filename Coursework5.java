import java.util.*;
class Coursework5{
	public static void main(String args[]){
	Scanner input=new Scanner(System.in);
	do{
		char OptionA='y';
		while(OptionA == 'Y' || OptionA == 'y'){
		System.out.println("\t\t\t\t __    _____             __");
		System.out.println("\t\t\t\t|  \\ /      \\           |  \\");
		System.out.println("\t\t\t\t \\$$|  $$$$$$\\  ______  | $$  _______");
		System.out.println("\t\t\t\t|  \\| $$   \\$$ |      \\ | $$ /       \\");
		System.out.println("\t\t\t\t| $$| $$        \\$$$$$$\\| $$|  $$$$$$$");
		System.out.println("\t\t\t\t| $$| $$   __  /      $$| $$| $$");
		System.out.println("\t\t\t\t| $$| $$__/  \\|  $$$$$$$| $$| $$_____");
		System.out.println("\t\t\t\t| $$ \\$$    $$ \\$$    $$| $$ \\$$     \\");
		System.out.println("\t\t\t\t \\$$  \\$$$$$$   \\$$$$$$$ \\$$  \\$$$$$$$\n");
		System.out.println();
        System.out.println(" _   _                    _                  _____                                 _ ");
        System.out.println("| \\ | |                  | |                /  __ \\                               | |");
        System.out.println("|  \\| | _   _  _ __ ___  | |__   ___  _ __  | /  \\/  ___   _ __ __   __ ___  _ __ | |_  ___  _ __");
        System.out.println("| . ` || | | || '_ ` _ \\ | '_ \\ / _ \\| '__| | |     / _ \\ | '_ \\\\ \\ / // _ \\| '__|| __|/ _ \\| '__|");
        System.out.println("| |\\  || |_| || | | | | || |_) |  __/| |    | \\__/\\| (_) || | | |\\ V /|  __/| |   | |_|  __/| |   ");
        System.out.println("\\_| \\_/ \\__,_||_| |_| |_||_.__/ \\___||_|     \\____/ \\___/ |_| |_| \\_/  \\___||_|    \\__|\\___||_|   ");
        System.out.println("--------------------------------------------------------------------------------------------------");
        System.out.println();
		System.out.println("\t[01] Decimal Converter");
		System.out.println("\t[02] Binary Converter");
        System.out.println("\t[03] Octal Converter");
        System.out.println("\t[04] Hexadecimal Converter");
        System.out.println("\t[05] Roman Number Converter");
        System.out.println();
        System.out.print("Enter Option -> ");
		int option=input.nextInt();
        
		switch(option){
			
			case 01:
				while(OptionA == 'Y' || OptionA == 'y'){
        
				System.out.println("+---------------------------------------------------+");
				System.out.println("|                 Decimal Converter                 |");
				System.out.println("+---------------------------------------------------+");
				System.out.println();
				
				System.out.print("Enter an Decimal number: ");
				int dNum = input.nextInt();
				
				if (dNum < 0) {
					System.out.println("        Invalid input...");
					System.out.println();
					System.out.print("Do you want to input number again (Y/N) -> ");
					OptionA = input.next().charAt(0);
					System.out.println();
					
					if (OptionA == 'N' || OptionA == 'n') {
						break;
					}
				} 
					else {
					String binary = "";
					String octal = "";
					String hexa = "";
					
					if (dNum == 0) {
						binary = "0";
						octal = "0";
						hexa = "0";
					} else {
						
						int biNum = dNum; 
						while (biNum > 0) {
							int r = biNum % 2;
							binary = r + binary;
							biNum = biNum / 2;
						}
						
						int OcNum = dNum;
						while (OcNum > 0) {
							int r = OcNum % 8;
							octal = r + octal;
							OcNum = OcNum / 8;
						}
						
						
						int HeNum = dNum;
						char[] hexChars = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
						while (HeNum > 0) {
							int r = HeNum % 16;
							hexa = hexChars[r] + hexa;
							HeNum = HeNum / 16;
						}
					}
					
					System.out.println("\n        Binary number: " + binary);
					System.out.println("        Octal number: " + octal);
					System.out.println("        Hexadecimal number: " + hexa);
					System.out.println();
					
            break; 
					}
				}
    
					System.out.print("Do you want to go to homepage (Y/N)-> ");
					char homepage = input.next().charAt(0); 
					System.out.println("\n---------------------------------------------------\n");
			
				break;
			case 02:
				OptionA = 'Y';
				input.nextLine(); 
				while(OptionA == 'Y' || OptionA == 'y'){
        
				System.out.println("+---------------------------------------------------+");
				System.out.println("|                  Binery Converter                 |");
				System.out.println("+---------------------------------------------------+");
				System.out.println();
				
				System.out.print("Enter an Decimal number: ");
				String biNum=input.nextLine();
				
				boolean Binary = true;
				
				for (int i = 0; i < biNum.length(); i++) {
				char ch = biNum.charAt(i);
				
				if (ch != '0' && ch != '1') {
				Binary = false; 
				break;           
					}
				}
				
				if(!Binary){
					System.out.println("        Invalid input...");
					System.out.println();
					System.out.print("Do you want to input number again (Y/N) -> ");
					OptionA = input.next().charAt(0);
					System.out.println();
					
					if (OptionA == 'N' || OptionA == 'n') {
						break;
					}
					continue;
				} 
				int dNum = 0;
				int power = 0;
				for (int i = biNum.length() - 1; i >= 0; i--) {
				char ch = biNum.charAt(i);
				if (ch == '1') {
                dNum += Math.pow(2, power);
					}
				power++;
				}
				
				String octal = "";
				String hexa = "";

				if (dNum == 0) {
					octal = "0";
					hexa = "0";
				} else {
					int OcNum = dNum;
				while (OcNum > 0) {
                int r = OcNum % 8;
                octal = r + octal;
                OcNum = OcNum / 8;
				}
				
				int HeNum = dNum;
				char[] hexChars = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
				while (HeNum > 0) {
                int r = HeNum % 16;
                hexa = hexChars[r] + hexa;
                HeNum = HeNum / 16;
            }
        }
				System.out.println();
				System.out.println("        Decimal Number: " + dNum);
				System.out.println("        Octal number: " + octal);
				System.out.println("        Hexadecimal number: " + hexa);
				System.out.println();
				
				System.out.print("Do you want to go to homepage (Y/N)-> ");
				homepage = input.next().charAt(0);
				System.out.println();
				if(homepage == 'Y' || homepage == 'y') {
				break;
				} else {
            System.exit(0);
				}
			}
				break;	
					
			case 03:
			OptionA = 'Y';
			input.nextLine(); 
			
			while(OptionA == 'Y' || OptionA == 'y'){
				System.out.println("+----------------------------------------+");
				System.out.println("|             Octal Converter            |");
				System.out.println("+----------------------------------------+");
				System.out.println();

				System.out.print("Enter an Octal number: ");
				String octNum = input.nextLine();

				boolean isOctal = true;
				for (int i = 0; i < octNum.length(); i++) {
					char ch = octNum.charAt(i);
					if (ch < '0' || ch > '7') {
						isOctal = false;
						break;
					}
				}

				if(!isOctal){
					System.out.println("        Invalid input...");
					System.out.println();
					System.out.print("Do you want to input number again (Y/N) -> ");
					homepage = input.next().charAt(0);
					System.out.println();
					input.nextLine();

					if (homepage == 'N' || homepage == 'n') {
						break; 
					}
					continue;
				}


				int dNum = 0;
				int power = 0;
				for (int i = octNum.length() - 1; i >= 0; i--) {
					char ch = octNum.charAt(i);
					int digit = Character.getNumericValue(ch); 
					
					dNum += digit * Math.pow(8, power);
					power++;
				}

				String binary = "";
				String hexa = "";

				if (dNum == 0) {
					binary = "0";
					hexa = "0";
				} else {
					int biNum = dNum;
					while (biNum > 0) {
						int r = biNum % 2;
						binary = r + binary;
						biNum = biNum / 2;
					}

					int HeNum = dNum;
					char[] hexChars = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
					while (HeNum > 0) {
						int r = HeNum % 16;
						hexa = hexChars[r] + hexa;
						HeNum = HeNum / 16;
					}
				}

				System.out.println();
				System.out.println("        Decimal Number: " + dNum);
				System.out.println("        Binary Number: " + binary);
				System.out.println("        Hexadecimal Number: " + hexa);
				System.out.println();

				System.out.print("Do you want to go to homepage (Y/N)-> ");
				homepage = input.next().charAt(0);
				System.out.println();
				
				if(homepage == 'Y' || homepage == 'y') {
					break; 
				} else {
					System.exit(0);
				}
			}
			break;

			case 04:
				OptionA = 'Y';
				input.nextLine(); 
				
				while(OptionA == 'Y' || OptionA == 'y'){
					System.out.println("+----------------------------------------+");
					System.out.println("|          HexaDecimal Converter         |");
					System.out.println("+----------------------------------------+");
					System.out.println();

					System.out.print("Enter an HexaDecimal number: ");
					String hexNum = input.nextLine();

					String hexa = hexNum.toUpperCase();

					boolean isHex = true;
					for (int i = 0; i < hexa.length(); i++) {
						char ch = hexa.charAt(i);
						
						if (!((ch >= '0' && ch <= '9') || (ch >= 'A' && ch <= 'F'))) {
							isHex = false;
							break;
						}
					}

					if(!isHex){
						System.out.println("        Invalid input...");
						System.out.println();
						System.out.print("Do you want to input number again (Y/N) -> ");
						homepage = input.next().charAt(0);
						System.out.println();
						input.nextLine(); 

						if (homepage == 'N' || homepage == 'n') {
							break; 
						}
						continue; 
					}

					int dNum = 0;
					int power = 0;
					String hexDigits = "0123456789ABCDEF"; 

					for (int i = hexa.length() - 1; i >= 0; i--) {
						char ch = hexa.charAt(i);
						
						int digitValue = hexDigits.indexOf(ch);
						
						dNum += digitValue * Math.pow(16, power);
						power++;
					}

					String binary = "";
					String octal = "";

					if (dNum == 0) {
						binary = "0";
						octal = "0";
					} else {
						int biNum = dNum;
						while (biNum > 0) {
							int r = biNum % 2;
							binary = r + binary;
							biNum = biNum / 2;
						}

						int OcNum = dNum;
						while (OcNum > 0) {
							int r = OcNum % 8;
							octal = r + octal;
							OcNum = OcNum / 8;
						}
					}

					System.out.println();
					System.out.println("        Decimal Number: " + dNum);
					System.out.println("        Binary Number: " + binary);
					System.out.println("        Octal Number: " + octal);
					System.out.println();

					System.out.print("Do you want to go to homepage (Y/N)-> ");
					homepage = input.next().charAt(0);
					System.out.println();
					
					if(homepage == 'Y' || homepage == 'y') {
						break; 
					} else {
						System.exit(0); 
					}
				}
				break;

			case 05:
								
					System.out.println("+----------------------------------------+");
					System.out.println("|         Roman Number Converter         |");
					System.out.println("+----------------------------------------+");
					System.out.println();
					System.out.println("        [01] Decimal Number to Roman Number Converter");
					System.out.println("        [02] Roman Number to Decimal Number Converter");
					System.out.println();
					System.out.print("Enter an option -> ");
					int subOption = input.nextInt();
					input.nextLine(); 
					System.out.println();

					if (subOption == 1) {
						System.out.println("+-------------------------------------------------------+");
						System.out.println("|         Decimal Number to Roman Number Converter       |");
						System.out.println("+-------------------------------------------------------+");
						System.out.println();
						
						System.out.print("Enter an Decimal number: ");
						int dNum = input.nextInt();
						input.nextLine(); 

						if (dNum <= 0) {
							System.out.println("        Invalid input...");
						} else {
							int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
							String[] romanLetters = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
							
							String roman = "";
							int temp = dNum;
							
							for (int i = 0; i < values.length; i++) {
								while (temp >= values[i]) {
									roman += romanLetters[i];
									temp -= values[i];
								}
							}
							System.out.println();
							System.out.println("        Roman numeral: " + roman);
						}
					} 
					else if (subOption == 2) {
						System.out.println("+-------------------------------------------------------+");
						System.out.println("|         Roman Number to Decimal Number Converter       |");
						System.out.println("+-------------------------------------------------------+");
						System.out.println();
						
						System.out.print("Enter an Roman number: ");
						String rNum = input.nextLine(); 

						int decimalValue = 0;
						int prevValue = 0;
						boolean isValidRoman = true;

						for (int i = rNum.length() - 1; i >= 0; i--) {
							char ch = rNum.charAt(i);
							int currentValue = 0;

							if (ch == 'I' || ch == 'i') currentValue = 1;
							else if (ch == 'V' || ch == 'v') currentValue = 5;
							else if (ch == 'X' || ch == 'x') currentValue = 10;
							else if (ch == 'L' || ch == 'l') currentValue = 50;
							else if (ch == 'C' || ch == 'c') currentValue = 100;
							else if (ch == 'D' || ch == 'd') currentValue = 500;
							else if (ch == 'M' || ch == 'm') currentValue = 1000;
							else {
								isValidRoman = false;
								break;
							}

							if (currentValue < prevValue) {
								decimalValue -= currentValue;
							} else {
								decimalValue += currentValue;
							}
							prevValue = currentValue;
						}

						if (!isValidRoman) {
							System.out.println("        Invalid input...");
						} else {
							System.out.println();
							System.out.println("        Decimal number: " + decimalValue);
						}
					} else {
						System.out.println("        Invalid option...");
					}


							System.out.println("+-----------------------------------------+");
							
							System.out.print("Do you want to continue? (Y/N): ");
							OptionA = input.next().charAt(0); 
							
						
						break;	
					}
				break;		
				} while(OptionA == 'Y' || OptionA == 'y');
				
		
	}

