package defpackage;

import android.content.Context;

/* renamed from: how reason: default package */
public abstract class how implements hpd {
    protected final Context a;
    protected final String b;

    public void a() {
    }

    public how(Context context, String str) {
        this.a = (Context) fay.a(context);
        this.b = (String) fay.a(str);
    }

    public boolean a(String str) {
        return this.b.equals(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof how)) {
            return false;
        }
        return this.b.equals(((how) obj).b);
    }

    public int hashCode() {
        return this.b.hashCode();
    }
}
