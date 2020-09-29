package defpackage;

import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.Consumer;

/* renamed from: -$$Lambda$kvu$9tmkVf8X3guV2_cuGJfgpqkcRpY reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$kvu$9tmkVf8X3guV2_cuGJfgpqkcRpY implements Consumer {
    public static final /* synthetic */ $$Lambda$kvu$9tmkVf8X3guV2_cuGJfgpqkcRpY INSTANCE = new $$Lambda$kvu$9tmkVf8X3guV2_cuGJfgpqkcRpY();

    private /* synthetic */ $$Lambda$kvu$9tmkVf8X3guV2_cuGJfgpqkcRpY() {
    }

    public final void accept(Object obj) {
        Logger.e("Error fetching shuffle dialog data: %s", ((Throwable) obj).getMessage());
    }
}
