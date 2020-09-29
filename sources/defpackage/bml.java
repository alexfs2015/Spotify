package defpackage;

import android.content.Context;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;

/* renamed from: bml reason: default package */
public final class bml {
    private static bml a;
    private bmb b;
    private GoogleSignInAccount c = this.b.a();
    private GoogleSignInOptions d = this.b.b();

    private bml(Context context) {
        this.b = bmb.a(context);
    }

    public static synchronized bml a(Context context) {
        bml b2;
        synchronized (bml.class) {
            b2 = b(context.getApplicationContext());
        }
        return b2;
    }

    private static synchronized bml b(Context context) {
        bml bml;
        synchronized (bml.class) {
            if (a == null) {
                a = new bml(context);
            }
            bml = a;
        }
        return bml;
    }

    /* JADX INFO: finally extract failed */
    public final synchronized void a() {
        bmb bmb = this.b;
        bmb.a.lock();
        try {
            bmb.b.edit().clear().apply();
            bmb.a.unlock();
            this.c = null;
            this.d = null;
        } catch (Throwable th) {
            bmb.a.unlock();
            throw th;
        }
    }

    public final synchronized void a(GoogleSignInOptions googleSignInOptions, GoogleSignInAccount googleSignInAccount) {
        this.b.a(googleSignInAccount, googleSignInOptions);
        this.c = googleSignInAccount;
        this.d = googleSignInOptions;
    }
}
