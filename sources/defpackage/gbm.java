package defpackage;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.nio.charset.Charset;

/* renamed from: gbm reason: default package */
public final class gbm {
    public static String a(String str, Charset charset) {
        try {
            return URLEncoder.encode((String) fay.a(str), (String) fay.a(charset.name()));
        } catch (UnsupportedEncodingException e) {
            throw new AssertionError(e);
        }
    }

    public static String b(String str, Charset charset) {
        try {
            return URLDecoder.decode((String) fay.a(str), (String) fay.a(charset.name()));
        } catch (UnsupportedEncodingException e) {
            throw new AssertionError(e);
        }
    }
}
