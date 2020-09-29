package defpackage;

import java.util.Set;

/* renamed from: oyz reason: default package */
public final class oyz implements wig<oyy> {
    private final wzi<Set<oyx>> a;

    private oyz(wzi<Set<oyx>> wzi) {
        this.a = wzi;
    }

    public static oyz a(wzi<Set<oyx>> wzi) {
        return new oyz(wzi);
    }

    public final /* synthetic */ Object get() {
        return new oyy((Set) this.a.get());
    }
}
