package defpackage;

import com.spotify.mobile.android.service.offlinesync.OfflineProgressModel;

/* renamed from: hwx reason: default package */
public final class hwx implements wig<hww> {
    private final wzi<xii<OfflineProgressModel>> a;
    private final wzi<xil> b;

    private hwx(wzi<xii<OfflineProgressModel>> wzi, wzi<xil> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static hwx a(wzi<xii<OfflineProgressModel>> wzi, wzi<xil> wzi2) {
        return new hwx(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return new hww((xii) this.a.get(), (xil) this.b.get());
    }
}
