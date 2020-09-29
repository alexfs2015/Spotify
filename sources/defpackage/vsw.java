package defpackage;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.database.Cursor;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.ObservableTransformer;
import io.reactivex.Scheduler;
import io.reactivex.functions.Cancellable;

/* renamed from: vsw reason: default package */
public final class vsw {
    final Handler a = new Handler(Looper.getMainLooper());
    final ContentResolver b;
    volatile boolean c;
    private final b d;
    private final Scheduler e;
    private final ObservableTransformer<c, c> f;

    vsw(ContentResolver contentResolver, b bVar, Scheduler scheduler, ObservableTransformer<c, c> observableTransformer) {
        this.b = contentResolver;
        this.d = bVar;
        this.e = scheduler;
        this.f = observableTransformer;
    }

    public final vsx a(final Uri uri, String[] strArr, String str, String[] strArr2, String str2, boolean z) {
        final Uri uri2 = uri;
        final String str3 = str;
        final AnonymousClass1 r0 = new c(null, null, null, false) {
            private /* synthetic */ String[] b;

            {
                this.b = r3;
            }

            public final Cursor a() {
                System.nanoTime();
                Cursor query = vsw.this.b.query(uri2, this.b, str3, null, null);
                boolean z = vsw.this.c;
                return query;
            }
        };
        return (vsx) Observable.a((ObservableOnSubscribe<T>) new ObservableOnSubscribe<c>(false) {
            public final void subscribe(final ObservableEmitter<c> observableEmitter) {
                final AnonymousClass1 r0 = new ContentObserver(vsw.this.a) {
                    public final void onChange(boolean z) {
                        if (!observableEmitter.b()) {
                            observableEmitter.a(r0);
                        }
                    }
                };
                vsw.this.b.registerContentObserver(uri, false, r0);
                observableEmitter.a((Cancellable) new Cancellable() {
                    public final void cancel() {
                        vsw.this.b.unregisterContentObserver(r0);
                    }
                });
                if (!observableEmitter.b()) {
                    observableEmitter.a(r0);
                }
            }
        }).a(this.e).a(this.f).i(vsx.a);
    }
}
