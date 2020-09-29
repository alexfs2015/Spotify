package defpackage;

import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.common.api.Status;

/* renamed from: efw reason: default package */
public final class efw implements bmg {
    public final bsz<Status> a(bsy bsy) {
        bxo.a(bsy, (Object) "client must not be null");
        return bsy.b(new egb(bsy));
    }

    public final bsz<bmf> a(bsy bsy, bmd bmd) {
        bxo.a(bsy, (Object) "client must not be null");
        bxo.a(bmd, (Object) "request must not be null");
        return bsy.a(new efx(bsy, bmd));
    }

    public final bsz<Status> a(bsy bsy, Credential credential) {
        bxo.a(bsy, (Object) "client must not be null");
        bxo.a(credential, (Object) "credential must not be null");
        return bsy.b(new efz(bsy, credential));
    }

    public final bsz<Status> b(bsy bsy, Credential credential) {
        bxo.a(bsy, (Object) "client must not be null");
        bxo.a(credential, (Object) "credential must not be null");
        return bsy.b(new ega(bsy, credential));
    }
}
