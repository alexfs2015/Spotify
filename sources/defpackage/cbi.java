package defpackage;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: cbi reason: default package */
public interface cbi extends IInterface {

    /* renamed from: cbi$a */
    public static abstract class a extends ejo implements cbi {

        /* renamed from: cbi$a$a reason: collision with other inner class name */
        public static class C0023a extends ejn implements cbi {
            C0023a(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.dynamic.IObjectWrapper");
            }
        }

        public a() {
            super("com.google.android.gms.dynamic.IObjectWrapper");
        }

        public static cbi a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
            return queryLocalInterface instanceof cbi ? (cbi) queryLocalInterface : new C0023a(iBinder);
        }
    }
}
