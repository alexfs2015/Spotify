package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: bms reason: default package */
public final class bms {
    private static final Lock c = new ReentrantLock();
    private static bms d;
    final Lock a = new ReentrantLock();
    final SharedPreferences b;

    private bms(Context context) {
        this.b = context.getSharedPreferences("com.google.android.gms.signin", 0);
    }

    public static bms a(Context context) {
        bxo.a(context);
        c.lock();
        try {
            if (d == null) {
                d = new bms(context.getApplicationContext());
            }
            return d;
        } finally {
            c.unlock();
        }
    }

    public static String a(String str, String str2) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(str2).length());
        sb.append(str);
        sb.append(":");
        sb.append(str2);
        return sb.toString();
    }

    private final void b(String str, String str2) {
        this.a.lock();
        try {
            this.b.edit().putString(str, str2).apply();
        } finally {
            this.a.unlock();
        }
    }

    private final GoogleSignInAccount c(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String a2 = a(a("googleSignInAccount", str));
        if (a2 != null) {
            try {
                return GoogleSignInAccount.a(a2);
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    private final GoogleSignInOptions d(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String a2 = a(a("googleSignInOptions", str));
        if (a2 != null) {
            try {
                return GoogleSignInOptions.a(a2);
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    public final GoogleSignInAccount a() {
        return c(a("defaultGoogleSignInAccount"));
    }

    public final String a(String str) {
        this.a.lock();
        try {
            return this.b.getString(str, null);
        } finally {
            this.a.unlock();
        }
    }

    public final void a(GoogleSignInAccount googleSignInAccount, GoogleSignInOptions googleSignInOptions) {
        bxo.a(googleSignInAccount);
        bxo.a(googleSignInOptions);
        b("defaultGoogleSignInAccount", googleSignInAccount.a);
        bxo.a(googleSignInAccount);
        bxo.a(googleSignInOptions);
        String str = googleSignInAccount.a;
        String a2 = a("googleSignInAccount", str);
        JSONObject c2 = googleSignInAccount.c();
        c2.remove("serverAuthCode");
        b(a2, c2.toString());
        b(a("googleSignInOptions", str), googleSignInOptions.b().toString());
    }

    public final GoogleSignInOptions b() {
        return d(a("defaultGoogleSignInAccount"));
    }

    public final void b(String str) {
        this.a.lock();
        try {
            this.b.edit().remove(str).apply();
        } finally {
            this.a.unlock();
        }
    }
}
