package defpackage;

import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.Consumer;

/* renamed from: -$$Lambda$hze$t-cBYLt82RLnzqvKg_zXwObmDW4 reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$hze$tcBYLt82RLnzqvKg_zXwObmDW4 implements Consumer {
    private final /* synthetic */ String f$0;

    public /* synthetic */ $$Lambda$hze$tcBYLt82RLnzqvKg_zXwObmDW4(String str) {
        this.f$0 = str;
    }

    public final void accept(Object obj) {
        Logger.b("preroll - failed to fetch preroll with view uri: %s", this.f$0);
    }
}
