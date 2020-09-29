package defpackage;

import com.google.common.io.BaseEncoding;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.mobile.android.util.Assertion;
import java.util.Locale;

/* renamed from: juq reason: default package */
public final class juq {
    private static void a(StringBuilder sb, int i, PlayerTrack playerTrack, boolean z) {
        sb.append(z ? "->" : "| ");
        sb.append(i);
        sb.append(": ");
        sb.append(a(playerTrack));
    }

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

    private static String b(String str, PlayerTrack[] playerTrackArr, PlayerTrack playerTrack, PlayerTrack[] playerTrackArr2) {
        int i;
        int i2;
        StringBuilder sb = new StringBuilder(128);
        sb.append(str);
        sb.append(": \n");
        if (playerTrackArr == null) {
            i = 0;
        } else {
            i = playerTrackArr.length;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < i; i4++) {
            a(sb, i3, playerTrackArr[i4], false);
            i3++;
        }
        if (playerTrack != null) {
            a(sb, i3, playerTrack, true);
            i3++;
        }
        if (playerTrackArr2 == null) {
            i2 = 0;
        } else {
            i2 = playerTrackArr2.length;
        }
        for (int i5 = 0; i5 < i2; i5++) {
            a(sb, i3, playerTrackArr2[i5], false);
            i3++;
        }
        return sb.toString();
    }

    public static void a(String str, PlayerTrack[] playerTrackArr, PlayerTrack playerTrack, PlayerTrack[] playerTrackArr2) {
        Logger.b(b(str, playerTrackArr, playerTrack, playerTrackArr2), new Object[0]);
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
}
