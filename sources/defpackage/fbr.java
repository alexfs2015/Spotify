package defpackage;

import java.util.NoSuchElementException;

/* renamed from: fbr reason: default package */
public abstract class fbr<T> extends fdh<T> {
    private T a;

    /* access modifiers changed from: protected */
    public abstract T a(T t);

    protected fbr(T t) {
        this.a = t;
    }

    public final boolean hasNext() {
        return this.a != null;
    }

    public final T next() {
        if (hasNext()) {
            try {
                return this.a;
            } finally {
                this.a = a(this.a);
            }
        } else {
            throw new NoSuchElementException();
        }
    }
}
