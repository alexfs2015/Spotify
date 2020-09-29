package defpackage;

import io.reactivex.Scheduler;

/* renamed from: oba reason: default package */
public final class oba implements wig<oaz> {
    private final wzi<Scheduler> a;
    private final wzi<a> b;
    private final wzi<szp> c;

    private oba(wzi<Scheduler> wzi, wzi<a> wzi2, wzi<szp> wzi3) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
    }

    public static oba a(wzi<Scheduler> wzi, wzi<a> wzi2, wzi<szp> wzi3) {
        return new oba(wzi, wzi2, wzi3);
    }

    public final /* synthetic */ Object get() {
        return new oaz(this.a, this.b, this.c);
    }
}
