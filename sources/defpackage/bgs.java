package defpackage;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

@cey
/* renamed from: bgs reason: default package */
public final class bgs extends bxf {
    public static final Creator<bgs> CREATOR = new bgr();
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final Intent f;
    private final String g;
    private final String h;

    public bgs(Intent intent) {
        this(null, null, null, null, null, null, null, intent);
    }

    public bgs(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this(str, str2, str3, str4, str5, str6, str7, null);
    }

    public bgs(String str, String str2, String str3, String str4, String str5, String str6, String str7, Intent intent) {
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
        int a2 = bxg.a(parcel, 20293);
        bxg.a(parcel, 2, this.g, false);
        bxg.a(parcel, 3, this.a, false);
        bxg.a(parcel, 4, this.b, false);
        bxg.a(parcel, 5, this.c, false);
        bxg.a(parcel, 6, this.d, false);
        bxg.a(parcel, 7, this.e, false);
        bxg.a(parcel, 8, this.h, false);
        bxg.a(parcel, 9, (Parcelable) this.f, i, false);
        bxg.b(parcel, a2);
    }
}
