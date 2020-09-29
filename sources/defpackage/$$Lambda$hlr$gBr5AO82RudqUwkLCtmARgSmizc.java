package defpackage;

import com.spotify.base.java.logging.Logger;
import com.spotify.cosmos.router.Response;
import io.reactivex.functions.Consumer;

/* renamed from: -$$Lambda$hlr$gBr5AO82RudqUwkLCtmARgSmizc reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$hlr$gBr5AO82RudqUwkLCtmARgSmizc implements Consumer {
    public static final /* synthetic */ $$Lambda$hlr$gBr5AO82RudqUwkLCtmARgSmizc INSTANCE = new $$Lambda$hlr$gBr5AO82RudqUwkLCtmARgSmizc();

    private /* synthetic */ $$Lambda$hlr$gBr5AO82RudqUwkLCtmARgSmizc() {
    }

    public final void accept(Object obj) {
        Logger.c("Successfully updated ABBA values in Core, status = %d", Integer.valueOf(((Response) obj).getStatus()));
    }
}
