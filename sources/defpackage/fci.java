package defpackage;

import java.util.NoSuchElementException;

/* renamed from: fci reason: default package */
public abstract class fci<T> extends fdz<T> {
    private T a;

    protected fci(T t) {
        this.a = t;
    }

    /* access modifiers changed from: protected */
    public abstract T a(T t);

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
