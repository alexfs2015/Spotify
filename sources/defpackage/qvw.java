package defpackage;

import android.os.Handler;

/* renamed from: qvw reason: default package */
public final class qvw implements vua<hcw> {
    private final wlc<hcx> a;

    private qvw(wlc<hcx> wlc) {
        this.a = wlc;
    }

    public static qvw a(wlc<hcx> wlc) {
        return new qvw(wlc);
    }

    public final /* synthetic */ Object get() {
        hcx hcx = (hcx) this.a.get();
        hcv hcv = new hcv(new Handler(), hcx.b, 200);
        hcx.a.a(hcv);
        return (hcw) vuf.a(hcv, "Cannot return null from a non-@Nullable @Provides method");
    }
}
