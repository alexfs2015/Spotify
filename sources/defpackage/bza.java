package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: bza reason: default package */
public final class bza extends bxw {
    public static final Creator<bza> CREATOR = new bzb();
    Bundle a;
    bsn[] b;

    public bza() {
    }

    bza(Bundle bundle, bsn[] bsnArr) {
        this.a = bundle;
        this.b = bsnArr;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = bxx.a(parcel, 20293);
        bxx.a(parcel, 1, this.a, false);
        bxx.a(parcel, 2, (T[]) this.b, i, false);
        bxx.b(parcel, a2);
    }
}
