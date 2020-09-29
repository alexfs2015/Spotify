package defpackage;

import android.os.Bundle;

/* renamed from: oqv reason: default package */
public final class oqv implements wig<String> {
    private final wzi<Bundle> a;

    private oqv(wzi<Bundle> wzi) {
        this.a = wzi;
    }

    public static String a(Bundle bundle) {
        return (String) wil.a(bundle.getString("key_playlist_uri"), "Cannot return null from a non-@Nullable @Provides method");
    }

    public static oqv a(wzi<Bundle> wzi) {
        return new oqv(wzi);
    }

    public final /* synthetic */ Object get() {
        return a((Bundle) this.a.get());
    }
}
