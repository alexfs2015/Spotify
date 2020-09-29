package defpackage;

import com.google.common.collect.ImmutableList;
import com.spotify.music.features.profile.model.LoadingState;
import com.spotify.music.features.profile.model.ProfileListItem;

/* renamed from: prc reason: default package */
abstract class prc extends prg {
    final LoadingState a;
    final ImmutableList<ProfileListItem> b;

    /* renamed from: prc$a */
    static final class a extends defpackage.prg.a {
        private LoadingState a;
        private ImmutableList<ProfileListItem> b;

        a() {
        }

        private a(prg prg) {
            this.a = prg.a();
            this.b = prg.b();
        }

        /* synthetic */ a(prg prg, byte b2) {
            this(prg);
        }

        public final defpackage.prg.a a(ImmutableList<ProfileListItem> immutableList) {
            if (immutableList != null) {
                this.b = immutableList;
                return this;
            }
            throw new NullPointerException("Null items");
        }

        public final defpackage.prg.a a(LoadingState loadingState) {
            if (loadingState != null) {
                this.a = loadingState;
                return this;
            }
            throw new NullPointerException("Null loadingState");
        }

        public final prg a() {
            String str = "";
            if (this.a == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" loadingState");
                str = sb.toString();
            }
            if (this.b == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(" items");
                str = sb2.toString();
            }
            if (str.isEmpty()) {
                return new pre(this.a, this.b);
            }
            StringBuilder sb3 = new StringBuilder("Missing required properties:");
            sb3.append(str);
            throw new IllegalStateException(sb3.toString());
        }
    }

    prc(LoadingState loadingState, ImmutableList<ProfileListItem> immutableList) {
        if (loadingState != null) {
            this.a = loadingState;
            if (immutableList != null) {
                this.b = immutableList;
                return;
            }
            throw new NullPointerException("Null items");
        }
        throw new NullPointerException("Null loadingState");
    }

    public final LoadingState a() {
        return this.a;
    }

    public final ImmutableList<ProfileListItem> b() {
        return this.b;
    }

    public final defpackage.prg.a c() {
        return new a(this, 0);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof prg) {
            prg prg = (prg) obj;
            return this.a.equals(prg.a()) && this.b.equals(prg.b());
        }
    }

    public int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ProfileListData{loadingState=");
        sb.append(this.a);
        sb.append(", items=");
        sb.append(this.b);
        sb.append("}");
        return sb.toString();
    }
}
