package defpackage;

import android.content.Context;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.music.R;

/* renamed from: mye reason: default package */
public final class mye implements wig<rou> {
    private final wzi<Context> a;
    private final wzi<fqn> b;
    private final wzi<Boolean> c;
    private final wzi<mxn> d;

    private mye(wzi<Context> wzi, wzi<fqn> wzi2, wzi<Boolean> wzi3, wzi<mxn> wzi4) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
    }

    public static mye a(wzi<Context> wzi, wzi<fqn> wzi2, wzi<Boolean> wzi3, wzi<mxn> wzi4) {
        return new mye(wzi, wzi2, wzi3, wzi4);
    }

    public final /* synthetic */ Object get() {
        Context context = (Context) this.a.get();
        fqn fqn = (fqn) this.b.get();
        boolean booleanValue = ((Boolean) this.c.get()).booleanValue();
        mxn mxn = (mxn) this.d.get();
        return (rou) wil.a(rou.o().a(context.getString(R.string.album_title_default)).a(SpotifyIconV2.ALBUM).c(true).e(booleanValue).d(booleanValue).k(booleanValue).g(booleanValue || fqn.b(url.g)).i(true).a(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
