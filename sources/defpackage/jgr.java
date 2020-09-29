package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import io.reactivex.Flowable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;

/* renamed from: jgr reason: default package */
public final class jgr {
    public final String a = hoq.e();
    public final hou b;
    public boolean c;
    private final rqi d;
    private final Flowable<PlayerState> e;
    private final hnc f;
    private Disposable g;

    jgr(hou hou, rqi rqi, Flowable<PlayerState> flowable) {
        this.b = (hou) fay.a(hou);
        this.d = (rqi) fay.a(rqi);
        this.e = flowable;
        this.f = new hnc(this.b, this.a, rqi);
    }

    public final void a() {
        if (!this.c) {
            this.b.a(this.a, 0, this.d);
            Flowable<PlayerState> flowable = this.e;
            hnc hnc = this.f;
            hnc.getClass();
            this.g = flowable.c((Consumer<? super T>) new $$Lambda$LzI9TkjpAw5qQx84CL9QLch3wFM<Object>(hnc));
            this.c = true;
        }
    }

    public final void a(boolean z) {
        if (this.c) {
            Disposable disposable = this.g;
            if (disposable != null && !disposable.b()) {
                this.g.bf_();
            }
            if (z) {
                this.f.a();
                this.b.b(this.a, 0, this.d);
            }
            this.c = false;
        }
    }
}
