package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: eih reason: default package */
public final class eih extends ehk implements eie {
    eih(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.cast.internal.ICastDeviceController");
    }

    public final void a() {
        c(1, e());
    }

    public final void a(double d, double d2, boolean z) {
        Parcel e = e();
        e.writeDouble(d);
        e.writeDouble(d2);
        ehz.a(e, z);
        c(7, e);
    }

    public final void a(String str) {
        Parcel e = e();
        e.writeString(str);
        c(5, e);
    }

    public final void a(String str, boa boa) {
        Parcel e = e();
        e.writeString(str);
        ehz.a(e, (Parcelable) boa);
        c(13, e);
    }

    public final void a(String str, String str2, long j) {
        Parcel e = e();
        e.writeString(str);
        e.writeString(str2);
        e.writeLong(j);
        c(9, e);
    }

    public final void a(String str, String str2, brr brr) {
        Parcel e = e();
        e.writeString(str);
        e.writeString(str2);
        ehz.a(e, (Parcelable) brr);
        c(14, e);
    }

    public final void b(String str) {
        Parcel e = e();
        e.writeString(str);
        c(11, e);
    }

    public final void c(String str) {
        Parcel e = e();
        e.writeString(str);
        c(12, e);
    }
}
