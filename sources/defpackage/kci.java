package defpackage;

import com.google.common.base.Optional;
import com.spotify.mobile.android.video.tracking.VideoSurfaceState;
import java.util.Comparator;

/* renamed from: kci reason: default package */
public final class kci {
    static final Comparator<kci> a = $$Lambda$kci$EEDM4K6_OqzdRQB1Tq3o74NDvM.INSTANCE;
    final long b;
    final VideoSurfaceState c;
    final String d;
    final float e;
    private final long f;

    /* access modifiers changed from: private */
    public static /* synthetic */ int a(kci kci, kci kci2) {
        long j = kci.b;
        long j2 = kci2.b;
        if (j < j2) {
            return -1;
        }
        return j == j2 ? 0 : 1;
    }

    public kci(long j, float f2, VideoSurfaceState videoSurfaceState, String str) {
        this(j, -1, f2, videoSurfaceState, str);
    }

    private kci(long j, long j2, float f2, VideoSurfaceState videoSurfaceState, String str) {
        this.b = j;
        this.f = j2;
        this.e = f2;
        this.c = videoSurfaceState;
        this.d = str;
    }

    public final kci a(long j) {
        kci kci = new kci(this.b, j, this.e, this.c, this.d);
        return kci;
    }

    public final Optional<Long> a() {
        if (c()) {
            return Optional.b(Long.valueOf(this.f - this.b));
        }
        return Optional.e();
    }

    public final long b() {
        if (this.e > 0.0f) {
            return (long) (((float) ((Long) a().a(Long.valueOf(0))).longValue()) / this.e);
        }
        return 0;
    }

    public final boolean c() {
        return this.f != -1;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Range{mStart=");
        sb.append(this.b);
        sb.append(", mEnd=");
        sb.append(this.f);
        sb.append(", mSurfaceState=");
        sb.append(this.c);
        sb.append(", length=");
        sb.append(a());
        sb.append('}');
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kci)) {
            return false;
        }
        kci kci = (kci) obj;
        return this.b == kci.b && this.f == kci.f && this.c == kci.c;
    }

    public final int hashCode() {
        long j = this.b;
        int i = ((int) (j ^ (j >>> 32))) * 31;
        long j2 = this.f;
        int i2 = (i + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        VideoSurfaceState videoSurfaceState = this.c;
        return i2 + (videoSurfaceState != null ? videoSurfaceState.hashCode() : 0);
    }
}
