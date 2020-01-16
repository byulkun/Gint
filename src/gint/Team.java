package gint;

import java.util.ArrayList;

public interface Team {
    public void doWork();

    public static void printTeamRoster(ArrayList memberList, String selectedTeam) {
        for (int i = 0; i < memberList.size(); i++) {
            Member member = (Member) memberList.get(i);
            if (member.getTeam().equals(selectedTeam)) {
                System.out.println(
                        member.getName() + "\t" + member.getTeam() + "\t" + member.getRank());
            }
        }
    }
}
