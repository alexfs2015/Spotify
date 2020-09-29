package defpackage;

/* renamed from: ejy reason: default package */
final class ejy extends ejv {
    private final ejw a = new ejw();

    ejy() {
    }

    public final void a(Throwable th, Throwable th2) {
        if (th2 == th) {
            throw new IllegalArgumentException("Self suppression is not allowed.", th2);
        } else if (th2 != null) {
            this.a.a(th).add(th2);
        } else {
            throw new NullPointerException("The suppressed exception cannot be null.");
        }
    }
}
