package defpackage;

import android.os.RemoteException;
import java.util.Map;

/* renamed from: duf reason: default package */
final class duf implements bhc<Object> {
    private final /* synthetic */ due a;

    duf(due due) {
        this.a = due;
    }

    public final void zza(Object obj, Map<String, String> map) {
        try {
            this.a.e = Long.valueOf(Long.parseLong((String) map.get("timestamp")));
        } catch (NumberFormatException unused) {
            cml.a("Failed to call parse unconfirmedClickTimestamp.");
        }
        this.a.d = (String) map.get("id");
        String str = (String) map.get("asset_id");
        if (this.a.b == null) {
            cpn.a(3);
            return;
        }
        try {
            this.a.b.a(str);
        } catch (RemoteException e) {
            cpn.b("#007 Could not call remote method.", e);
        }
    }
}
