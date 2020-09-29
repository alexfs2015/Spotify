package defpackage;

import com.squareup.picasso.Downloader;

/* renamed from: lio reason: default package */
public final class lio implements vua<Downloader> {
    private final wlc<gho> a;

    private lio(wlc<gho> wlc) {
        this.a = wlc;
    }

    public static lio a(wlc<gho> wlc) {
        return new lio(wlc);
    }

    public final /* synthetic */ Object get() {
        return (Downloader) vuf.a(new fno(((gho) this.a.get()).c), "Cannot return null from a non-@Nullable @Provides method");
    }
}
