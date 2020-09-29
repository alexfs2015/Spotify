package defpackage;

import java.util.List;

/* renamed from: mph reason: default package */
public abstract class mph {

    /* renamed from: mph$a */
    public static final class a extends mph {
        public final List<mpf> a;

        public a(List<mpf> list) {
            this.a = (List) gcr.a(list);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            return ((a) obj).a.equals(this.a);
        }

        public final int hashCode() {
            return this.a.hashCode() + 0;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Artists{artists=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }

        public final void a(gcs<c> gcs, gcs<b> gcs2, gcs<d> gcs3, gcs<a> gcs4) {
            gcs4.accept(this);
        }

        public final <R_> R_ a(gct<c, R_> gct, gct<b, R_> gct2, gct<d, R_> gct3, gct<a, R_> gct4) {
            return gct4.apply(this);
        }
    }

    /* renamed from: mph$b */
    public static final class b extends mph {
        public final CharSequence a;
        public final String b;
        public final int c;
        public final String d;
        public final int e;
        private final int f;

        public b(CharSequence charSequence, String str, int i, int i2, String str2, int i3) {
            this.a = charSequence;
            this.b = (String) gcr.a(str);
            this.c = i;
            this.f = i2;
            this.d = str2;
            this.e = i3;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return bVar.c == this.c && bVar.f == this.f && bVar.e == this.e && gcr.a(bVar.a, this.a) && bVar.b.equals(this.b) && gcr.a(bVar.d, this.d);
        }

        public final int hashCode() {
            CharSequence charSequence = this.a;
            int i = 0;
            int hashCode = ((((((((charSequence != null ? charSequence.hashCode() : 0) + 0) * 31) + this.b.hashCode()) * 31) + Integer.valueOf(this.c).hashCode()) * 31) + Integer.valueOf(this.f).hashCode()) * 31;
            String str = this.d;
            if (str != null) {
                i = str.hashCode();
            }
            return ((hashCode + i) * 31) + Integer.valueOf(this.e).hashCode();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("StoryEntity{title=");
            sb.append(this.a);
            sb.append(", type=");
            sb.append(this.b);
            sb.append(", trackCount=");
            sb.append(this.c);
            sb.append(", resId=");
            sb.append(this.f);
            sb.append(", image=");
            sb.append(this.d);
            sb.append(", accentColor=");
            sb.append(this.e);
            sb.append('}');
            return sb.toString();
        }

        public final void a(gcs<c> gcs, gcs<b> gcs2, gcs<d> gcs3, gcs<a> gcs4) {
            gcs2.accept(this);
        }

        public final <R_> R_ a(gct<c, R_> gct, gct<b, R_> gct2, gct<d, R_> gct3, gct<a, R_> gct4) {
            return gct2.apply(this);
        }
    }

    /* renamed from: mph$c */
    public static final class c extends mph {
        public final CharSequence a;
        public final String b;
        public final String c;
        public final String d;

        public c(CharSequence charSequence, String str, String str2, String str3) {
            this.a = charSequence;
            this.b = (String) gcr.a(str);
            this.c = (String) gcr.a(str2);
            this.d = str3;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return gcr.a(cVar.a, this.a) && cVar.b.equals(this.b) && cVar.c.equals(this.c) && gcr.a(cVar.d, this.d);
        }

        public final int hashCode() {
            CharSequence charSequence = this.a;
            int i = 0;
            int hashCode = ((((((charSequence != null ? charSequence.hashCode() : 0) + 0) * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31;
            String str = this.d;
            if (str != null) {
                i = str.hashCode();
            }
            return hashCode + i;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("StoryHeader{title=");
            sb.append(this.a);
            sb.append(", description=");
            sb.append(this.b);
            sb.append(", releasedDate=");
            sb.append(this.c);
            sb.append(", image=");
            sb.append(this.d);
            sb.append('}');
            return sb.toString();
        }

        public final void a(gcs<c> gcs, gcs<b> gcs2, gcs<d> gcs3, gcs<a> gcs4) {
            gcs.accept(this);
        }

        public final <R_> R_ a(gct<c, R_> gct, gct<b, R_> gct2, gct<d, R_> gct3, gct<a, R_> gct4) {
            return gct.apply(this);
        }
    }

    /* renamed from: mph$d */
    public static final class d extends mph {
        public final String a;
        private final int b;

        public d(String str, int i) {
            this.a = (String) gcr.a(str);
            this.b = i;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return dVar.b == this.b && dVar.a.equals(this.a);
        }

        public final int hashCode() {
            return ((this.a.hashCode() + 0) * 31) + Integer.valueOf(this.b).hashCode();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("StoryViewAll{type=");
            sb.append(this.a);
            sb.append(", resId=");
            sb.append(this.b);
            sb.append('}');
            return sb.toString();
        }

        public final void a(gcs<c> gcs, gcs<b> gcs2, gcs<d> gcs3, gcs<a> gcs4) {
            gcs3.accept(this);
        }

        public final <R_> R_ a(gct<c, R_> gct, gct<b, R_> gct2, gct<d, R_> gct3, gct<a, R_> gct4) {
            return gct3.apply(this);
        }
    }

    public abstract <R_> R_ a(gct<c, R_> gct, gct<b, R_> gct2, gct<d, R_> gct3, gct<a, R_> gct4);

    public abstract void a(gcs<c> gcs, gcs<b> gcs2, gcs<d> gcs3, gcs<a> gcs4);

    mph() {
    }
}
