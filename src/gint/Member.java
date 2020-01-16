package gint;

import java.util.ArrayList;
import java.util.Scanner;

public class Member {
	private String name;
	private String team;
	private String rank;

	public Member() {}

	public Member(String name, String team, String rank) {
		this.name= name;
		this.team = team;
		this.rank = rank;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getTeam() {
		return team;
	}
	public void setTeam(String team) {
		this.team = team;
	}
	
	public String getRank( ) {
		return rank;
	}
	public void setRank(String rank) {
		this.rank = rank;
	}

	public static void printMember(ArrayList memberList) {
		String selectedMember = null;
		Scanner scanner = new Scanner(System.in);
		int checkCnt = 0;

		System.out.println("원하는 멤버의 이름을 입력해주세요");
		System.out.print("이름 : ");
		selectedMember = scanner.next();

		for (int i = 0; i < memberList.size(); i++) {
			Member member = (Member) memberList.get(i);
			if (member.getName().equals(selectedMember)) {
				checkCnt++;
				System.out.println(
						member.getName() + "\t" + member.getTeam() + "\t" + member.getRank());
			}
		}

		if (checkCnt == 0) {
			System.out.println("요청하신 멤버를 찾을 수 없습니다. 이름을 확인 해주세요");
		}
	}
}
