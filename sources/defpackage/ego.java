package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.text.TextUtils;
import java.util.HashSet;
import java.util.Set;

/* renamed from: ego reason: default package */
public final class ego extends bxc<egp> {
    private final Bundle a;

    public ego(Context context, Looper looper, bwy bwy, bmc bmc, b bVar, c cVar) {
        super(context, looper, 16, bwy, bVar, cVar);
        if (bmc == null) {
            this.a = new Bundle();
            return;
        }
        throw new NoSuchMethodError();
    }

    public final String C_() {
        return "com.google.android.gms.auth.service.START";
    }

    public final /* synthetic */ IInterface a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.internal.IAuthService");
        return queryLocalInterface instanceof egp ? (egp) queryLocalInterface : new egq(iBinder);
    }

    public final String b() {
        return "com.google.android.gms.auth.api.internal.IAuthService";
    }

    public final int e() {
        return bsq.GOOGLE_PLAY_SERVICES_VERSION_CODE;
    }

    public final boolean i() {
        Set set;
        bwy bwy = this.i;
        if (!TextUtils.isEmpty(bwy.a != null ? bwy.a.name : null)) {
            b bVar = (b) bwy.d.get(bmb.a);
            if (bVar == null || bVar.a.isEmpty()) {
                set = bwy.b;
            } else {
                set = new HashSet(bwy.b);
                set.addAll(bVar.a);
            }
            if (!set.isEmpty()) {
                return true;
            }
        }
        return false;
    }

    public final Bundle o() {
        return this.a;
    }
}
