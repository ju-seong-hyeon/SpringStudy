import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

class AppConfigTest {
    AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);

    @Test
    void findAllBean(){
        String[] beanDifinitionNames = ac.getBeanDefinitionNames();
        for(String beanDifinitionname : beanDifinitionNames){
            Object bean = ac.getBean(beanDifinitionname);
            System.out.println("bean = " + bean);
        }
    }
    @Test
    void findApplicaitonBean(){
        String[] beanDifinitionNames = ac.getBeanDefinitionNames();
        for(String beanDifinitionname : beanDifinitionNames){
            BeanDefinition beanDefinition = ac.getBeanDefinition(beanDifinitionname);
            if(beanDefinition.getRole() == BeanDefinition.ROLE_APPLICATION){
                Object bean = ac.getBean(beanDifinitionname);
                System.out.println("bean = " + bean);
            }
        }
    }

}