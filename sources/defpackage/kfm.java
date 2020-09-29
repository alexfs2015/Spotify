package defpackage;

import com.google.android.exoplayer2.ExoPlaybackException;
import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.functions.Cancellable;

/* renamed from: kfm reason: default package */
public final class kfm {
    public static Observable<kfg> a(apz apz, jrp jrp) {
        return Observable.a((ObservableOnSubscribe<T>) new $$Lambda$kfm$loQjEduiCfK5lOJNqPIfhLWAs0s<T>(jrp, apz));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(final jrp jrp, apz apz, final ObservableEmitter observableEmitter) {
        AnonymousClass1 r0 = new a() {
            public /* synthetic */ void a() {
                CC.$default$a(this);
            }

            public /* synthetic */ void a(aql aql) {
                CC.$default$a((a) this, aql);
            }

            public /* synthetic */ void a(aqu aqu, int i) {
                CC.$default$a((a) this, aqu, i);
            }

            public /* synthetic */ void a(axx axx, bbe bbe) {
                CC.$default$a((a) this, axx, bbe);
            }

            public /* synthetic */ void a(ExoPlaybackException exoPlaybackException) {
                CC.$default$a((a) this, exoPlaybackException);
            }

            public /* synthetic */ void a(boolean z) {
                CC.$default$a((a) this, z);
            }

            public /* synthetic */ void a_(int i) {
                CC.$default$a_(this, i);
            }

            public /* synthetic */ void b(int i) {
                CC.$default$b(this, i);
            }

            public final void a(boolean z, int i) {
                if (i == 3) {
                    observableEmitter.a(new d(jrp.c()));
                }
            }
        };
        apz.a((a) r0);
        observableEmitter.a((Cancellable) new $$Lambda$kfm$KLIUrcJvmoMQ47vFftcVKtL518(apz, r0));
    }
}
