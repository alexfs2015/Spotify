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

/* renamed from: kal reason: default package */
public final class kal implements kci, xis<Emitter<List<kai>>> {
    public List<kai> a = Collections.emptyList();
    private final xii<List<kai>> b = OperatorReplay.a(xii.a((xis<Emitter<T>>) this, BackpressureMode.BUFFER), 1).e();
    private Emitter<List<kai>> c;

    /* access modifiers changed from: private */
    public void a() {
        Emitter<List<kai>> emitter = this.c;
        if (emitter != null) {
            emitter.onNext(this.a);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b() {
        this.c = null;
    }

    public final /* synthetic */ void call(Object obj) {
        Emitter<List<kai>> emitter = (Emitter) obj;
        this.c = emitter;
        a();
        emitter.a((xiw) new $$Lambda$kal$3C2ScPXZmvHsChDM1jg6gPkv5wE(this));
    }

    public final Optional<kch> createEventObserver(kaa kaa, jzx jzx, kac kac, String str, kad kad) {
        return Optional.b(new kch() {
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

            public /* synthetic */ void a(long j, long j2) {
                CC.$default$a((kch) this, j, j2);
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

            public /* synthetic */ void a(BetamaxException betamaxException, long j, long j2) {
                CC.$default$a((kch) this, betamaxException, j, j2);
            }

            public final void a(List<kai> list) {
                kal.this.a = list;
                kal.this.a();
            }

            public /* synthetic */ void a(jzr jzr, ReasonEnd reasonEnd, long j, long j2) {
                CC.$default$a(this, jzr, reasonEnd, j, j2);
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
        });
    }
}
