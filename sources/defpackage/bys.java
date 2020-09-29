package defpackage;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.ResolvableApiException;
import com.google.android.gms.common.api.Status;

/* renamed from: bys reason: default package */
final class bys implements b {
    bys() {
    }

    public final ApiException a(Status status) {
        return status.b() ? new ResolvableApiException(status) : new ApiException(status);
    }
}
