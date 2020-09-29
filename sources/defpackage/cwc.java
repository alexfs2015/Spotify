package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: cwc reason: default package */
public final class cwc extends bxw {
    public static final Creator<cwc> CREATOR = new cwd();
    private final int a;
    private final String b;
    private final String c;

    cwc(int i, String str, String str2) {
        this.a = i;
        this.b = str;
        this.c = str2;
    }

    public cwc(String str, String str2) {
        this(1, str, str2);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = bxx.a(parcel, 20293);
        bxx.b(parcel, 1, this.a);
        bxx.a(parcel, 2, this.b, false);
        bxx.a(parcel, 3, this.c, false);
        bxx.b(parcel, a2);
    }
}
