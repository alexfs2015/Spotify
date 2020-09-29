package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* renamed from: erg reason: default package */
public final class erg extends ele implements ere {
    erg(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.internal.IMeasurementService");
    }

    public final List<ewa> a(ewh ewh, boolean z) {
        Parcel a = a();
        elg.a(a, (Parcelable) ewh);
        elg.a(a, z);
        Parcel a2 = a(7, a);
        ArrayList createTypedArrayList = a2.createTypedArrayList(ewa.CREATOR);
        a2.recycle();
        return createTypedArrayList;
    }

    public final List<ewl> a(String str, String str2, ewh ewh) {
        Parcel a = a();
        a.writeString(str);
        a.writeString(str2);
        elg.a(a, (Parcelable) ewh);
        Parcel a2 = a(16, a);
        ArrayList createTypedArrayList = a2.createTypedArrayList(ewl.CREATOR);
        a2.recycle();
        return createTypedArrayList;
    }

    public final List<ewl> a(String str, String str2, String str3) {
        Parcel a = a();
        a.writeString(str);
        a.writeString(str2);
        a.writeString(str3);
        Parcel a2 = a(17, a);
        ArrayList createTypedArrayList = a2.createTypedArrayList(ewl.CREATOR);
        a2.recycle();
        return createTypedArrayList;
    }

    public final List<ewa> a(String str, String str2, String str3, boolean z) {
        Parcel a = a();
        a.writeString(str);
        a.writeString(str2);
        a.writeString(str3);
        elg.a(a, z);
        Parcel a2 = a(15, a);
        ArrayList createTypedArrayList = a2.createTypedArrayList(ewa.CREATOR);
        a2.recycle();
        return createTypedArrayList;
    }

    public final List<ewa> a(String str, String str2, boolean z, ewh ewh) {
        Parcel a = a();
        a.writeString(str);
        a.writeString(str2);
        elg.a(a, z);
        elg.a(a, (Parcelable) ewh);
        Parcel a2 = a(14, a);
        ArrayList createTypedArrayList = a2.createTypedArrayList(ewa.CREATOR);
        a2.recycle();
        return createTypedArrayList;
    }

    public final void a(long j, String str, String str2, String str3) {
        Parcel a = a();
        a.writeLong(j);
        a.writeString(str);
        a.writeString(str2);
        a.writeString(str3);
        b(10, a);
    }

    public final void a(erb erb, ewh ewh) {
        Parcel a = a();
        elg.a(a, (Parcelable) erb);
        elg.a(a, (Parcelable) ewh);
        b(1, a);
    }

    public final void a(erb erb, String str, String str2) {
        Parcel a = a();
        elg.a(a, (Parcelable) erb);
        a.writeString(str);
        a.writeString(str2);
        b(5, a);
    }

    public final void a(ewa ewa, ewh ewh) {
        Parcel a = a();
        elg.a(a, (Parcelable) ewa);
        elg.a(a, (Parcelable) ewh);
        b(2, a);
    }

    public final void a(ewh ewh) {
        Parcel a = a();
        elg.a(a, (Parcelable) ewh);
        b(4, a);
    }

    public final void a(ewl ewl) {
        Parcel a = a();
        elg.a(a, (Parcelable) ewl);
        b(13, a);
    }

    public final void a(ewl ewl, ewh ewh) {
        Parcel a = a();
        elg.a(a, (Parcelable) ewl);
        elg.a(a, (Parcelable) ewh);
        b(12, a);
    }

    public final byte[] a(erb erb, String str) {
        Parcel a = a();
        elg.a(a, (Parcelable) erb);
        a.writeString(str);
        Parcel a2 = a(9, a);
        byte[] createByteArray = a2.createByteArray();
        a2.recycle();
        return createByteArray;
    }

    public final void b(ewh ewh) {
        Parcel a = a();
        elg.a(a, (Parcelable) ewh);
        b(6, a);
    }

    public final String c(ewh ewh) {
        Parcel a = a();
        elg.a(a, (Parcelable) ewh);
        Parcel a2 = a(11, a);
        String readString = a2.readString();
        a2.recycle();
        return readString;
    }

    public final void d(ewh ewh) {
        Parcel a = a();
        elg.a(a, (Parcelable) ewh);
        b(18, a);
    }
}
