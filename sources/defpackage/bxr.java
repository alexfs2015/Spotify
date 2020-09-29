package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Scope;

/* renamed from: bxr reason: default package */
public final class bxr extends bxw {
    public static final Creator<bxr> CREATOR = new byy();
    private final int a;
    private final int b;
    private final int c;
    @Deprecated
    private final Scope[] d;

    public bxr(int i, int i2) {
        this(1, i, i2, null);
    }

    bxr(int i, int i2, int i3, Scope[] scopeArr) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = scopeArr;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = bxx.a(parcel, 20293);
        bxx.b(parcel, 1, this.a);
        bxx.b(parcel, 2, this.b);
        bxx.b(parcel, 3, this.c);
        bxx.a(parcel, 4, (T[]) this.d, i, false);
        bxx.b(parcel, a2);
    }
}
