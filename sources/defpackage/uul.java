package defpackage;

import android.content.Context;
import android.view.View;
import java.lang.ref.WeakReference;

/* renamed from: uul reason: default package */
public final class uul {
    private static WeakReference<View> a = new WeakReference<>(null);

    public static synchronized boolean a(Context context) {
        boolean isInEditMode;
        synchronized (uul.class) {
            View view = (View) a.get();
            if (view == null) {
                view = new View(context.getApplicationContext());
                a = new WeakReference<>(view);
            }
            isInEditMode = view.isInEditMode();
        }
        return isInEditMode;
    }
}
