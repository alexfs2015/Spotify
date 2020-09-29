package defpackage;

import android.os.Bundle;

/* renamed from: kyn reason: default package */
public final class kyn implements vua<String> {
    private final wlc<Bundle> a;

    private kyn(wlc<Bundle> wlc) {
        this.a = wlc;
    }

    public static kyn a(wlc<Bundle> wlc) {
        return new kyn(wlc);
    }

    public final /* synthetic */ Object get() {
        return (String) vuf.a((String) fay.a(((Bundle) this.a.get()).getString("username"), (Object) "Username fragment argument not set."), "Cannot return null from a non-@Nullable @Provides method");
    }
}
