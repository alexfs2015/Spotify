package defpackage;

import java.util.LinkedHashSet;
import java.util.Set;

/* renamed from: wmu reason: default package */
public final class wmu {
    private final Set<wmh> a = new LinkedHashSet();

    public final synchronized void a(wmh wmh) {
        this.a.add(wmh);
    }

    public final synchronized void b(wmh wmh) {
        this.a.remove(wmh);
    }

    public final synchronized boolean c(wmh wmh) {
        return this.a.contains(wmh);
    }
}
