package defpackage;

import java.util.List;
import java.util.Set;
import javax.net.ssl.SSLEngine;

/* renamed from: wtf reason: default package */
public interface wtf extends wsy {

    /* renamed from: wtf$a */
    public interface a {
    }

    /* renamed from: wtf$b */
    public interface b {
        a a(SSLEngine sSLEngine, List<String> list);
    }

    /* renamed from: wtf$c */
    public interface c {
    }

    /* renamed from: wtf$d */
    public interface d {
        c a(SSLEngine sSLEngine, Set<String> set);
    }

    /* renamed from: wtf$e */
    public interface e {
        SSLEngine a(SSLEngine sSLEngine, wtf wtf, boolean z);
    }

    e b();

    b c();

    d d();
}
