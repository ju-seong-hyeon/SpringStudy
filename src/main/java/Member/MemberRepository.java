package Member;

public interface MemberRepository {
    void save(Member member);
    Member findbyId(Long memberId);
}
