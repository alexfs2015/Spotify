package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: cvl reason: default package */
public final class cvl extends bxf {
    public static final Creator<cvl> CREATOR = new cvm();
    private final int a;
    private final String b;
    private final String c;

    cvl(int i, String str, String str2) {
        this.a = i;
        this.b = str;
        this.c = str2;
    }

    public cvl(String str, String str2) {
        this(1, str, str2);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = bxg.a(parcel, 20293);
        bxg.b(parcel, 1, this.a);
        bxg.a(parcel, 2, this.b, false);
        bxg.a(parcel, 3, this.c, false);
        bxg.b(parcel, a2);
    }
}
