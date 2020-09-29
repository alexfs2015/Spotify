package defpackage;

import com.spotify.mobile.android.waze.model.WazeBannerModel;
import com.spotify.mobile.android.waze.model.WazeBannerModel.Type;

/* renamed from: kqs reason: default package */
final class kqs implements kqf {
    private final sff a;
    private final kew b;

    kqs(kew kew, sff sff) {
        this.b = kew;
        this.a = sff;
    }

    public final void a() {
        this.b.a(WazeBannerModel.a(Type.NO_BANNER).a());
        this.a.b("waze");
    }
}
