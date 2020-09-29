package defpackage;

import android.os.Bundle;

/* renamed from: pfb reason: default package */
public final class pfb implements wig<String> {
    private final wzi<Bundle> a;

    private pfb(wzi<Bundle> wzi) {
        this.a = wzi;
    }

    public static pfb a(wzi<Bundle> wzi) {
        return new pfb(wzi);
    }

    public final /* synthetic */ Object get() {
        return (String) wil.a(((Bundle) this.a.get()).getString("uri", ""), "Cannot return null from a non-@Nullable @Provides method");
    }
}
