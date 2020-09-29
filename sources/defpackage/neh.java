package defpackage;

import com.spotify.mobile.android.util.ui.Lifecycle.a;

/* renamed from: neh reason: default package */
public final class neh implements wig<quk> {
    private final wzi<a> a;

    private neh(wzi<a> wzi) {
        this.a = wzi;
    }

    public static neh a(wzi<a> wzi) {
        return new neh(wzi);
    }

    public final /* synthetic */ Object get() {
        return (quk) wil.a(new quj("key_session_id", (a) this.a.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
