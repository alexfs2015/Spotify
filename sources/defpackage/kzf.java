package defpackage;

import android.app.Activity;
import android.app.ActivityManager;
import android.os.Bundle;

/* renamed from: kzf reason: default package */
public interface kzf {

    /* renamed from: kzf$-CC reason: invalid class name */
    public final /* synthetic */ class CC {
        public static Bundle a(Activity activity) {
            Bundle extras = activity.getIntent().getExtras();
            if (extras != null) {
                return extras;
            }
            return new Bundle();
        }

        public static ActivityManager b(Activity activity) {
            return (ActivityManager) activity.getSystemService("activity");
        }
    }
}
