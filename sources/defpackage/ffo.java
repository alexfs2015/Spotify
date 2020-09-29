package defpackage;

/* renamed from: ffo reason: default package */
public final class ffo<T> {
    public final Class<T> a;
    public final T b;

    public final String toString() {
        return String.format("Event{type: %s, payload: %s}", new Object[]{this.a, this.b});
    }
}
