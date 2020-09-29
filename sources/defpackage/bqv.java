package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: bqv reason: default package */
public final class bqv extends ehk implements bqt {
    bqv(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.cast.framework.ICastContext");
    }

    public final void a(bqq bqq) {
        Parcel e = e();
        ehz.a(e, (IInterface) bqq);
        b(3, e);
    }

    public final boolean a() {
        Parcel a = a(2, e());
        boolean a2 = ehz.a(a);
        a.recycle();
        return a2;
    }

    public final brg b() {
        brg brg;
        Parcel a = a(5, e());
        IBinder readStrongBinder = a.readStrongBinder();
        if (readStrongBinder == null) {
            brg = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.cast.framework.ISessionManager");
            brg = queryLocalInterface instanceof brg ? (brg) queryLocalInterface : new brf(readStrongBinder);
        }
        a.recycle();
        return brg;
    }

    public final void b(bqq bqq) {
        Parcel e = e();
        ehz.a(e, (IInterface) bqq);
        b(4, e);
    }

    public final bra c() {
        bra bra;
        Parcel a = a(6, e());
        IBinder readStrongBinder = a.readStrongBinder();
        if (readStrongBinder == null) {
            bra = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.cast.framework.IDiscoveryManager");
            bra = queryLocalInterface instanceof bra ? (bra) queryLocalInterface : new bqz(readStrongBinder);
        }
        a.recycle();
        return bra;
    }

    public final boolean d() {
        Parcel a = a(12, e());
        boolean a2 = ehz.a(a);
        a.recycle();
        return a2;
    }
}
