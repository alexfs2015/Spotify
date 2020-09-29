package defpackage;

import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;

/* renamed from: brb reason: default package */
public interface brb extends IInterface {

    /* renamed from: brb$a */
    public static abstract class a extends egx implements brb {
        public static brb a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cast.framework.IReconnectionService");
            return queryLocalInterface instanceof brb ? (brb) queryLocalInterface : new brd(iBinder);
        }
    }

    int a(Intent intent, int i, int i2);

    IBinder a(Intent intent);

    void a();

    void b();
}
