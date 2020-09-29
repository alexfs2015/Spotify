package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

@cfp
/* renamed from: dsl reason: default package */
public final class dsl extends bxw {
    public static final Creator<dsl> CREATOR = new dsm();
    public final String a;

    public dsl(bly bly) {
        this.a = bly.a;
    }

    dsl(String str) {
        this.a = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = bxx.a(parcel, 20293);
        bxx.a(parcel, 15, this.a, false);
        bxx.b(parcel, a2);
    }
}
