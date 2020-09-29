package defpackage;

import android.content.Intent;

/* renamed from: ioa reason: default package */
final class ioa extends iob {
    private final String a;
    private final Intent b;

    /* renamed from: ioa$a */
    public static final class a extends defpackage.iob.a {
        private String a;
        private Intent b;

        public final defpackage.iob.a a(Intent intent) {
            this.b = intent;
            return this;
        }

        public final defpackage.iob.a a(String str) {
            if (str != null) {
                this.a = str;
                return this;
            }
            throw new NullPointerException("Null text");
        }

        public final iob a() {
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
                return new ioa(this.a, this.b, 0);
            }
            StringBuilder sb3 = new StringBuilder("Missing required properties:");
            sb3.append(str);
            throw new IllegalStateException(sb3.toString());
        }
    }

    private ioa(String str, Intent intent) {
        this.a = str;
        this.b = intent;
    }

    /* synthetic */ ioa(String str, Intent intent, byte b2) {
        this(str, intent);
    }

    public final String a() {
        return this.a;
    }

    public final Intent b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof iob) {
            iob iob = (iob) obj;
            return this.a.equals(iob.a()) && this.b.equals(iob.b());
        }
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CTA{text=");
        sb.append(this.a);
        sb.append(", deeplinkIntent=");
        sb.append(this.b);
        sb.append("}");
        return sb.toString();
    }
}
