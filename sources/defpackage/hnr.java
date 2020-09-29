package defpackage;

import android.content.Context;
import com.spotify.music.libs.viewuri.ViewUris;

/* renamed from: hnr reason: default package */
public final class hnr implements vua<hnn> {
    private final wlc<Context> a;
    private final wlc<jjf> b;

    private hnr(wlc<Context> wlc, wlc<jjf> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static hnr a(wlc<Context> wlc, wlc<jjf> wlc2) {
        return new hnr(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return (hnn) vuf.a(new hnm((Context) this.a.get(), ViewUris.bP, new hou((jjf) this.b.get())), "Cannot return null from a non-@Nullable @Provides method");
    }
}
