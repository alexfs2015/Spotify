package defpackage;

import com.google.common.collect.ImmutableSet;
import com.squareup.picasso.Downloader;
import com.squareup.picasso.Downloader.a;
import com.squareup.picasso.Picasso.LoadedFrom;

/* renamed from: uvo reason: default package */
public final class uvo extends vsm {
    private static final ImmutableSet<String> a = ImmutableSet.a("content", "file", "android.resource");
    private final uvn b;
    private final Downloader c;

    public uvo(uvn uvn, Downloader downloader) {
        this.b = uvn;
        this.c = downloader;
    }

    public final boolean a(vsk vsk) {
        return !a.contains(vsk.d.getScheme());
    }

    public final a a(vsk vsk, int i) {
        a a2 = this.b.a(vsk.d, i);
        if (a2 != null) {
            return new a(a2.a, LoadedFrom.DISK);
        }
        String scheme = vsk.d.getScheme();
        a a3 = "http".equals(scheme) || "https".equals(scheme) ? this.c.a(vsk.d, i) : null;
        if (a3 == null) {
            return null;
        }
        return new a(a3.a, LoadedFrom.DISK);
    }
}
