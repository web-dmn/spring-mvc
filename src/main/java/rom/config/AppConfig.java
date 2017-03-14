package rom.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import rom.sample.SampleBean;
import rom.sample.impl.SampleBeanImpl;

/**
 * Created by Java on 2017/03/14.
 */
@Configuration
@ComponentScan(basePackages = {"rom.sample"})
public class AppConfig {

    @Bean
    public SampleBean sampleBean() {
        return new SampleBeanImpl();
    }
}
