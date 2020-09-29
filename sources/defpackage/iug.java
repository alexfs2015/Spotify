package defpackage;

import com.spotify.mobile.android.spotlets.miniplayer.MiniPlayerDisplayRule;
import com.spotify.mobile.android.spotlets.miniplayer.MiniPlayerDisplayRule.Item;
import com.spotify.mobile.android.spotlets.miniplayer.MiniPlayerDisplayRule.a;

/* renamed from: iug reason: default package */
final class iug {
    iug() {
    }

    public static MiniPlayerDisplayRule a(boolean z, boolean z2) {
        if (z) {
            return new a().a(Item.CONNECT, MiniPlayerDisplayRule.a()).a;
        }
        return new MiniPlayerDisplayRule();
    }
}
