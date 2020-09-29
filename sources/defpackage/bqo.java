package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: bqo reason: default package */
public final class bqo extends egt implements bqp {
    bqo(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.cast.framework.ISessionManager");
    }

    public final car a() {
        Parcel a = a(1, e());
        car a2 = a.a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    public final void a(bqr bqr) {
        Parcel e = e();
        ehi.a(e, (IInterface) bqr);
        b(2, e);
    }

    public final void a(bqh bqh) {
        Parcel e = e();
        ehi.a(e, (IInterface) bqh);
        b(4, e);
    }

    public final void a(boolean z) {
        Parcel e = e();
        ehi.a(e, true);
        ehi.a(e, z);
        b(6, e);
    }

    public final car b() {
        Parcel a = a(7, e());
        car a2 = a.a(a.readStrongBinder());
        a.recycle();
        return a2;
    }
}
