package defpackage;

import io.fabric.sdk.android.services.common.IdManager.DeviceIdentifierType;
import java.util.Collections;
import java.util.Map;

/* renamed from: ahp reason: default package */
public final class ahp extends vuz<Boolean> implements vvs {
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
        vuu.a().a("Beta", "Beta kit initializing...");
        return Boolean.TRUE;
    }
}
