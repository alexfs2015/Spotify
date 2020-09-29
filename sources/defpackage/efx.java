package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.text.TextUtils;
import java.util.HashSet;
import java.util.Set;

/* renamed from: efx reason: default package */
public final class efx extends bwl<efy> {
    private final Bundle a;

    public efx(Context context, Looper looper, bwh bwh, bll bll, b bVar, c cVar) {
        super(context, looper, 16, bwh, bVar, cVar);
        if (bll == null) {
            this.a = new Bundle();
            return;
        }
        throw new NoSuchMethodError();
    }

    public final String C_() {
        return "com.google.android.gms.auth.service.START";
    }

    public final String b() {
        return "com.google.android.gms.auth.api.internal.IAuthService";
    }

    public final int e() {
        return brz.GOOGLE_PLAY_SERVICES_VERSION_CODE;
    }

    public final Bundle o() {
        return this.a;
    }

    public final /* synthetic */ IInterface a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.internal.IAuthService");
        if (queryLocalInterface instanceof efy) {
            return (efy) queryLocalInterface;
        }
        return new efz(iBinder);
    }

    public final boolean i() {
        Set set;
        bwh bwh = this.i;
        if (!TextUtils.isEmpty(bwh.a != null ? bwh.a.name : null)) {
            b bVar = (b) bwh.d.get(blk.a);
            if (bVar == null || bVar.a.isEmpty()) {
                set = bwh.b;
            } else {
                set = new HashSet(bwh.b);
                set.addAll(bVar.a);
            }
            if (!set.isEmpty()) {
                return true;
            }
        }
        return false;
    }
}
