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

/* renamed from: ivl reason: default package */
final class ivl implements ivm {
    private final MiniPlayerPageView a;

    ivl(MiniPlayerPageView miniPlayerPageView) {
        this.a = miniPlayerPageView;
    }

    private static void a(Context context, SpannableString spannableString, int i, int i2) {
        spannableString.setSpan(new TextAppearanceSpan(context, 2132017656), i, i2, 33);
    }

    private static void b(Context context, SpannableString spannableString, int i, int i2) {
        spannableString.setSpan(new TextAppearanceSpan(context, 2132017655), i, i2, 34);
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
            str = fax.b((String) playerTrack.metadata().get("advertiser"));
        } else if (str3 == null) {
            return str2;
        } else {
            str = PlayerTrackUtil.getArtists(playerTrack);
        }
        if (uur.a((View) this.a)) {
            return a(context, str3, str);
        }
        return b(context, str3, str);
    }

    private static CharSequence a(Context context, String str, String str2) {
        String str3;
        boolean z = !fax.a(str2);
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

    private static CharSequence b(Context context, String str, String str2) {
        String str3;
        boolean z = !fax.a(str2);
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
}
