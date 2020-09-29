package defpackage;

import com.google.common.base.Optional;
import com.spotify.music.features.yourlibrary.musicpages.prefs.domain.PrefsModel;

/* renamed from: qyp reason: default package */
public abstract class qyp {

    /* renamed from: qyp$a */
    public static final class a extends qyp {
        final String a;
        final Long b;

        public a(String str, Long l) {
            this.a = (String) gcr.a(str);
            this.b = (Long) gcr.a(l);
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

        public final <R_> R_ a(gct<d, R_> gct, gct<b, R_> gct2, gct<a, R_> gct3, gct<c, R_> gct4) {
            return gct3.apply(this);
        }
    }

    /* renamed from: qyp$b */
    public static final class b extends qyp {
        final PrefsModel a;

        public b(PrefsModel prefsModel) {
            this.a = (PrefsModel) gcr.a(prefsModel);
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

        public final <R_> R_ a(gct<d, R_> gct, gct<b, R_> gct2, gct<a, R_> gct3, gct<c, R_> gct4) {
            return gct2.apply(this);
        }
    }

    /* renamed from: qyp$c */
    public static final class c extends qyp {
        final String a;
        final String b;
        final Optional<String> c;
        final Long d;

        public c(String str, String str2, Optional<String> optional, Long l) {
            this.a = (String) gcr.a(str);
            this.b = (String) gcr.a(str2);
            this.c = (Optional) gcr.a(optional);
            this.d = (Long) gcr.a(l);
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

        public final <R_> R_ a(gct<d, R_> gct, gct<b, R_> gct2, gct<a, R_> gct3, gct<c, R_> gct4) {
            return gct4.apply(this);
        }
    }

    /* renamed from: qyp$d */
    public static final class d extends qyp {
        final String a;

        d(String str) {
            this.a = (String) gcr.a(str);
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

        public final <R_> R_ a(gct<d, R_> gct, gct<b, R_> gct2, gct<a, R_> gct3, gct<c, R_> gct4) {
            return gct.apply(this);
        }
    }

    public abstract <R_> R_ a(gct<d, R_> gct, gct<b, R_> gct2, gct<a, R_> gct3, gct<c, R_> gct4);

    qyp() {
    }

    public static qyp a(String str) {
        return new d(str);
    }
}
