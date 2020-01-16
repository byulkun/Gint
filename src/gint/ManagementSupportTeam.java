package gint;

import java.util.ArrayList;

public class ManagementSupportTeam implements Team {


    public ManagementSupportTeam() {}

    @Override
    public void doWork() {
        System.out.println("경영 지원중...");
    }

    public ArrayList setMemberRoster(){
        ArrayList<Member> memberList = new ArrayList<Member>();

        memberList.add(new Member("김용현", "임원", "대표이사"));
        memberList.add(new Member("손승락", "임원", "연구소장"));
        memberList.add(new Member("송재호", "임원", "서비스 프랫폼 개발팀 팀장"));
        memberList.add(new Member("손승락", "데이터 연구팀", "(겸)팀장(이사)"));
        memberList.add(new Member("김지은", "경영 지원팀", "팀장(차장)"));
        memberList.add(new Member("박성은", "경영 지원팀", "주임"));
        memberList.add(new Member("김명중", "경영 지원팀", "주임"));
        memberList.add(new Member("김연태", "자율 주행 플랫폼팀", "팀장(책임)"));
        memberList.add(new Member("최성훈", "자율 주행 플랫폼팀", "주임연구원"));
        memberList.add(new Member("최상천", "제어 시스템 개발팀", "팀장(책임)"));
        memberList.add(new Member("이근식", "제어 시스템 개발팀", "책임연구원"));
        memberList.add(new Member("윤희범", "제어 시스템 개발팀", "선임연구원"));
        memberList.add(new Member("김도훈", "제어 시스템 개발팀", "주임연구원"));
        memberList.add(new Member("김민지", "제어 시스템 개발팀", "주임연구원"));
        memberList.add(new Member("김은태", "제어 시스템 개발팀", "주임연구원"));
        memberList.add(new Member("이동환", "제어 시스템 개발팀", "주임연구원"));
        memberList.add(new Member("김도훈", "제어 시스템 개발팀", "주임연구원"));
        memberList.add(new Member("윤해온", "H/W 플랫폼팀", "팀장(책임)"));
        memberList.add(new Member("손민규", "H/W 플랫폼팀", "선임연구원"));
        memberList.add(new Member("한아름", "H/W 플랫폼팀", "선임연구원"));
        memberList.add(new Member("신현모", "임베디드 S/W팀", "팀장(책임)"));
        memberList.add(new Member("장여운", "임베디드 S/W팀", "책임연구원"));
        memberList.add(new Member("김병선", "임베디드 S/W팀", "선임연구원"));
        memberList.add(new Member("장수환", "임베디드 S/W팀", "선임연구원"));
        memberList.add(new Member("송재호", "서비스 프랫폼 개발팀", "팀장(이사)"));
        memberList.add(new Member("김현길", "서비스 프랫폼 개발팀", "책임연구원"));
        memberList.add(new Member("김진원", "서비스 프랫폼 개발팀", "선임연구원"));
        memberList.add(new Member("도상희", "서비스 프랫폼 개발팀", "주임연구원"));
        memberList.add(new Member("안영범", "서비스 프랫폼 개발팀", "주임연구원"));
        memberList.add(new Member("이한별", "서비스 프랫폼 개발팀", "주임연구원"));
        memberList.add(new Member("이혜진", "서비스 프랫폼 개발팀", "주임연구원"));

        return memberList;
    }

    public void requestWork() {

    }
}
