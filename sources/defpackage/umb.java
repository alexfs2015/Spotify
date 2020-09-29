package defpackage;

import com.spotify.music.slate.model.BackgroundColor;

/* renamed from: umb reason: default package */
abstract class umb extends umj {
    final ulz a;
    final ulz b;
    final ulw c;
    final ulz d;
    final BackgroundColor e;
    final b f;

    /* renamed from: umb$a */
    static final class a extends defpackage.umj.a {
        private ulz a;
        private ulz b;
        private ulw c;
        private ulz d;
        private BackgroundColor e;
        private b f;

        a() {
        }

        public final defpackage.umj.a a(BackgroundColor backgroundColor) {
            if (backgroundColor != null) {
                this.e = backgroundColor;
                return this;
            }
            throw new NullPointerException("Null backgroundColor");
        }

        public final defpackage.umj.a a(ulw ulw) {
            if (ulw != null) {
                this.c = ulw;
                return this;
            }
            throw new NullPointerException("Null image");
        }

        public final defpackage.umj.a a(ulz ulz) {
            if (ulz != null) {
                this.a = ulz;
                return this;
            }
            throw new NullPointerException("Null title");
        }

        public final defpackage.umj.a a(b bVar) {
            if (bVar != null) {
                this.f = bVar;
                return this;
            }
            throw new NullPointerException("Null layout");
        }

        public final umj a() {
            String str = "";
            if (this.a == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" title");
                str = sb.toString();
            }
            if (this.b == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(" subtitle");
                str = sb2.toString();
            }
            if (this.c == null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append(" image");
                str = sb3.toString();
            }
            if (this.d == null) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(str);
                sb4.append(" positiveAction");
                str = sb4.toString();
            }
            if (this.e == null) {
                StringBuilder sb5 = new StringBuilder();
                sb5.append(str);
                sb5.append(" backgroundColor");
                str = sb5.toString();
            }
            if (this.f == null) {
                StringBuilder sb6 = new StringBuilder();
                sb6.append(str);
                sb6.append(" layout");
                str = sb6.toString();
            }
            if (str.isEmpty()) {
                ume ume = new ume(this.a, this.b, this.c, this.d, this.e, this.f);
                return ume;
            }
            StringBuilder sb7 = new StringBuilder("Missing required properties:");
            sb7.append(str);
            throw new IllegalStateException(sb7.toString());
        }

        public final defpackage.umj.a b(ulz ulz) {
            if (ulz != null) {
                this.b = ulz;
                return this;
            }
            throw new NullPointerException("Null subtitle");
        }

        public final defpackage.umj.a c(ulz ulz) {
            if (ulz != null) {
                this.d = ulz;
                return this;
            }
            throw new NullPointerException("Null positiveAction");
        }
    }

    umb(ulz ulz, ulz ulz2, ulw ulw, ulz ulz3, BackgroundColor backgroundColor, b bVar) {
        if (ulz != null) {
            this.a = ulz;
            if (ulz2 != null) {
                this.b = ulz2;
                if (ulw != null) {
                    this.c = ulw;
                    if (ulz3 != null) {
                        this.d = ulz3;
                        if (backgroundColor != null) {
                            this.e = backgroundColor;
                            if (bVar != null) {
                                this.f = bVar;
                                return;
                            }
                            throw new NullPointerException("Null layout");
                        }
                        throw new NullPointerException("Null backgroundColor");
                    }
                    throw new NullPointerException("Null positiveAction");
                }
                throw new NullPointerException("Null image");
            }
            throw new NullPointerException("Null subtitle");
        }
        throw new NullPointerException("Null title");
    }

    public final ulz a() {
        return this.a;
    }

    public final ulz b() {
        return this.b;
    }

    public final ulw c() {
        return this.c;
    }

    public final ulz d() {
        return this.d;
    }

    public final BackgroundColor e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof umj) {
            umj umj = (umj) obj;
            return this.a.equals(umj.a()) && this.b.equals(umj.b()) && this.c.equals(umj.c()) && this.d.equals(umj.d()) && this.e.equals(umj.e()) && this.f.equals(umj.f());
        }
    }

    public final b f() {
        return this.f;
    }

    public int hashCode() {
        return ((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("TwoLineAndImageViewModel{title=");
        sb.append(this.a);
        sb.append(", subtitle=");
        sb.append(this.b);
        sb.append(", image=");
        sb.append(this.c);
        sb.append(", positiveAction=");
        sb.append(this.d);
        sb.append(", backgroundColor=");
        sb.append(this.e);
        sb.append(", layout=");
        sb.append(this.f);
        sb.append("}");
        return sb.toString();
    }
}
