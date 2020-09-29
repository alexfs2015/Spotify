package defpackage;

import android.content.Context;
import com.spotify.music.R;

/* renamed from: qhj reason: default package */
public final class qhj implements wig<String> {
    private final wzi<Context> a;

    private qhj(wzi<Context> wzi) {
        this.a = wzi;
    }

    public static qhj a(wzi<Context> wzi) {
        return new qhj(wzi);
    }

    public final /* synthetic */ Object get() {
        return (String) wil.a(((Context) this.a.get()).getString(R.string.recent_searches_title), "Cannot return null from a non-@Nullable @Provides method");
    }
}
