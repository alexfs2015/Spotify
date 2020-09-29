package defpackage;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: bql reason: default package */
public interface bql extends IInterface {

    /* renamed from: bql$a */
    public static abstract class a extends egg implements bql {
        public static bql a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cast.framework.ISession");
            if (queryLocalInterface instanceof bql) {
                return (bql) queryLocalInterface;
            }
            return new bqn(iBinder);
        }
    }

    car a();

    void a(int i);

    void b(int i);

    boolean b();

    void c(int i);

    boolean c();

    boolean d();
}
