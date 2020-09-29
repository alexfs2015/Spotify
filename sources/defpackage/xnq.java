package defpackage;

import rx.exceptions.CompositeException;
import rx.exceptions.OnCompletedFailedException;
import rx.exceptions.OnErrorFailedException;

/* renamed from: xnq reason: default package */
public final class xnq implements xih, xip {
    private xih a;
    private xip b;
    private boolean c;

    public xnq(xih xih) {
        this.a = xih;
    }

    public final void a() {
        if (!this.c) {
            this.c = true;
            try {
                this.a.a();
            } catch (Throwable th) {
                xiq.b(th);
                throw new OnCompletedFailedException(th);
            }
        }
    }

    public final void a(Throwable th) {
        if (this.c) {
            xnx.a(th);
            return;
        }
        this.c = true;
        try {
            this.a.a(th);
        } catch (Throwable th2) {
            xiq.b(th2);
            throw new OnErrorFailedException(new CompositeException(th, th2));
        }
    }

    public final void a(xip xip) {
        this.b = xip;
        try {
            this.a.a((xip) this);
        } catch (Throwable th) {
            xiq.b(th);
            xip.unsubscribe();
            a(th);
        }
    }

    public final boolean isUnsubscribed() {
        return this.c || this.b.isUnsubscribed();
    }

    public final void unsubscribe() {
        this.b.unsubscribe();
    }
}
