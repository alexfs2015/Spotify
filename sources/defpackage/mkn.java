package defpackage;

import com.spotify.mobile.android.connect.model.DeviceState;

/* renamed from: mkn reason: default package */
public final class mkn {
    private String a;
    private boolean b;
    private boolean c;
    private String d;
    private String e;

    mkn(DeviceState deviceState, boolean z, boolean z2, String str, String str2) {
        this.a = deviceState.toString();
        this.b = z;
        this.c = z2;
        this.d = str;
        this.e = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mkn)) {
            return false;
        }
        mkn mkn = (mkn) obj;
        if (this.b == mkn.b && this.c == mkn.c && this.a.equals(mkn.a) && this.d.equals(mkn.d)) {
            return this.e.equals(mkn.e);
        }
        return false;
    }

    public final int hashCode() {
        return (((((((this.a.hashCode() * 31) + (this.b ? 1 : 0)) * 31) + (this.c ? 1 : 0)) * 31) + this.d.hashCode()) * 31) + this.e.hashCode();
    }
}
