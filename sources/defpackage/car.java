package defpackage;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: car reason: default package */
public interface car extends IInterface {

    /* renamed from: car$a */
    public static abstract class a extends eix implements car {

        /* renamed from: car$a$a reason: collision with other inner class name */
        public static class C0023a extends eiw implements car {
            C0023a(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.dynamic.IObjectWrapper");
            }
        }

        public a() {
            super("com.google.android.gms.dynamic.IObjectWrapper");
        }

        public static car a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
            if (queryLocalInterface instanceof car) {
                return (car) queryLocalInterface;
            }
            return new C0023a(iBinder);
        }
    }
}
