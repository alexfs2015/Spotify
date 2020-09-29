package com.google.android.gms.common.api;

import android.app.Activity;

public class ResolvableApiException extends ApiException {
    public ResolvableApiException(Status status) {
        super(status);
    }

    public final void a(Activity activity, int i) {
        Status status = this.mStatus;
        if (status.b()) {
            activity.startIntentSenderForResult(status.h.getIntentSender(), i, null, 0, 0, 0);
        }
    }
}
