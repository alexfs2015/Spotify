package defpackage;

import android.content.Intent;

/* renamed from: iln reason: default package */
final class iln extends ilo {
    private final String a;
    private final Intent b;

    /* renamed from: iln$a */
    public static final class a extends defpackage.ilo.a {
        private String a;
        private Intent b;

        public final defpackage.ilo.a a(String str) {
            if (str != null) {
                this.a = str;
                return this;
            }
            throw new NullPointerException("Null text");
        }

        public final defpackage.ilo.a a(Intent intent) {
            this.b = intent;
            return this;
        }

        public final ilo a() {
            String str = "";
            if (this.a == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" text");
                str = sb.toString();
            }
            if (this.b == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(" deeplinkIntent");
                str = sb2.toString();
            }
            if (str.isEmpty()) {
                return new iln(this.a, this.b, 0);
            }
            StringBuilder sb3 = new StringBuilder("Missing required properties:");
            sb3.append(str);
            throw new IllegalStateException(sb3.toString());
        }
    }

    /* synthetic */ iln(String str, Intent intent, byte b2) {
        this(str, intent);
    }

    private iln(String str, Intent intent) {
        this.a = str;
        this.b = intent;
    }

    public final String a() {
        return this.a;
    }

    public final Intent b() {
        return this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CTA{text=");
        sb.append(this.a);
        sb.append(", deeplinkIntent=");
        sb.append(this.b);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ilo) {
            ilo ilo = (ilo) obj;
            return this.a.equals(ilo.a()) && this.b.equals(ilo.b());
        }
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }
}
