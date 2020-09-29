package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* renamed from: ege reason: default package */
public final class ege extends bxc<egj> {
    private final a a;

    public ege(Context context, Looper looper, bwy bwy, a aVar, b bVar, c cVar) {
        super(context, looper, 68, bwy, bVar, cVar);
        this.a = aVar;
    }

    public final String C_() {
        return "com.google.android.gms.auth.api.credentials.service.START";
    }

    public final /* synthetic */ IInterface a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
        return queryLocalInterface instanceof egj ? (egj) queryLocalInterface : new egk(iBinder);
    }

    public final String b() {
        return "com.google.android.gms.auth.api.credentials.internal.ICredentialsService";
    }

    public final int e() {
        return 12800000;
    }

    public final Bundle o() {
        a aVar = this.a;
        if (aVar == null) {
            return new Bundle();
        }
        Bundle bundle = new Bundle();
        bundle.putString("consumer_package", null);
        bundle.putBoolean("force_save_dialog", aVar.a);
        return bundle;
    }
}
