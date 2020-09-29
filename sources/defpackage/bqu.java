package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.common.ConnectionResult;

/* renamed from: bqu reason: default package */
public interface bqu extends IInterface {

    /* renamed from: bqu$a */
    public static abstract class a extends egx implements bqu {
        public static bqu a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cast.framework.ICastSession");
            return queryLocalInterface instanceof bqu ? (bqu) queryLocalInterface : new bqw(iBinder);
        }
    }

    void a(int i);

    void a(Bundle bundle);

    void a(bnx bnx, String str, String str2, boolean z);

    void a(ConnectionResult connectionResult);

    void a(boolean z);

    void b(int i);
}
