package cn.stylefeng.guns.config;

import cn.stylefeng.guns.utils.SmsUtil;
import com.aliyuncs.exceptions.ClientException;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
@RabbitListener(queues = "forget_sms")
public class ForgetPwdSmsListener {

    @Autowired
    private SmsUtil smsUtil;

    @Value("${aliyun.sms.template_code}")
    private String templateCode;

    @Value("${aliyun.sms.sign_name}")
    private String signName;

    @Value("${aliyun.sms.forget_code}")
    private String forgetCode;

    /**
     * 发送短信 修改密码
     * @param message
     */
    @RabbitHandler
    public void sendForgetSms(Map<String,String> message){
        try {
            smsUtil.sendForgetSms(message.get("mobile"),forgetCode,signName,"{\"code\":\""+message.get("code")+"\"}");
            System.out.println("手机号："+message.get("mobile"));
            System.out.println("验证码："+message.get("code"));
            System.out.println("code："+message.get("code"));
            System.out.println("mobile："+message.get("mobile"));
        } catch (ClientException e) {
            e.printStackTrace();
        }
    }
}
