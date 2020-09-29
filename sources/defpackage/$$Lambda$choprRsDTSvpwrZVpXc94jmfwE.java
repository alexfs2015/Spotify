package defpackage;

import io.reactivex.functions.Consumer;
import io.reactivex.subjects.CompletableSubject;

/* renamed from: -$$Lambda$choprRsDTSvpwrZVpX-c94jmfwE reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$choprRsDTSvpwrZVpXc94jmfwE implements Consumer {
    private final /* synthetic */ CompletableSubject f$0;

    public /* synthetic */ $$Lambda$choprRsDTSvpwrZVpXc94jmfwE(CompletableSubject completableSubject) {
        this.f$0 = completableSubject;
    }

    public final void accept(Object obj) {
        this.f$0.onError((Throwable) obj);
    }
}
