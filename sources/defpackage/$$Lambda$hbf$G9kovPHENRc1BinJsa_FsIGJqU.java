package defpackage;

import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;

/* renamed from: -$$Lambda$hbf$G-9kovPHENRc1BinJsa_FsIGJqU reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$hbf$G9kovPHENRc1BinJsa_FsIGJqU implements Consumer {
    private final /* synthetic */ hbf f$0;
    private final /* synthetic */ a f$1;
    private final /* synthetic */ Observable f$2;

    public /* synthetic */ $$Lambda$hbf$G9kovPHENRc1BinJsa_FsIGJqU(hbf hbf, a aVar, Observable observable) {
        this.f$0 = hbf;
        this.f$1 = aVar;
        this.f$2 = observable;
    }

    public final void accept(Object obj) {
        this.f$0.a(this.f$1, this.f$2, (Disposable) obj);
    }
}
