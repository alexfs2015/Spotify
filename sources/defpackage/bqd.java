package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.common.ConnectionResult;

/* renamed from: bqd reason: default package */
public interface bqd extends IInterface {

    /* renamed from: bqd$a */
    public static abstract class a extends egg implements bqd {
        public static bqd a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cast.framework.ICastSession");
            if (queryLocalInterface instanceof bqd) {
                return (bqd) queryLocalInterface;
            }
            return new bqf(iBinder);
        }
    }

    void a(int i);

    void a(Bundle bundle);

    void a(bng bng, String str, String str2, boolean z);

    void a(ConnectionResult connectionResult);

    void a(boolean z);

    void b(int i);
}
