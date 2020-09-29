package defpackage;

import java.util.List;

/* renamed from: kwu reason: default package */
abstract class kwu extends defpackage.kww.a {
    final String a;
    final String b;
    final String c;
    final boolean d;
    final boolean e;
    final boolean f;
    final Boolean g;
    final String h;
    final String i;
    final List<String> j;
    final String k;
    final String l;

    /* renamed from: kwu$a */
    static final class a implements C0047a {
        private String a;
        private String b;
        private String c;
        private Boolean d;
        private Boolean e;
        private Boolean f;
        private Boolean g;
        private String h;
        private String i;
        private List<String> j;
        private String k;
        private String l;

        /* synthetic */ a(defpackage.kww.a aVar, byte b2) {
            this(aVar);
        }

        a() {
        }

        private a(defpackage.kww.a aVar) {
            this.a = aVar.a();
            this.b = aVar.b();
            this.c = aVar.c();
            this.d = Boolean.valueOf(aVar.d());
            this.e = Boolean.valueOf(aVar.e());
            this.f = Boolean.valueOf(aVar.f());
            this.g = aVar.g();
            this.h = aVar.h();
            this.i = aVar.i();
            this.j = aVar.j();
            this.k = aVar.k();
            this.l = aVar.l();
        }

        public final /* synthetic */ rft a() {
            String str = "";
            if (this.a == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" uri");
                str = sb.toString();
            }
            if (this.b == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(" name");
                str = sb2.toString();
            }
            if (this.c == null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append(" previewId");
                str = sb3.toString();
            }
            if (this.d == null) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(str);
                sb4.append(" explicit");
                str = sb4.toString();
            }
            if (this.e == null) {
                StringBuilder sb5 = new StringBuilder();
                sb5.append(str);
                sb5.append(" hearted");
                str = sb5.toString();
            }
            if (this.f == null) {
                StringBuilder sb6 = new StringBuilder();
                sb6.append(str);
                sb6.append(" banned");
                str = sb6.toString();
            }
            if (this.h == null) {
                StringBuilder sb7 = new StringBuilder();
                sb7.append(str);
                sb7.append(" albumName");
                str = sb7.toString();
            }
            if (this.i == null) {
                StringBuilder sb8 = new StringBuilder();
                sb8.append(str);
                sb8.append(" artistName");
                str = sb8.toString();
            }
            if (this.j == null) {
                StringBuilder sb9 = new StringBuilder();
                sb9.append(str);
                sb9.append(" artistNames");
                str = sb9.toString();
            }
            if (this.k == null) {
                StringBuilder sb10 = new StringBuilder();
                sb10.append(str);
                sb10.append(" imageUri");
                str = sb10.toString();
            }
            if (str.isEmpty()) {
                kwv kwv = new kwv(this.a, this.b, this.c, this.d.booleanValue(), this.e.booleanValue(), this.f.booleanValue(), this.g, this.h, this.i, this.j, this.k, this.l);
                return kwv;
            }
            StringBuilder sb11 = new StringBuilder("Missing required properties:");
            sb11.append(str);
            throw new IllegalStateException(sb11.toString());
        }

        public final /* synthetic */ defpackage.rft.a a(boolean z) {
            this.f = Boolean.valueOf(z);
            return this;
        }

        public final /* synthetic */ defpackage.rft.a b(boolean z) {
            this.e = Boolean.valueOf(z);
            return this;
        }
    }

    kwu(String str, String str2, String str3, boolean z, boolean z2, boolean z3, Boolean bool, String str4, String str5, List<String> list, String str6, String str7) {
        if (str != null) {
            this.a = str;
            if (str2 != null) {
                this.b = str2;
                if (str3 != null) {
                    this.c = str3;
                    this.d = z;
                    this.e = z2;
                    this.f = z3;
                    this.g = bool;
                    if (str4 != null) {
                        this.h = str4;
                        if (str5 != null) {
                            this.i = str5;
                            if (list != null) {
                                this.j = list;
                                if (str6 != null) {
                                    this.k = str6;
                                    this.l = str7;
                                    return;
                                }
                                throw new NullPointerException("Null imageUri");
                            }
                            throw new NullPointerException("Null artistNames");
                        }
                        throw new NullPointerException("Null artistName");
                    }
                    throw new NullPointerException("Null albumName");
                }
                throw new NullPointerException("Null previewId");
            }
            throw new NullPointerException("Null name");
        }
        throw new NullPointerException("Null uri");
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

    public final boolean d() {
        return this.d;
    }

    public final boolean e() {
        return this.e;
    }

    public final boolean f() {
        return this.f;
    }

    public final Boolean g() {
        return this.g;
    }

    public final String h() {
        return this.h;
    }

    public final String i() {
        return this.i;
    }

    public final List<String> j() {
        return this.j;
    }

    public final String k() {
        return this.k;
    }

    public final String l() {
        return this.l;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("HubTrack{uri=");
        sb.append(this.a);
        sb.append(", name=");
        sb.append(this.b);
        sb.append(", previewId=");
        sb.append(this.c);
        sb.append(", explicit=");
        sb.append(this.d);
        sb.append(", hearted=");
        sb.append(this.e);
        sb.append(", banned=");
        sb.append(this.f);
        sb.append(", currentlyPlayable=");
        sb.append(this.g);
        sb.append(", albumName=");
        sb.append(this.h);
        sb.append(", artistName=");
        sb.append(this.i);
        sb.append(", artistNames=");
        sb.append(this.j);
        sb.append(", imageUri=");
        sb.append(this.k);
        sb.append(", rowId=");
        sb.append(this.l);
        sb.append("}");
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.kww.a) {
            defpackage.kww.a aVar = (defpackage.kww.a) obj;
            if (this.a.equals(aVar.a()) && this.b.equals(aVar.b()) && this.c.equals(aVar.c()) && this.d == aVar.d() && this.e == aVar.e() && this.f == aVar.f()) {
                Boolean bool = this.g;
                if (bool != null ? bool.equals(aVar.g()) : aVar.g() == null) {
                    if (this.h.equals(aVar.h()) && this.i.equals(aVar.i()) && this.j.equals(aVar.j()) && this.k.equals(aVar.k())) {
                        String str = this.l;
                        return str != null ? str.equals(aVar.l()) : aVar.l() == null;
                    }
                }
            }
        }
    }

    public int hashCode() {
        int i2 = 1231;
        int hashCode = (((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ (this.d ? 1231 : 1237)) * 1000003) ^ (this.e ? 1231 : 1237)) * 1000003;
        if (!this.f) {
            i2 = 1237;
        }
        int i3 = (hashCode ^ i2) * 1000003;
        Boolean bool = this.g;
        int i4 = 0;
        int hashCode2 = (((((((((i3 ^ (bool == null ? 0 : bool.hashCode())) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.i.hashCode()) * 1000003) ^ this.j.hashCode()) * 1000003) ^ this.k.hashCode()) * 1000003;
        String str = this.l;
        if (str != null) {
            i4 = str.hashCode();
        }
        return hashCode2 ^ i4;
    }

    public final C0047a m() {
        return new a(this, 0);
    }
}
