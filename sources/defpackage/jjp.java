package defpackage;

import android.app.Activity;
import android.view.Window;
import com.spotify.base.java.logging.Logger;
import java.lang.ref.WeakReference;

/* renamed from: jjp reason: default package */
public final class jjp extends jyr {
    WeakReference<? extends Activity> a = new WeakReference<>(null);
    boolean b;
    private boolean c;

    /* access modifiers changed from: 0000 */
    public void a(Activity activity) {
        if (this.b && activity != null) {
            Window window = activity.getWindow();
            if (this.c) {
                Logger.c("Device is docked now", new Object[0]);
                window.addFlags(128);
                return;
            }
            Logger.c("Device is un-docked now", new Object[0]);
            window.clearFlags(128);
        }
    }

    /* access modifiers changed from: 0000 */
    public final void a(boolean z) {
        this.c = z;
        a((Activity) this.a.get());
    }

    public final void onActivityStarted(Activity activity) {
        this.a = new WeakReference<>(activity);
        a(activity);
    }

    public final void onActivityStopped(Activity activity) {
        this.a.clear();
    }
}
