package defpackage;

import com.google.common.collect.ImmutableList;
import com.spotify.music.features.yourlibrary.musicpages.recsloader.RecsTrack;

/* renamed from: rhl reason: default package */
public abstract class rhl {

    /* renamed from: rhl$a */
    public static final class a extends rhl {
        public final ImmutableList<RecsTrack> a;
        public final String b;

        a(ImmutableList<RecsTrack> immutableList, String str) {
            this.a = (ImmutableList) gec.a(immutableList);
            this.b = (String) gec.a(str);
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
            sb.append("DecorateRecs{recsTracks=");
            sb.append(this.a);
            sb.append(", contextUri=");
            sb.append(this.b);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: rhl$b */
    public static final class b extends rhl {
        public final int a;
        public final ImmutableList<String> b;
        public final ImmutableList<String> c;

        b(int i, ImmutableList<String> immutableList, ImmutableList<String> immutableList2) {
            this.a = i;
            this.b = (ImmutableList) gec.a(immutableList);
            this.c = (ImmutableList) gec.a(immutableList2);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return bVar.a == this.a && bVar.b.equals(this.b) && bVar.c.equals(this.c);
        }

        public final int hashCode() {
            return ((((Integer.valueOf(this.a).hashCode() + 0) * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("RequestRecs{count=");
            sb.append(this.a);
            sb.append(", trackUris=");
            sb.append(this.b);
            sb.append(", skipUris=");
            sb.append(this.c);
            sb.append('}');
            return sb.toString();
        }
    }

    rhl() {
    }

    public static rhl a(int i, ImmutableList<String> immutableList, ImmutableList<String> immutableList2) {
        return new b(50, immutableList, immutableList2);
    }
}
