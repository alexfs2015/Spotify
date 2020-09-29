package defpackage;

import com.google.common.base.Optional;
import com.spotify.music.features.yourlibrary.musicpages.prefs.domain.PrefsModel;

/* renamed from: rhe reason: default package */
public abstract class rhe {

    /* renamed from: rhe$a */
    public static final class a extends rhe {
        final String a;
        final Long b;

        public a(String str, Long l) {
            this.a = (String) gec.a(str);
            this.b = (Long) gec.a(l);
        }

        public final <R_> R_ a(gee<d, R_> gee, gee<b, R_> gee2, gee<a, R_> gee3, gee<c, R_> gee4) {
            return gee3.apply(this);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return aVar.a.equals(this.a) && aVar.b.equals(this.b);
        }

        public final int hashCode() {
            return ((this.a.hashCode() + 0) * 31) + this.b.hashCode();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("PagePrefsAccessed{uri=");
            sb.append(this.a);
            sb.append(", timestamp=");
            sb.append(this.b);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: rhe$b */
    public static final class b extends rhe {
        final PrefsModel a;

        public b(PrefsModel prefsModel) {
            this.a = (PrefsModel) gec.a(prefsModel);
        }

        public final <R_> R_ a(gee<d, R_> gee, gee<b, R_> gee2, gee<a, R_> gee3, gee<c, R_> gee4) {
            return gee2.apply(this);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            return ((b) obj).a.equals(this.a);
        }

        public final int hashCode() {
            return this.a.hashCode() + 0;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("PrefsModelLoaded{prefsModel=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: rhe$c */
    public static final class c extends rhe {
        final String a;
        final String b;
        final Optional<String> c;
        final Long d;

        public c(String str, String str2, Optional<String> optional, Long l) {
            this.a = (String) gec.a(str);
            this.b = (String) gec.a(str2);
            this.c = (Optional) gec.a(optional);
            this.d = (Long) gec.a(l);
        }

        public final <R_> R_ a(gee<d, R_> gee, gee<b, R_> gee2, gee<a, R_> gee3, gee<c, R_> gee4) {
            return gee4.apply(this);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return cVar.a.equals(this.a) && cVar.b.equals(this.b) && cVar.c.equals(this.c) && cVar.d.equals(this.d);
        }

        public final int hashCode() {
            return ((((((this.a.hashCode() + 0) * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("SetPagePrefsOption{uri=");
            sb.append(this.a);
            sb.append(", key=");
            sb.append(this.b);
            sb.append(", value=");
            sb.append(this.c);
            sb.append(", timestamp=");
            sb.append(this.d);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: rhe$d */
    public static final class d extends rhe {
        final String a;

        d(String str) {
            this.a = (String) gec.a(str);
        }

        public final <R_> R_ a(gee<d, R_> gee, gee<b, R_> gee2, gee<a, R_> gee3, gee<c, R_> gee4) {
            return gee.apply(this);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            return ((d) obj).a.equals(this.a);
        }

        public final int hashCode() {
            return this.a.hashCode() + 0;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("UsernameLoaded{username=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }
    }

    rhe() {
    }

    public static rhe a(String str) {
        return new d(str);
    }

    public abstract <R_> R_ a(gee<d, R_> gee, gee<b, R_> gee2, gee<a, R_> gee3, gee<c, R_> gee4);
}
