package defpackage;

import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.Consumer;

/* renamed from: -$$Lambda$kvu$1bm-LRLNqklaKD0ui8UKRGLtEw0 reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$kvu$1bmLRLNqklaKD0ui8UKRGLtEw0 implements Consumer {
    public static final /* synthetic */ $$Lambda$kvu$1bmLRLNqklaKD0ui8UKRGLtEw0 INSTANCE = new $$Lambda$kvu$1bmLRLNqklaKD0ui8UKRGLtEw0();

    private /* synthetic */ $$Lambda$kvu$1bmLRLNqklaKD0ui8UKRGLtEw0() {
    }

    public final void accept(Object obj) {
        Logger.e("Error fetching shuffle dialog data: %s", ((Throwable) obj).getMessage());
    }
}
