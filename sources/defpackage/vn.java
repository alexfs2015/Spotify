package defpackage;

import com.adjust.sdk.ActivityPackage;

/* renamed from: vn reason: default package */
public final class vn extends wg {
    private String a;
    private String j;
    private String k;

    public vn(ActivityPackage activityPackage) {
        this.a = (String) activityPackage.parameters.get("event_token");
        this.j = (String) activityPackage.parameters.get("event_callback_id");
        this.k = wm.e(activityPackage.clientSdk);
    }
}
