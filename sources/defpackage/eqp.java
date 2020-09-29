package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* renamed from: eqp reason: default package */
public final class eqp extends ekn implements eqn {
    eqp(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.internal.IMeasurementService");
    }

    public final void a(eqk eqk, evq evq) {
        Parcel a = a();
        ekp.a(a, (Parcelable) eqk);
        ekp.a(a, (Parcelable) evq);
        b(1, a);
    }

    public final void a(evj evj, evq evq) {
        Parcel a = a();
        ekp.a(a, (Parcelable) evj);
        ekp.a(a, (Parcelable) evq);
        b(2, a);
    }

    public final void a(evq evq) {
        Parcel a = a();
        ekp.a(a, (Parcelable) evq);
        b(4, a);
    }

    public final void a(eqk eqk, String str, String str2) {
        Parcel a = a();
        ekp.a(a, (Parcelable) eqk);
        a.writeString(str);
        a.writeString(str2);
        b(5, a);
    }

    public final void b(evq evq) {
        Parcel a = a();
        ekp.a(a, (Parcelable) evq);
        b(6, a);
    }

    public final List<evj> a(evq evq, boolean z) {
        Parcel a = a();
        ekp.a(a, (Parcelable) evq);
        ekp.a(a, z);
        Parcel a2 = a(7, a);
        ArrayList createTypedArrayList = a2.createTypedArrayList(evj.CREATOR);
        a2.recycle();
        return createTypedArrayList;
    }

    public final byte[] a(eqk eqk, String str) {
        Parcel a = a();
        ekp.a(a, (Parcelable) eqk);
        a.writeString(str);
        Parcel a2 = a(9, a);
        byte[] createByteArray = a2.createByteArray();
        a2.recycle();
        return createByteArray;
    }

    public final void a(long j, String str, String str2, String str3) {
        Parcel a = a();
        a.writeLong(j);
        a.writeString(str);
        a.writeString(str2);
        a.writeString(str3);
        b(10, a);
    }

    public final String c(evq evq) {
        Parcel a = a();
        ekp.a(a, (Parcelable) evq);
        Parcel a2 = a(11, a);
        String readString = a2.readString();
        a2.recycle();
        return readString;
    }

    public final void a(evu evu, evq evq) {
        Parcel a = a();
        ekp.a(a, (Parcelable) evu);
        ekp.a(a, (Parcelable) evq);
        b(12, a);
    }

    public final void a(evu evu) {
        Parcel a = a();
        ekp.a(a, (Parcelable) evu);
        b(13, a);
    }

    public final List<evj> a(String str, String str2, boolean z, evq evq) {
        Parcel a = a();
        a.writeString(str);
        a.writeString(str2);
        ekp.a(a, z);
        ekp.a(a, (Parcelable) evq);
        Parcel a2 = a(14, a);
        ArrayList createTypedArrayList = a2.createTypedArrayList(evj.CREATOR);
        a2.recycle();
        return createTypedArrayList;
    }

    public final List<evj> a(String str, String str2, String str3, boolean z) {
        Parcel a = a();
        a.writeString(str);
        a.writeString(str2);
        a.writeString(str3);
        ekp.a(a, z);
        Parcel a2 = a(15, a);
        ArrayList createTypedArrayList = a2.createTypedArrayList(evj.CREATOR);
        a2.recycle();
        return createTypedArrayList;
    }

    public final List<evu> a(String str, String str2, evq evq) {
        Parcel a = a();
        a.writeString(str);
        a.writeString(str2);
        ekp.a(a, (Parcelable) evq);
        Parcel a2 = a(16, a);
        ArrayList createTypedArrayList = a2.createTypedArrayList(evu.CREATOR);
        a2.recycle();
        return createTypedArrayList;
    }

    public final List<evu> a(String str, String str2, String str3) {
        Parcel a = a();
        a.writeString(str);
        a.writeString(str2);
        a.writeString(str3);
        Parcel a2 = a(17, a);
        ArrayList createTypedArrayList = a2.createTypedArrayList(evu.CREATOR);
        a2.recycle();
        return createTypedArrayList;
    }

    public final void d(evq evq) {
        Parcel a = a();
        ekp.a(a, (Parcelable) evq);
        b(18, a);
    }
}
