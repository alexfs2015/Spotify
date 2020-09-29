package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.RemoteCreator;
import com.google.android.gms.dynamic.RemoteCreator.RemoteCreatorException;

@cey
/* renamed from: dow reason: default package */
public final class dow extends RemoteCreator<dqg> {
    public dow() {
        super("com.google.android.gms.ads.AdManagerCreatorImpl");
    }

    public final /* synthetic */ Object a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManagerCreator");
        return queryLocalInterface instanceof dqg ? (dqg) queryLocalInterface : new dqh(iBinder);
    }

    public final dqd a(Context context, dpc dpc, String str, ecp ecp, int i) {
        try {
            IBinder a = ((dqg) a(context)).a(cas.a(context), dpc, str, ecp, i);
            if (a == null) {
                return null;
            }
            IInterface queryLocalInterface = a.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            return queryLocalInterface instanceof dqd ? (dqd) queryLocalInterface : new dqf(a);
        } catch (RemoteException | RemoteCreatorException unused) {
            cow.a(3);
            return null;
        }
    }
}
