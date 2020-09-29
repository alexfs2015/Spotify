package defpackage;

import com.spotify.mobile.android.util.LinkType;

/* renamed from: toh reason: default package */
public final class toh {
    private final boolean a;
    private final boolean b;

    public toh(boolean z, boolean z2) {
        this.b = z2;
        this.a = z;
    }

    public final boolean a(vlc vlc, String str) {
        if (!this.b && !this.a) {
            jva a2 = jva.a(str);
            if (!(LinkType.SHOW_SHOW == a2.b || LinkType.SHOW_EPISODE == a2.b)) {
                return vlc != null && ((Boolean) vlc.n().a(Boolean.FALSE)).booleanValue();
            }
        }
        return true;
    }
}
