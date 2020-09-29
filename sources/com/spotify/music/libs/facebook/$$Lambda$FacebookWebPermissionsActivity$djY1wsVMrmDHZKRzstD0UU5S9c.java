package com.spotify.music.libs.facebook;

import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.Consumer;

/* renamed from: com.spotify.music.libs.facebook.-$$Lambda$FacebookWebPermissionsActivity$djY1wsVMrm-DHZKRzstD0UU5S9c reason: invalid class name */
public final /* synthetic */ class $$Lambda$FacebookWebPermissionsActivity$djY1wsVMrmDHZKRzstD0UU5S9c implements Consumer {
    public static final /* synthetic */ $$Lambda$FacebookWebPermissionsActivity$djY1wsVMrmDHZKRzstD0UU5S9c INSTANCE = new $$Lambda$FacebookWebPermissionsActivity$djY1wsVMrmDHZKRzstD0UU5S9c();

    private /* synthetic */ $$Lambda$FacebookWebPermissionsActivity$djY1wsVMrmDHZKRzstD0UU5S9c() {
    }

    public final void accept(Object obj) {
        Logger.e((Throwable) obj, "Failed to subscribe to social permissions", new Object[0]);
    }
}
