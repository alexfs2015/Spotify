package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.webkit.WebSettings;
import java.util.concurrent.Callable;

/* renamed from: cox reason: default package */
final class cox implements Callable<String> {
    private final /* synthetic */ Context a;
    private final /* synthetic */ Context b;

    cox(Context context, Context context2) {
        this.a = context;
        this.b = context2;
    }

    public final /* synthetic */ Object call() {
        SharedPreferences sharedPreferences;
        String str = "admob_user_agent";
        boolean z = false;
        if (this.a != null) {
            cml.a();
            sharedPreferences = this.a.getSharedPreferences(str, 0);
        } else {
            cml.a();
            sharedPreferences = this.b.getSharedPreferences(str, 0);
            z = true;
        }
        String str2 = "user_agent";
        String string = sharedPreferences.getString(str2, "");
        if (TextUtils.isEmpty(string)) {
            cml.a();
            string = WebSettings.getDefaultUserAgent(this.b);
            if (z) {
                sharedPreferences.edit().putString(str2, string).apply();
                cml.a();
            }
        }
        return string;
    }
}
