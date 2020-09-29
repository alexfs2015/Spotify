package defpackage;

import com.google.common.base.Optional;
import com.jakewharton.rxrelay2.PublishRelay;
import com.spotify.mobile.android.video.VideoSurfaceView;
import com.spotify.mobile.android.video.drm.EncryptionType;
import com.spotify.mobile.android.video.events.ReasonEnd;
import com.spotify.mobile.android.video.exception.BetamaxException;
import java.util.List;

/* renamed from: ngr reason: default package */
public final class ngr implements kch, kci {
    final fou<ngj> a = PublishRelay.a();
    private kac b;
    private long c;

    /* access modifiers changed from: private */
    public void c(long j) {
        this.a.accept(new c(j, this.c));
    }

    public /* synthetic */ void a() {
        CC.$default$a(this);
    }

    public /* synthetic */ void a(float f, long j, long j2) {
        CC.$default$a((kch) this, f, j, j2);
    }

    public /* synthetic */ void a(int i) {
        CC.$default$a((kch) this, i);
    }

    public /* synthetic */ void a(long j) {
        CC.$default$a((kch) this, j);
    }

    public final void a(long j, long j2) {
        this.a.accept(new f());
    }

    public /* synthetic */ void a(long j, long j2, long j3) {
        CC.$default$a((kch) this, j, j2, j3);
    }

    public /* synthetic */ void a(Optional<VideoSurfaceView> optional, long j, long j2) {
        CC.$default$a((kch) this, (Optional) optional, j, j2);
    }

    public /* synthetic */ void a(EncryptionType encryptionType) {
        CC.$default$a((kch) this, encryptionType);
    }

    public final void a(BetamaxException betamaxException, long j, long j2) {
        this.a.accept(new d(betamaxException));
    }

    public /* synthetic */ void a(List<kai> list) {
        CC.$default$a((kch) this, (List) list);
    }

    public final void a(jzr jzr, ReasonEnd reasonEnd, long j, long j2) {
        if (reasonEnd == ReasonEnd.PLAYED_TO_END) {
            this.a.accept(new a());
        }
    }

    public /* synthetic */ void a(kaa kaa, long j) {
        CC.$default$a((kch) this, kaa, j);
    }

    public /* synthetic */ void a(kai kai, long j, long j2) {
        CC.$default$a((kch) this, kai, j, j2);
    }

    public /* synthetic */ void a(kcc kcc, long j, long j2) {
        CC.$default$a((kch) this, kcc, j, j2);
    }

    public /* synthetic */ void a(kcm kcm, long j, long j2) {
        CC.$default$a((kch) this, kcm, j, j2);
    }

    public /* synthetic */ void a(boolean z, long j) {
        CC.$default$a((kch) this, z, j);
    }

    public /* synthetic */ void a(boolean z, long j, long j2) {
        CC.$default$a((kch) this, z, j, j2);
    }

    public final void b(long j) {
        this.a.accept(new e());
    }

    public final void b(long j, long j2) {
        kac kac = this.b;
        if (kac != null) {
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
                    kac.a(jArr, new $$Lambda$ngr$O35wtHlIv1L0oPfAitcsABrwW6g(this));
                    this.b = null;
                    return;
                }
            }
        }
    }

    public final void b(BetamaxException betamaxException, long j, long j2) {
        this.a.accept(new b(betamaxException));
    }

    public /* synthetic */ void c(long j, long j2) {
        CC.$default$c(this, j, j2);
    }

    public final Optional<kch> createEventObserver(kaa kaa, jzx jzx, kac kac, String str, kad kad) {
        this.b = kac;
        return Optional.b(this);
    }

    public /* synthetic */ void d(long j, long j2) {
        CC.$default$d(this, j, j2);
    }

    public /* synthetic */ void e(long j, long j2) {
        CC.$default$e(this, j, j2);
    }
}
