package defpackage;

import android.view.View.OnClickListener;

/* renamed from: uzu reason: default package */
final class uzu extends uzy {
    private final String a;
    private final int b;
    private final int c;
    private final int d;
    private final String e;
    private final OnClickListener f;

    /* renamed from: uzu$a */
    static final class a extends defpackage.uzy.a {
        String a;
        private Integer b;
        private Integer c;
        private Integer d;
        private String e;
        private OnClickListener f;

        a() {
        }

        /* access modifiers changed from: 0000 */
        public final defpackage.uzy.a a(int i) {
            this.b = Integer.valueOf(i);
            return this;
        }

        public final defpackage.uzy.a a(OnClickListener onClickListener) {
            this.f = onClickListener;
            return this;
        }

        public final defpackage.uzy.a a(String str) {
            this.e = str;
            return this;
        }

        public final uzy a() {
            String str = "";
            if (this.a == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" infoText");
                str = sb.toString();
            }
            if (this.b == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(" durationInMs");
                str = sb2.toString();
            }
            if (this.c == null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append(" textColor");
                str = sb3.toString();
            }
            if (this.d == null) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(str);
                sb4.append(" backgroundColor");
                str = sb4.toString();
            }
            if (str.isEmpty()) {
                uzu uzu = new uzu(this.a, this.b.intValue(), this.c.intValue(), this.d.intValue(), this.e, this.f, 0);
                return uzu;
            }
            StringBuilder sb5 = new StringBuilder("Missing required properties:");
            sb5.append(str);
            throw new IllegalStateException(sb5.toString());
        }

        public final defpackage.uzy.a b(int i) {
            this.c = Integer.valueOf(i);
            return this;
        }

        public final defpackage.uzy.a c(int i) {
            this.d = Integer.valueOf(i);
            return this;
        }
    }

    private uzu(String str, int i, int i2, int i3, String str2, OnClickListener onClickListener) {
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = str2;
        this.f = onClickListener;
    }

    /* synthetic */ uzu(String str, int i, int i2, int i3, String str2, OnClickListener onClickListener, byte b2) {
        this(str, i, i2, i3, str2, onClickListener);
    }

    public final String a() {
        return this.a;
    }

    public final int b() {
        return this.b;
    }

    public final int c() {
        return this.c;
    }

    public final int d() {
        return this.d;
    }

    public final String e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof uzy) {
            uzy uzy = (uzy) obj;
            if (this.a.equals(uzy.a()) && this.b == uzy.b() && this.c == uzy.c() && this.d == uzy.d()) {
                String str = this.e;
                if (str != null ? str.equals(uzy.e()) : uzy.e() == null) {
                    OnClickListener onClickListener = this.f;
                    return onClickListener != null ? onClickListener.equals(uzy.f()) : uzy.f() == null;
                }
            }
        }
    }

    public final OnClickListener f() {
        return this.f;
    }

    public final int hashCode() {
        int hashCode = (((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c) * 1000003) ^ this.d) * 1000003;
        String str = this.e;
        int i = 0;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        OnClickListener onClickListener = this.f;
        if (onClickListener != null) {
            i = onClickListener.hashCode();
        }
        return hashCode2 ^ i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ToastieConfiguration{infoText=");
        sb.append(this.a);
        sb.append(", durationInMs=");
        sb.append(this.b);
        sb.append(", textColor=");
        sb.append(this.c);
        sb.append(", backgroundColor=");
        sb.append(this.d);
        sb.append(", actionText=");
        sb.append(this.e);
        sb.append(", onClickListener=");
        sb.append(this.f);
        sb.append("}");
        return sb.toString();
    }
}
