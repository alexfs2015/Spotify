package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

/* renamed from: eqk reason: default package */
public final class eqk extends bxf {
    public static final Creator<eqk> CREATOR = new eql();
    public final String a;
    public final eqh b;
    public final String c;
    public final long d;

    public eqk(String str, eqh eqh, String str2, long j) {
        this.a = str;
        this.b = eqh;
        this.c = str2;
        this.d = j;
    }

    eqk(eqk eqk, long j) {
        bwx.a(eqk);
        this.a = eqk.a;
        this.b = eqk.b;
        this.c = eqk.c;
        this.d = j;
    }

    public final String toString() {
        String str = this.c;
        String str2 = this.a;
        String valueOf = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 21 + String.valueOf(str2).length() + String.valueOf(valueOf).length());
        sb.append("origin=");
        sb.append(str);
        sb.append(",name=");
        sb.append(str2);
        sb.append(",params=");
        sb.append(valueOf);
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = bxg.a(parcel, 20293);
        bxg.a(parcel, 2, this.a, false);
        bxg.a(parcel, 3, (Parcelable) this.b, i, false);
        bxg.a(parcel, 4, this.c, false);
        bxg.a(parcel, 5, this.d);
        bxg.b(parcel, a2);
    }
}
