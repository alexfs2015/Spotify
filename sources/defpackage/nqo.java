package defpackage;

import com.google.common.collect.ImmutableList;
import com.spotify.music.features.listeninghistory.model.Session;

/* renamed from: nqo reason: default package */
public abstract class nqo {

    /* renamed from: nqo$a */
    public static final class a extends nqo {
        final boolean a;

        public a(boolean z) {
            this.a = z;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            return (obj instanceof a) && ((a) obj).a == this.a;
        }

        public final int hashCode() {
            return Boolean.valueOf(this.a).hashCode() + 0;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("InternetConnectionStateChanged{state=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }

        public final <R_> R_ a(gct<d, R_> gct, gct<c, R_> gct2, gct<b, R_> gct3, gct<a, R_> gct4) {
            return gct4.apply(this);
        }
    }

    /* renamed from: nqo$b */
    public static final class b extends nqo {
        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "PaginationRequested{}";
        }

        public final boolean equals(Object obj) {
            return obj instanceof b;
        }

        public final <R_> R_ a(gct<d, R_> gct, gct<c, R_> gct2, gct<b, R_> gct3, gct<a, R_> gct4) {
            return gct3.apply(this);
        }
    }

    /* renamed from: nqo$c */
    public static final class c extends nqo {
        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "SessionListFetchFailed{}";
        }

        public final boolean equals(Object obj) {
            return obj instanceof c;
        }

        public final <R_> R_ a(gct<d, R_> gct, gct<c, R_> gct2, gct<b, R_> gct3, gct<a, R_> gct4) {
            return gct2.apply(this);
        }
    }

    /* renamed from: nqo$d */
    public static final class d extends nqo {
        final ImmutableList<Session> a;
        final String b;

        public d(ImmutableList<Session> immutableList, String str) {
            this.a = (ImmutableList) gcr.a(immutableList);
            this.b = (String) gcr.a(str);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return dVar.a.equals(this.a) && dVar.b.equals(this.b);
        }

        public final int hashCode() {
            return ((this.a.hashCode() + 0) * 31) + this.b.hashCode();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("SessionListFetchSucceeded{sessionList=");
            sb.append(this.a);
            sb.append(", lastSessionEndTime=");
            sb.append(this.b);
            sb.append('}');
            return sb.toString();
        }

        public final <R_> R_ a(gct<d, R_> gct, gct<c, R_> gct2, gct<b, R_> gct3, gct<a, R_> gct4) {
            return gct.apply(this);
        }
    }

    public abstract <R_> R_ a(gct<d, R_> gct, gct<c, R_> gct2, gct<b, R_> gct3, gct<a, R_> gct4);

    nqo() {
    }
}
