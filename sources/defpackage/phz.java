package defpackage;

import com.google.common.base.Optional;

/* renamed from: phz reason: default package */
public abstract class phz {

    /* renamed from: phz$a */
    public static final class a extends phz {
        public final String a;

        a(String str) {
            this.a = str;
        }

        public final void a(ged<b> ged, ged<a> ged2, ged<c> ged3) {
            ged2.accept(this);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            return gec.a(((a) obj).a, this.a);
        }

        public final int hashCode() {
            String str = this.a;
            return (str != null ? str.hashCode() : 0) + 0;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Failure{message=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: phz$b */
    public static final class b extends phz {
        public final void a(ged<b> ged, ged<a> ged2, ged<c> ged3) {
            ged.accept(this);
        }

        public final boolean equals(Object obj) {
            return obj instanceof b;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "Loading{}";
        }
    }

    /* renamed from: phz$c */
    public static final class c extends phz {
        public final vkv a;
        public final Optional<hcs> b;
        public final Optional<hcs> c;

        c(vkv vkv, Optional<hcs> optional, Optional<hcs> optional2) {
            this.a = (vkv) gec.a(vkv);
            this.b = (Optional) gec.a(optional);
            this.c = (Optional) gec.a(optional2);
        }

        public final void a(ged<b> ged, ged<a> ged2, ged<c> ged3) {
            ged3.accept(this);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return cVar.a.equals(this.a) && cVar.b.equals(this.b) && cVar.c.equals(this.c);
        }

        public final int hashCode() {
            return ((((this.a.hashCode() + 0) * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Success{episode=");
            sb.append(this.a);
            sb.append(", episodeRecommendationsHubsViewModel=");
            sb.append(this.b);
            sb.append(", featuredContentHubsViewModel=");
            sb.append(this.c);
            sb.append('}');
            return sb.toString();
        }
    }

    phz() {
    }

    public static phz a(String str) {
        return new a(str);
    }

    public static phz a(vkv vkv, Optional<hcs> optional, Optional<hcs> optional2) {
        return new c(vkv, optional, optional2);
    }

    public abstract void a(ged<b> ged, ged<a> ged2, ged<c> ged3);
}
