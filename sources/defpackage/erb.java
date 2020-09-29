package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

/* renamed from: erb reason: default package */
public final class erb extends bxw {
    public static final Creator<erb> CREATOR = new erc();
    public final String a;
    public final eqy b;
    public final String c;
    public final long d;

    erb(erb erb, long j) {
        bxo.a(erb);
        this.a = erb.a;
        this.b = erb.b;
        this.c = erb.c;
        this.d = j;
    }

    public erb(String str, eqy eqy, String str2, long j) {
        this.a = str;
        this.b = eqy;
        this.c = str2;
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
        int a2 = bxx.a(parcel, 20293);
        bxx.a(parcel, 2, this.a, false);
        bxx.a(parcel, 3, (Parcelable) this.b, i, false);
        bxx.a(parcel, 4, this.c, false);
        bxx.a(parcel, 5, this.d);
        bxx.b(parcel, a2);
    }
}
