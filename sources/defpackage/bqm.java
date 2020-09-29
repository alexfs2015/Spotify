package defpackage;

import android.content.Intent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: bqm reason: default package */
public final class bqm extends egt implements bqk {
    bqm(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.cast.framework.IReconnectionService");
    }

    public final void a() {
        b(1, e());
    }

    public final int a(Intent intent, int i, int i2) {
        Parcel e = e();
        ehi.a(e, (Parcelable) intent);
        e.writeInt(i);
        e.writeInt(i2);
        Parcel a = a(2, e);
        int readInt = a.readInt();
        a.recycle();
        return readInt;
    }

    public final IBinder a(Intent intent) {
        Parcel e = e();
        ehi.a(e, (Parcelable) intent);
        Parcel a = a(3, e);
        IBinder readStrongBinder = a.readStrongBinder();
        a.recycle();
        return readStrongBinder;
    }

    public final void b() {
        b(4, e());
    }
}
