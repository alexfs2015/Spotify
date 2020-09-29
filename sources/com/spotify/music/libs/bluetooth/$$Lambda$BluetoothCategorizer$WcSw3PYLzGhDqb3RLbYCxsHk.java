package com.spotify.music.libs.bluetooth;

import com.spotify.base.java.logging.Logger;
import com.spotify.music.libs.bluetooth.BluetoothCategorizer.CategorizerResponse;

/* renamed from: com.spotify.music.libs.bluetooth.-$$Lambda$BluetoothCategorizer$W-cSw3PYLzGhDqb3RL-bYC-xsHk reason: invalid class name */
public final /* synthetic */ class $$Lambda$BluetoothCategorizer$WcSw3PYLzGhDqb3RLbYCxsHk implements xiy {
    public static final /* synthetic */ $$Lambda$BluetoothCategorizer$WcSw3PYLzGhDqb3RLbYCxsHk INSTANCE = new $$Lambda$BluetoothCategorizer$WcSw3PYLzGhDqb3RLbYCxsHk();

    private /* synthetic */ $$Lambda$BluetoothCategorizer$WcSw3PYLzGhDqb3RLbYCxsHk() {
    }

    public final Object call(Object obj) {
        return Logger.b("Categorized as %s", ((CategorizerResponse) obj).getCategory());
    }
}
