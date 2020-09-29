package defpackage;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Status;

/* renamed from: exf reason: default package */
public final class exf extends bxw implements btc {
    public static final Creator<exf> CREATOR = new exg();
    private final int a;
    private int b;
    private Intent c;

    public exf() {
        this(0);
    }

    private exf(byte b2) {
        this(2, 0, null);
    }

    exf(int i, int i2, Intent intent) {
        this.a = i;
        this.b = i2;
        this.c = intent;
    }

    public final Status B_() {
        return this.b == 0 ? Status.a : Status.e;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = bxx.a(parcel, 20293);
        bxx.b(parcel, 1, this.a);
        bxx.b(parcel, 2, this.b);
        bxx.a(parcel, 3, (Parcelable) this.c, i, false);
        bxx.b(parcel, a2);
    }
}
