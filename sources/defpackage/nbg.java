package defpackage;

import com.google.common.base.Optional;
import com.jakewharton.rxrelay2.PublishRelay;
import com.spotify.mobile.android.video.VideoSurfaceView;
import com.spotify.mobile.android.video.drm.EncryptionType;
import com.spotify.mobile.android.video.events.ReasonEnd;
import com.spotify.mobile.android.video.exception.BetamaxException;
import java.util.List;

/* renamed from: nbg reason: default package */
public final class nbg implements kah, kai {
    final foa<nbb> a = PublishRelay.a();
    private jyc b;
    private long c;

    public /* synthetic */ void a() {
        CC.$default$a(this);
    }

    public /* synthetic */ void a(float f, long j, long j2) {
        CC.$default$a((kah) this, f, j, j2);
    }

    public /* synthetic */ void a(int i) {
        CC.$default$a((kah) this, i);
    }

    public /* synthetic */ void a(long j) {
        CC.$default$a((kah) this, j);
    }

    public /* synthetic */ void a(long j, long j2, long j3) {
        CC.$default$a((kah) this, j, j2, j3);
    }

    public /* synthetic */ void a(Optional<VideoSurfaceView> optional, long j, long j2) {
        CC.$default$a((kah) this, (Optional) optional, j, j2);
    }

    public /* synthetic */ void a(EncryptionType encryptionType) {
        CC.$default$a((kah) this, encryptionType);
    }

    public /* synthetic */ void a(List<jyi> list) {
        CC.$default$a((kah) this, (List) list);
    }

    public /* synthetic */ void a(jya jya, long j) {
        CC.$default$a((kah) this, jya, j);
    }

    public /* synthetic */ void a(jyi jyi, long j, long j2) {
        CC.$default$a((kah) this, jyi, j, j2);
    }

    public /* synthetic */ void a(kac kac, long j, long j2) {
        CC.$default$a((kah) this, kac, j, j2);
    }

    public /* synthetic */ void a(kam kam, long j, long j2) {
        CC.$default$a((kah) this, kam, j, j2);
    }

    public /* synthetic */ void a(boolean z, long j) {
        CC.$default$a((kah) this, z, j);
    }

    public /* synthetic */ void a(boolean z, long j, long j2) {
        CC.$default$a((kah) this, z, j, j2);
    }

    public /* synthetic */ void c(long j, long j2) {
        CC.$default$c(this, j, j2);
    }

    public /* synthetic */ void d(long j, long j2) {
        CC.$default$d(this, j, j2);
    }

    public /* synthetic */ void e(long j, long j2) {
        CC.$default$e(this, j, j2);
    }

    public final Optional<kah> a(jya jya, jxx jxx, jyc jyc, String str, jyd jyd) {
        this.b = jyc;
        return Optional.b(this);
    }

    public final void b(long j, long j2) {
        jyc jyc = this.b;
        if (jyc != null) {
            this.c = j;
            double d = (double) j;
            Double.isNaN(d);
            int ceil = (int) Math.ceil(d / 50.0d);
            long[] jArr = new long[ceil];
            int i = 0;
            while (true) {
                int i2 = ceil - 1;
                if (i < i2) {
                    jArr[i] = ((long) i) * 50;
                    i++;
                } else {
                    jArr[i2] = j;
                    jyc.a(jArr, new $$Lambda$nbg$8CRatXYi85gzSqohZE3glTZsHU(this));
                    this.b = null;
                    return;
                }
            }
        }
    }

    public final void a(jxr jxr, ReasonEnd reasonEnd, long j, long j2) {
        if (reasonEnd == ReasonEnd.PLAYED_TO_END) {
            this.a.accept(new a());
        }
    }

    public final void a(long j, long j2) {
        this.a.accept(new f());
    }

    public final void b(long j) {
        this.a.accept(new e());
    }

    public final void a(BetamaxException betamaxException, long j, long j2) {
        this.a.accept(new d(betamaxException));
    }

    public final void b(BetamaxException betamaxException, long j, long j2) {
        this.a.accept(new b(betamaxException));
    }

    /* access modifiers changed from: private */
    public void c(long j) {
        this.a.accept(new c(j, this.c));
    }
}
