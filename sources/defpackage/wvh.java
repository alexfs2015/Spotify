package defpackage;

import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CodingErrorAction;
import java.util.IdentityHashMap;
import java.util.Map;

/* renamed from: wvh reason: default package */
public final class wvh {
    public static final Charset a = Charset.forName("UTF-8");
    public static final Charset b = Charset.forName("US-ASCII");
    private static Charset c = Charset.forName("UTF-16");
    private static Charset d = Charset.forName("UTF-16BE");
    private static Charset e = Charset.forName("UTF-16LE");
    private static Charset f = Charset.forName("ISO-8859-1");

    static {
        Charset[] charsetArr = {c, d, e, a, f, b};
    }

    public static CharsetEncoder a(Charset charset) {
        String str = "charset";
        wxq.a(charset, str);
        wxi b2 = wxi.b();
        Map map = b2.l;
        if (map == null) {
            map = new IdentityHashMap();
            b2.l = map;
        }
        CharsetEncoder charsetEncoder = (CharsetEncoder) map.get(charset);
        if (charsetEncoder != null) {
            charsetEncoder.reset().onMalformedInput(CodingErrorAction.REPLACE).onUnmappableCharacter(CodingErrorAction.REPLACE);
            return charsetEncoder;
        }
        CodingErrorAction codingErrorAction = CodingErrorAction.REPLACE;
        wxq.a(charset, str);
        CharsetEncoder newEncoder = charset.newEncoder();
        newEncoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction);
        map.put(charset, newEncoder);
        return newEncoder;
    }

    public static CharsetDecoder b(Charset charset) {
        String str = "charset";
        wxq.a(charset, str);
        wxi b2 = wxi.b();
        Map map = b2.m;
        if (map == null) {
            map = new IdentityHashMap();
            b2.m = map;
        }
        CharsetDecoder charsetDecoder = (CharsetDecoder) map.get(charset);
        if (charsetDecoder != null) {
            charsetDecoder.reset().onMalformedInput(CodingErrorAction.REPLACE).onUnmappableCharacter(CodingErrorAction.REPLACE);
            return charsetDecoder;
        }
        CodingErrorAction codingErrorAction = CodingErrorAction.REPLACE;
        wxq.a(charset, str);
        CharsetDecoder newDecoder = charset.newDecoder();
        newDecoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction);
        map.put(charset, newDecoder);
        return newDecoder;
    }
}
