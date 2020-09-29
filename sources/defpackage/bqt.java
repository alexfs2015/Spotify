package defpackage;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: bqt reason: default package */
public interface bqt extends IInterface {

    /* renamed from: bqt$a */
    public static abstract class a extends egx implements bqt {
        public static bqt a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cast.framework.ICastContext");
            return queryLocalInterface instanceof bqt ? (bqt) queryLocalInterface : new bqv(iBinder);
        }
    }

    void a(bqq bqq);

    boolean a();

    brg b();

    void b(bqq bqq);

    bra c();

    boolean d();
}
