package defpackage;

import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.Consumer;

/* renamed from: -$$Lambda$kwa$PqLcmX_quPODrPp7p36lLHo3mKc reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$kwa$PqLcmX_quPODrPp7p36lLHo3mKc implements Consumer {
    public static final /* synthetic */ $$Lambda$kwa$PqLcmX_quPODrPp7p36lLHo3mKc INSTANCE = new $$Lambda$kwa$PqLcmX_quPODrPp7p36lLHo3mKc();

    private /* synthetic */ $$Lambda$kwa$PqLcmX_quPODrPp7p36lLHo3mKc() {
    }

    public final void accept(Object obj) {
        Logger.e("Error fetching shuffle dialog data: %s", ((Throwable) obj).getMessage());
    }
}
