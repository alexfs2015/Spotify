package defpackage;

import android.app.Activity;
import android.app.Application;

/* renamed from: ma reason: default package */
public final class ma {
    public static Application a(Activity activity) {
        Application application = activity.getApplication();
        if (application != null) {
            return application;
        }
        throw new IllegalStateException("Your activity/fragment is not yet attached to Application. You can't request ViewModel before onCreate call.");
    }
}
