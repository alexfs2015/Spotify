package defpackage;

import android.content.Context;
import com.spotify.music.R;

/* renamed from: mbr reason: default package */
public final class mbr implements wig<String> {
    private final wzi<Context> a;

    private mbr(wzi<Context> wzi) {
        this.a = wzi;
    }

    public static mbr a(wzi<Context> wzi) {
        return new mbr(wzi);
    }

    public final /* synthetic */ Object get() {
        return (String) wil.a(((Context) this.a.get()).getString(R.string.search_default_title), "Cannot return null from a non-@Nullable @Provides method");
    }
}
