package defpackage;

import com.spotify.music.toastie.ToastieManager;

/* renamed from: ncx reason: default package */
public final class ncx implements wig<ncw> {
    private final wzi<ToastieManager> a;
    private final wzi<uqy> b;

    private ncx(wzi<ToastieManager> wzi, wzi<uqy> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static ncx a(wzi<ToastieManager> wzi, wzi<uqy> wzi2) {
        return new ncx(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return new ncw((ToastieManager) this.a.get(), (uqy) this.b.get());
    }
}
