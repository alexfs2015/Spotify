package defpackage;

import android.content.Context;
import com.spotify.music.R;

/* renamed from: qaf reason: default package */
public final class qaf implements vua<String> {
    private final wlc<Context> a;

    private qaf(wlc<Context> wlc) {
        this.a = wlc;
    }

    public static qaf a(wlc<Context> wlc) {
        return new qaf(wlc);
    }

    public final /* synthetic */ Object get() {
        return (String) vuf.a(((Context) this.a.get()).getString(R.string.recent_searches_title), "Cannot return null from a non-@Nullable @Provides method");
    }
}
