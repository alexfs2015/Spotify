package defpackage;

import android.os.SystemClock;
import android.util.Pair;
import com.google.protobuf.ByteString;
import com.spotify.contexts.MonotonicClock;

/* renamed from: gfb reason: default package */
final class gfb implements gex {
    private final gfd a;
    private final gfc b;

    public final String a() {
        return "context_monotonic_clock";
    }

    public /* synthetic */ Pair<String, ByteString> c() {
        return CC.$default$c(this);
    }

    gfb(gfd gfd, gfc gfc) {
        this.a = gfd;
        this.b = gfc;
    }

    public final fko b() {
        return MonotonicClock.k().a((long) this.b.a()).b(SystemClock.elapsedRealtime()).g();
    }
}
