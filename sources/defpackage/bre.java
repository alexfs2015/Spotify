package defpackage;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: bre reason: default package */
public final class bre extends ehk implements brc {
    bre(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.cast.framework.ISession");
    }

    public final cbi a() {
        Parcel a = a(1, e());
        cbi a2 = a.a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    public final void a(int i) {
        Parcel e = e();
        e.writeInt(i);
        b(12, e);
    }

    public final void b(int i) {
        Parcel e = e();
        e.writeInt(i);
        b(13, e);
    }

    public final boolean b() {
        Parcel a = a(5, e());
        boolean a2 = ehz.a(a);
        a.recycle();
        return a2;
    }

    public final void c(int i) {
        Parcel e = e();
        e.writeInt(i);
        b(15, e);
    }

    public final boolean c() {
        Parcel a = a(6, e());
        boolean a2 = ehz.a(a);
        a.recycle();
        return a2;
    }

    public final boolean d() {
        Parcel a = a(9, e());
        boolean a2 = ehz.a(a);
        a.recycle();
        return a2;
    }
}
