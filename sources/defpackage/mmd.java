package defpackage;

import com.spotify.music.R;
import com.spotify.music.connection.OfflineState;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import io.reactivex.disposables.Disposables;
import io.reactivex.functions.Consumer;
import java.util.List;

/* renamed from: mmd reason: default package */
public final class mmd {
    public Disposable a = Disposables.b();
    public Disposable b = Disposables.b();
    public int c;
    public a d;
    private final mlv e;
    private final ura f;
    private final Scheduler g;
    private boolean h;
    private boolean i;

    /* renamed from: mmd$a */
    public interface a {
        void onUpdate();
    }

    public mmd(mlv mlv, ura ura, Scheduler scheduler) {
        this.e = mlv;
        this.f = ura;
        this.g = scheduler;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(OfflineState offlineState) {
        this.h = offlineState.offline();
        b();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(List list) {
        this.i = list.size() > 0;
        if (list.size() == 1) {
            this.i = !((gtz) list.get(0)).isSelf();
        }
        b();
    }

    private void b() {
        this.c = 0;
        if (this.h) {
            this.c = R.string.connect_picker_no_internet;
        } else if (!this.i) {
            this.c = R.string.connect_picker_no_device;
        }
        a aVar = this.d;
        if (aVar != null) {
            aVar.onUpdate();
        }
    }

    public final void a() {
        this.a = this.f.a.a((Consumer<? super T>) new $$Lambda$mmd$DsjYGyUB2VtgjUiJuqLLq8dmzCU<Object>(this), (Consumer<? super Throwable>) $$Lambda$mmd$OqKBwtPr8Bw4vkB18UvG5mRazgg.INSTANCE);
        this.b = this.e.a().a(this.g).a((Consumer<? super T>) new $$Lambda$mmd$d_7NyeLjTIa0Hbm0KOtlVDeI<Object>(this), (Consumer<? super Throwable>) $$Lambda$mmd$bSdzIom2d8ga2xsel7rlpIH29y8.INSTANCE);
    }
}
