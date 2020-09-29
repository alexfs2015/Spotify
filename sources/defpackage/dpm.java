package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.RemoteCreator;
import com.google.android.gms.dynamic.RemoteCreator.RemoteCreatorException;

@cfp
/* renamed from: dpm reason: default package */
public final class dpm extends RemoteCreator<dqs> {
    public dpm() {
        super("com.google.android.gms.ads.AdLoaderBuilderCreatorImpl");
    }

    public final dqp a(Context context, String str, edg edg) {
        try {
            IBinder a = ((dqs) a(context)).a(cbj.a(context), str, edg);
            if (a == null) {
                return null;
            }
            IInterface queryLocalInterface = a.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
            return queryLocalInterface instanceof dqp ? (dqp) queryLocalInterface : new dqr(a);
        } catch (RemoteException | RemoteCreatorException unused) {
            cpn.a(5);
            return null;
        }
    }

    public final /* synthetic */ Object a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilderCreator");
        return queryLocalInterface instanceof dqs ? (dqs) queryLocalInterface : new dqt(iBinder);
    }
}
