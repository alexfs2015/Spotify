package defpackage;

import com.squareup.picasso.Downloader;

/* renamed from: lmn reason: default package */
public final class lmn implements wig<Downloader> {
    private final wzi<giz> a;

    private lmn(wzi<giz> wzi) {
        this.a = wzi;
    }

    public static lmn a(wzi<giz> wzi) {
        return new lmn(wzi);
    }

    public final /* synthetic */ Object get() {
        return (Downloader) wil.a(new foi(((giz) this.a.get()).c), "Cannot return null from a non-@Nullable @Provides method");
    }
}
