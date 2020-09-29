package defpackage;

import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.common.api.Status;

/* renamed from: efj reason: default package */
final class efj extends efm<Status> {
    private final /* synthetic */ Credential a;

    efj(bsh bsh, Credential credential) {
        this.a = credential;
        super(bsh);
    }

    public final /* synthetic */ bsl a(Status status) {
        return status;
    }

    /* access modifiers changed from: protected */
    public final void a(efs efs) {
        efs.a((efq) new efl(this), new efo(this.a));
    }
}
