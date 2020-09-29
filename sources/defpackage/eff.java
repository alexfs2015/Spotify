package defpackage;

import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.common.api.Status;

/* renamed from: eff reason: default package */
public final class eff implements blp {
    public final bsi<blo> a(bsh bsh, blm blm) {
        bwx.a(bsh, (Object) "client must not be null");
        bwx.a(blm, (Object) "request must not be null");
        return bsh.a(new efg(bsh, blm));
    }

    public final bsi<Status> a(bsh bsh, Credential credential) {
        bwx.a(bsh, (Object) "client must not be null");
        bwx.a(credential, (Object) "credential must not be null");
        return bsh.b(new efi(bsh, credential));
    }

    public final bsi<Status> b(bsh bsh, Credential credential) {
        bwx.a(bsh, (Object) "client must not be null");
        bwx.a(credential, (Object) "credential must not be null");
        return bsh.b(new efj(bsh, credential));
    }

    public final bsi<Status> a(bsh bsh) {
        bwx.a(bsh, (Object) "client must not be null");
        return bsh.b(new efk(bsh));
    }
}
