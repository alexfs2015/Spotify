package defpackage;

import com.google.android.exoplayer2.upstream.cache.Cache;
import com.spotify.mobile.android.util.Assertion;
import java.io.File;

/* renamed from: jyo reason: default package */
public final class jyo {
    final Cache a;

    public jyo(File file, long j) {
        if (bcs.b(file)) {
            Assertion.b("Video Cache folder is locked");
            bcs.b();
        }
        this.a = new bcs(file, new bcr(50000000));
    }
}
