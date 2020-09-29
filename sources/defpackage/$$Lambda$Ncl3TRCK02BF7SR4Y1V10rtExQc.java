package defpackage;

import com.spotify.cosmos.session.model.LoginResponse;
import io.reactivex.functions.Function;

/* renamed from: -$$Lambda$Ncl3TRCK02BF7SR4Y1V10rtExQc reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$Ncl3TRCK02BF7SR4Y1V10rtExQc implements Function {
    public static final /* synthetic */ $$Lambda$Ncl3TRCK02BF7SR4Y1V10rtExQc INSTANCE = new $$Lambda$Ncl3TRCK02BF7SR4Y1V10rtExQc();

    private /* synthetic */ $$Lambda$Ncl3TRCK02BF7SR4Y1V10rtExQc() {
    }

    public final Object apply(Object obj) {
        return Boolean.valueOf(((LoginResponse) obj).isSuccess());
    }
}
