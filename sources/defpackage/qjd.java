package defpackage;

import android.content.Context;
import com.spotify.music.R;

/* renamed from: qjd reason: default package */
public final class qjd implements wig<String> {
    private final wzi<Context> a;

    private qjd(wzi<Context> wzi) {
        this.a = wzi;
    }

    public static qjd a(wzi<Context> wzi) {
        return new qjd(wzi);
    }

    public final /* synthetic */ Object get() {
        return (String) wil.a(((Context) this.a.get()).getString(R.string.recent_searches_title), "Cannot return null from a non-@Nullable @Provides method");
    }
}
