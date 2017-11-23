/**
 * <html>
 * <body>
 *  <P> Copyright 1994 JsonInternational</p>
 *  <p> All rights reserved.</p>
 *  <p> Created on 19941115</p>
 *  <p> Created by Jason</p>
 *  </body>
 * </html>
 */
package cn.ucaner.components.core.security;


import java.security.KeyFactory;
import java.security.PrivateKey;
import java.security.Signature;
import java.security.spec.PKCS8EncodedKeySpec;

/**
* @Package：cn.ucaner.components.core.security   
* @ClassName：RSA256   
* @Description：   <p> rsa256 </p>
* @Author： - DaoDou 
* @CreatTime：2017年11月23日 下午11:20:00   
* @Modify By：   
* @ModifyTime：  
* @Modify marker：   
* @version    V1.0
 */
public final class RSA256 implements ISecurity {

    private final String SIGN_256_ALGORITHMS = "SHA256WithRSA";

    private final ISecurity base64 = SecurityUtil.getBase64();

    @Override
    public String Encrypt(String data) throws Exception {
        return null;
    }

    @Override
    public String Decrypt(String data) throws Exception {
        return null;
    }

    @Override
    public String Sign(String content, String privateKey) throws Exception {
        PKCS8EncodedKeySpec priPKCS8 = new PKCS8EncodedKeySpec(base64.Decrypt(privateKey).getBytes("UTF-8"));
        KeyFactory keyf = KeyFactory.getInstance("RSA");
        PrivateKey priKey = keyf.generatePrivate(priPKCS8);
        Signature signature = Signature.getInstance(SIGN_256_ALGORITHMS);
        signature.initSign(priKey);
        signature.update(content.getBytes("UTF-8"));
        byte[] signed = signature.sign();
        return base64.Encrypt(new String(signed));
    }
}
