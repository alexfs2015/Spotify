package defpackage;

import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.Consumer;

/* renamed from: -$$Lambda$mfo$CWRdCrPDcw1lX_gQC2FmHb_VToc reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$mfo$CWRdCrPDcw1lX_gQC2FmHb_VToc implements Consumer {
    public static final /* synthetic */ $$Lambda$mfo$CWRdCrPDcw1lX_gQC2FmHb_VToc INSTANCE = new $$Lambda$mfo$CWRdCrPDcw1lX_gQC2FmHb_VToc();

    private /* synthetic */ $$Lambda$mfo$CWRdCrPDcw1lX_gQC2FmHb_VToc() {
    }

    public final void accept(Object obj) {
        Logger.e("CMC - Error when subscribing to gaia state. Error: %s", ((Throwable) obj).getMessage());
    }
}
