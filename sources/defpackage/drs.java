package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: drs reason: default package */
public final class drs extends dko implements drq {
    drs(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IVideoController");
    }

    public final void a() {
        b(1, K_());
    }

    public final void a(drt drt) {
        Parcel K_ = K_();
        dkq.a(K_, (IInterface) drt);
        b(8, K_);
    }

    public final void a(boolean z) {
        Parcel K_ = K_();
        dkq.a(K_, z);
        b(3, K_);
    }

    public final void b() {
        b(2, K_());
    }

    public final boolean c() {
        Parcel a = a(4, K_());
        boolean a2 = dkq.a(a);
        a.recycle();
        return a2;
    }

    public final int d() {
        Parcel a = a(5, K_());
        int readInt = a.readInt();
        a.recycle();
        return readInt;
    }

    public final float e() {
        Parcel a = a(9, K_());
        float readFloat = a.readFloat();
        a.recycle();
        return readFloat;
    }

    public final float f() {
        Parcel a = a(6, K_());
        float readFloat = a.readFloat();
        a.recycle();
        return readFloat;
    }

    public final float g() {
        Parcel a = a(7, K_());
        float readFloat = a.readFloat();
        a.recycle();
        return readFloat;
    }

    public final drt h() {
        drt drt;
        Parcel a = a(11, K_());
        IBinder readStrongBinder = a.readStrongBinder();
        if (readStrongBinder == null) {
            drt = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
            drt = queryLocalInterface instanceof drt ? (drt) queryLocalInterface : new drv(readStrongBinder);
        }
        a.recycle();
        return drt;
    }

    public final boolean i() {
        Parcel a = a(10, K_());
        boolean a2 = dkq.a(a);
        a.recycle();
        return a2;
    }

    public final boolean j() {
        Parcel a = a(12, K_());
        boolean a2 = dkq.a(a);
        a.recycle();
        return a2;
    }
}
