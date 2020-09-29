package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: bqe reason: default package */
public final class bqe extends egt implements bqc {
    bqe(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.cast.framework.ICastContext");
    }

    public final boolean a() {
        Parcel a = a(2, e());
        boolean a2 = ehi.a(a);
        a.recycle();
        return a2;
    }

    public final void a(bpz bpz) {
        Parcel e = e();
        ehi.a(e, (IInterface) bpz);
        b(3, e);
    }

    public final void b(bpz bpz) {
        Parcel e = e();
        ehi.a(e, (IInterface) bpz);
        b(4, e);
    }

    public final bqp b() {
        bqp bqp;
        Parcel a = a(5, e());
        IBinder readStrongBinder = a.readStrongBinder();
        if (readStrongBinder == null) {
            bqp = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.cast.framework.ISessionManager");
            if (queryLocalInterface instanceof bqp) {
                bqp = (bqp) queryLocalInterface;
            } else {
                bqp = new bqo(readStrongBinder);
            }
        }
        a.recycle();
        return bqp;
    }

    public final bqj c() {
        bqj bqj;
        Parcel a = a(6, e());
        IBinder readStrongBinder = a.readStrongBinder();
        if (readStrongBinder == null) {
            bqj = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.cast.framework.IDiscoveryManager");
            if (queryLocalInterface instanceof bqj) {
                bqj = (bqj) queryLocalInterface;
            } else {
                bqj = new bqi(readStrongBinder);
            }
        }
        a.recycle();
        return bqj;
    }

    public final boolean d() {
        Parcel a = a(12, e());
        boolean a2 = ehi.a(a);
        a.recycle();
        return a2;
    }
}
