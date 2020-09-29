package defpackage;

import com.google.android.gms.common.api.Status;

/* renamed from: ehv reason: default package */
final class ehv implements a {
    private final Status a;
    private final bnx b;
    private final String c;
    private final String d;
    private final boolean e;

    public ehv(Status status) {
        this(status, null, null, null, false);
    }

    public ehv(Status status, bnx bnx, String str, String str2, boolean z) {
        this.a = status;
        this.b = bnx;
        this.c = str;
        this.d = str2;
        this.e = z;
    }

    public final Status B_() {
        return this.a;
    }

    public final bnx a() {
        return this.b;
    }

    public final String b() {
        return this.c;
    }

    public final String c() {
        return this.d;
    }

    public final boolean d() {
        return this.e;
    }
}
