package defpackage;

import com.google.common.base.Optional;
import com.spotify.mobile.android.video.VideoSurfaceView;
import com.spotify.mobile.android.video.drm.EncryptionType;
import com.spotify.mobile.android.video.events.ReasonEnd;
import com.spotify.mobile.android.video.exception.BetamaxException;
import java.util.Collections;
import java.util.List;
import rx.Emitter;
import rx.Emitter.BackpressureMode;
import rx.internal.operators.OperatorReplay;

/* renamed from: jyl reason: default package */
public final class jyl implements kai, wun<Emitter<List<jyi>>> {
    public List<jyi> a = Collections.emptyList();
    private final wud<List<jyi>> b = OperatorReplay.a(wud.a((wun<Emitter<T>>) this, BackpressureMode.BUFFER), 1).e();
    private Emitter<List<jyi>> c;

    public final /* synthetic */ void call(Object obj) {
        Emitter<List<jyi>> emitter = (Emitter) obj;
        this.c = emitter;
        a();
        emitter.a((wur) new $$Lambda$jyl$jfcoXmSRA7xoHHDz8ETRKiPLs0(this));
    }

    public final Optional<kah> a(jya jya, jxx jxx, jyc jyc, String str, jyd jyd) {
        return Optional.b(new kah() {
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

            public /* synthetic */ void a(long j, long j2) {
                CC.$default$a((kah) this, j, j2);
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

            public /* synthetic */ void a(BetamaxException betamaxException, long j, long j2) {
                CC.$default$a((kah) this, betamaxException, j, j2);
            }

            public /* synthetic */ void a(jxr jxr, ReasonEnd reasonEnd, long j, long j2) {
                CC.$default$a(this, jxr, reasonEnd, j, j2);
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

            public /* synthetic */ void b(long j) {
                CC.$default$b(this, j);
            }

            public /* synthetic */ void b(long j, long j2) {
                CC.$default$b(this, j, j2);
            }

            public /* synthetic */ void b(BetamaxException betamaxException, long j, long j2) {
                CC.$default$b(this, betamaxException, j, j2);
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

            public final void a(List<jyi> list) {
                jyl.this.a = list;
                jyl.this.a();
            }
        });
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b() {
        this.c = null;
    }

    /* access modifiers changed from: private */
    public void a() {
        Emitter<List<jyi>> emitter = this.c;
        if (emitter != null) {
            emitter.onNext(this.a);
        }
    }
}
