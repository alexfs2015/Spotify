package defpackage;

import android.content.Intent;

/* renamed from: kzu reason: default package */
abstract class kzu extends kzw {
    final String a;
    final String b;
    final String c;
    final String d;
    final String e;
    final String f;
    final String g;
    final long h;
    final Intent i;
    final hct j;

    /* renamed from: kzu$a */
    static final class a extends defpackage.kzw.a {
        private String a;
        private String b;
        private String c;
        private String d;
        private String e;
        private String f;
        private String g;
        private Long h;
        private Intent i;
        private hct j;

        a() {
        }

        private a(kzw kzw) {
            this.a = kzw.a();
            this.b = kzw.b();
            this.c = kzw.c();
            this.d = kzw.d();
            this.e = kzw.e();
            this.f = kzw.f();
            this.g = kzw.g();
            this.h = Long.valueOf(kzw.h());
            this.i = kzw.i();
            this.j = kzw.j();
        }

        /* synthetic */ a(kzw kzw, byte b2) {
            this(kzw);
        }

        public final defpackage.kzw.a a(long j2) {
            this.h = Long.valueOf(j2);
            return this;
        }

        public final defpackage.kzw.a a(Intent intent) {
            this.i = intent;
            return this;
        }

        public final defpackage.kzw.a a(hct hct) {
            this.j = hct;
            return this;
        }

        public final kzw a() {
            String str = "";
            if (this.a == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" body");
                str = sb.toString();
            }
            if (this.b == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(" header");
                str = sb2.toString();
            }
            if (this.c == null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append(" primaryButton");
                str = sb3.toString();
            }
            if (this.g == null) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(str);
                sb4.append(" imageUri");
                str = sb4.toString();
            }
            if (this.h == null) {
                StringBuilder sb5 = new StringBuilder();
                sb5.append(str);
                sb5.append(" remainingTimeUntillnextOnDemand");
                str = sb5.toString();
            }
            if (str.isEmpty()) {
                kzv kzv = new kzv(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h.longValue(), this.i, this.j);
                return kzv;
            }
            StringBuilder sb6 = new StringBuilder("Missing required properties:");
            sb6.append(str);
            throw new IllegalStateException(sb6.toString());
        }
    }

    kzu(String str, String str2, String str3, String str4, String str5, String str6, String str7, long j2, Intent intent, hct hct) {
        if (str != null) {
            this.a = str;
            if (str2 != null) {
                this.b = str2;
                if (str3 != null) {
                    this.c = str3;
                    this.d = str4;
                    this.e = str5;
                    this.f = str6;
                    if (str7 != null) {
                        this.g = str7;
                        this.h = j2;
                        this.i = intent;
                        this.j = hct;
                        return;
                    }
                    throw new NullPointerException("Null imageUri");
                }
                throw new NullPointerException("Null primaryButton");
            }
            throw new NullPointerException("Null header");
        }
        throw new NullPointerException("Null body");
    }

    public final String a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public final String c() {
        return this.c;
    }

    public final String d() {
        return this.d;
    }

    public final String e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof kzw) {
            kzw kzw = (kzw) obj;
            if (this.a.equals(kzw.a()) && this.b.equals(kzw.b()) && this.c.equals(kzw.c())) {
                String str = this.d;
                if (str != null ? str.equals(kzw.d()) : kzw.d() == null) {
                    String str2 = this.e;
                    if (str2 != null ? str2.equals(kzw.e()) : kzw.e() == null) {
                        String str3 = this.f;
                        if (str3 != null ? str3.equals(kzw.f()) : kzw.f() == null) {
                            if (this.g.equals(kzw.g()) && this.h == kzw.h()) {
                                Intent intent = this.i;
                                if (intent != null ? intent.equals(kzw.i()) : kzw.i() == null) {
                                    hct hct = this.j;
                                    return hct != null ? hct.equals(kzw.j()) : kzw.j() == null;
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public final String f() {
        return this.f;
    }

    public final String g() {
        return this.g;
    }

    public final long h() {
        return this.h;
    }

    public int hashCode() {
        int hashCode = (((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003;
        String str = this.d;
        int i2 = 0;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.e;
        int hashCode3 = (hashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f;
        int hashCode4 = (((hashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003) ^ this.g.hashCode()) * 1000003;
        long j2 = this.h;
        int i3 = (hashCode4 ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        Intent intent = this.i;
        int hashCode5 = (i3 ^ (intent == null ? 0 : intent.hashCode())) * 1000003;
        hct hct = this.j;
        if (hct != null) {
            i2 = hct.hashCode();
        }
        return hashCode5 ^ i2;
    }

    public final Intent i() {
        return this.i;
    }

    public final hct j() {
        return this.j;
    }

    public final defpackage.kzw.a k() {
        return new a(this, 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("CappedOndemandDialogModel{body=");
        sb.append(this.a);
        sb.append(", header=");
        sb.append(this.b);
        sb.append(", primaryButton=");
        sb.append(this.c);
        sb.append(", secondaryButton=");
        sb.append(this.d);
        sb.append(", negativeButton=");
        sb.append(this.e);
        sb.append(", loadingDesc=");
        sb.append(this.f);
        sb.append(", imageUri=");
        sb.append(this.g);
        sb.append(", remainingTimeUntillnextOnDemand=");
        sb.append(this.h);
        sb.append(", intent=");
        sb.append(this.i);
        sb.append(", playFromContextHubsCommandModel=");
        sb.append(this.j);
        sb.append("}");
        return sb.toString();
    }
}
