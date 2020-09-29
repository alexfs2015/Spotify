package defpackage;

import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.Consumer;

/* renamed from: -$$Lambda$igl$zSI1Y8FhW1Ma61WTbNTsv2aZ718 reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$igl$zSI1Y8FhW1Ma61WTbNTsv2aZ718 implements Consumer {
    private final /* synthetic */ String f$0;
    private final /* synthetic */ String f$1;

    public /* synthetic */ $$Lambda$igl$zSI1Y8FhW1Ma61WTbNTsv2aZ718(String str, String str2) {
        this.f$0 = str;
        this.f$1 = str2;
    }

    public final void accept(Object obj) {
        Logger.b((Throwable) obj, "Flashpoint - Failed to report event %s with data (%s)", this.f$0, this.f$1);
    }
}
