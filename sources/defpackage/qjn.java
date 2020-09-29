package defpackage;

import java.util.Set;

/* renamed from: qjn reason: default package */
public final class qjn implements wig<qjm> {
    private final wzi<Set<a>> a;
    private final wzi<Set<b>> b;

    private qjn(wzi<Set<a>> wzi, wzi<Set<b>> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static qjn a(wzi<Set<a>> wzi, wzi<Set<b>> wzi2) {
        return new qjn(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return new qjm((Set) this.a.get(), (Set) this.b.get());
    }
}
