public class Day2 {

	public static void main(String[] args) {
		
		String puzzleInput = "revtoubfniyhzsgxdowjwkqglp\r\n" + 
				"revtcgbfniyhzsvxdomjwkqmlp\r\n" + 
				"cevtcubfniyhqsgxdoakwkqmlp\r\n" + 
				"revtcubfniyhzsgxdtavwkqmep\r\n" + 
				"reutcuboniyhzmgxdoajwkqmlp\r\n" + 
				"revtcubfniyhzsgxxqajmkqmlp\r\n" + 
				"rwvtcvbfniyhzsgxdozjwkqmlp\r\n" + 
				"qevtcbbfniyhzsgxdoljwkqmlp\r\n" + 
				"rnvtcmbfniyhzsuxdoajwkqmlp\r\n" + 
				"revtcubfsiyhzsgxdaaewkqmlp\r\n" + 
				"revtcubfpiyhesgxhoajwkqmlp\r\n" + 
				"revtcubfnivhzsuxdoljwkqmlp\r\n" + 
				"retpcubwniyhzsgxdoajwkqmlp\r\n" + 
				"revrcubfniyhzsgxdyajhkqmlp\r\n" + 
				"revtcbbfniyhzsixdoajwvqmlp\r\n" + 
				"revtcubfniyhzsgxdoanmkqmpp\r\n" + 
				"jevtoubfnuyhzsgxdoajwkqmlp\r\n" + 
				"rpwtcubfniehzsgxdoajwkqmlp\r\n" + 
				"revhcubfniyhnsgxdoajwkxmlp\r\n" + 
				"revtcubfniyhzswxdodjwkqvlp\r\n" + 
				"reotcubfciyhzsgxdnajwkqmlp\r\n" + 
				"revtcubfniyhzsgxdbatwsqmlp\r\n" + 
				"rlvbcubfniyhzssxdoajwkqmlp\r\n" + 
				"rentcubfnyyhzsgxdozjwkqmlp\r\n" + 
				"revtcuufniyhasgxdohjwkqmlp\r\n" + 
				"jevtcubfniyhxsgxdoajwkqwlp\r\n" + 
				"ravtcubfnryhzfgxdoajwkqmlp\r\n" + 
				"reltcubfnvyhzsgxdoajwkumlp\r\n" + 
				"revtrubfnschzsgxdoajwkqmlp\r\n" + 
				"uevtcubanichzsgxdoajwkqmlp\r\n" + 
				"revtcubfniyhzdpxdoajwwqmlp\r\n" + 
				"revtcubfhiyhzsgxdoajgkqplp\r\n" + 
				"revtcubfniyxzygxdoajwkqmld\r\n" + 
				"revtcunfniyfzsgxdoajwkqwlp\r\n" + 
				"reqtcubfniyhzsgxdoajwfqmlj\r\n" + 
				"revtcubfniyhzagedaajwkqmlp\r\n" + 
				"revthuefniyhzsgxroajwkqmlp\r\n" + 
				"revtcrbfodyhzsgxdoajwkqmlp\r\n" + 
				"revtcubfniyhxsgxdlajwuqmlp\r\n" + 
				"revtrubfnirhzsgxdokjwkqmlp\r\n" + 
				"revtiubfniyhzagudoajwkqmlp\r\n" + 
				"jevtcubfniyhusgxsoajwkqmlp\r\n" + 
				"reetcubfniyhzsgxdoajvmqmlp\r\n" + 
				"pestcubfniyhzsgxdoajwkqglp\r\n" + 
				"revtcubfniyhzsgxdoiowkqalp\r\n" + 
				"revscubfniyhzsgxdoajwkoplp\r\n" + 
				"revtcubfnoyhzsgxdlajwkymlp\r\n" + 
				"rkvtcubfniyhzsgxdoajzkqhlp\r\n" + 
				"revtuubfniyhzsgxdojjwkqglp\r\n" + 
				"revtcubmniyhzsgydoajwkzmlp\r\n" + 
				"revtcybfnijhzsgxvoajwkqmlp\r\n" + 
				"rxftcubfnkyhzsgxdoajwkqmlp\r\n" + 
				"gertcubfniyhzsgxjoajwkqmlp\r\n" + 
				"revtcabfniygzdgxdoajwkqmlp\r\n" + 
				"levgcubfniyhzsgxdoalwkqmlp\r\n" + 
				"revtcubfniyhzslxdofjwkqxlp\r\n" + 
				"revtcybwniyhzsgxdoajwkqmlx\r\n" + 
				"devtcubpniyhzsgqdoajwkqmlp\r\n" + 
				"pevtcjbfniyhzsbxdoajwkqmlp\r\n" + 
				"revtcubfeiehzsgxdoafwkqmlp\r\n" + 
				"revwcubfniyhzsgxdoawekqmlp\r\n" + 
				"revtcubfniyussgxdoawwkqmlp\r\n" + 
				"revtcuafnczhzsgxdoajwkqmlp\r\n" + 
				"revtaubfniyhusgxdoajwkqilp\r\n" + 
				"revtcubfnidhzxgxdoajwkqmlt\r\n" + 
				"revtcubfniyhzsexdmajwnqmlp\r\n" + 
				"revtcubfnhyhzsgxdwxjwkqmlp\r\n" + 
				"revtalbfniyhzsgxdoajwbqmlp\r\n" + 
				"revtcubfniyazsgxdoajwkqcvp\r\n" + 
				"rcvtcubfniyhzwgxdoajwkqmsp\r\n" + 
				"revthubfniyhzxgxdoalwkqmlp\r\n" + 
				"revtcubfniyazsoxgoajwkqmlp\r\n" + 
				"revtcubkriyhzsgtdoajwkqmlp\r\n" + 
				"revtcubfniyhzsgxgeajwgqmlp\r\n" + 
				"heftcubfniypzsgxdoajwkqmlp\r\n" + 
				"revtclbfniyhzsgxdowjnkqmlp\r\n" + 
				"revtcubfnifhzsgxdoamwkqmhp\r\n" + 
				"revncubfniyhzsgxdoxjwiqmlp\r\n" + 
				"reitcurfniyhzsgxdoajwkrmlp\r\n" + 
				"revtfmbfniyhzsgxdoajwkqmbp\r\n" + 
				"revtcubfniahzsgxdoajwkqhtp\r\n" + 
				"rejtcubfhiyhzsgxdoajwkqmfp\r\n" + 
				"revtcuxfqiyhzsgxdoajwkqmlh\r\n" + 
				"revtcuzfniwhzsgxdoajwkqmcp\r\n" + 
				"revtcubfniyhzsmxdotjwkqmlx\r\n" + 
				"revtcubfniyhzzgxmoajwkqulp\r\n" + 
				"revtcuaffiyhzsgxdoajwkqmlj\r\n" + 
				"revtcxbfniyhzsaxdoajwkqflp\r\n" + 
				"revtjubfniyhzcrxdoajwkqmlp\r\n" + 
				"revtcunfniyhzsgxdfajwoqmlp\r\n" + 
				"revtcubfpiytzswxdoajwkqmlp\r\n" + 
				"revtcubfniyhzsgxdorjwiqmtp\r\n" + 
				"oevtcubfniyhzsgidoajwkqmlt\r\n" + 
				"revccubzniyhztgxdoajwkqmlp\r\n" + 
				"reircubfniwhzsgxdoajwkqmlp\r\n" + 
				"revtcubfniyhzsgxhyajwkqvlp\r\n" + 
				"revtcubfnpyhzsgxdoajwkvblp\r\n" + 
				"revtduvfniyhzsixdoajwkqmlp\r\n" + 
				"revtcebfniyhzsgydpajwkqmlp\r\n" + 
				"revtcubftiyhzsgxwkajwkqmlp\r\n" + 
				"revtcdbfniyuzsgxdoajlkqmlp\r\n" + 
				"revtcubfnvydjsgxdoajwkqmlp\r\n" + 
				"cevtcupfniypzsgxdoajwkqmlp\r\n" + 
				"revtcubfniyhzsgoeonjwkqmlp\r\n" + 
				"revtcsbfniyhzsgxdoyjwdqmlp\r\n" + 
				"revtcubfriyhzugxdoakwkqmlp\r\n" + 
				"revtcadfniohzsgxdoajwkqmlp\r\n" + 
				"revrcubfniyhzsguxoajwkqmlp\r\n" + 
				"ruvtcubfniyhzsxxdoahwkqmlp\r\n" + 
				"aevtcubfniyhzsgcdoajwkqdlp\r\n" + 
				"revtcubgniyhzwgxdoajpkqmlp\r\n" + 
				"revtcubfniyhzegxdoajwkumsp\r\n" + 
				"rlvtcubzniyhzsgxdoajwkqzlp\r\n" + 
				"revtfubfniyhzxgbdoajwkqmlp\r\n" + 
				"revtcubfniyszssxdoajwkymlp\r\n" + 
				"revtcubfniyhzsgxdoarskzmlp\r\n" + 
				"rewtcubfniyhzsgxdoajwkpmlh\r\n" + 
				"revtcubbniyhzsfxdxajwkqmlp\r\n" + 
				"yeitcubfniyhzsgxdrajwkqmlp\r\n" + 
				"revtcubfniyhzsrxnoajwkemlp\r\n" + 
				"revtcuefnqyhzsgxdoajwkqmbp\r\n" + 
				"revtcubfniyhzsuxdoajwdqnlp\r\n" + 
				"revtcujfnifhzsgxdoaswkqmlp\r\n" + 
				"revtcuyfniyhzsgxdoaswklmlp\r\n" + 
				"reeacubfniyhzsgxdoajwkqmfp\r\n" + 
				"revtcubvniyhzsgxdoauwkqmls\r\n" + 
				"revtpubkniyhzsgxdoajvkqmlp\r\n" + 
				"revtcubfnpyhzsgxdoavnkqmlp\r\n" + 
				"revtcobfnvyhzsfxdoajwkqmlp\r\n" + 
				"gevtcubfniyhzsgxcoajwkqmld\r\n" + 
				"rivtcubfniyhzqgxdpajwkqmlp\r\n" + 
				"rettgubfngyhzsgxdoajwkqmlp\r\n" + 
				"revtcuhfccyhzsgxdoajwkqmlp\r\n" + 
				"rertarbfniyhzsgxdoajwkqmlp\r\n" + 
				"rhftcybfniyhzsgxdoajwkqmlp\r\n" + 
				"revtcvjfniyhzsgxboajwkqmlp\r\n" + 
				"reetcubfnikhzsgxdoajwkqmsp\r\n" + 
				"revtwubfniyhusgxdoajwkqelp\r\n" + 
				"revtcdbfniyyzsgxdwajwkqmlp\r\n" + 
				"revtcurfniyhzsgxduajwkqmtp\r\n" + 
				"revtcuafneyhzsgxduajwkqmlp\r\n" + 
				"rpvtcubfziyhzsgxdoajwkqmep\r\n" + 
				"mevtcubfniyhzssxdoaywkqmlp\r\n" + 
				"reptcubfniypzsgsdoajwkqmlp\r\n" + 
				"revtcubfniyhnsgxdoajwcqelp\r\n" + 
				"revtcutfniyhzsdxdoajwkqmlr\r\n" + 
				"rpvtcuafniyhzsgxqoajwkqmlp\r\n" + 
				"revncubfniyhzsgxdoajwkqkpp\r\n" + 
				"rertcabfniyhzsgxdoejwkqmlp\r\n" + 
				"revockbfniymzsgxdoajwkqmlp\r\n" + 
				"revtsubfniyczsgxdoajwkqplp\r\n" + 
				"revrcubpniyhzbgxdoajwkqmlp\r\n" + 
				"revrculfniyhzsgxdoajwkrmlp\r\n" + 
				"revtlubfniyhzsgxdiajhkqmlp\r\n" + 
				"ravtcubfniyhzsgxdoajwftmlp\r\n" + 
				"revtcunfxiyhzssxdoajwkqmlp\r\n" + 
				"revscubfniypzsgxroajwkqmlp\r\n" + 
				"mevtzubfniyhysgxdoajwkqmlp\r\n" + 
				"reitcubfniyuzogxdoajwkqmlp\r\n" + 
				"revycubfniyhwsgxdoajwkqmlg\r\n" + 
				"revtcubfnyyhzsgxdoajwkomqp\r\n" + 
				"zevtcutfniyhzsgxcoajwkqmlp\r\n" + 
				"revtwubfniylzsgxdjajwkqmlp\r\n" + 
				"oevtcubfniyhzsgxdoaowkzmlp\r\n" + 
				"revtcubfniyhzsgxdxajwwqclp\r\n" + 
				"revtcuafniyhzsgxdlacwkqmlp\r\n" + 
				"revtcubfniyhzsgxdqrjlkqmlp\r\n" + 
				"revmcubfnvyhzsgxduajwkqmlp\r\n" + 
				"rgvvcubfniyhzxgxdoajwkqmlp\r\n" + 
				"revtcubfniyhzsgxdoakwiqmlz\r\n" + 
				"reztcubfniyhzsgxddajwnqmlp\r\n" + 
				"revtcrbfnayhzsgxdoajwxqmlp\r\n" + 
				"revtcuboncyxzsgxdoajwkqmlp\r\n" + 
				"revtczbfniybxsgxdoajwkqmlp\r\n" + 
				"yevtcubfniyhcsdxdoajwkqmlp\r\n" + 
				"reztcmbfniyhzsgxcoajwkqmlp\r\n" + 
				"restcubfliyhzsbxdoajwkqmlp\r\n" + 
				"restcubkniyhzsgxdomjwkqmlp\r\n" + 
				"reokhubfniyhzsgxdoajwkqmlp\r\n" + 
				"rejtiubfniyhzsnxdoajwkqmlp\r\n" + 
				"revtcubfuiyjzsgxdoajykqmlp\r\n" + 
				"revscubfniyhzsixdoajwkqhlp\r\n" + 
				"revtjuzfniyhzsgxdoajwkqilp\r\n" + 
				"revtcubfziyhzsgxdoajhgqmlp\r\n" + 
				"revtcubiniyhzsgldoacwkqmlp\r\n" + 
				"revtcubfngyhisgxdoajwkqmkp\r\n" + 
				"ruvtcubfniyhzsgxloajwkqplp\r\n" + 
				"rtvtcubfniqbzsgxdoajwkqmlp\r\n" + 
				"revtcubfniyhzegxdffjwkqmlp\r\n" + 
				"revtcumsniyhzsgxdoajwkqmsp\r\n" + 
				"rmvtcubfnhyhzsgxsoajwkqmlp\r\n" + 
				"revtcbbfniyhzsgxdoajwkqzgp\r\n" + 
				"rebtcjufniyhzsgxdoajwkqmlp\r\n" + 
				"rephcubfniyhzvgxdoajwkqmlp\r\n" + 
				"revtcpbfniyxzsgxdoajwkqmls\r\n" + 
				"revjcubfniyizsgxdoajwkqmcp\r\n" + 
				"revtcuqfniyhzsgxdoavwkqmdp\r\n" + 
				"rettcubfniyhzsgxdoojwkqmbp\r\n" + 
				"rkvtcubfmuyhzsgxdoajwkqmlp\r\n" + 
				"revtcubcniyhzngxdoajlkqmlp\r\n" + 
				"revxcubfpiyfzsgxdoajwkqmlp\r\n" + 
				"revtcubfniyhzsgkkoajwklmlp\r\n" + 
				"revtcubfniyhzsbxdoajwqqslp\r\n" + 
				"zecycubfniyhzsgxdoajwkqmlp\r\n" + 
				"revtcubfniyhzsggaoajwksmlp\r\n" + 
				"revtcubffiyhzspxdoajwkqmmp\r\n" + 
				"ruvtcubfniyhzsgxdoajwkamlu\r\n" + 
				"revtcubfnmyhzsgxjoajwuqmlp\r\n" + 
				"revtcubfniyhisgxdoajwkqjgp\r\n" + 
				"revthubfniyhzsgxdoajwkeolp\r\n" + 
				"ryvtgubfniyhzsgidoajwkqmlp\r\n" + 
				"reitiubfniyhzsgxdoajwkqmbp\r\n" + 
				"rektcubfniyhzsfxdoajpkqmlp\r\n" + 
				"revbcubfniykzsgxdoajwkqwlp\r\n" + 
				"revzyubfniyhzkgxdoajwkqmlp\r\n" + 
				"ravtcubfniyhzsgxdoajwkhmap\r\n" + 
				"revtcubfnfyhzsgxdvpjwkqmlp\r\n" + 
				"rhvtcnbfnibhzsgxdoajwkqmlp\r\n" + 
				"revtctbfniywzsgxroajwkqmlp\r\n" + 
				"revtcubfniyhzsfmdoabwkqmlp\r\n" + 
				"sevtcubfniynzsgxpoajwkqmlp\r\n" + 
				"revtcnbfniyhzzgxdoajwzqmlp\r\n" + 
				"revtcoofniyhzsgxdoajwkqmrp\r\n" + 
				"revtcubfaiynysgxdoajwkqmlp\r\n" + 
				"revtlubfniyizsnxdoajwkqmlp\r\n" + 
				"revtcubfnwyzzsgxdoajwkqmzp\r\n" + 
				"revtqubfjiyhzsgxdoajwkrmlp\r\n" + 
				"revtaubfniyhpsgxdoajwkqilp\r\n" + 
				"revncuufniwhzsgxdoajwkqmlp\r\n" + 
				"revtcubfngyhisgxdoauwkqmlp\r\n" + 
				"revtcubynqyhzdgxdoajwkqmlp\r\n" + 
				"revtcubfniykzsgxdoyjwkqmla\r\n" + 
				"revttubfniytzsghdoajwkqmlp\r\n" + 
				"rerzcujfniyhzsgxdoajwkqmlp\r\n" + 
				"revtcubtniydzsgxdoajwkpmlp\r\n" + 
				"revecubfniyhzsvxsoajwkqmlp\r\n" + 
				"revtcuvfniyhzsgsdaajwkqmlp\r\n" + 
				"revtcubfniyxzsgxdoajtkzmlp\r\n" + 
				"revtcukfxiyhzsgxdofjwkqmlp\r\n" + 
				"revtcubfnayhzugxdqajwkqmlp\r\n" + 
				"revtcbbfniyizsgxdoajwkqmop\r\n" + 
				"revtcubfnzyhzsgxdoajwoqmpp\r\n" + 
				"reitcnbfniyqzsgxdoajwkqmlp\r\n" + 
				"rektcubfniyhzsgxdgijwkqmlp\r\n" + 
				"revtcubfniyhpsaxdoajdkqmlp\r\n" + 
				"ckvtcubfniyhzsgxeoajwkqmlp\r\n" + 
				"revtcubfniyhzsgxdhajzknmlp\r\n" + 
				"revscubfniyhrsgxdoajwwqmlp\r\n" + 
				"revtcubfilyhzsgxdpajwkqmlp\r\n" + 
				"fevtcubyniyhzsgxdoajwkqmpp";
		
		// PART 1
		String[] splitInput = puzzleInput.split("\r\n");
		int two = 0;
		int three = 0;
		
		// iterate through array of ids and check each for exactly two or three letters
		for (int i = 0; i < splitInput.length; i++) {
			
			if (findTwo(splitInput[i])) {
				two++;
			}
			if (findThree(splitInput[i])) {
				three++;
			}
			
		}
		
		// calculate checksum
		System.out.println("Checksum: " + (two * three));
		
		// PART 2
		System.out.println("Same letters: " + findID(splitInput));

	}
	
	// PART 1
	public static boolean findTwo(String id) {
		
		char[] checkedLetters = new char[26];
		int checkedIndex = 0;
		
		// iterate through id
		for (int i = 0; i < id.length(); i++) {
			
			// if the letter has already been checked, skip it
			boolean alreadyChecked = false;
			for (int j = 0; j < checkedIndex; j++) {
				if (id.charAt(i) == checkedLetters[j]) {
					alreadyChecked = true;
				}
			}
			
			// check that the letter appears exactly twice
			if (!alreadyChecked) {
				int index = id.indexOf(id.charAt(i), i + 1);
				if (index != -1) {
					index = id.indexOf(id.charAt(i), index + 1);
					if (index == -1) {
						return true;
					}
				}
			
			// if it does not appear exactly twice, add it to the checked letters
				checkedLetters[checkedIndex] = id.charAt(i);
				checkedIndex++;
			}
		}
		
		return false;
	}
	
	public static boolean findThree(String id) {
		
		char[] checkedLetters = new char[26];
		int checkedIndex = 0;
		
		// iterate through id
		for (int i = 0; i < id.length(); i++) {
			
			// if the letter has already been checked, skip it
			boolean alreadyChecked = false;
			for (int j = 0; j < checkedIndex; j++) {
				if (id.charAt(i) == checkedLetters[j]) {
					alreadyChecked = true;
				}
			}
			
			// check that the letter appears exactly thrice
			if (!alreadyChecked) {
				int index = id.indexOf(id.charAt(i), i + 1);
				if (index != -1) {
					index = id.indexOf(id.charAt(i), index + 1);
					if (index != -1) {
						index = id.indexOf(id.charAt(i), index + 1);
						if (index == -1) {
							return true;
						}
					}
				}
			
			// if it does not appear exactly thrice, add it to the checked letters
				checkedLetters[checkedIndex] = id.charAt(i);
				checkedIndex++;
			}
			
		}
		
		return false;
		
	}
	
	public static String findID(String[] input) {
		
		// PART 2
		int differences = 0;
		int idLength = input[1].length();
		
		// iterate through array of ids
		for (int i = 0; i < input.length - 1; i++) {
			
			// iterate through rest of ids
			for (int j = i + 1; j < input.length; j++) {
				
				// iterate through characters in both ids
				int k;
				int diffIndex = 0;
				for (k = 0; k < idLength && differences <= 1; k++) {
					if (input[i].charAt(k) != input[j].charAt(k)) {
						differences++;
						diffIndex = k;
					}
				}
				
				// if the number of differences is exactly 1, return the common letters
				if (differences == 1) {
					return input[i].substring(0,diffIndex) + input[i].substring(diffIndex + 1);
				}
				else {
					differences = 0;
				}
			}
			
		}
		
		return null;
	}

}
