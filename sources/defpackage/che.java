package defpackage;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.List;

@cfp
/* renamed from: che reason: default package */
public final class che extends bxw {
    public static final Creator<che> CREATOR = new chf();
    private final Bundle a;
    private final cpp b;
    private final ApplicationInfo c;
    private final String d;
    private final List<String> e;
    private final PackageInfo f;
    private final String g;
    private final boolean h;
    private final String i;

    public che(Bundle bundle, cpp cpp, ApplicationInfo applicationInfo, String str, List<String> list, PackageInfo packageInfo, String str2, boolean z, String str3) {
        this.a = bundle;
        this.b = cpp;
        this.d = str;
        this.c = applicationInfo;
        this.e = list;
        this.f = packageInfo;
        this.g = str2;
        this.h = z;
        this.i = str3;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a2 = bxx.a(parcel, 20293);
        bxx.a(parcel, 1, this.a, false);
        bxx.a(parcel, 2, (Parcelable) this.b, i2, false);
        bxx.a(parcel, 3, (Parcelable) this.c, i2, false);
        bxx.a(parcel, 4, this.d, false);
        bxx.a(parcel, 5, this.e, false);
        bxx.a(parcel, 6, (Parcelable) this.f, i2, false);
        bxx.a(parcel, 7, this.g, false);
        bxx.a(parcel, 8, this.h);
        bxx.a(parcel, 9, this.i, false);
        bxx.b(parcel, a2);
    }
}
