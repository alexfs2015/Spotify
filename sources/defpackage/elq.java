package defpackage;

import android.content.Context;
import android.util.Log;

/* renamed from: elq reason: default package */
final class elq implements eln {
    static elq a;
    final Context b;

    private elq() {
        this.b = null;
    }

    private elq(Context context) {
        this.b = context;
        this.b.getContentResolver().registerContentObserver(elh.a, true, new els());
    }

    static elq a(Context context) {
        elq elq;
        synchronized (elq.class) {
            if (a == null) {
                a = fs.a(context, "com.google.android.providers.gsf.permission.READ_GSERVICES") == 0 ? new elq(context) : new elq();
            }
            elq = a;
        }
        return elq;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final String a(String str) {
        if (this.b == null) {
            return null;
        }
        try {
            return (String) elo.a(new elr(this, str));
        } catch (SecurityException e) {
            String str2 = "Unable to read GServices for: ";
            String valueOf = String.valueOf(str);
            Log.e("GservicesLoader", valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2), e);
            return null;
        }
    }
}
