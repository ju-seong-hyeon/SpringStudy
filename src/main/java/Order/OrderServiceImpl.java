package Order;

import Member.Member;
import Member.MemberRepository;


public class OrderServiceImpl implements OrderService {
    private final MemberRepository memberRepository;
    private final DiscountPolicy discountPolicy;

    public OrderServiceImpl(MemberRepository memberRepository, DiscountPolicy discountPolicy) {
        this.memberRepository = memberRepository;
        this.discountPolicy = discountPolicy;
    }

    @Override
    public Order createOrder(Long memberid, String itemName, int itemPrice) {
        Member member = memberRepository.findbyId(memberid);
        int discountprice = discountPolicy.discount(member, itemPrice);
        return new Order(memberid, itemName, itemPrice, discountprice);
    }
}
