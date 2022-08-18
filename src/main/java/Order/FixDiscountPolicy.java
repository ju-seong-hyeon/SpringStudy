package Order;

import Member.Member;
import Member.Grade;

public class FixDiscountPolicy implements DiscountPolicy {
    private int fixdiscount = 1000;

    @Override
    public int discount(Member member, int price) {
        if(member.getGrade() == Grade.VIP){
            return fixdiscount;
        }
        else {
            return 0;
        }
    }
}
