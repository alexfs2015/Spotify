package com.crashlytics.android.core;

import android.text.TextUtils;
import java.util.HashMap;

public class CrashlyticsController$20$1 extends HashMap<String, Object> {
    final /* synthetic */ AnonymousClass13 this$1;

    public CrashlyticsController$20$1(AnonymousClass13 r2) {
        this.this$1 = r2;
        put("app_identifier", r2);
        put("api_key", ahz.this.g.a);
        put("version_code", r3);
        put("version_name", r4);
        put("install_uuid", r5);
        put("delivery_mechanism", Integer.valueOf(r6));
        put("unity_version", TextUtils.isEmpty(ahz.this.y) ? "" : ahz.this.y);
    }
}
