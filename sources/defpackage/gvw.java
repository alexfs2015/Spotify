package defpackage;

import com.spotify.mobile.android.driving.flags.DrivingFlagsUtils;

/* renamed from: gvw reason: default package */
public final class gvw implements wig<DrivingFlagsUtils> {
    private final wzi<hgy> a;

    private gvw(wzi<hgy> wzi) {
        this.a = wzi;
    }

    public static gvw a(wzi<hgy> wzi) {
        return new gvw(wzi);
    }

    public final /* synthetic */ Object get() {
        return new DrivingFlagsUtils((hgy) this.a.get());
    }
}
