package defpackage;

import com.spotify.mobile.android.util.LinkType;

/* renamed from: tdx reason: default package */
public final class tdx {
    private final boolean a;
    private final boolean b;

    public tdx(boolean z, boolean z2) {
        this.b = z2;
        this.a = z;
    }

    public final boolean a(uyz uyz, String str) {
        if (!this.b && !this.a) {
            jst a2 = jst.a(str);
            if (!(LinkType.SHOW_SHOW == a2.b || LinkType.SHOW_EPISODE == a2.b)) {
                if (uyz == null || !((Boolean) uyz.n().a(Boolean.FALSE)).booleanValue()) {
                    return false;
                }
                return true;
            }
        }
        return true;
    }
}
