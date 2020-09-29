package defpackage;

import java.nio.charset.Charset;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* renamed from: cwf reason: default package */
public final class cwf<P> {
    static final Charset a = Charset.forName("UTF-8");
    ConcurrentMap<String, List<cwg<P>>> b = new ConcurrentHashMap();
    cwg<P> c;
}
