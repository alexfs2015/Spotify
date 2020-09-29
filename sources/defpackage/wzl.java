package defpackage;

import rx.exceptions.CompositeException;
import rx.exceptions.OnCompletedFailedException;
import rx.exceptions.OnErrorFailedException;

/* renamed from: wzl reason: default package */
public final class wzl implements wuc, wuk {
    private wuc a;
    private wuk b;
    private boolean c;

    public wzl(wuc wuc) {
        this.a = wuc;
    }

    public final void a() {
        if (!this.c) {
            this.c = true;
            try {
                this.a.a();
            } catch (Throwable th) {
                wul.b(th);
                throw new OnCompletedFailedException(th);
            }
        }
    }

    public final void a(Throwable th) {
        if (this.c) {
            wzs.a(th);
            return;
        }
        this.c = true;
        try {
            this.a.a(th);
        } catch (Throwable th2) {
            wul.b(th2);
            throw new OnErrorFailedException(new CompositeException(th, th2));
        }
    }

    public final void a(wuk wuk) {
        this.b = wuk;
        try {
            this.a.a((wuk) this);
        } catch (Throwable th) {
            wul.b(th);
            wuk.unsubscribe();
            a(th);
        }
    }

    public final void unsubscribe() {
        this.b.unsubscribe();
    }

    public final boolean isUnsubscribed() {
        return this.c || this.b.isUnsubscribed();
    }
}
