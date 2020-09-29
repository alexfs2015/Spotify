package defpackage;

import com.spotify.mobile.android.spotlets.collection.util.AlbumCollectionState;

/* renamed from: isy reason: default package */
public final class isy implements tsy {
    public final String a;
    public final vli b;
    private final boolean c;
    private final vli d;

    public isy(String str, AlbumCollectionState albumCollectionState, vli vli, vli vli2) {
        this.a = str;
        this.c = albumCollectionState != AlbumCollectionState.YES;
        this.d = vli;
        this.b = vli2;
    }

    public final vli a() {
        return this.d;
    }

    public final boolean b() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof isy)) {
            return false;
        }
        isy isy = (isy) obj;
        return this.d == isy.d && this.c == isy.c && this.b == isy.b;
    }

    public final int hashCode() {
        return (((this.d.hashCode() * 31) + this.b.hashCode()) * 31) + (this.c ? 1 : 0);
    }
}
