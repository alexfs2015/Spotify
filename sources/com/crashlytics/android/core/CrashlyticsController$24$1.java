package com.crashlytics.android.core;

import android.os.Build;
import java.util.HashMap;

public class CrashlyticsController$24$1 extends HashMap<String, Object> {
    final /* synthetic */ AnonymousClass17 this$1;

    public CrashlyticsController$24$1(AnonymousClass17 r3) {
        this.this$1 = r3;
        put("arch", Integer.valueOf(r2));
        put("build_model", Build.MODEL);
        put("available_processors", Integer.valueOf(r3));
        put("total_ram", Long.valueOf(r4));
        put("disk_space", Long.valueOf(r6));
        put("is_emulator", Boolean.valueOf(r8));
        put("ids", r9);
        put("state", Integer.valueOf(r10));
        put("build_manufacturer", Build.MANUFACTURER);
        put("build_product", Build.PRODUCT);
    }
}
