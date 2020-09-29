package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: le reason: default package */
public final class le {
    private static AtomicBoolean a = new AtomicBoolean(false);

    /* renamed from: le$a */
    static class a extends la {
        public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        public final void onActivityStopped(Activity activity) {
        }

        a() {
        }

        public final void onActivityCreated(Activity activity, Bundle bundle) {
            lr.a(activity);
        }
    }

    public static void a(Context context) {
        if (!a.getAndSet(true)) {
            ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(new a());
        }
    }
}
