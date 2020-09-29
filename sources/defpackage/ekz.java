package defpackage;

import android.content.Context;
import android.util.Log;

/* renamed from: ekz reason: default package */
final class ekz implements ekw {
    static ekz a;
    final Context b;

    static ekz a(Context context) {
        ekz ekz;
        synchronized (ekz.class) {
            if (a == null) {
                a = fs.a(context, "com.google.android.providers.gsf.permission.READ_GSERVICES") == 0 ? new ekz(context) : new ekz();
            }
            ekz = a;
        }
        return ekz;
    }

    private ekz(Context context) {
        this.b = context;
        this.b.getContentResolver().registerContentObserver(ekq.a, true, new elb());
    }

    private ekz() {
        this.b = null;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final String a(String str) {
        if (this.b == null) {
            return null;
        }
        try {
            return (String) ekx.a(new ela(this, str));
        } catch (SecurityException e) {
            String str2 = "Unable to read GServices for: ";
            String valueOf = String.valueOf(str);
            Log.e("GservicesLoader", valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2), e);
            return null;
        }
    }
}
