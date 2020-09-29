package defpackage;

import com.google.android.gms.common.api.Status;

/* renamed from: ehe reason: default package */
final class ehe implements a {
    private final Status a;
    private final bng b;
    private final String c;
    private final String d;
    private final boolean e;

    public ehe(Status status, bng bng, String str, String str2, boolean z) {
        this.a = status;
        this.b = bng;
        this.c = str;
        this.d = str2;
        this.e = z;
    }

    public ehe(Status status) {
        this(status, null, null, null, false);
    }

    public final Status B_() {
        return this.a;
    }

    public final bng a() {
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
