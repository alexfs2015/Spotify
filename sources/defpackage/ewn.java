package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;

/* renamed from: ewn reason: default package */
public final class ewn extends bwl<ewt> implements exc {
    private final boolean a;
    private final bwh j;
    private final Bundle k;
    private Integer l;

    private ewn(Context context, Looper looper, bwh bwh, Bundle bundle, b bVar, c cVar) {
        super(context, looper, 44, bwh, bVar, cVar);
        this.a = true;
        this.j = bwh;
        this.k = bundle;
        this.l = bwh.h;
    }

    public final String C_() {
        return "com.google.android.gms.signin.service.START";
    }

    public final String b() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    public final int e() {
        return brz.GOOGLE_PLAY_SERVICES_VERSION_CODE;
    }

    public final boolean i() {
        return true;
    }

    public final void a(bwq bwq, boolean z) {
        try {
            ((ewt) q()).a(bwq, this.l.intValue(), z);
        } catch (RemoteException unused) {
        }
    }

    public final void s() {
        try {
            ((ewt) q()).a(this.l.intValue());
        } catch (RemoteException unused) {
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
        r5.a(new defpackage.ewx());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x004c, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0044 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(defpackage.ewr r5) {
        /*
            r4 = this;
            java.lang.String r0 = "Expecting a valid ISignInCallbacks"
            defpackage.bwx.a(r5, r0)
            bwh r0 = r4.j     // Catch:{ RemoteException -> 0x0044 }
            android.accounts.Account r1 = r0.a     // Catch:{ RemoteException -> 0x0044 }
            java.lang.String r2 = "<<default account>>"
            if (r1 == 0) goto L_0x0010
            android.accounts.Account r0 = r0.a     // Catch:{ RemoteException -> 0x0044 }
            goto L_0x0017
        L_0x0010:
            android.accounts.Account r0 = new android.accounts.Account     // Catch:{ RemoteException -> 0x0044 }
            java.lang.String r1 = "com.google"
            r0.<init>(r2, r1)     // Catch:{ RemoteException -> 0x0044 }
        L_0x0017:
            r1 = 0
            java.lang.String r3 = r0.name     // Catch:{ RemoteException -> 0x0044 }
            boolean r2 = r2.equals(r3)     // Catch:{ RemoteException -> 0x0044 }
            if (r2 == 0) goto L_0x002a
            android.content.Context r1 = r4.d     // Catch:{ RemoteException -> 0x0044 }
            bmb r1 = defpackage.bmb.a(r1)     // Catch:{ RemoteException -> 0x0044 }
            com.google.android.gms.auth.api.signin.GoogleSignInAccount r1 = r1.a()     // Catch:{ RemoteException -> 0x0044 }
        L_0x002a:
            bwy r2 = new bwy     // Catch:{ RemoteException -> 0x0044 }
            java.lang.Integer r3 = r4.l     // Catch:{ RemoteException -> 0x0044 }
            int r3 = r3.intValue()     // Catch:{ RemoteException -> 0x0044 }
            r2.<init>(r0, r3, r1)     // Catch:{ RemoteException -> 0x0044 }
            android.os.IInterface r0 = r4.q()     // Catch:{ RemoteException -> 0x0044 }
            ewt r0 = (defpackage.ewt) r0     // Catch:{ RemoteException -> 0x0044 }
            ewv r1 = new ewv     // Catch:{ RemoteException -> 0x0044 }
            r1.<init>(r2)     // Catch:{ RemoteException -> 0x0044 }
            r0.a(r1, r5)     // Catch:{ RemoteException -> 0x0044 }
            return
        L_0x0044:
            ewx r0 = new ewx     // Catch:{ RemoteException -> 0x004c }
            r0.<init>()     // Catch:{ RemoteException -> 0x004c }
            r5.a(r0)     // Catch:{ RemoteException -> 0x004c }
        L_0x004c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ewn.a(ewr):void");
    }

    public final Bundle o() {
        if (!this.d.getPackageName().equals(this.j.e)) {
            this.k.putString("com.google.android.gms.signin.internal.realClientPackageName", this.j.e);
        }
        return this.k;
    }

    public final void t() {
        a((c) new d());
    }

    public final /* synthetic */ IInterface a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        if (queryLocalInterface instanceof ewt) {
            return (ewt) queryLocalInterface;
        }
        return new ewu(iBinder);
    }

    public ewn(Context context, Looper looper, bwh bwh, b bVar, c cVar) {
        ewm ewm = bwh.g;
        Integer num = bwh.h;
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.google.android.gms.signin.internal.clientRequestedAccount", bwh.a);
        if (num != null) {
            bundle.putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", num.intValue());
        }
        if (ewm != null) {
            bundle.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", false);
            bundle.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", false);
            bundle.putString("com.google.android.gms.signin.internal.serverClientId", null);
            bundle.putBoolean("com.google.android.gms.signin.internal.usePromptModeForAuthCode", true);
            bundle.putBoolean("com.google.android.gms.signin.internal.forceCodeForRefreshToken", false);
            bundle.putString("com.google.android.gms.signin.internal.hostedDomain", null);
            bundle.putBoolean("com.google.android.gms.signin.internal.waitForAccessTokenRefresh", false);
        }
        this(context, looper, bwh, bundle, bVar, cVar);
    }
}
