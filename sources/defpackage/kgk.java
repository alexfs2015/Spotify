package defpackage;

/* renamed from: kgk reason: default package */
public abstract class kgk {

    /* renamed from: kgk$a */
    public static final class a extends kgk {
        final kfp a;
        final int b;

        public a(kfp kfp, int i) {
            this.a = (kfp) gec.a(kfp);
            this.b = i;
        }

        public final <R_> R_ a(gee<b, R_> gee, gee<a, R_> gee2, gee<c, R_> gee3) {
            return gee2.apply(this);
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
    }

    /* renamed from: kgk$b */
    public static final class b extends kgk {
        final kfp a;
        final kfp b;
        final kgd c;
        final int d;

        b(kfp kfp, kfp kfp2, kgd kgd, int i) {
            this.a = (kfp) gec.a(kfp);
            this.b = (kfp) gec.a(kfp2);
            this.c = (kgd) gec.a(kgd);
            this.d = i;
        }

        public final <R_> R_ a(gee<b, R_> gee, gee<a, R_> gee2, gee<c, R_> gee3) {
            return gee.apply(this);
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
    }

    /* renamed from: kgk$c */
    public static final class c extends kgk {
        final kfp a;
        final int b;

        public c(kfp kfp, int i) {
            this.a = (kfp) gec.a(kfp);
            this.b = i;
        }

        public final <R_> R_ a(gee<b, R_> gee, gee<a, R_> gee2, gee<c, R_> gee3) {
            return gee3.apply(this);
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
    }

    kgk() {
    }

    public static kgk a(kfp kfp, kfp kfp2, kgd kgd, int i) {
        return new b(kfp, kfp2, kgd, i);
    }

    public abstract <R_> R_ a(gee<b, R_> gee, gee<a, R_> gee2, gee<c, R_> gee3);
}
