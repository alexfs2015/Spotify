package defpackage;

import android.content.Context;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import android.view.View;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrackUtil;
import com.spotify.mobile.android.spotlets.miniplayer.view.MiniPlayerPageView;
import com.spotify.music.R;

/* renamed from: ixw reason: default package */
final class ixw implements ixx {
    private final MiniPlayerPageView a;

    ixw(MiniPlayerPageView miniPlayerPageView) {
        this.a = miniPlayerPageView;
    }

    private static CharSequence a(Context context, String str, String str2) {
        String str3;
        boolean z = !fbo.a(str2);
        if (z) {
            str3 = context.getString(R.string.mft_npv_track_artist_title, new Object[]{str2, str});
        } else {
            str3 = str;
        }
        SpannableString valueOf = SpannableString.valueOf(str3);
        if (z) {
            a(context, valueOf, str2.length() + 1, str3.length());
            b(context, valueOf, 0, str3.length() - str.length());
        } else {
            a(context, valueOf, 0, str.length());
        }
        return valueOf;
    }

    private static void a(Context context, SpannableString spannableString, int i, int i2) {
        spannableString.setSpan(new TextAppearanceSpan(context, 2132017659), i, i2, 33);
    }

    private static CharSequence b(Context context, String str, String str2) {
        String str3;
        boolean z = !fbo.a(str2);
        if (z) {
            str3 = context.getString(R.string.mft_npv_track_artist_title, new Object[]{str, str2});
        } else {
            str3 = str;
        }
        SpannableString valueOf = SpannableString.valueOf(str3);
        if (z) {
            a(context, valueOf, 0, str.length());
            b(context, valueOf, str.length() + 1, str3.length());
        } else {
            a(context, valueOf, 0, str.length());
        }
        return valueOf;
    }

    private static void b(Context context, SpannableString spannableString, int i, int i2) {
        spannableString.setSpan(new TextAppearanceSpan(context, 2132017658), i, i2, 34);
    }

    public final void a(PlayerTrack playerTrack) {
        if (playerTrack != null) {
            MiniPlayerPageView miniPlayerPageView = this.a;
            miniPlayerPageView.a.setText(b(playerTrack));
        }
    }

    public final CharSequence b(PlayerTrack playerTrack) {
        String str;
        String str2 = "";
        if (playerTrack == null) {
            return str2;
        }
        Context context = this.a.getContext();
        String str3 = (String) playerTrack.metadata().get("title");
        if (PlayerTrackUtil.isInterruptionFromAds(playerTrack)) {
            str3 = context.getString(R.string.sas_interruption_title);
            str = context.getString(R.string.widget_label);
        } else if (PlayerTrackUtil.isAd(playerTrack)) {
            if (TextUtils.isEmpty(str3)) {
                str3 = context.getString(R.string.audio_ads_header_title);
            }
            str = fbo.b((String) playerTrack.metadata().get("advertiser"));
        } else if (str3 == null) {
            return str2;
        } else {
            str = PlayerTrackUtil.getArtists(playerTrack);
        }
        return vgi.a((View) this.a) ? a(context, str3, str) : b(context, str3, str);
    }
}
