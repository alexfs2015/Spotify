package defpackage;

import com.spotify.mobile.android.util.ui.Lifecycle.a;

/* renamed from: qtw reason: default package */
public final class qtw implements wig<quk> {
    private final wzi<a> a;

    private qtw(wzi<a> wzi) {
        this.a = wzi;
    }

    public static qtw a(wzi<a> wzi) {
        return new qtw(wzi);
    }

    public final /* synthetic */ Object get() {
        return (quk) wil.a(new quj("key_search_session_id", (a) this.a.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
