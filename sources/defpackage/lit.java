package defpackage;

import com.squareup.picasso.Downloader;

/* renamed from: lit reason: default package */
public final class lit implements vua<uvo> {
    private final wlc<uvn> a;
    private final wlc<Downloader> b;

    private lit(wlc<uvn> wlc, wlc<Downloader> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static lit a(wlc<uvn> wlc, wlc<Downloader> wlc2) {
        return new lit(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return (uvo) vuf.a(new uvo((uvn) this.a.get(), (Downloader) this.b.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
