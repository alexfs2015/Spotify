package defpackage;

import android.content.Context;
import com.spotify.cosmos.router.Response;
import io.reactivex.functions.Consumer;

/* renamed from: -$$Lambda$jxo$Eb674mhsJsgAuMN0cK8rGXyJ_yU reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$jxo$Eb674mhsJsgAuMN0cK8rGXyJ_yU implements Consumer {
    private final /* synthetic */ jxo f$0;
    private final /* synthetic */ Context f$1;
    private final /* synthetic */ jyi f$2;

    public /* synthetic */ $$Lambda$jxo$Eb674mhsJsgAuMN0cK8rGXyJ_yU(jxo jxo, Context context, jyi jyi) {
        this.f$0 = jxo;
        this.f$1 = context;
        this.f$2 = jyi;
    }

    public final void accept(Object obj) {
        this.f$0.a(this.f$1, this.f$2, (Response) obj);
    }
}
