package defpackage;

import java.util.LinkedHashSet;
import java.util.Set;

/* renamed from: xba reason: default package */
public final class xba {
    private final Set<xan> a = new LinkedHashSet();

    public final synchronized void a(xan xan) {
        this.a.add(xan);
    }

    public final synchronized void b(xan xan) {
        this.a.remove(xan);
    }

    public final synchronized boolean c(xan xan) {
        return this.a.contains(xan);
    }
}
