package defpackage;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: brc reason: default package */
public interface brc extends IInterface {

    /* renamed from: brc$a */
    public static abstract class a extends egx implements brc {
        public static brc a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cast.framework.ISession");
            return queryLocalInterface instanceof brc ? (brc) queryLocalInterface : new bre(iBinder);
        }
    }

    cbi a();

    void a(int i);

    void b(int i);

    boolean b();

    void c(int i);

    boolean c();

    boolean d();
}
