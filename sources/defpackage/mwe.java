package defpackage;

import com.spotify.music.follow.FollowManager;
import com.spotify.music.follow.FollowManager.a;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Consumer;

/* renamed from: mwe reason: default package */
public final class mwe implements Consumer<b> {
    private final FollowManager a;
    private final rls b;
    private final CompositeDisposable c = new CompositeDisposable();

    public mwe(FollowManager followManager, rls rls) {
        this.a = followManager;
        this.b = rls;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(String str, a aVar) {
        this.a.a(aVar);
        if (!aVar.d) {
            this.a.a(str, true);
        }
    }

    public final /* synthetic */ void accept(Object obj) {
        String str = ((b) obj).a;
        a a2 = this.a.a(str);
        if (a2 != null) {
            if (!a2.d) {
                this.a.a(str, true);
            }
            return;
        }
        this.c.a(this.b.a(str).c(1).a((Consumer<? super T>) new $$Lambda$mwe$SvHes7m1el2PyZ71oNpF9keCo0<Object>(this, str), (Consumer<? super Throwable>) new $$Lambda$mwe$dx7oJIiAmpewpXOaEv5LgIT1Ink<Object>(str)));
    }
}
