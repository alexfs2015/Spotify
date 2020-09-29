package com.google.android.gms.ads.internal.overlay;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.ReflectedParcelable;

@cfp
public final class AdOverlayInfoParcel extends bxw implements ReflectedParcelable {
    public static final Creator<AdOverlayInfoParcel> CREATOR = new bhs();
    public final bhj a;
    public final dpj b;
    public final bht c;
    public final cti d;
    public final bgk e;
    public final String f;
    public final boolean g;
    public final String h;
    public final bhz i;
    public final int j;
    public final int k;
    public final String l;
    public final cpp m;
    public final String n;
    public final biw o;
    public final bgi p;

    public AdOverlayInfoParcel(bhj bhj, IBinder iBinder, IBinder iBinder2, IBinder iBinder3, IBinder iBinder4, String str, boolean z, String str2, IBinder iBinder5, int i2, int i3, String str3, cpp cpp, String str4, biw biw, IBinder iBinder6) {
        this.a = bhj;
        this.b = (dpj) cbj.a(a.a(iBinder));
        this.c = (bht) cbj.a(a.a(iBinder2));
        this.d = (cti) cbj.a(a.a(iBinder3));
        this.p = (bgi) cbj.a(a.a(iBinder6));
        this.e = (bgk) cbj.a(a.a(iBinder4));
        this.f = str;
        this.g = z;
        this.h = str2;
        this.i = (bhz) cbj.a(a.a(iBinder5));
        this.j = i2;
        this.k = i3;
        this.l = str3;
        this.m = cpp;
        this.n = str4;
        this.o = biw;
    }

    public AdOverlayInfoParcel(bhj bhj, dpj dpj, bht bht, bhz bhz, cpp cpp) {
        this.a = bhj;
        this.b = dpj;
        this.c = bht;
        this.d = null;
        this.p = null;
        this.e = null;
        this.f = null;
        this.g = false;
        this.h = null;
        this.i = bhz;
        this.j = -1;
        this.k = 4;
        this.l = null;
        this.m = cpp;
        this.n = null;
        this.o = null;
    }

    public AdOverlayInfoParcel(dpj dpj, bht bht, bgi bgi, bgk bgk, bhz bhz, cti cti, boolean z, int i2, String str, cpp cpp) {
        this.a = null;
        this.b = dpj;
        this.c = bht;
        this.d = cti;
        this.p = bgi;
        this.e = bgk;
        this.f = null;
        this.g = z;
        this.h = null;
        this.i = bhz;
        this.j = i2;
        this.k = 3;
        this.l = str;
        this.m = cpp;
        this.n = null;
        this.o = null;
    }

    public AdOverlayInfoParcel(dpj dpj, bht bht, bgi bgi, bgk bgk, bhz bhz, cti cti, boolean z, int i2, String str, String str2, cpp cpp) {
        this.a = null;
        this.b = dpj;
        this.c = bht;
        this.d = cti;
        this.p = bgi;
        this.e = bgk;
        this.f = str2;
        this.g = z;
        this.h = str;
        this.i = bhz;
        this.j = i2;
        this.k = 3;
        this.l = null;
        this.m = cpp;
        this.n = null;
        this.o = null;
    }

    public AdOverlayInfoParcel(dpj dpj, bht bht, bhz bhz, cti cti, int i2, cpp cpp, String str, biw biw) {
        this.a = null;
        this.b = dpj;
        this.c = bht;
        this.d = cti;
        this.p = null;
        this.e = null;
        this.f = null;
        this.g = false;
        this.h = null;
        this.i = bhz;
        this.j = i2;
        this.k = 1;
        this.l = null;
        this.m = cpp;
        this.n = str;
        this.o = biw;
    }

    public AdOverlayInfoParcel(dpj dpj, bht bht, bhz bhz, cti cti, boolean z, int i2, cpp cpp) {
        this.a = null;
        this.b = dpj;
        this.c = bht;
        this.d = cti;
        this.p = null;
        this.e = null;
        this.f = null;
        this.g = z;
        this.h = null;
        this.i = bhz;
        this.j = i2;
        this.k = 2;
        this.l = null;
        this.m = cpp;
        this.n = null;
        this.o = null;
    }

    public static AdOverlayInfoParcel a(Intent intent) {
        String str = "com.google.android.gms.ads.inernal.overlay.AdOverlayInfo";
        try {
            Bundle bundleExtra = intent.getBundleExtra(str);
            bundleExtra.setClassLoader(AdOverlayInfoParcel.class.getClassLoader());
            return (AdOverlayInfoParcel) bundleExtra.getParcelable(str);
        } catch (Exception unused) {
            return null;
        }
    }

    public static void a(Intent intent, AdOverlayInfoParcel adOverlayInfoParcel) {
        Bundle bundle = new Bundle(1);
        String str = "com.google.android.gms.ads.inernal.overlay.AdOverlayInfo";
        bundle.putParcelable(str, adOverlayInfoParcel);
        intent.putExtra(str, bundle);
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a2 = bxx.a(parcel, 20293);
        bxx.a(parcel, 2, (Parcelable) this.a, i2, false);
        bxx.a(parcel, 3, cbj.a(this.b).asBinder(), false);
        bxx.a(parcel, 4, cbj.a(this.c).asBinder(), false);
        bxx.a(parcel, 5, cbj.a(this.d).asBinder(), false);
        bxx.a(parcel, 6, cbj.a(this.e).asBinder(), false);
        bxx.a(parcel, 7, this.f, false);
        bxx.a(parcel, 8, this.g);
        bxx.a(parcel, 9, this.h, false);
        bxx.a(parcel, 10, cbj.a(this.i).asBinder(), false);
        bxx.b(parcel, 11, this.j);
        bxx.b(parcel, 12, this.k);
        bxx.a(parcel, 13, this.l, false);
        bxx.a(parcel, 14, (Parcelable) this.m, i2, false);
        bxx.a(parcel, 16, this.n, false);
        bxx.a(parcel, 17, (Parcelable) this.o, i2, false);
        bxx.a(parcel, 18, cbj.a(this.p).asBinder(), false);
        bxx.b(parcel, a2);
    }
}
