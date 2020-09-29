package defpackage;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

@cfp
/* renamed from: bhj reason: default package */
public final class bhj extends bxw {
    public static final Creator<bhj> CREATOR = new bhi();
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final Intent f;
    private final String g;
    private final String h;

    public bhj(Intent intent) {
        this(null, null, null, null, null, null, null, intent);
    }

    public bhj(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this(str, str2, str3, str4, str5, str6, str7, null);
    }

    public bhj(String str, String str2, String str3, String str4, String str5, String str6, String str7, Intent intent) {
        this.g = str;
        this.a = str2;
        this.b = str3;
        this.c = str4;
        this.d = str5;
        this.e = str6;
        this.h = str7;
        this.f = intent;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = bxx.a(parcel, 20293);
        bxx.a(parcel, 2, this.g, false);
        bxx.a(parcel, 3, this.a, false);
        bxx.a(parcel, 4, this.b, false);
        bxx.a(parcel, 5, this.c, false);
        bxx.a(parcel, 6, this.d, false);
        bxx.a(parcel, 7, this.e, false);
        bxx.a(parcel, 8, this.h, false);
        bxx.a(parcel, 9, (Parcelable) this.f, i, false);
        bxx.b(parcel, a2);
    }
}
