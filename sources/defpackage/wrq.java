package defpackage;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;

/* renamed from: wrq reason: default package */
public final class wrq implements wri {
    public boolean a = false;
    public final Map<String, wrp> b = new HashMap();
    public final LinkedBlockingQueue<wrn> c = new LinkedBlockingQueue<>();

    public final synchronized wrj a(String str) {
        wrp wrp;
        wrp = (wrp) this.b.get(str);
        if (wrp == null) {
            wrp = new wrp(str, this.c, this.a);
            this.b.put(str, wrp);
        }
        return wrp;
    }
}
