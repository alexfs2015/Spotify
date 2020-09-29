package defpackage;

import com.google.common.io.BaseEncoding;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.mobile.android.util.Assertion;
import java.util.Locale;

/* renamed from: jwy reason: default package */
public final class jwy {
    public static String a(PlayerTrack playerTrack) {
        if (playerTrack == null) {
            return "(PlayerTrack) NULL";
        }
        StringBuilder sb = new StringBuilder();
        String hexString = Integer.toHexString(playerTrack.hashCode());
        String str = (String) playerTrack.metadata().get("title");
        String str2 = (String) playerTrack.metadata().get("artist_name");
        sb.append("0x");
        sb.append(hexString);
        sb.append(" : ");
        sb.append(str);
        sb.append(" - ");
        sb.append(str2);
        sb.append(10);
        return sb.toString();
    }

    public static void a(String str, PlayerTrack[] playerTrackArr, PlayerTrack playerTrack, PlayerTrack[] playerTrackArr2) {
        Logger.b(b(str, playerTrackArr, playerTrack, playerTrackArr2), new Object[0]);
    }

    private static void a(StringBuilder sb, int i, PlayerTrack playerTrack, boolean z) {
        sb.append(z ? "->" : "| ");
        sb.append(i);
        sb.append(": ");
        sb.append(a(playerTrack));
    }

    public static byte[] a(String str) {
        try {
            return BaseEncoding.e().b().a((CharSequence) str.toLowerCase(Locale.US));
        } catch (IllegalArgumentException e) {
            StringBuilder sb = new StringBuilder("Cannot decode hex string (will return empty byte array): ");
            sb.append(str);
            Assertion.a(sb.toString(), (Throwable) e);
            return new byte[0];
        }
    }

    private static String b(String str, PlayerTrack[] playerTrackArr, PlayerTrack playerTrack, PlayerTrack[] playerTrackArr2) {
        StringBuilder sb = new StringBuilder(128);
        sb.append(str);
        sb.append(": \n");
        int length = playerTrackArr == null ? 0 : playerTrackArr.length;
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            a(sb, i, playerTrackArr[i2], false);
            i++;
        }
        if (playerTrack != null) {
            a(sb, i, playerTrack, true);
            i++;
        }
        int length2 = playerTrackArr2 == null ? 0 : playerTrackArr2.length;
        for (int i3 = 0; i3 < length2; i3++) {
            a(sb, i, playerTrackArr2[i3], false);
            i++;
        }
        return sb.toString();
    }
}
