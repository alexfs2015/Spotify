package defpackage;

import android.os.SystemClock;
import android.util.Pair;
import com.google.protobuf.ByteString;
import com.spotify.contexts.MonotonicClock;

/* renamed from: ggm reason: default package */
final class ggm implements ggi {
    private final ggo a;
    private final ggn b;

    ggm(ggo ggo, ggn ggn) {
        this.a = ggo;
        this.b = ggn;
    }

    public final String a() {
        return "context_monotonic_clock";
    }

    public final fli b() {
        return MonotonicClock.k().a((long) this.b.a()).b(SystemClock.elapsedRealtime()).g();
    }

    public /* synthetic */ Pair<String, ByteString> c() {
        return CC.$default$c(this);
    }
}
