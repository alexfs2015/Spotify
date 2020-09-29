package defpackage;

/* renamed from: kei reason: default package */
public abstract class kei {

    /* renamed from: kei$a */
    public static final class a extends kei {
        final kdo a;
        final int b;

        public a(kdo kdo, int i) {
            this.a = (kdo) gcr.a(kdo);
            this.b = i;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return aVar.b == this.b && aVar.a.equals(this.a);
        }

        public final int hashCode() {
            return ((this.a.hashCode() + 0) * 31) + Integer.valueOf(this.b).hashCode();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Mute{story=");
            sb.append(this.a);
            sb.append(", storyIndex=");
            sb.append(this.b);
            sb.append('}');
            return sb.toString();
        }

        public final <R_> R_ a(gct<b, R_> gct, gct<a, R_> gct2, gct<c, R_> gct3) {
            return gct2.apply(this);
        }
    }

    /* renamed from: kei$b */
    public static final class b extends kei {
        final kdo a;
        final kdo b;
        final keb c;
        final int d;

        b(kdo kdo, kdo kdo2, keb keb, int i) {
            this.a = (kdo) gcr.a(kdo);
            this.b = (kdo) gcr.a(kdo2);
            this.c = (keb) gcr.a(keb);
            this.d = i;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return bVar.d == this.d && bVar.a.equals(this.a) && bVar.b.equals(this.b) && bVar.c.equals(this.c);
        }

        public final int hashCode() {
            return ((((((this.a.hashCode() + 0) * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + Integer.valueOf(this.d).hashCode();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("NavigateStory{currentStory=");
            sb.append(this.a);
            sb.append(", nextStory=");
            sb.append(this.b);
            sb.append(", direction=");
            sb.append(this.c);
            sb.append(", currentStoryIndex=");
            sb.append(this.d);
            sb.append('}');
            return sb.toString();
        }

        public final <R_> R_ a(gct<b, R_> gct, gct<a, R_> gct2, gct<c, R_> gct3) {
            return gct.apply(this);
        }
    }

    /* renamed from: kei$c */
    public static final class c extends kei {
        final kdo a;
        final int b;

        public c(kdo kdo, int i) {
            this.a = (kdo) gcr.a(kdo);
            this.b = i;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return cVar.b == this.b && cVar.a.equals(this.a);
        }

        public final int hashCode() {
            return ((this.a.hashCode() + 0) * 31) + Integer.valueOf(this.b).hashCode();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Unmute{story=");
            sb.append(this.a);
            sb.append(", storyIndex=");
            sb.append(this.b);
            sb.append('}');
            return sb.toString();
        }

        public final <R_> R_ a(gct<b, R_> gct, gct<a, R_> gct2, gct<c, R_> gct3) {
            return gct3.apply(this);
        }
    }

    public abstract <R_> R_ a(gct<b, R_> gct, gct<a, R_> gct2, gct<c, R_> gct3);

    kei() {
    }

    public static kei a(kdo kdo, kdo kdo2, keb keb, int i) {
        return new b(kdo, kdo2, keb, i);
    }
}
