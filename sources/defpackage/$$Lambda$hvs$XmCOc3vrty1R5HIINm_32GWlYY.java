package defpackage;

import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.Consumer;

/* renamed from: -$$Lambda$hvs$XmCOc3vrty1R5HIINm_32GW-lYY reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$hvs$XmCOc3vrty1R5HIINm_32GWlYY implements Consumer {
    public static final /* synthetic */ $$Lambda$hvs$XmCOc3vrty1R5HIINm_32GWlYY INSTANCE = new $$Lambda$hvs$XmCOc3vrty1R5HIINm_32GWlYY();

    private /* synthetic */ $$Lambda$hvs$XmCOc3vrty1R5HIINm_32GWlYY() {
    }

    public final void accept(Object obj) {
        Logger.b("Error while detecting offline errors: %s", ((Throwable) obj).getMessage());
    }
}
