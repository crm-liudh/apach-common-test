package com.example.commons.test.demo.util;


import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.commons.mail.*;

import javax.mail.internet.MimeUtility;

public class TestEmail {
    private static Log log = LogFactory.getLog(TestLog.class);
    public static void EmailTest() {
        try {
            HtmlEmail email = new HtmlEmail();
            EmailAttachment attachment = new EmailAttachment();
            email.setHostName("smtp.qq.com");//smtp.exmail.qq.com
            email.setSmtpPort(465);
            email.setAuthenticator(new DefaultAuthenticator(CommonStatic.USERNAME, CommonStatic.PASSWORD));
            email.setSSLOnConnect(true);
            email.setFrom(CommonStatic.USERNAME);//发件人
            email.setSubject("邮件主题");//邮件主题
            email.setMsg("DU.py");//邮件内容
            //添加附件---------start
            attachment.setPath("D:/DU.py");
            attachment.setName(MimeUtility.encodeText("DU.py"));
            attachment.setDisposition(EmailAttachment.ATTACHMENT);
            attachment.setDescription("Picture of John");
            email.attach(attachment);
            //添加附件---------end
            email.addTo("yilong.liao@hand-china.com");//接收人
            email.addCc("lina.liao@hand-china.com");//抄送人
           // email.addBcc("密送收件人");//密送收件人
            email.send();
        }catch (Exception e){
            log.error(e.getMessage());
        }
    }
}
