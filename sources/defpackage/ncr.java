package defpackage;

import android.content.res.Resources;
import com.spotify.music.R;

/* renamed from: ncr reason: default package */
public final class ncr implements wig<String> {
    private final wzi<Resources> a;

    private ncr(wzi<Resources> wzi) {
        this.a = wzi;
    }

    public static ncr a(wzi<Resources> wzi) {
        return new ncr(wzi);
    }

    public final /* synthetic */ Object get() {
        return (String) wil.a(((Resources) this.a.get()).getString(R.string.error_general_title), "Cannot return null from a non-@Nullable @Provides method");
    }
}
