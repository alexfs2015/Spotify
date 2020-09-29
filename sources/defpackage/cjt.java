package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

@cfp
/* renamed from: cjt reason: default package */
public final class cjt extends bxw {
    public static final Creator<cjt> CREATOR = new cju();
    public final dpp a;
    public final String b;

    public cjt(dpp dpp, String str) {
        this.a = dpp;
        this.b = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = bxx.a(parcel, 20293);
        bxx.a(parcel, 2, (Parcelable) this.a, i, false);
        bxx.a(parcel, 3, this.b, false);
        bxx.b(parcel, a2);
    }
}
