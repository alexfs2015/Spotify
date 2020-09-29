package defpackage;

import com.google.common.base.Optional;
import com.spotify.cosmos.router.Response;
import io.reactivex.functions.Consumer;

/* renamed from: -$$Lambda$ozn$7Kn_NIst5doNmkL8lOJOorVKrK4 reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$ozn$7Kn_NIst5doNmkL8lOJOorVKrK4 implements Consumer {
    private final /* synthetic */ ozn f$0;
    private final /* synthetic */ Optional f$1;

    public /* synthetic */ $$Lambda$ozn$7Kn_NIst5doNmkL8lOJOorVKrK4(ozn ozn, Optional optional) {
        this.f$0 = ozn;
        this.f$1 = optional;
    }

    public final void accept(Object obj) {
        this.f$0.a(this.f$1, (Response) obj);
    }
}
