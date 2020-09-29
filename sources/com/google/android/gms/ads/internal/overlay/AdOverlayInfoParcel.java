package com.google.android.gms.ads.internal.overlay;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.ReflectedParcelable;

@cey
public final class AdOverlayInfoParcel extends bxf implements ReflectedParcelable {
    public static final Creator<AdOverlayInfoParcel> CREATOR = new bhb();
    public final bgs a;
    public final dos b;
    public final bhc c;
    public final csr d;
    public final bft e;
    public final String f;
    public final boolean g;
    public final String h;
    public final bhi i;
    public final int j;
    public final int k;
    public final String l;
    public final coy m;
    public final String n;
    public final bif o;
    public final bfr p;

    public AdOverlayInfoParcel(bgs bgs, IBinder iBinder, IBinder iBinder2, IBinder iBinder3, IBinder iBinder4, String str, boolean z, String str2, IBinder iBinder5, int i2, int i3, String str3, coy coy, String str4, bif bif, IBinder iBinder6) {
        this.a = bgs;
        this.b = (dos) cas.a(a.a(iBinder));
        this.c = (bhc) cas.a(a.a(iBinder2));
        this.d = (csr) cas.a(a.a(iBinder3));
        this.p = (bfr) cas.a(a.a(iBinder6));
        this.e = (bft) cas.a(a.a(iBinder4));
        this.f = str;
        this.g = z;
        this.h = str2;
        this.i = (bhi) cas.a(a.a(iBinder5));
        this.j = i2;
        this.k = i3;
        this.l = str3;
        this.m = coy;
        this.n = str4;
        this.o = bif;
    }

    public AdOverlayInfoParcel(bgs bgs, dos dos, bhc bhc, bhi bhi, coy coy) {
        this.a = bgs;
        this.b = dos;
        this.c = bhc;
        this.d = null;
        this.p = null;
        this.e = null;
        this.f = null;
        this.g = false;
        this.h = null;
        this.i = bhi;
        this.j = -1;
        this.k = 4;
        this.l = null;
        this.m = coy;
        this.n = null;
        this.o = null;
    }

    public AdOverlayInfoParcel(dos dos, bhc bhc, bfr bfr, bft bft, bhi bhi, csr csr, boolean z, int i2, String str, coy coy) {
        this.a = null;
        this.b = dos;
        this.c = bhc;
        this.d = csr;
        this.p = bfr;
        this.e = bft;
        this.f = null;
        this.g = z;
        this.h = null;
        this.i = bhi;
        this.j = i2;
        this.k = 3;
        this.l = str;
        this.m = coy;
        this.n = null;
        this.o = null;
    }

    public AdOverlayInfoParcel(dos dos, bhc bhc, bfr bfr, bft bft, bhi bhi, csr csr, boolean z, int i2, String str, String str2, coy coy) {
        this.a = null;
        this.b = dos;
        this.c = bhc;
        this.d = csr;
        this.p = bfr;
        this.e = bft;
        this.f = str2;
        this.g = z;
        this.h = str;
        this.i = bhi;
        this.j = i2;
        this.k = 3;
        this.l = null;
        this.m = coy;
        this.n = null;
        this.o = null;
    }

    public AdOverlayInfoParcel(dos dos, bhc bhc, bhi bhi, csr csr, int i2, coy coy, String str, bif bif) {
        this.a = null;
        this.b = dos;
        this.c = bhc;
        this.d = csr;
        this.p = null;
        this.e = null;
        this.f = null;
        this.g = false;
        this.h = null;
        this.i = bhi;
        this.j = i2;
        this.k = 1;
        this.l = null;
        this.m = coy;
        this.n = str;
        this.o = bif;
    }

    public AdOverlayInfoParcel(dos dos, bhc bhc, bhi bhi, csr csr, boolean z, int i2, coy coy) {
        this.a = null;
        this.b = dos;
        this.c = bhc;
        this.d = csr;
        this.p = null;
        this.e = null;
        this.f = null;
        this.g = z;
        this.h = null;
        this.i = bhi;
        this.j = i2;
        this.k = 2;
        this.l = null;
        this.m = coy;
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
        int a2 = bxg.a(parcel, 20293);
        bxg.a(parcel, 2, (Parcelable) this.a, i2, false);
        bxg.a(parcel, 3, cas.a(this.b).asBinder(), false);
        bxg.a(parcel, 4, cas.a(this.c).asBinder(), false);
        bxg.a(parcel, 5, cas.a(this.d).asBinder(), false);
        bxg.a(parcel, 6, cas.a(this.e).asBinder(), false);
        bxg.a(parcel, 7, this.f, false);
        bxg.a(parcel, 8, this.g);
        bxg.a(parcel, 9, this.h, false);
        bxg.a(parcel, 10, cas.a(this.i).asBinder(), false);
        bxg.b(parcel, 11, this.j);
        bxg.b(parcel, 12, this.k);
        bxg.a(parcel, 13, this.l, false);
        bxg.a(parcel, 14, (Parcelable) this.m, i2, false);
        bxg.a(parcel, 16, this.n, false);
        bxg.a(parcel, 17, (Parcelable) this.o, i2, false);
        bxg.a(parcel, 18, cas.a(this.p).asBinder(), false);
        bxg.b(parcel, a2);
    }
}
