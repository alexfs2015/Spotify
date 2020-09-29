package defpackage;

import java.util.Set;

/* renamed from: sco reason: default package */
public final class sco implements wig<scn> {
    private final wzi<Set<scp>> a;

    private sco(wzi<Set<scp>> wzi) {
        this.a = wzi;
    }

    public static sco a(wzi<Set<scp>> wzi) {
        return new sco(wzi);
    }

    public final /* synthetic */ Object get() {
        return new scn((Set) this.a.get());
    }
}
