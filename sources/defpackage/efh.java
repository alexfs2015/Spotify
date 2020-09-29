package defpackage;

import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.common.api.Status;

/* renamed from: efh reason: default package */
final class efh extends efd {
    private final /* synthetic */ efg a;

    efh(efg efg) {
        this.a = efg;
    }

    public final void a(Status status, Credential credential) {
        this.a.a(new efe(status, credential));
    }

    public final void a(Status status) {
        this.a.a(efe.a(status));
    }
}
