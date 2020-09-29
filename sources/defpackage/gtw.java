package defpackage;

import com.spotify.mobile.android.driving.flags.DrivingFlagsUtils;

/* renamed from: gtw reason: default package */
public final class gtw implements vua<DrivingFlagsUtils> {
    private final wlc<hec> a;

    private gtw(wlc<hec> wlc) {
        this.a = wlc;
    }

    public static gtw a(wlc<hec> wlc) {
        return new gtw(wlc);
    }

    public final /* synthetic */ Object get() {
        return new DrivingFlagsUtils((hec) this.a.get());
    }
}
