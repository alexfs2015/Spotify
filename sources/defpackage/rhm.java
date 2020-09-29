package defpackage;

import com.google.common.collect.ImmutableList;
import com.spotify.music.features.yourlibrary.musicpages.item.MusicItem;
import com.spotify.music.features.yourlibrary.musicpages.recsloader.RecsTrack;

/* renamed from: rhm reason: default package */
public abstract class rhm {

    /* renamed from: rhm$a */
    public static final class a extends rhm {
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
            sb.append("ConnectedState{connected=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: rhm$b */
    public static final class b extends rhm {
        final ImmutableList<MusicItem> a;

        b(ImmutableList<MusicItem> immutableList) {
            this.a = (ImmutableList) gec.a(immutableList);
        }

        public final <R_> R_ a(gee<d, R_> gee, gee<c, R_> gee2, gee<b, R_> gee3, gee<a, R_> gee4) {
            return gee3.apply(this);
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
    }

    /* renamed from: rhm$c */
    public static final class c extends rhm {
        final ImmutableList<RecsTrack> a;

        c(ImmutableList<RecsTrack> immutableList) {
            this.a = (ImmutableList) gec.a(immutableList);
        }

        public final <R_> R_ a(gee<d, R_> gee, gee<c, R_> gee2, gee<b, R_> gee3, gee<a, R_> gee4) {
            return gee2.apply(this);
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
    }

    /* renamed from: rhm$d */
    public static final class d extends rhm {
        final ImmutableList<String> a;

        public d(ImmutableList<String> immutableList) {
            this.a = (ImmutableList) gec.a(immutableList);
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
    }

    rhm() {
    }

    public static rhm a(ImmutableList<RecsTrack> immutableList) {
        return new c(immutableList);
    }

    public static rhm b(ImmutableList<MusicItem> immutableList) {
        return new b(immutableList);
    }

    public abstract <R_> R_ a(gee<d, R_> gee, gee<c, R_> gee2, gee<b, R_> gee3, gee<a, R_> gee4);
}
