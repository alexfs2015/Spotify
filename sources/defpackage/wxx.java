package defpackage;

import io.netty.util.internal.ThreadLocalRandom;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: wxx reason: default package */
public class wxx {
    static final ThreadLocal<wxi> b = new ThreadLocal<>();
    static final AtomicInteger c = new AtomicInteger();
    Object[] d;
    public int e;
    public Map<Class<?>, Boolean> f;
    public wxh g;
    public ThreadLocalRandom h;
    Map<Class<?>, wxw> i;
    Map<Class<?>, Map<String, wxw>> j;
    StringBuilder k;
    public Map<Charset, CharsetEncoder> l;
    public Map<Charset, CharsetDecoder> m;

    wxx(Object[] objArr) {
        this.d = objArr;
    }
}
