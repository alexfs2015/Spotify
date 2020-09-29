package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* renamed from: efn reason: default package */
public final class efn extends bwl<efs> {
    private final a a;

    public efn(Context context, Looper looper, bwh bwh, a aVar, b bVar, c cVar) {
        super(context, looper, 68, bwh, bVar, cVar);
        this.a = aVar;
    }

    public final String C_() {
        return "com.google.android.gms.auth.api.credentials.service.START";
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

    public final /* synthetic */ IInterface a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
        if (queryLocalInterface instanceof efs) {
            return (efs) queryLocalInterface;
        }
        return new eft(iBinder);
    }
}
