package defpackage;

import android.content.Context;
import com.spotify.cosmos.router.Response;
import io.reactivex.functions.Consumer;

/* renamed from: -$$Lambda$jzo$kXg4TQl8-4t90CNYX6e1bCeyqt8 reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$jzo$kXg4TQl84t90CNYX6e1bCeyqt8 implements Consumer {
    private final /* synthetic */ jzo f$0;
    private final /* synthetic */ Context f$1;
    private final /* synthetic */ kai f$2;

    public /* synthetic */ $$Lambda$jzo$kXg4TQl84t90CNYX6e1bCeyqt8(jzo jzo, Context context, kai kai) {
        this.f$0 = jzo;
        this.f$1 = context;
        this.f$2 = kai;
    }

    public final void accept(Object obj) {
        this.f$0.a(this.f$1, this.f$2, (Response) obj);
    }
}
