package Order;

import Member.Member;
import Member.Grade;

public class RateDiscountPolicy implements DiscountPolicy {
    private int rateDiscountP = 10;

    @Override
    public int discount(Member member, int price) {
        if(member.getGrade() == Grade.VIP){
            return price * rateDiscountP / 100;
        }else{
            return 0;
        }
    }
}
