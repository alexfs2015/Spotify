package defpackage;

import android.content.Intent;

/* renamed from: kwl reason: default package */
abstract class kwl extends kwn {
    final String a;
    final String b;
    final String c;
    final String d;
    final String e;
    final String f;
    final String g;
    final long h;
    final Intent i;
    final haa j;

    /* renamed from: kwl$a */
    static final class a extends defpackage.kwn.a {
        private String a;
        private String b;
        private String c;
        private String d;
        private String e;
        private String f;
        private String g;
        private Long h;
        private Intent i;
        private haa j;

        /* synthetic */ a(kwn kwn, byte b2) {
            this(kwn);
        }

        a() {
        }

        private a(kwn kwn) {
            this.a = kwn.a();
            this.b = kwn.b();
            this.c = kwn.c();
            this.d = kwn.d();
            this.e = kwn.e();
            this.f = kwn.f();
            this.g = kwn.g();
            this.h = Long.valueOf(kwn.h());
            this.i = kwn.i();
            this.j = kwn.j();
        }

        public final defpackage.kwn.a a(long j2) {
            this.h = Long.valueOf(j2);
            return this;
        }

        public final defpackage.kwn.a a(Intent intent) {
            this.i = intent;
            return this;
        }

        public final defpackage.kwn.a a(haa haa) {
            this.j = haa;
            return this;
        }

        public final kwn a() {
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
                kwm kwm = new kwm(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h.longValue(), this.i, this.j);
                return kwm;
            }
            StringBuilder sb6 = new StringBuilder("Missing required properties:");
            sb6.append(str);
            throw new IllegalStateException(sb6.toString());
        }
    }

    kwl(String str, String str2, String str3, String str4, String str5, String str6, String str7, long j2, Intent intent, haa haa) {
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
                        this.j = haa;
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

    public final String f() {
        return this.f;
    }

    public final String g() {
        return this.g;
    }

    public final long h() {
        return this.h;
    }

    public final Intent i() {
        return this.i;
    }

    public final haa j() {
        return this.j;
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

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof kwn) {
            kwn kwn = (kwn) obj;
            if (this.a.equals(kwn.a()) && this.b.equals(kwn.b()) && this.c.equals(kwn.c())) {
                String str = this.d;
                if (str != null ? str.equals(kwn.d()) : kwn.d() == null) {
                    String str2 = this.e;
                    if (str2 != null ? str2.equals(kwn.e()) : kwn.e() == null) {
                        String str3 = this.f;
                        if (str3 != null ? str3.equals(kwn.f()) : kwn.f() == null) {
                            if (this.g.equals(kwn.g()) && this.h == kwn.h()) {
                                Intent intent = this.i;
                                if (intent != null ? intent.equals(kwn.i()) : kwn.i() == null) {
                                    haa haa = this.j;
                                    return haa != null ? haa.equals(kwn.j()) : kwn.j() == null;
                                }
                            }
                        }
                    }
                }
            }
        }
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
        haa haa = this.j;
        if (haa != null) {
            i2 = haa.hashCode();
        }
        return hashCode5 ^ i2;
    }

    public final defpackage.kwn.a k() {
        return new a(this, 0);
    }
}
