package Order;

import Member.Member;

public interface DiscountPolicy {
    int discount(Member member, int price);

}
