package defpackage;

import android.content.res.Resources;

/* renamed from: rfh reason: default package */
public final class rfh implements wig<rfg> {
    private final wzi<rbg> a;
    private final wzi<Resources> b;

    private rfh(wzi<rbg> wzi, wzi<Resources> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static rfh a(wzi<rbg> wzi, wzi<Resources> wzi2) {
        return new rfh(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return new rfg((rbg) this.a.get(), (Resources) this.b.get());
    }
}
