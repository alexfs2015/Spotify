package defpackage;

import com.google.common.base.Optional;
import com.spotify.cosmos.router.Response;
import io.reactivex.functions.Consumer;

/* renamed from: -$$Lambda$pgw$Z3K-CElkj6hN9bZGa7II1WCK6v8 reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$pgw$Z3KCElkj6hN9bZGa7II1WCK6v8 implements Consumer {
    private final /* synthetic */ pgw f$0;
    private final /* synthetic */ Optional f$1;

    public /* synthetic */ $$Lambda$pgw$Z3KCElkj6hN9bZGa7II1WCK6v8(pgw pgw, Optional optional) {
        this.f$0 = pgw;
        this.f$1 = optional;
    }

    public final void accept(Object obj) {
        this.f$0.a(this.f$1, (Response) obj);
    }
}
