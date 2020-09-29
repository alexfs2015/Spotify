package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* renamed from: byh reason: default package */
public final class byh extends bxc<byk> {
    public byh(Context context, Looper looper, bwy bwy, b bVar, c cVar) {
        super(context, looper, 39, bwy, bVar, cVar);
    }

    public final String C_() {
        return "com.google.android.gms.common.service.START";
    }

    public final /* synthetic */ IInterface a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.service.ICommonService");
        return queryLocalInterface instanceof byk ? (byk) queryLocalInterface : new byl(iBinder);
    }

    public final String b() {
        return "com.google.android.gms.common.internal.service.ICommonService";
    }
}
