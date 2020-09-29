package defpackage;

import com.spotify.mobile.android.spotlets.miniplayer.MiniPlayerDisplayRule;
import com.spotify.mobile.android.spotlets.miniplayer.MiniPlayerDisplayRule.Item;
import com.spotify.mobile.android.spotlets.miniplayer.MiniPlayerDisplayRule.a;

/* renamed from: iwr reason: default package */
final class iwr {
    iwr() {
    }

    public static MiniPlayerDisplayRule a(boolean z, boolean z2) {
        return z ? new a().a(Item.CONNECT, MiniPlayerDisplayRule.a()).a : new MiniPlayerDisplayRule();
    }
}
