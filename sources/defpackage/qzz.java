package defpackage;

import com.spotify.music.yourlibrary.interfaces.YourLibraryPageId;
import io.reactivex.subjects.BehaviorSubject;
import io.reactivex.subjects.PublishSubject;

/* renamed from: qzz reason: default package */
public final class qzz implements knw<vbz> {
    public final PublishSubject<rak> a = PublishSubject.a();
    final BehaviorSubject<vbz> b = BehaviorSubject.a(vbz.d);
    public final PublishSubject<rmb> c = PublishSubject.a();
    /* access modifiers changed from: private */
    public final rah d;

    public qzz(rah rah) {
        this.d = rah;
    }

    public final void a(YourLibraryPageId yourLibraryPageId, boolean z) {
        this.a.onNext(new c(yourLibraryPageId, true));
    }

    /* renamed from: a */
    public final void accept(vbz vbz) {
        this.b.onNext(vbz);
    }
}
