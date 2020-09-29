package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.dynamic.RemoteCreator;

@cfp
/* renamed from: dse reason: default package */
public final class dse extends RemoteCreator<dro> {
    public dse() {
        super("com.google.android.gms.ads.MobileAdsSettingManagerCreatorImpl");
    }

    public final /* synthetic */ Object a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManagerCreator");
        return queryLocalInterface instanceof dro ? (dro) queryLocalInterface : new drp(iBinder);
    }
}
