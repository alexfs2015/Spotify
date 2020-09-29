package defpackage;

/* renamed from: fgi reason: default package */
public final class fgi<T> {
    public final Class<T> a;
    public final T b;

    public final String toString() {
        return String.format("Event{type: %s, payload: %s}", new Object[]{this.a, this.b});
    }
}
