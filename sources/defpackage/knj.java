package defpackage;

import com.spotify.mobile.android.waze.model.WazeBannerModel;
import com.spotify.mobile.android.waze.model.WazeBannerModel.Type;

/* renamed from: knj reason: default package */
final class knj implements kmw {
    private final rvv a;
    private final kcv b;

    knj(kcv kcv, rvv rvv) {
        this.b = kcv;
        this.a = rvv;
    }

    public final void a() {
        this.b.a(WazeBannerModel.a(Type.NO_BANNER).a());
        this.a.b("waze");
    }
}
