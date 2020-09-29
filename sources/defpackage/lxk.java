package defpackage;

import android.os.Bundle;

/* renamed from: lxk reason: default package */
public final class lxk implements wig<lxj> {
    private final wzi<Bundle> a;

    private lxk(wzi<Bundle> wzi) {
        this.a = wzi;
    }

    public static lxk a(wzi<Bundle> wzi) {
        return new lxk(wzi);
    }

    public final /* synthetic */ Object get() {
        return new lxj((Bundle) this.a.get());
    }
}
