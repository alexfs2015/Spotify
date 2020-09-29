package defpackage;

import com.google.common.collect.ImmutableList;
import com.spotify.music.features.listeninghistory.model.Session;

/* renamed from: nwr reason: default package */
public abstract class nwr {

    /* renamed from: nwr$a */
    public static final class a extends nwr {
        final boolean a;

        public a(boolean z) {
            this.a = z;
        }

        public final <R_> R_ a(gee<d, R_> gee, gee<c, R_> gee2, gee<b, R_> gee3, gee<a, R_> gee4) {
            return gee4.apply(this);
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
    }

    /* renamed from: nwr$b */
    public static final class b extends nwr {
        public final <R_> R_ a(gee<d, R_> gee, gee<c, R_> gee2, gee<b, R_> gee3, gee<a, R_> gee4) {
            return gee3.apply(this);
        }

        public final boolean equals(Object obj) {
            return obj instanceof b;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "PaginationRequested{}";
        }
    }

    /* renamed from: nwr$c */
    public static final class c extends nwr {
        public final <R_> R_ a(gee<d, R_> gee, gee<c, R_> gee2, gee<b, R_> gee3, gee<a, R_> gee4) {
            return gee2.apply(this);
        }

        public final boolean equals(Object obj) {
            return obj instanceof c;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "SessionListFetchFailed{}";
        }
    }

    /* renamed from: nwr$d */
    public static final class d extends nwr {
        final ImmutableList<Session> a;
        final String b;

        public d(ImmutableList<Session> immutableList, String str) {
            this.a = (ImmutableList) gec.a(immutableList);
            this.b = (String) gec.a(str);
        }

        public final <R_> R_ a(gee<d, R_> gee, gee<c, R_> gee2, gee<b, R_> gee3, gee<a, R_> gee4) {
            return gee.apply(this);
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
    }

    nwr() {
    }

    public abstract <R_> R_ a(gee<d, R_> gee, gee<c, R_> gee2, gee<b, R_> gee3, gee<a, R_> gee4);
}
