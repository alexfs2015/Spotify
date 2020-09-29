package defpackage;

import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.common.api.Status;

/* renamed from: efv reason: default package */
public final class efv implements bmf {
    private final Status a;
    private final Credential b;

    public efv(Status status, Credential credential) {
        this.a = status;
        this.b = credential;
    }

    public static efv a(Status status) {
        return new efv(status, null);
    }

    public final Status B_() {
        return this.a;
    }

    public final Credential a() {
        return this.b;
    }
}
