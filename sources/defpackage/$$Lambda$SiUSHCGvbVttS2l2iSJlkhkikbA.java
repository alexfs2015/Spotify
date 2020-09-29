package defpackage;

import com.google.common.base.Optional;
import io.reactivex.functions.Function;

/* renamed from: -$$Lambda$SiUSHCGvbVttS2l2iSJlkhkikbA reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$SiUSHCGvbVttS2l2iSJlkhkikbA implements Function {
    private final /* synthetic */ Optional f$0;

    public /* synthetic */ $$Lambda$SiUSHCGvbVttS2l2iSJlkhkikbA(Optional optional) {
        this.f$0 = optional;
    }

    public final Object apply(Object obj) {
        return Boolean.valueOf(this.f$0.equals((Optional) obj));
    }
}
