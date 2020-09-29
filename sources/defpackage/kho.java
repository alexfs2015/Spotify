package defpackage;

import com.google.android.exoplayer2.ExoPlaybackException;
import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.functions.Cancellable;

/* renamed from: kho reason: default package */
public final class kho {
    public static Observable<khi> a(aqq aqq, jtz jtz) {
        return Observable.a((ObservableOnSubscribe<T>) new $$Lambda$kho$2Qpt22_nyE5HP7b1XUTMVuPLqF4<T>(jtz, aqq));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(final jtz jtz, aqq aqq, final ObservableEmitter observableEmitter) {
        AnonymousClass1 r0 = new a() {
            public /* synthetic */ void a() {
                CC.$default$a(this);
            }

            public /* synthetic */ void a(arc arc) {
                CC.$default$a((a) this, arc);
            }

            public /* synthetic */ void a(arl arl, int i) {
                CC.$default$a((a) this, arl, i);
            }

            public /* synthetic */ void a(ayo ayo, bbv bbv) {
                CC.$default$a((a) this, ayo, bbv);
            }

            public /* synthetic */ void a(ExoPlaybackException exoPlaybackException) {
                CC.$default$a((a) this, exoPlaybackException);
            }

            public /* synthetic */ void a(boolean z) {
                CC.$default$a((a) this, z);
            }

            public final void a(boolean z, int i) {
                if (i == 3) {
                    observableEmitter.a(new d(jtz.c()));
                }
            }

            public /* synthetic */ void a_(int i) {
                CC.$default$a_(this, i);
            }

            public /* synthetic */ void b(int i) {
                CC.$default$b(this, i);
            }
        };
        aqq.a((a) r0);
        observableEmitter.a((Cancellable) new $$Lambda$kho$AvLNnFj2MhGAYUIEOiUOYBd5NE(aqq, r0));
    }
}
