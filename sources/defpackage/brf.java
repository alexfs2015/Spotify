package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: brf reason: default package */
public final class brf extends ehk implements brg {
    brf(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.cast.framework.ISessionManager");
    }

    public final cbi a() {
        Parcel a = a(1, e());
        cbi a2 = a.a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    public final void a(bqy bqy) {
        Parcel e = e();
        ehz.a(e, (IInterface) bqy);
        b(4, e);
    }

    public final void a(bri bri) {
        Parcel e = e();
        ehz.a(e, (IInterface) bri);
        b(2, e);
    }

    public final void a(boolean z) {
        Parcel e = e();
        ehz.a(e, true);
        ehz.a(e, z);
        b(6, e);
    }

    public final cbi b() {
        Parcel a = a(7, e());
        cbi a2 = a.a(a.readStrongBinder());
        a.recycle();
        return a2;
    }
}
