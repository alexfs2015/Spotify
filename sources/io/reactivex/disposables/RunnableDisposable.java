package io.reactivex.disposables;

final class RunnableDisposable extends ReferenceDisposable<Runnable> {
    private static final long serialVersionUID = -8219729196779211169L;

    /* access modifiers changed from: protected */
    public final /* synthetic */ void a(Object obj) {
        ((Runnable) obj).run();
    }

    RunnableDisposable(Runnable runnable) {
        super(runnable);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RunnableDisposable(disposed=");
        sb.append(b());
        sb.append(", ");
        sb.append(get());
        sb.append(")");
        return sb.toString();
    }
}
