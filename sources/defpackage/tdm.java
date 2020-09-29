package defpackage;

import com.spotify.mobile.android.util.ui.Lifecycle.a;
import com.spotify.music.nowplaying.common.view.overlay.OverlayDisplayMode;
import io.reactivex.Flowable;

/* renamed from: tdm reason: default package */
public final class tdm implements wig<tdl> {
    private final wzi<tkp> a;
    private final wzi<Flowable<OverlayDisplayMode>> b;
    private final wzi<a> c;

    private tdm(wzi<tkp> wzi, wzi<Flowable<OverlayDisplayMode>> wzi2, wzi<a> wzi3) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
    }

    public static tdm a(wzi<tkp> wzi, wzi<Flowable<OverlayDisplayMode>> wzi2, wzi<a> wzi3) {
        return new tdm(wzi, wzi2, wzi3);
    }

    public final /* synthetic */ Object get() {
        return new tdl(this.a, this.b, this.c);
    }
}
