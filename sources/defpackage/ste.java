package defpackage;

import com.spotify.mobile.android.util.ui.Lifecycle.a;
import com.spotify.music.nowplaying.common.view.overlay.OverlayDisplayMode;
import io.reactivex.Flowable;

/* renamed from: ste reason: default package */
public final class ste {
    private final wlc<tai> a;
    private final wlc<Flowable<OverlayDisplayMode>> b;
    private final wlc<a> c;

    public ste(wlc<tai> wlc, wlc<Flowable<OverlayDisplayMode>> wlc2, wlc<a> wlc3) {
        this.a = (wlc) a(wlc, 1);
        this.b = (wlc) a(wlc2, 2);
        this.c = (wlc) a(wlc3, 3);
    }

    public final std a(Flowable<Boolean> flowable) {
        return new std((tai) a(this.a.get(), 1), (Flowable) a(this.b.get(), 2), (a) a(this.c.get(), 3), (Flowable) a(flowable, 4));
    }

    private static <T> T a(T t, int i) {
        if (t != null) {
            return t;
        }
        StringBuilder sb = new StringBuilder("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        sb.append(i);
        throw new NullPointerException(sb.toString());
    }
}
