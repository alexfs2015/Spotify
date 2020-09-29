package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Map;

/* renamed from: eil reason: default package */
public final class eil extends egt implements eim {
    eil(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.cast.framework.internal.ICastDynamiteModule");
    }

    public final bqc a(car car, bnw bnw, eio eio, Map map) {
        Parcel e = e();
        ehi.a(e, (IInterface) car);
        ehi.a(e, (Parcelable) bnw);
        ehi.a(e, (IInterface) eio);
        e.writeMap(map);
        Parcel a = a(1, e);
        bqc a2 = a.a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    public final bql a(String str, String str2, bpt bpt) {
        Parcel e = e();
        e.writeString(str);
        e.writeString(str2);
        ehi.a(e, (IInterface) bpt);
        Parcel a = a(2, e);
        bql a2 = a.a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    public final bqd a(bnw bnw, car car, bqb bqb) {
        Parcel e = e();
        ehi.a(e, (Parcelable) bnw);
        ehi.a(e, (IInterface) car);
        ehi.a(e, (IInterface) bqb);
        Parcel a = a(3, e);
        bqd a2 = a.a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    public final bqk a(car car, car car2, car car3) {
        Parcel e = e();
        ehi.a(e, (IInterface) car);
        ehi.a(e, (IInterface) car2);
        ehi.a(e, (IInterface) car3);
        Parcel a = a(5, e);
        bqk a2 = a.a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    public final egk a(car car, egl egl, int i, int i2, boolean z, long j, int i3, int i4, int i5) {
        Parcel e = e();
        ehi.a(e, (IInterface) car);
        ehi.a(e, (IInterface) egl);
        e.writeInt(i);
        e.writeInt(i2);
        ehi.a(e, z);
        e.writeLong(2097152);
        e.writeInt(5);
        e.writeInt(333);
        e.writeInt(10000);
        Parcel a = a(6, e);
        egk a2 = a.a(a.readStrongBinder());
        a.recycle();
        return a2;
    }
}
