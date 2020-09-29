package defpackage;

import android.database.Cursor;
import rx.exceptions.OnErrorThrowable;

/* renamed from: hdz reason: default package */
public final class hdz<T> implements b<T, c> {
    /* access modifiers changed from: private */
    public final wut<Cursor, T> a;
    /* access modifiers changed from: private */
    public final boolean b = true;
    /* access modifiers changed from: private */
    public final T c;

    public final /* synthetic */ Object call(Object obj) {
        final wuj wuj = (wuj) obj;
        return new wuj<c>(wuj) {
            public final /* synthetic */ void onNext(Object obj) {
                Cursor cursor;
                c cVar = (c) obj;
                Object obj2 = null;
                try {
                    cursor = (Cursor) fay.a(cVar.a());
                    boolean z = true;
                    if (cursor.moveToFirst()) {
                        z = false;
                        obj2 = hdz.this.a.call(cursor);
                        if (obj2 == null) {
                            throw new NullPointerException("Mapper returned null for row 1");
                        }
                    }
                    cursor.close();
                    if (!wuj.isUnsubscribed()) {
                        if (!z) {
                            wuj.onNext(obj2);
                        } else if (hdz.this.b) {
                            wuj.onNext(hdz.this.c);
                        }
                    }
                } catch (RuntimeException e) {
                    wul.b(e);
                    onError(OnErrorThrowable.a(e, cVar.toString()));
                } catch (Throwable th) {
                    cursor.close();
                    throw th;
                }
            }

            public final void onError(Throwable th) {
                wuj.onError(th);
            }

            public final void onCompleted() {
                wuj.onCompleted();
            }
        };
    }

    hdz(wut<Cursor, T> wut, boolean z, T t) {
        this.a = wut;
        this.c = t;
    }

    public static <T> c<c, T> a(final wut<Cursor, T> wut, final T t) {
        return new c<c, T>() {
            public final /* synthetic */ Object call(Object obj) {
                return ((wud) obj).a((b<? extends R, ? super T>) new hdz<Object,Object>(wut, true, t));
            }
        };
    }
}
