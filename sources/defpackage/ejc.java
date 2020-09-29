package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Map;

/* renamed from: ejc reason: default package */
public final class ejc extends ehk implements ejd {
    ejc(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.cast.framework.internal.ICastDynamiteModule");
    }

    public final bqt a(cbi cbi, bon bon, ejf ejf, Map map) {
        Parcel e = e();
        ehz.a(e, (IInterface) cbi);
        ehz.a(e, (Parcelable) bon);
        ehz.a(e, (IInterface) ejf);
        e.writeMap(map);
        Parcel a = a(1, e);
        bqt a2 = a.a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    public final bqu a(bon bon, cbi cbi, bqs bqs) {
        Parcel e = e();
        ehz.a(e, (Parcelable) bon);
        ehz.a(e, (IInterface) cbi);
        ehz.a(e, (IInterface) bqs);
        Parcel a = a(3, e);
        bqu a2 = a.a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    public final brb a(cbi cbi, cbi cbi2, cbi cbi3) {
        Parcel e = e();
        ehz.a(e, (IInterface) cbi);
        ehz.a(e, (IInterface) cbi2);
        ehz.a(e, (IInterface) cbi3);
        Parcel a = a(5, e);
        brb a2 = a.a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    public final brc a(String str, String str2, bqk bqk) {
        Parcel e = e();
        e.writeString(str);
        e.writeString(str2);
        ehz.a(e, (IInterface) bqk);
        Parcel a = a(2, e);
        brc a2 = a.a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    public final ehb a(cbi cbi, ehc ehc, int i, int i2, boolean z, long j, int i3, int i4, int i5) {
        Parcel e = e();
        ehz.a(e, (IInterface) cbi);
        ehz.a(e, (IInterface) ehc);
        e.writeInt(i);
        e.writeInt(i2);
        ehz.a(e, z);
        e.writeLong(2097152);
        e.writeInt(5);
        e.writeInt(333);
        e.writeInt(10000);
        Parcel a = a(6, e);
        ehb a2 = a.a(a.readStrongBinder());
        a.recycle();
        return a2;
    }
}
