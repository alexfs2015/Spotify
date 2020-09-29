package defpackage;

import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;

/* renamed from: -$$Lambda$qvb$e6iKh3MP6fjxF4RjcwCRWtsQgK4 reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$qvb$e6iKh3MP6fjxF4RjcwCRWtsQgK4 implements Consumer {
    private final /* synthetic */ qvb f$0;
    private final /* synthetic */ Observable f$1;

    public /* synthetic */ $$Lambda$qvb$e6iKh3MP6fjxF4RjcwCRWtsQgK4(qvb qvb, Observable observable) {
        this.f$0 = qvb;
        this.f$1 = observable;
    }

    public final void accept(Object obj) {
        this.f$0.a(this.f$1, (Disposable) obj);
    }
}
