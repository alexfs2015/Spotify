package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import java.util.Calendar;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* renamed from: ewg reason: default package */
public final class ewg extends esv {
    private long a;
    private String b;
    private Boolean c;

    ewg(ery ery) {
        super(ery);
    }

    /* access modifiers changed from: protected */
    public final boolean d() {
        Calendar instance = Calendar.getInstance();
        this.a = TimeUnit.MINUTES.convert((long) (instance.get(15) + instance.get(16)), TimeUnit.MILLISECONDS);
        Locale locale = Locale.getDefault();
        String lowerCase = locale.getLanguage().toLowerCase(Locale.ENGLISH);
        String lowerCase2 = locale.getCountry().toLowerCase(Locale.ENGLISH);
        StringBuilder sb = new StringBuilder(String.valueOf(lowerCase).length() + 1 + String.valueOf(lowerCase2).length());
        sb.append(lowerCase);
        sb.append("-");
        sb.append(lowerCase2);
        this.b = sb.toString();
        return false;
    }

    public final long f() {
        w();
        return this.a;
    }

    public final String g() {
        w();
        return this.b;
    }

    public final boolean a(Context context) {
        if (this.c == null) {
            this.c = Boolean.FALSE;
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager != null) {
                    packageManager.getPackageInfo("com.google.android.gms", 128);
                    this.c = Boolean.TRUE;
                }
            } catch (NameNotFoundException unused) {
            }
        }
        return this.c.booleanValue();
    }

    public final /* bridge */ /* synthetic */ void a() {
        super.a();
    }

    public final /* bridge */ /* synthetic */ void b() {
        super.b();
    }

    public final /* bridge */ /* synthetic */ void c() {
        super.c();
    }

    public final /* bridge */ /* synthetic */ ewg k() {
        return super.k();
    }

    public final /* bridge */ /* synthetic */ bzg l() {
        return super.l();
    }

    public final /* bridge */ /* synthetic */ Context m() {
        return super.m();
    }

    public final /* bridge */ /* synthetic */ equ n() {
        return super.n();
    }

    public final /* bridge */ /* synthetic */ evm o() {
        return super.o();
    }

    public final /* bridge */ /* synthetic */ eru p() {
        return super.p();
    }

    public final /* bridge */ /* synthetic */ eqw q() {
        return super.q();
    }

    public final /* bridge */ /* synthetic */ erh r() {
        return super.r();
    }

    public final /* bridge */ /* synthetic */ evw s() {
        return super.s();
    }
}
