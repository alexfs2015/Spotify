package defpackage;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.ResolvableApiException;
import com.google.android.gms.common.api.Status;

/* renamed from: byb reason: default package */
final class byb implements b {
    byb() {
    }

    public final ApiException a(Status status) {
        if (status.b()) {
            return new ResolvableApiException(status);
        }
        return new ApiException(status);
    }
}
