package com.soft1851.md5;

/**
 * @author tengf
 * @Description:
 * @date: 2020/10/6 18:49
 */
public class MD5Service {
    public String getMD5( String input ) {
        return MD5Util.getMD5( input.getBytes() );
    }
}
