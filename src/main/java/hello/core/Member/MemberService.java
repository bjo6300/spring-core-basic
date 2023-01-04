package hello.core.Member;

public interface MemberService {
    void join(Member memeber);

    Member findMember(Long memberId);
}
