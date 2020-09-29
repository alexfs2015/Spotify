package defpackage;

import io.reactivex.Observable;
import java.util.concurrent.Callable;

/* renamed from: -$$Lambda$lvq$1$GPYWgGMnw9kaPhg8lIbTkxEuF1o reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$lvq$1$GPYWgGMnw9kaPhg8lIbTkxEuF1o implements Callable {
    private final /* synthetic */ lvx f$0;
    private final /* synthetic */ luu f$1;

    public /* synthetic */ $$Lambda$lvq$1$GPYWgGMnw9kaPhg8lIbTkxEuF1o(lvx lvx, luu luu) {
        this.f$0 = lvx;
        this.f$1 = luu;
    }

    public final Object call() {
        return Observable.b(this.f$0.a(this.f$1));
    }
}
