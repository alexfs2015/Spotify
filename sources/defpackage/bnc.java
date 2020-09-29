package defpackage;

import android.content.Context;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;

/* renamed from: bnc reason: default package */
public final class bnc {
    private static bnc a;
    private bms b;
    private GoogleSignInAccount c = this.b.a();
    private GoogleSignInOptions d = this.b.b();

    private bnc(Context context) {
        this.b = bms.a(context);
    }

    public static synchronized bnc a(Context context) {
        bnc b2;
        synchronized (bnc.class) {
            b2 = b(context.getApplicationContext());
        }
        return b2;
    }

    private static synchronized bnc b(Context context) {
        bnc bnc;
        synchronized (bnc.class) {
            if (a == null) {
                a = new bnc(context);
            }
            bnc = a;
        }
        return bnc;
    }

    /* JADX INFO: finally extract failed */
    public final synchronized void a() {
        bms bms = this.b;
        bms.a.lock();
        try {
            bms.b.edit().clear().apply();
            bms.a.unlock();
            this.c = null;
            this.d = null;
        } catch (Throwable th) {
            bms.a.unlock();
            throw th;
        }
    }

    public final synchronized void a(GoogleSignInOptions googleSignInOptions, GoogleSignInAccount googleSignInAccount) {
        this.b.a(googleSignInAccount, googleSignInOptions);
        this.c = googleSignInAccount;
        this.d = googleSignInOptions;
    }
}
