package defpackage;

import android.app.Activity;
import android.app.ActivityOptions;
import android.content.Context;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.View;

/* renamed from: fb reason: default package */
public class fb {

    /* renamed from: fb$a */
    static class a extends fb {
        private final ActivityOptions a;

        a(ActivityOptions activityOptions) {
            this.a = activityOptions;
        }

        public final Bundle a() {
            return this.a.toBundle();
        }
    }

    protected fb() {
    }

    public static fb a(Activity activity, View view, String str) {
        return VERSION.SDK_INT >= 21 ? new a(ActivityOptions.makeSceneTransitionAnimation(activity, view, str)) : new fb();
    }

    public static fb a(Context context, int i, int i2) {
        return VERSION.SDK_INT >= 16 ? new a(ActivityOptions.makeCustomAnimation(context, 17432576, 17432577)) : new fb();
    }

    public Bundle a() {
        return null;
    }
}
