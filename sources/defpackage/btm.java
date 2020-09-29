package defpackage;

import android.app.Activity;
import android.content.Intent;
import com.google.android.gms.common.api.internal.LifecycleCallback;

/* renamed from: btm reason: default package */
public interface btm {
    Activity D_();

    <T extends LifecycleCallback> T a(String str, Class<T> cls);

    void a(String str, LifecycleCallback lifecycleCallback);

    void startActivityForResult(Intent intent, int i);
}
