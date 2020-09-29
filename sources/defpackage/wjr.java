package defpackage;

import io.netty.util.internal.ThreadLocalRandom;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: wjr reason: default package */
public class wjr {
    static final ThreadLocal<wjc> b = new ThreadLocal<>();
    static final AtomicInteger c = new AtomicInteger();
    Object[] d;
    public int e;
    public Map<Class<?>, Boolean> f;
    public wjb g;
    public ThreadLocalRandom h;
    Map<Class<?>, wjq> i;
    Map<Class<?>, Map<String, wjq>> j;
    StringBuilder k;
    public Map<Charset, CharsetEncoder> l;
    public Map<Charset, CharsetDecoder> m;

    wjr(Object[] objArr) {
        this.d = objArr;
    }
}
