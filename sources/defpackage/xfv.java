package defpackage;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;

/* renamed from: xfv reason: default package */
public final class xfv implements xfn {
    public boolean a = false;
    public final Map<String, xfu> b = new HashMap();
    public final LinkedBlockingQueue<xfs> c = new LinkedBlockingQueue<>();

    public final synchronized xfo a(String str) {
        xfu xfu;
        xfu = (xfu) this.b.get(str);
        if (xfu == null) {
            xfu = new xfu(str, this.c, this.a);
            this.b.put(str, xfu);
        }
        return xfu;
    }
}
