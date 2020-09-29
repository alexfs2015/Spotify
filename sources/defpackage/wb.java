package defpackage;

import com.adjust.sdk.ActivityPackage;

/* renamed from: wb reason: default package */
public final class wb extends wu {
    private String a;
    private String j;
    private String k;

    public wb(ActivityPackage activityPackage) {
        this.a = (String) activityPackage.parameters.get("event_token");
        this.j = (String) activityPackage.parameters.get("event_callback_id");
        this.k = xa.e(activityPackage.clientSdk);
    }
}
