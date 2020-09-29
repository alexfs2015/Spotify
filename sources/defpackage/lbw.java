package defpackage;

import android.os.Bundle;

/* renamed from: lbw reason: default package */
public final class lbw implements wig<String> {
    private final wzi<Bundle> a;

    private lbw(wzi<Bundle> wzi) {
        this.a = wzi;
    }

    public static lbw a(wzi<Bundle> wzi) {
        return new lbw(wzi);
    }

    public final /* synthetic */ Object get() {
        return (String) wil.a((String) fbp.a(((Bundle) this.a.get()).getString("username"), (Object) "Username fragment argument not set."), "Cannot return null from a non-@Nullable @Provides method");
    }
}
