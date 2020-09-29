package defpackage;

import com.spotify.music.features.yourlibrary.musicpages.item.MusicItem.d;
import java.util.List;

/* renamed from: qxj reason: default package */
public abstract class qxj extends d {
    final List<qxd> a;

    /* renamed from: qxj$a */
    public static final class a extends com.spotify.music.features.yourlibrary.musicpages.item.MusicItem.d.a {
        private List<qxd> a;

        public final com.spotify.music.features.yourlibrary.musicpages.item.MusicItem.d.a a(List<qxd> list) {
            if (list != null) {
                this.a = list;
                return this;
            }
            throw new NullPointerException("Null activeFilters");
        }

        public final d a() {
            String str = "";
            if (this.a == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" activeFilters");
                str = sb.toString();
            }
            if (str.isEmpty()) {
                return new qxn(this.a);
            }
            StringBuilder sb2 = new StringBuilder("Missing required properties:");
            sb2.append(str);
            throw new IllegalStateException(sb2.toString());
        }
    }

    qxj(List<qxd> list) {
        if (list != null) {
            this.a = list;
            return;
        }
        throw new NullPointerException("Null activeFilters");
    }

    public final List<qxd> a() {
        return this.a;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("FilterIndicatorExtras{activeFilters=");
        sb.append(this.a);
        sb.append("}");
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        return this.a.equals(((d) obj).a());
    }

    public int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }
}
