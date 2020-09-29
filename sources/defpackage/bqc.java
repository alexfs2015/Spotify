package defpackage;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: bqc reason: default package */
public interface bqc extends IInterface {

    /* renamed from: bqc$a */
    public static abstract class a extends egg implements bqc {
        public static bqc a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cast.framework.ICastContext");
            if (queryLocalInterface instanceof bqc) {
                return (bqc) queryLocalInterface;
            }
            return new bqe(iBinder);
        }
    }

    void a(bpz bpz);

    boolean a();

    bqp b();

    void b(bpz bpz);

    bqj c();

    boolean d();
}
