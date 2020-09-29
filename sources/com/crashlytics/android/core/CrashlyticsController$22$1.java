package com.crashlytics.android.core;

import android.os.Build.VERSION;
import java.util.HashMap;

public class CrashlyticsController$22$1 extends HashMap<String, Object> {
    final /* synthetic */ AnonymousClass15 this$1;

    public CrashlyticsController$22$1(AnonymousClass15 r2) {
        this.this$1 = r2;
        put("version", VERSION.RELEASE);
        put("build_version", VERSION.CODENAME);
        put("is_rooted", Boolean.valueOf(r0));
    }
}
