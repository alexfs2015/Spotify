package defpackage;

import com.spotify.music.features.yourlibrary.musicpages.item.MusicItem.d;
import java.util.List;

/* renamed from: rfy reason: default package */
public abstract class rfy extends d {
    final List<rfs> a;

    /* renamed from: rfy$a */
    public static final class a extends com.spotify.music.features.yourlibrary.musicpages.item.MusicItem.d.a {
        private List<rfs> a;

        public final com.spotify.music.features.yourlibrary.musicpages.item.MusicItem.d.a a(List<rfs> list) {
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
                return new rgc(this.a);
            }
            StringBuilder sb2 = new StringBuilder("Missing required properties:");
            sb2.append(str);
            throw new IllegalStateException(sb2.toString());
        }
    }

    rfy(List<rfs> list) {
        if (list != null) {
            this.a = list;
            return;
        }
        throw new NullPointerException("Null activeFilters");
    }

    public final List<rfs> a() {
        return this.a;
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

    public String toString() {
        StringBuilder sb = new StringBuilder("FilterIndicatorExtras{activeFilters=");
        sb.append(this.a);
        sb.append("}");
        return sb.toString();
    }
}
