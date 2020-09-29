package defpackage;

import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;

/* renamed from: bqk reason: default package */
public interface bqk extends IInterface {

    /* renamed from: bqk$a */
    public static abstract class a extends egg implements bqk {
        public static bqk a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cast.framework.IReconnectionService");
            if (queryLocalInterface instanceof bqk) {
                return (bqk) queryLocalInterface;
            }
            return new bqm(iBinder);
        }
    }

    int a(Intent intent, int i, int i2);

    IBinder a(Intent intent);

    void a();

    void b();
}
