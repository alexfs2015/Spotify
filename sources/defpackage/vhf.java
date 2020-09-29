package defpackage;

import com.google.common.collect.ImmutableSet;
import com.squareup.picasso.Downloader;
import com.squareup.picasso.Downloader.a;
import com.squareup.picasso.Picasso.LoadedFrom;

/* renamed from: vhf reason: default package */
public final class vhf extends wgs {
    private static final ImmutableSet<String> a = ImmutableSet.a("content", "file", "android.resource");
    private final vhe b;
    private final Downloader c;

    public vhf(vhe vhe, Downloader downloader) {
        this.b = vhe;
        this.c = downloader;
    }

    public final a a(wgq wgq, int i) {
        a a2 = this.b.a(wgq.d, i);
        if (a2 != null) {
            return new a(a2.a, LoadedFrom.DISK);
        }
        String scheme = wgq.d.getScheme();
        a a3 = "http".equals(scheme) || "https".equals(scheme) ? this.c.a(wgq.d, i) : null;
        if (a3 == null) {
            return null;
        }
        return new a(a3.a, LoadedFrom.DISK);
    }

    public final boolean a(wgq wgq) {
        return !a.contains(wgq.d.getScheme());
    }
}
