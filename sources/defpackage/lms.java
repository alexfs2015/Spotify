package defpackage;

import com.squareup.picasso.Downloader;

/* renamed from: lms reason: default package */
public final class lms implements wig<vhf> {
    private final wzi<vhe> a;
    private final wzi<Downloader> b;

    private lms(wzi<vhe> wzi, wzi<Downloader> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static lms a(wzi<vhe> wzi, wzi<Downloader> wzi2) {
        return new lms(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return (vhf) wil.a(new vhf((vhe) this.a.get(), (Downloader) this.b.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
