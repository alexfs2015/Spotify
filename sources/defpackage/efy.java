package defpackage;

import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.common.api.Status;

/* renamed from: efy reason: default package */
final class efy extends efu {
    private final /* synthetic */ efx a;

    efy(efx efx) {
        this.a = efx;
    }

    public final void a(Status status) {
        this.a.a(efv.a(status));
    }

    public final void a(Status status, Credential credential) {
        this.a.a(new efv(status, credential));
    }
}
