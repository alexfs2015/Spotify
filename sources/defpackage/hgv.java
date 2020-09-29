package defpackage;

import android.database.Cursor;
import rx.exceptions.OnErrorThrowable;

/* renamed from: hgv reason: default package */
public final class hgv<T> implements b<T, c> {
    /* access modifiers changed from: private */
    public final xiy<Cursor, T> a;
    /* access modifiers changed from: private */
    public final boolean b = true;
    /* access modifiers changed from: private */
    public final T c;

    hgv(xiy<Cursor, T> xiy, boolean z, T t) {
        this.a = xiy;
        this.c = t;
    }

    public static <T> c<c, T> a(final xiy<Cursor, T> xiy, final T t) {
        return new c<c, T>() {
            public final /* synthetic */ Object call(Object obj) {
                return ((xii) obj).a((b<? extends R, ? super T>) new hgv<Object,Object>(xiy, true, t));
            }
        };
    }

    public final /* synthetic */ Object call(Object obj) {
        final xio xio = (xio) obj;
        return new xio<c>(xio) {
            public final void onCompleted() {
                xio.onCompleted();
            }

            public final void onError(Throwable th) {
                xio.onError(th);
            }

            public final /* synthetic */ void onNext(Object obj) {
                Cursor cursor;
                c cVar = (c) obj;
                Object obj2 = null;
                try {
                    cursor = (Cursor) fbp.a(cVar.a());
                    boolean z = true;
                    if (cursor.moveToFirst()) {
                        z = false;
                        obj2 = hgv.this.a.call(cursor);
                        if (obj2 == null) {
                            throw new NullPointerException("Mapper returned null for row 1");
                        }
                    }
                    cursor.close();
                    if (!xio.isUnsubscribed()) {
                        if (!z) {
                            xio.onNext(obj2);
                        } else if (hgv.this.b) {
                            xio.onNext(hgv.this.c);
                        }
                    }
                } catch (RuntimeException e) {
                    xiq.b(e);
                    onError(OnErrorThrowable.a(e, cVar.toString()));
                } catch (Throwable th) {
                    cursor.close();
                    throw th;
                }
            }
        };
    }
}
