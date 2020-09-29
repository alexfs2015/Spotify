package defpackage;

import com.spotify.mobile.android.spotlets.collection.util.AlbumCollectionState;

/* renamed from: iql reason: default package */
public final class iql implements tig {
    public final String a;
    public final uzf b;
    private final boolean c;
    private final uzf d;

    public iql(String str, AlbumCollectionState albumCollectionState, uzf uzf, uzf uzf2) {
        this.a = str;
        this.c = albumCollectionState != AlbumCollectionState.YES;
        this.d = uzf;
        this.b = uzf2;
    }

    public final uzf a() {
        return this.d;
    }

    public final boolean b() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iql)) {
            return false;
        }
        iql iql = (iql) obj;
        return this.d == iql.d && this.c == iql.c && this.b == iql.b;
    }

    public final int hashCode() {
        return (((this.d.hashCode() * 31) + this.b.hashCode()) * 31) + (this.c ? 1 : 0);
    }
}
