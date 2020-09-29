package defpackage;

import com.spotify.mobile.android.connect.ConnectManager;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.functions.Function;
import java.util.List;

/* renamed from: -$$Lambda$mhi$RNg8RPsvtvkIKnzPpOfWhiK43oE reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$mhi$RNg8RPsvtvkIKnzPpOfWhiK43oE implements Function {
    private final /* synthetic */ ConnectManager f$0;

    public /* synthetic */ $$Lambda$mhi$RNg8RPsvtvkIKnzPpOfWhiK43oE(ConnectManager connectManager) {
        this.f$0 = connectManager;
    }

    public final Object apply(Object obj) {
        return Observable.a((Iterable<? extends T>) (List) obj).a((Function<? super T, ? extends ObservableSource<? extends R>>) new $$Lambda$mhi$eLeoBiX6ofLw5meuH3QYZmfP6WQ<Object,Object>(this.f$0), false).b(16).d();
    }
}
