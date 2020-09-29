package defpackage;

import com.google.android.exoplayer2.upstream.cache.Cache;
import com.spotify.mobile.android.util.Assertion;
import java.io.File;

/* renamed from: kao reason: default package */
public final class kao {
    final Cache a;

    public kao(File file, long j) {
        if (bdj.b(file)) {
            Assertion.b("Video Cache folder is locked");
            bdj.b();
        }
        this.a = new bdj(file, new bdi(50000000));
    }
}
