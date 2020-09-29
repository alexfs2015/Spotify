package defpackage;

import com.spotify.music.yourlibrary.interfaces.YourLibraryPageId;
import io.reactivex.subjects.BehaviorSubject;
import io.reactivex.subjects.PublishSubject;

/* renamed from: qrk reason: default package */
public final class qrk implements kkn<uqu> {
    public final PublishSubject<qrv> a = PublishSubject.a();
    final BehaviorSubject<uqu> b = BehaviorSubject.a(uqu.d);
    public final PublishSubject<rdd> c = PublishSubject.a();
    /* access modifiers changed from: private */
    public final qrs d;

    public qrk(qrs qrs) {
        this.d = qrs;
    }

    /* renamed from: a */
    public final void accept(uqu uqu) {
        this.b.onNext(uqu);
    }

    public final void a(YourLibraryPageId yourLibraryPageId, boolean z) {
        this.a.onNext(new c(yourLibraryPageId, true));
    }
}
