package defpackage;

import com.spotify.music.cappedondemand.core.model.CappedOndemandStatus;
import io.reactivex.functions.Function;

/* renamed from: -$$Lambda$kym$kURxARiaxPpC0b45rAw3owzi7uE reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$kym$kURxARiaxPpC0b45rAw3owzi7uE implements Function {
    public static final /* synthetic */ $$Lambda$kym$kURxARiaxPpC0b45rAw3owzi7uE INSTANCE = new $$Lambda$kym$kURxARiaxPpC0b45rAw3owzi7uE();

    private /* synthetic */ $$Lambda$kym$kURxARiaxPpC0b45rAw3owzi7uE() {
    }

    public final Object apply(Object obj) {
        return Boolean.valueOf(!((CappedOndemandStatus) obj).ondemand());
    }
}
