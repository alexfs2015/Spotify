package defpackage;

import com.spotify.music.ondemandsharing.OnDemandSharingUtils;

/* renamed from: tti reason: default package */
public final class tti implements wig<OnDemandSharingUtils> {
    private final wzi<ttk> a;

    private tti(wzi<ttk> wzi) {
        this.a = wzi;
    }

    public static tti a(wzi<ttk> wzi) {
        return new tti(wzi);
    }

    public final /* synthetic */ Object get() {
        return new OnDemandSharingUtils((ttk) this.a.get());
    }
}
