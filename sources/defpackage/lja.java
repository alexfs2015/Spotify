package defpackage;

import android.content.Context;
import com.spotify.music.R;

/* renamed from: lja reason: default package */
public final class lja implements vua<String> {
    private final wlc<Context> a;

    private lja(wlc<Context> wlc) {
        this.a = wlc;
    }

    public static lja a(wlc<Context> wlc) {
        return new lja(wlc);
    }

    public final /* synthetic */ Object get() {
        return (String) vuf.a(((Context) this.a.get()).getString(R.string.media_provider_authority), "Cannot return null from a non-@Nullable @Provides method");
    }
}
