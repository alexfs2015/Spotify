package defpackage;

import io.fabric.sdk.android.services.common.IdManager.DeviceIdentifierType;
import java.util.Collections;
import java.util.Map;

/* renamed from: aid reason: default package */
public final class aid extends wjf<Boolean> implements wjy {
    public final String a() {
        return "1.2.10.27";
    }

    public final String b() {
        return "com.crashlytics.sdk.android:beta";
    }

    public final Map<DeviceIdentifierType, String> d() {
        return Collections.emptyMap();
    }

    public final /* synthetic */ Object e() {
        wja.a().a("Beta", "Beta kit initializing...");
        return Boolean.TRUE;
    }
}
