package defpackage;

import java.util.List;
import java.util.Set;
import javax.net.ssl.SSLEngine;

/* renamed from: wez reason: default package */
public interface wez extends wes {

    /* renamed from: wez$a */
    public interface a {
    }

    /* renamed from: wez$b */
    public interface b {
        a a(SSLEngine sSLEngine, List<String> list);
    }

    /* renamed from: wez$c */
    public interface c {
    }

    /* renamed from: wez$d */
    public interface d {
        c a(SSLEngine sSLEngine, Set<String> set);
    }

    /* renamed from: wez$e */
    public interface e {
        SSLEngine a(SSLEngine sSLEngine, wez wez, boolean z);
    }

    e b();

    b c();

    d d();
}
