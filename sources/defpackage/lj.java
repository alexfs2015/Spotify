package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: lj reason: default package */
public final class lj {
    private static AtomicBoolean a = new AtomicBoolean(false);

    /* renamed from: lj$a */
    static class a extends lf {
        a() {
        }

        public final void onActivityCreated(Activity activity, Bundle bundle) {
            lw.a(activity);
        }

        public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        public final void onActivityStopped(Activity activity) {
        }
    }

    public static void a(Context context) {
        if (!a.getAndSet(true)) {
            ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(new a());
        }
    }
}
