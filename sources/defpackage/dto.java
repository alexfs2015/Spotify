package defpackage;

import android.os.RemoteException;
import java.util.Map;

/* renamed from: dto reason: default package */
final class dto implements bgl<Object> {
    private final /* synthetic */ dtn a;

    dto(dtn dtn) {
        this.a = dtn;
    }

    public final void zza(Object obj, Map<String, String> map) {
        try {
            this.a.e = Long.valueOf(Long.parseLong((String) map.get("timestamp")));
        } catch (NumberFormatException unused) {
            clu.a("Failed to call parse unconfirmedClickTimestamp.");
        }
        this.a.d = (String) map.get("id");
        String str = (String) map.get("asset_id");
        if (this.a.b == null) {
            cow.a(3);
            return;
        }
        try {
            this.a.b.a(str);
        } catch (RemoteException e) {
            cow.b("#007 Could not call remote method.", e);
        }
    }
}
