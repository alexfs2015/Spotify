package defpackage;

import android.net.Uri;
import io.reactivex.functions.Consumer;

/* renamed from: -$$Lambda$khl$7ottf48AUjf0mJsx-6VbrXhwavo reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$khl$7ottf48AUjf0mJsx6VbrXhwavo implements Consumer {
    private final /* synthetic */ aqq f$0;
    private final /* synthetic */ c f$1;

    public /* synthetic */ $$Lambda$khl$7ottf48AUjf0mJsx6VbrXhwavo(aqq aqq, c cVar) {
        this.f$0 = aqq;
        this.f$1 = cVar;
    }

    public final void accept(Object obj) {
        this.f$0.a((ayg) this.f$1.a(Uri.parse(((b) obj).a)));
    }
}
