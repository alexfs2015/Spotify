package defpackage;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Status;

/* renamed from: ewo reason: default package */
public final class ewo extends bxf implements bsl {
    public static final Creator<ewo> CREATOR = new ewp();
    private final int a;
    private int b;
    private Intent c;

    ewo(int i, int i2, Intent intent) {
        this.a = i;
        this.b = i2;
        this.c = intent;
    }

    public ewo() {
        this(0);
    }

    private ewo(byte b2) {
        this(2, 0, null);
    }

    public final Status B_() {
        if (this.b == 0) {
            return Status.a;
        }
        return Status.e;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = bxg.a(parcel, 20293);
        bxg.b(parcel, 1, this.a);
        bxg.b(parcel, 2, this.b);
        bxg.a(parcel, 3, (Parcelable) this.c, i, false);
        bxg.b(parcel, a2);
    }
}
