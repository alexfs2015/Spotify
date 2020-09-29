package defpackage;

import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.Consumer;

/* renamed from: -$$Lambda$tns$8fJs7RCkxYsBOB4yw4GK-PhfrGs reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$tns$8fJs7RCkxYsBOB4yw4GKPhfrGs implements Consumer {
    public static final /* synthetic */ $$Lambda$tns$8fJs7RCkxYsBOB4yw4GKPhfrGs INSTANCE = new $$Lambda$tns$8fJs7RCkxYsBOB4yw4GKPhfrGs();

    private /* synthetic */ $$Lambda$tns$8fJs7RCkxYsBOB4yw4GKPhfrGs() {
    }

    public final void accept(Object obj) {
        Logger.e("Error when subscribing: %s", ((Throwable) obj).getMessage());
    }
}
