import Member.MemberRepository;
import Member.MemberService;
import Member.MemberServiceImpl;
import Member.MemoryMemberRepository;
import Order.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    MemberService memberService() {
        return new MemberServiceImpl(memberRepository());
    }
    @Bean
    OrderService orderService() {
        return new OrderServiceImpl(memberRepository(), discountPolicy());
    }
    @Bean
    public MemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }
    @Bean
    public DiscountPolicy discountPolicy() {
        return new RateDiscountPolicy();
    }
    /*
    MemberService memberService(){
        return new MemberServiceImpl(memberRepository());
    };
    OrderService orderService(){
        return new OrderServiceImpl(memberRepository(), discountPolicy());
    }


    public MemberRepository memberRepository(){
        return new MemoryMemberRepository();
    }
    public DiscountPolicy discountPolicy(){
        return new RateDiscountPolicy();
    }
    */


}
