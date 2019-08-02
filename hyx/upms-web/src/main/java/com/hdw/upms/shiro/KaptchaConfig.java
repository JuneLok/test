package com.hdw.upms.shiro;

import com.google.code.kaptcha.Producer;
import com.google.code.kaptcha.util.Config;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.Properties;

/**
 * @author TuMinglong
 * @Description Kaptcha验证码配置
 * @date 2018/7/9 14:06
 */
@Component
public class KaptchaConfig {

    @Bean
    public Producer KaptchaProducer() {
        Properties kaptchaProperties = new Properties();
        kaptchaProperties.put("kaptcha.border", "no");
        kaptchaProperties.put("kaptcha.textproducer.char.length", "4");
        kaptchaProperties.put("kaptcha.textproducer.char.space", "6");
        kaptchaProperties.put("kaptcha.image.height", "80");
        // kaptchaProperties.put("kaptcha.image.width","125");
        kaptchaProperties.put("kaptcha.obscurificator.impl", "com.google.code.kaptcha.impl.WaterRipple");
        kaptchaProperties.put("kaptcha.textproducer.font.color", "blue");
        kaptchaProperties.put("kaptcha.textproducer.font.size", "60");
        //kaptchaProperties.put("kaptcha.noise.impl","com.google.code.kaptcha.impl.NoNoise");
        kaptchaProperties.put("kaptcha.noise.impl", "com.google.code.kaptcha.impl.DefaultNoise");
        kaptchaProperties.put("kaptcha.textproducer.char.string", "123456789");

        Config config = new Config(kaptchaProperties);
        return config.getProducerImpl();
    }
}
