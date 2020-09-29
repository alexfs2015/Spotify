package defpackage;

import com.spotify.music.cappedondemand.core.model.CappedOndemandStatus;
import io.reactivex.functions.Function;

/* renamed from: -$$Lambda$By_T6LmBjro9YGCjVASWDfzxmgI reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$By_T6LmBjro9YGCjVASWDfzxmgI implements Function {
    public static final /* synthetic */ $$Lambda$By_T6LmBjro9YGCjVASWDfzxmgI INSTANCE = new $$Lambda$By_T6LmBjro9YGCjVASWDfzxmgI();

    private /* synthetic */ $$Lambda$By_T6LmBjro9YGCjVASWDfzxmgI() {
    }

    public final Object apply(Object obj) {
        return ((CappedOndemandStatus) obj).countdownTillRefill();
    }
}
