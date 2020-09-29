package defpackage;

import android.os.Bundle;

/* renamed from: nln reason: default package */
public final class nln implements wig<String> {
    private final wzi<Bundle> a;

    private nln(wzi<Bundle> wzi) {
        this.a = wzi;
    }

    public static nln a(wzi<Bundle> wzi) {
        return new nln(wzi);
    }

    public final /* synthetic */ Object get() {
        return (String) wil.a(((Bundle) this.a.get()).getString("redirect_uri", ""), "Cannot return null from a non-@Nullable @Provides method");
    }
}
