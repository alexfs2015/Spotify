package defpackage;

import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.common.api.Status;

/* renamed from: efe reason: default package */
public final class efe implements blo {
    private final Status a;
    private final Credential b;

    public efe(Status status, Credential credential) {
        this.a = status;
        this.b = credential;
    }

    public final Status B_() {
        return this.a;
    }

    public final Credential a() {
        return this.b;
    }

    public static efe a(Status status) {
        return new efe(status, null);
    }
}
