package defpackage;

import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.Consumer;

/* renamed from: -$$Lambda$jiy$1jIzMBYuvwDfdFEA4VFFL4y5JDA reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$jiy$1jIzMBYuvwDfdFEA4VFFL4y5JDA implements Consumer {
    public static final /* synthetic */ $$Lambda$jiy$1jIzMBYuvwDfdFEA4VFFL4y5JDA INSTANCE = new $$Lambda$jiy$1jIzMBYuvwDfdFEA4VFFL4y5JDA();

    private /* synthetic */ $$Lambda$jiy$1jIzMBYuvwDfdFEA4VFFL4y5JDA() {
    }

    public final void accept(Object obj) {
        Logger.e("Error when subscribing to PlayerState: %s", ((Throwable) obj).getMessage());
    }
}
