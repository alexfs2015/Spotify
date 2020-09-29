package defpackage;

import java.util.Set;

/* renamed from: tvo reason: default package */
public final class tvo implements wig<tvn> {
    private final wzi<Set<tvp>> a;

    private tvo(wzi<Set<tvp>> wzi) {
        this.a = wzi;
    }

    public static tvo a(wzi<Set<tvp>> wzi) {
        return new tvo(wzi);
    }

    public final /* synthetic */ Object get() {
        return new tvn((Set) this.a.get());
    }
}
