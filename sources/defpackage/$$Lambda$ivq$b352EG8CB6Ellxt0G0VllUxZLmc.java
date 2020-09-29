package defpackage;

import com.spotify.mobile.android.util.Assertion;
import io.reactivex.functions.Consumer;

/* renamed from: -$$Lambda$ivq$b352EG8CB6Ellxt0G0VllUxZLmc reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$ivq$b352EG8CB6Ellxt0G0VllUxZLmc implements Consumer {
    public static final /* synthetic */ $$Lambda$ivq$b352EG8CB6Ellxt0G0VllUxZLmc INSTANCE = new $$Lambda$ivq$b352EG8CB6Ellxt0G0VllUxZLmc();

    private /* synthetic */ $$Lambda$ivq$b352EG8CB6Ellxt0G0VllUxZLmc() {
    }

    public final void accept(Object obj) {
        Assertion.a("Connection state error", (Throwable) obj);
    }
}
