package defpackage;

import com.spotify.music.cappedondemand.core.model.CappedOndemandStatus;
import io.reactivex.functions.Function;

/* renamed from: -$$Lambda$kvd$g6Tc3_ehMjqWvun1-QG7DlHB0iU reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$kvd$g6Tc3_ehMjqWvun1QG7DlHB0iU implements Function {
    public static final /* synthetic */ $$Lambda$kvd$g6Tc3_ehMjqWvun1QG7DlHB0iU INSTANCE = new $$Lambda$kvd$g6Tc3_ehMjqWvun1QG7DlHB0iU();

    private /* synthetic */ $$Lambda$kvd$g6Tc3_ehMjqWvun1QG7DlHB0iU() {
    }

    public final Object apply(Object obj) {
        return Boolean.valueOf(!((CappedOndemandStatus) obj).ondemand());
    }
}
