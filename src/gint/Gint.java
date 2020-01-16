package gint;

import java.util.ArrayList;
import java.util.Scanner;

public class Gint {
    private static Scanner scanner = new Scanner(System.in);
    private static ArrayList<Member> memberList = new ArrayList<Member>();

    public static void main(String[] arg) {
        boolean state = true;
        Member member = new Member();
        ManagementSupportTeam managementSupportTeam = new ManagementSupportTeam();

        System.out.println("직원 및 팀 목록을 불러오는 중입니다. 잠깐만 기다려주세요.");
        memberList = managementSupportTeam.setMemberRoster();

        while (state) {
            System.out.println("-----------------------------------------");
            System.out.println("1.직원 열람 | 2.팀 열람 | 3.종료");
            System.out.println("-----------------------------------------");
            System.out.print("선택> ");

            switch (scanner.nextInt()) {
            case 1:
                Member.printMember(memberList);
                break;
            case 2:
                getTeamRoster();
                break;
            case 3:
                System.out.println("종료");
                state = false;
                break;
            default:
                System.out.println("알맞은 번호를 입력하시오");
                break;
            }
        }
    }

    private static void getTeamRoster() {
        System.out.println("------------------------------------------------------------------");
        System.out.println("1.임원 | 2.경영 지원팀 | 3.데이터 연구팀 | 4.자율 주행 플랫폼팀 | 5.제어 시스템 개발팀");
        System.out.println("6.H/W 플랫폼팀 | 7.임베디드 S/W팀 | 8.서비스 플랫폼 개발팀");
        System.out.println("------------------------------------------------------------------");
        System.out.println("원하는 팀을 선택해 주세요");
        System.out.print("> ");

        switch (scanner.nextInt()) {
        case 1:
            Team.printTeamRoster(memberList, "임원");
            Executives executives = new Executives();
            executives.doWork();
            break;
        case 2:
            Team.printTeamRoster(memberList, "경영 지원팀");
            ManagementSupportTeam managementSupportTeam = new ManagementSupportTeam() ;
            managementSupportTeam.doWork();
            break;
        case 3:
            Team.printTeamRoster(memberList, "데이터 연구팀");
            DataResourch dataResourch = new DataResourch();
            dataResourch.doWork();
            break;
        case 4:
            Team.printTeamRoster(memberList, "자율 주행 플랫폼팀");
            AutonomousDrivingPlatform autonomousDrivingPlatform = new AutonomousDrivingPlatform();
            autonomousDrivingPlatform.doWork();
            break;
        case 5:
            Team.printTeamRoster(memberList, "제어 시스템 개발팀");
            ControlSystemDevelop controlSystemDevelop = new ControlSystemDevelop();
            controlSystemDevelop.doWork();
            break;
        case 6:
            Team.printTeamRoster(memberList, "H/W 플랫폼팀");
            HardwarePlatform hardwarePlatform = new HardwarePlatform();
            hardwarePlatform.doWork();
            break;
        case 7:
            Team.printTeamRoster(memberList, "임베디드 S/W팀");
            EmbeddedSoftware embeddedSoftware = new EmbeddedSoftware();
            embeddedSoftware.doWork();
            break;
        case 8:
            Team.printTeamRoster(memberList, "서비스 프랫폼 개발팀");
            ServicePlatformDevelop servicePlatformDevelop = new ServicePlatformDevelop();
            servicePlatformDevelop.doWork();
            break;
        default:
            System.out.println("알맞은 번호를 입력하시오");
            break;
        }
    }
}
