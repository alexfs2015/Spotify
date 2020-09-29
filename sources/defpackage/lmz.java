package defpackage;

import android.content.Context;
import com.spotify.music.R;

/* renamed from: lmz reason: default package */
public final class lmz implements wig<String> {
    private final wzi<Context> a;

    private lmz(wzi<Context> wzi) {
        this.a = wzi;
    }

    public static lmz a(wzi<Context> wzi) {
        return new lmz(wzi);
    }

    public final /* synthetic */ Object get() {
        return (String) wil.a(((Context) this.a.get()).getString(R.string.media_provider_authority), "Cannot return null from a non-@Nullable @Provides method");
    }
}
