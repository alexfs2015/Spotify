package defpackage;

import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.common.api.Status;

/* renamed from: efi reason: default package */
final class efi extends efm<Status> {
    private final /* synthetic */ Credential a;

    efi(bsh bsh, Credential credential) {
        this.a = credential;
        super(bsh);
    }

    public final /* synthetic */ bsl a(Status status) {
        return status;
    }

    /* access modifiers changed from: protected */
    public final void a(efs efs) {
        efs.a((efq) new efl(this), new efu(this.a));
    }
}
