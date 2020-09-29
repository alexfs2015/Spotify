package defpackage;

import com.spotify.music.features.profile.model.ProfileListItem;

/* renamed from: prp reason: default package */
public abstract class prp {

    /* renamed from: prp$a */
    public static final class a extends prp {
        final prg a;

        a(prg prg) {
            this.a = (prg) gec.a(prg);
        }

        public final <R_> R_ a(gee<a, R_> gee, gee<b, R_> gee2) {
            return gee.apply(this);
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
            sb.append("DataLoaded{profileListData=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: prp$b */
    public static final class b extends prp {
        final ProfileListItem a;

        public b(ProfileListItem profileListItem) {
            this.a = (ProfileListItem) gec.a(profileListItem);
        }

        public final <R_> R_ a(gee<a, R_> gee, gee<b, R_> gee2) {
            return gee2.apply(this);
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
            sb.append("ListItemClicked{profileListItem=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }
    }

    prp() {
    }

    public static prp a(prg prg) {
        return new a(prg);
    }

    public abstract <R_> R_ a(gee<a, R_> gee, gee<b, R_> gee2);
}
