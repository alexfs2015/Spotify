package defpackage;

import com.spotify.music.follow.FollowManager;
import com.spotify.music.follow.FollowManager.a;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Consumer;

/* renamed from: mrn reason: default package */
public final class mrn implements Consumer<b> {
    private final FollowManager a;
    private final rcu b;
    private final CompositeDisposable c = new CompositeDisposable();

    public final /* synthetic */ void accept(Object obj) {
        String str = ((b) obj).a;
        a a2 = this.a.a(str);
        if (a2 != null) {
            if (!a2.d) {
                this.a.a(str, true);
            }
            return;
        }
        this.c.a(this.b.a(str).c(1).a((Consumer<? super T>) new $$Lambda$mrn$48gCtexxA9pEEo8v0kI92vCEz4<Object>(this, str), (Consumer<? super Throwable>) new $$Lambda$mrn$esBifCOv3lBo_C_JNUWQNytMw<Object>(str)));
    }

    public mrn(FollowManager followManager, rcu rcu) {
        this.a = followManager;
        this.b = rcu;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(String str, a aVar) {
        this.a.a(aVar);
        if (!aVar.d) {
            this.a.a(str, true);
        }
    }
}
