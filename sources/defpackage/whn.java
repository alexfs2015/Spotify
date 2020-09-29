package defpackage;

import android.app.PendingIntent;

/* renamed from: whn reason: default package */
public final class whn {
    public final PendingIntent a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final String e;
    public final String f;
    public final String g;

    /* renamed from: whn$a */
    public static class a {
        public PendingIntent a;
    }

    private whn(PendingIntent pendingIntent, boolean z, boolean z2, boolean z3, String str, String str2, String str3) {
        this.a = pendingIntent;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = str;
        this.f = str2;
        this.g = str3;
    }

    public /* synthetic */ whn(PendingIntent pendingIntent, boolean z, boolean z2, boolean z3, String str, String str2, String str3, byte b2) {
        this(pendingIntent, z, z2, z3, str, str2, str3);
    }
}
