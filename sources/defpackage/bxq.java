package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* renamed from: bxq reason: default package */
public final class bxq extends bwl<bxt> {
    public bxq(Context context, Looper looper, bwh bwh, b bVar, c cVar) {
        super(context, looper, 39, bwh, bVar, cVar);
    }

    public final String C_() {
        return "com.google.android.gms.common.service.START";
    }

    public final String b() {
        return "com.google.android.gms.common.internal.service.ICommonService";
    }

    public final /* synthetic */ IInterface a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.service.ICommonService");
        if (queryLocalInterface instanceof bxt) {
            return (bxt) queryLocalInterface;
        }
        return new bxu(iBinder);
    }
}
