package defpackage;

import com.spotify.mobile.android.util.ui.Lifecycle.a;
import com.spotify.music.nowplaying.common.view.overlay.OverlayDisplayMode;
import io.reactivex.Flowable;

/* renamed from: tdl reason: default package */
public final class tdl {
    private final wzi<tkp> a;
    private final wzi<Flowable<OverlayDisplayMode>> b;
    private final wzi<a> c;

    public tdl(wzi<tkp> wzi, wzi<Flowable<OverlayDisplayMode>> wzi2, wzi<a> wzi3) {
        this.a = (wzi) a(wzi, 1);
        this.b = (wzi) a(wzi2, 2);
        this.c = (wzi) a(wzi3, 3);
    }

    private static <T> T a(T t, int i) {
        if (t != null) {
            return t;
        }
        StringBuilder sb = new StringBuilder("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        sb.append(i);
        throw new NullPointerException(sb.toString());
    }

    public final tdk a(Flowable<Boolean> flowable) {
        return new tdk((tkp) a(this.a.get(), 1), (Flowable) a(this.b.get(), 2), (a) a(this.c.get(), 3), (Flowable) a(flowable, 4));
    }
}
