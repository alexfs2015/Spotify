package defpackage;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.List;

@cey
/* renamed from: cgn reason: default package */
public final class cgn extends bxf {
    public static final Creator<cgn> CREATOR = new cgo();
    private final Bundle a;
    private final coy b;
    private final ApplicationInfo c;
    private final String d;
    private final List<String> e;
    private final PackageInfo f;
    private final String g;
    private final boolean h;
    private final String i;

    public cgn(Bundle bundle, coy coy, ApplicationInfo applicationInfo, String str, List<String> list, PackageInfo packageInfo, String str2, boolean z, String str3) {
        this.a = bundle;
        this.b = coy;
        this.d = str;
        this.c = applicationInfo;
        this.e = list;
        this.f = packageInfo;
        this.g = str2;
        this.h = z;
        this.i = str3;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a2 = bxg.a(parcel, 20293);
        bxg.a(parcel, 1, this.a, false);
        bxg.a(parcel, 2, (Parcelable) this.b, i2, false);
        bxg.a(parcel, 3, (Parcelable) this.c, i2, false);
        bxg.a(parcel, 4, this.d, false);
        bxg.a(parcel, 5, this.e, false);
        bxg.a(parcel, 6, (Parcelable) this.f, i2, false);
        bxg.a(parcel, 7, this.g, false);
        bxg.a(parcel, 8, this.h);
        bxg.a(parcel, 9, this.i, false);
        bxg.b(parcel, a2);
    }
}
