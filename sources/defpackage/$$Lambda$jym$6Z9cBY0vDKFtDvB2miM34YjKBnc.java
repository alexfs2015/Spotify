package defpackage;

import io.reactivex.functions.Function;
import java.util.Map;

/* renamed from: -$$Lambda$jym$6Z9cBY0vDKFtDvB2miM34YjKBnc reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$jym$6Z9cBY0vDKFtDvB2miM34YjKBnc implements Function {
    private final /* synthetic */ String f$0;

    public /* synthetic */ $$Lambda$jym$6Z9cBY0vDKFtDvB2miM34YjKBnc(String str) {
        this.f$0 = str;
    }

    public final Object apply(Object obj) {
        return ((Map) obj).get(this.f$0);
    }
}
