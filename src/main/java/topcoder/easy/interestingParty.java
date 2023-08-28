package topcoder.easy;

class interestingParty {

	public static void main(String[] args) {
		
		String[] first = {"fishing", "gardening", "swimming", "fishing"};
		String[] second = {"hunting", "fishing", "fishing", "biting"};
		System.out.println(interestingParty.bestInvitation(first, second));

	}

	public static int bestInvitation(String[] first, String[] second) {
		
		int cnt = 0;

		for (int i = 0; i < first.length; i++) {
			
			int f = 0;
			int s = 0;
			
			for (int j = 0; j < first.length; j++) {
				if(first[i]  == first[j]) f++;
				if(first[i]  == second[j]) f++;
				if(second[i] == first[j]) s++;
				if(second[i] == second[j]) s++;
				
			}
			cnt = Math.max(cnt, f);
			cnt = Math.max(cnt, s);
		}
		return cnt;
	}
}

