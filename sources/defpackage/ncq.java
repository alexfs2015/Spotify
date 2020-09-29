package defpackage;

import android.content.res.Resources;
import com.spotify.music.R;

/* renamed from: ncq reason: default package */
public final class ncq implements wig<String> {
    private final wzi<Resources> a;

    private ncq(wzi<Resources> wzi) {
        this.a = wzi;
    }

    public static ncq a(wzi<Resources> wzi) {
        return new ncq(wzi);
    }

    public final /* synthetic */ Object get() {
        return (String) wil.a(((Resources) this.a.get()).getString(R.string.error_general_body), "Cannot return null from a non-@Nullable @Provides method");
    }
}
