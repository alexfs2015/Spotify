package defpackage;

import com.google.common.collect.ImmutableList;
import com.spotify.music.features.yourlibrary.musicpages.item.MusicItem;
import com.spotify.music.features.yourlibrary.musicpages.recsloader.RecsTrack;

/* renamed from: qyx reason: default package */
public abstract class qyx {

    /* renamed from: qyx$a */
    public static final class a extends qyx {
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
            sb.append("ConnectedState{connected=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }

        public final <R_> R_ a(gct<d, R_> gct, gct<c, R_> gct2, gct<b, R_> gct3, gct<a, R_> gct4) {
            return gct4.apply(this);
        }
    }

    /* renamed from: qyx$b */
    public static final class b extends qyx {
        final ImmutableList<MusicItem> a;

        b(ImmutableList<MusicItem> immutableList) {
            this.a = (ImmutableList) gcr.a(immutableList);
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
            sb.append("DecoratedRecsReceived{decoratedRecs=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }

        public final <R_> R_ a(gct<d, R_> gct, gct<c, R_> gct2, gct<b, R_> gct3, gct<a, R_> gct4) {
            return gct3.apply(this);
        }
    }

    /* renamed from: qyx$c */
    public static final class c extends qyx {
        final ImmutableList<RecsTrack> a;

        c(ImmutableList<RecsTrack> immutableList) {
            this.a = (ImmutableList) gcr.a(immutableList);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            return ((c) obj).a.equals(this.a);
        }

        public final int hashCode() {
            return this.a.hashCode() + 0;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("RawRecsReceived{recsTracks=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }

        public final <R_> R_ a(gct<d, R_> gct, gct<c, R_> gct2, gct<b, R_> gct3, gct<a, R_> gct4) {
            return gct2.apply(this);
        }
    }

    /* renamed from: qyx$d */
    public static final class d extends qyx {
        final ImmutableList<String> a;

        public d(ImmutableList<String> immutableList) {
            this.a = (ImmutableList) gcr.a(immutableList);
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
            sb.append("SourceTracksUpdated{trackUris=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }

        public final <R_> R_ a(gct<d, R_> gct, gct<c, R_> gct2, gct<b, R_> gct3, gct<a, R_> gct4) {
            return gct.apply(this);
        }
    }

    public abstract <R_> R_ a(gct<d, R_> gct, gct<c, R_> gct2, gct<b, R_> gct3, gct<a, R_> gct4);

    qyx() {
    }

    public static qyx a(ImmutableList<RecsTrack> immutableList) {
        return new c(immutableList);
    }

    public static qyx b(ImmutableList<MusicItem> immutableList) {
        return new b(immutableList);
    }
}
