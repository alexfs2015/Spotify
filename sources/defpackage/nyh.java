package defpackage;

import com.spotify.libs.pse.PreSignupExperimentHelper.LocalValuePropVariant;

/* renamed from: nyh reason: default package */
public final class nyh implements wig<nyg> {
    private final wzi<Boolean> a;
    private final wzi<Integer> b;
    private final wzi<LocalValuePropVariant> c;
    private final wzi<uun> d;

    private nyh(wzi<Boolean> wzi, wzi<Integer> wzi2, wzi<LocalValuePropVariant> wzi3, wzi<uun> wzi4) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
    }

    public static nyh a(wzi<Boolean> wzi, wzi<Integer> wzi2, wzi<LocalValuePropVariant> wzi3, wzi<uun> wzi4) {
        return new nyh(wzi, wzi2, wzi3, wzi4);
    }

    public final /* synthetic */ Object get() {
        return new nyg(((Boolean) this.a.get()).booleanValue(), ((Integer) this.b.get()).intValue(), (LocalValuePropVariant) this.c.get(), (uun) this.d.get());
    }
}
