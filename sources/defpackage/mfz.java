package defpackage;

import com.spotify.mobile.android.connect.model.DeviceState;

/* renamed from: mfz reason: default package */
public final class mfz {
    private String a;
    private boolean b;
    private boolean c;
    private String d;
    private String e;

    mfz(DeviceState deviceState, boolean z, boolean z2, String str, String str2) {
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
        if (!(obj instanceof mfz)) {
            return false;
        }
        mfz mfz = (mfz) obj;
        if (this.b == mfz.b && this.c == mfz.c && this.a.equals(mfz.a) && this.d.equals(mfz.d)) {
            return this.e.equals(mfz.e);
        }
        return false;
    }

    public final int hashCode() {
        return (((((((this.a.hashCode() * 31) + (this.b ? 1 : 0)) * 31) + (this.c ? 1 : 0)) * 31) + this.d.hashCode()) * 31) + this.e.hashCode();
    }
}
