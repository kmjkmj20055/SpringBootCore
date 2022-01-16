package hello.core.member;

public class MemberServiceImpl implements MemberService {

    //    interface만 가지면 nullpointException 뜨겠 ?
//    이때 구현할 객체를 선택해줘야함 -> MemoryMemberRepository
    private final MemberRepository memberRepository;


    public MemberServiceImpl(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    @Override
    public void join(Member member) {
        memberRepository.save(member);
    }

    @Override
    public Member findMember(Long memberId) {
        return memberRepository.findById(memberId);
    }
}
