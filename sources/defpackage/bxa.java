package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Scope;

/* renamed from: bxa reason: default package */
public final class bxa extends bxf {
    public static final Creator<bxa> CREATOR = new byh();
    private final int a;
    private final int b;
    private final int c;
    @Deprecated
    private final Scope[] d;

    bxa(int i, int i2, int i3, Scope[] scopeArr) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = scopeArr;
    }

    public bxa(int i, int i2) {
        this(1, i, i2, null);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = bxg.a(parcel, 20293);
        bxg.b(parcel, 1, this.a);
        bxg.b(parcel, 2, this.b);
        bxg.b(parcel, 3, this.c);
        bxg.a(parcel, 4, (T[]) this.d, i, false);
        bxg.b(parcel, a2);
    }
}
