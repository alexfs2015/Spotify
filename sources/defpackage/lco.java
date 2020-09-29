package defpackage;

import android.app.Activity;
import android.app.ActivityManager;
import android.os.Bundle;

/* renamed from: lco reason: default package */
public interface lco {

    /* renamed from: lco$-CC reason: invalid class name */
    public final /* synthetic */ class CC {
        public static Bundle a(Activity activity) {
            Bundle extras = activity.getIntent().getExtras();
            return extras != null ? extras : new Bundle();
        }

        public static ActivityManager b(Activity activity) {
            return (ActivityManager) activity.getSystemService("activity");
        }
    }
}
