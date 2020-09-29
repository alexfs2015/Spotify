package defpackage;

import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol.Rating;
import com.spotify.music.spotlets.radio.model.ThumbState;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;

/* renamed from: imm reason: default package */
public final class imm extends ims {
    private ThumbState c;
    private Disposable d;
    private final Scheduler e;

    public imm(hpt hpt, a aVar, Scheduler scheduler) {
        super(hpt, aVar);
        this.e = scheduler;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Throwable th) {
        this.c = null;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(usi usi) {
        ThumbState b = usi.b();
        ThumbState thumbState = this.c;
        if (thumbState == null || thumbState != b) {
            this.c = b;
            a((Object) new Rating(b));
        }
    }

    /* access modifiers changed from: protected */
    public final void a() {
        this.d = wit.b(this.b.e().a()).a(this.e).a((Consumer<? super T>) new $$Lambda$imm$GrF0TnD0ZiX3dYc19cKwGBmoPmo<Object>(this), (Consumer<? super Throwable>) new $$Lambda$imm$Cc6SKKas78fhBVo_C7P7tId790I<Object>(this));
    }

    public final void a(iln iln, int i) {
        a((Object) new Rating(this.c));
    }

    /* access modifiers changed from: protected */
    public final void b() {
        Disposable disposable = this.d;
        if (disposable != null && !disposable.b()) {
            this.d.bd_();
        }
    }
}
