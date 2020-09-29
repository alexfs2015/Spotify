package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.appcompat.widget.SwitchCompat;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.music.R;
import com.spotify.paste.spotifyicon.SpotifyIconDrawable;

/* renamed from: uou reason: default package */
public final class uou implements fyz {
    private final rcq a;

    public uou(rcq rcq) {
        this.a = rcq;
    }

    public final void a(fyt fyt, sih sih, String str, boolean z) {
        this.a.a(fyt, R.id.options_menu_published, sih, str, z);
    }

    public final void d(fyt fyt, boolean z, fyq fyq) {
        Context a2 = fyt.a();
        fyy a3 = fyt.a((int) R.id.actionbar_item_follow, z ? R.string.options_menu_following : R.string.options_menu_follow, fzf.a(fyt.a(), z ? SpotifyIconV2.FOLLOW : SpotifyIconV2.ADDFOLLOW, fr.c(a2, z ? R.color.green : R.color.cat_grayscale_55)));
        fyq.getClass();
        a3.a(new $$Lambda$zKu_49RQmbMH_zreL2oO8jB6y6o(fyq));
    }

    public final void c(fyt fyt, boolean z, fyq fyq) {
        Context a2 = fyt.a();
        Resources resources = a2.getResources();
        String string = resources.getString(z ? R.string.options_menu_following : R.string.options_menu_follow);
        fyu a3 = fyt.a(R.id.actionbar_item_follow, string);
        SwitchCompat switchCompat = new SwitchCompat(a2);
        switchCompat.setChecked(z);
        switchCompat.setBackground(resources.getDrawable(R.drawable.toolbar_follow_btn));
        int dimension = (int) resources.getDimension(R.dimen.toolbar_follow_btn_padding);
        switchCompat.setPadding(dimension, dimension, dimension, dimension);
        switchCompat.setGravity(17);
        if (switchCompat.a != null) {
            switchCompat.a.setCallback(null);
        }
        switchCompat.a = null;
        switchCompat.requestLayout();
        switchCompat.setTextColor(fr.c(a2, R.color.white));
        uuu.b(a2, switchCompat, R.attr.pasteTextAppearanceMetadata);
        switchCompat.setText(string);
        switchCompat.setOnClickListener(new $$Lambda$uou$dOhmSuZYxsBgtrVQ1Cm3t2XSH9Q(fyq));
        fyu a4 = a3.a((View) switchCompat);
        fyq.getClass();
        a4.a((Runnable) new $$Lambda$zKu_49RQmbMH_zreL2oO8jB6y6o(fyq));
    }

    public final void a(fyt fyt, boolean z, fyq fyq) {
        Context a2 = fyt.a();
        Resources resources = a2.getResources();
        String string = resources.getString(z ? R.string.action_menu_item_unlike_content_description : R.string.action_menu_item_like_content_description);
        SpotifyIconDrawable spotifyIconDrawable = new SpotifyIconDrawable(a2, z ? SpotifyIconV2.HEART_ACTIVE : SpotifyIconV2.HEART, (float) resources.getDimensionPixelSize(R.dimen.toolbar_icon_size));
        spotifyIconDrawable.a(fr.c(a2, z ? R.color.green : R.color.white));
        fyu a3 = fyt.a(R.id.actionbar_item_save, string).a((Drawable) spotifyIconDrawable);
        fyq.getClass();
        a3.a((Runnable) new $$Lambda$zKu_49RQmbMH_zreL2oO8jB6y6o(fyq));
    }

    public final void b(fyt fyt, boolean z, fyq fyq) {
        Context a2 = fyt.a();
        fyy a3 = fyt.a((int) R.id.options_menu_save, (CharSequence) a2.getResources().getString(z ? R.string.free_tier_toolbar_menu_unlike : R.string.free_tier_toolbar_menu_like), fzf.a(fyt.a(), z ? SpotifyIconV2.HEART_ACTIVE : SpotifyIconV2.HEART, fr.c(a2, z ? R.color.green : R.color.cat_grayscale_55)));
        fyq.getClass();
        a3.a(new $$Lambda$zKu_49RQmbMH_zreL2oO8jB6y6o(fyq));
    }

    public final void a(fyt fyt, boolean z, boolean z2, fyq fyq) {
        Context a2 = fyt.a();
        String string = a2.getResources().getString(z ? R.string.free_tier_toolbar_menu_allow_play : R.string.free_tier_toolbar_menu_dont_play);
        SpotifyIconV2 spotifyIconV2 = z2 ? SpotifyIconV2.BLOCK : z ? SpotifyIconV2.BAN_ACTIVE : SpotifyIconV2.BAN;
        fyy a3 = fyt.a((int) R.id.actionbar_item_ban, (CharSequence) string, fzf.a(fyt.a(), spotifyIconV2, fr.c(a2, z ? R.color.red : R.color.cat_grayscale_55)));
        fyq.getClass();
        a3.a(new $$Lambda$zKu_49RQmbMH_zreL2oO8jB6y6o(fyq));
    }

    public final void a(fyt fyt, fyq fyq) {
        fyy a2 = fyt.a((int) R.id.actionbar_item_share, (CharSequence) fyt.a().getString(R.string.actionbar_item_share), fzf.a(fyt.a(), SpotifyIconV2.SHARE_ANDROID));
        fyq.getClass();
        a2.a(new $$Lambda$zKu_49RQmbMH_zreL2oO8jB6y6o(fyq));
    }

    public final void b(fyt fyt, fyq fyq) {
        fyy a2 = fyt.a((int) R.id.options_menu_go_to_artist, (int) R.string.context_menu_browse_artist, fzf.a(fyt.a(), SpotifyIconV2.ARTIST));
        fyq.getClass();
        a2.a(new $$Lambda$zKu_49RQmbMH_zreL2oO8jB6y6o(fyq));
    }

    public final void c(fyt fyt, fyq fyq) {
        fyy a2 = fyt.a((int) R.id.options_menu_add_to_playlist, (int) R.string.context_menu_add_to_playlist, fzf.a(fyt.a(), SpotifyIconV2.ADD_TO_PLAYLIST));
        fyq.getClass();
        a2.a(new $$Lambda$zKu_49RQmbMH_zreL2oO8jB6y6o(fyq));
    }

    public final void a(fyt fyt, String str, fyq fyq) {
        fyy a2 = fyt.a((int) R.id.actionbar_item_radio, (CharSequence) fyt.a().getString(uhq.a(jst.a(str))), fzf.a(fyt.a(), SpotifyIconV2.RADIO));
        fyq.getClass();
        a2.a(new $$Lambda$zKu_49RQmbMH_zreL2oO8jB6y6o(fyq));
    }

    public final void d(fyt fyt, fyq fyq) {
        fyy a2 = fyt.a((int) R.id.options_menu_queue_item, (int) R.string.context_menu_add_to_queue, fzf.a(fyt.a(), SpotifyIconV2.QUEUE));
        fyq.getClass();
        a2.a(new $$Lambda$zKu_49RQmbMH_zreL2oO8jB6y6o(fyq));
    }

    public final void e(fyt fyt, fyq fyq) {
        fyy a2 = fyt.a((int) R.id.options_menu_add_to_home_screen, (int) R.string.options_menu_add_to_home_screen, fzf.a(fyt.a(), SpotifyIconV2.DEVICE_MOBILE));
        fyq.getClass();
        a2.a(new $$Lambda$zKu_49RQmbMH_zreL2oO8jB6y6o(fyq));
    }

    public final void e(fyt fyt, boolean z, fyq fyq) {
        Context a2 = fyt.a();
        fyy a3 = fyt.a((int) R.id.options_menu_save_all_tracks, (CharSequence) a2.getResources().getString(z ? R.string.options_menu_remove_all_tracks_from_collection : R.string.options_menu_add_all_tracks_to_collection), fzf.a(fyt.a(), z ? SpotifyIconV2.HEART_ACTIVE : SpotifyIconV2.HEART, fr.c(a2, z ? R.color.green : R.color.cat_grayscale_55)));
        fyq.getClass();
        a3.a(new $$Lambda$zKu_49RQmbMH_zreL2oO8jB6y6o(fyq));
    }

    public final void f(fyt fyt, fyq fyq) {
        fyy a2 = fyt.a((int) R.id.options_menu_report, (int) R.string.context_menu_report, fzf.a(fyt.a(), SpotifyIconV2.FLAG));
        fyq.getClass();
        a2.a(new $$Lambda$zKu_49RQmbMH_zreL2oO8jB6y6o(fyq));
    }
}
