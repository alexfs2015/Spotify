package defpackage;

import com.spotify.music.slate.model.BackgroundColor;

/* renamed from: tzg reason: default package */
abstract class tzg extends tzo {
    final tze a;
    final tze b;
    final tzb c;
    final tze d;
    final BackgroundColor e;
    final b f;

    /* renamed from: tzg$a */
    static final class a extends defpackage.tzo.a {
        private tze a;
        private tze b;
        private tzb c;
        private tze d;
        private BackgroundColor e;
        private b f;

        a() {
        }

        public final defpackage.tzo.a a(tze tze) {
            if (tze != null) {
                this.a = tze;
                return this;
            }
            throw new NullPointerException("Null title");
        }

        public final defpackage.tzo.a b(tze tze) {
            if (tze != null) {
                this.b = tze;
                return this;
            }
            throw new NullPointerException("Null subtitle");
        }

        public final defpackage.tzo.a a(tzb tzb) {
            if (tzb != null) {
                this.c = tzb;
                return this;
            }
            throw new NullPointerException("Null image");
        }

        public final defpackage.tzo.a c(tze tze) {
            if (tze != null) {
                this.d = tze;
                return this;
            }
            throw new NullPointerException("Null positiveAction");
        }

        public final defpackage.tzo.a a(BackgroundColor backgroundColor) {
            if (backgroundColor != null) {
                this.e = backgroundColor;
                return this;
            }
            throw new NullPointerException("Null backgroundColor");
        }

        public final defpackage.tzo.a a(b bVar) {
            if (bVar != null) {
                this.f = bVar;
                return this;
            }
            throw new NullPointerException("Null layout");
        }

        public final tzo a() {
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
                tzj tzj = new tzj(this.a, this.b, this.c, this.d, this.e, this.f);
                return tzj;
            }
            StringBuilder sb7 = new StringBuilder("Missing required properties:");
            sb7.append(str);
            throw new IllegalStateException(sb7.toString());
        }
    }

    tzg(tze tze, tze tze2, tzb tzb, tze tze3, BackgroundColor backgroundColor, b bVar) {
        if (tze != null) {
            this.a = tze;
            if (tze2 != null) {
                this.b = tze2;
                if (tzb != null) {
                    this.c = tzb;
                    if (tze3 != null) {
                        this.d = tze3;
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

    public final tze a() {
        return this.a;
    }

    public final tze b() {
        return this.b;
    }

    public final tzb c() {
        return this.c;
    }

    public final tze d() {
        return this.d;
    }

    public final BackgroundColor e() {
        return this.e;
    }

    public final b f() {
        return this.f;
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

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof tzo) {
            tzo tzo = (tzo) obj;
            return this.a.equals(tzo.a()) && this.b.equals(tzo.b()) && this.c.equals(tzo.c()) && this.d.equals(tzo.d()) && this.e.equals(tzo.e()) && this.f.equals(tzo.f());
        }
    }

    public int hashCode() {
        return ((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode();
    }
}
