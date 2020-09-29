package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.appcompat.widget.SwitchCompat;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.music.R;
import com.spotify.paste.spotifyicon.SpotifyIconDrawable;

/* renamed from: uzz reason: default package */
public final class uzz implements fzt {
    private final rlo a;

    public uzz(rlo rlo) {
        this.a = rlo;
    }

    public final void a(fzn fzn, fzk fzk) {
        fzs a2 = fzn.a((int) R.id.actionbar_item_share, (CharSequence) fzn.a().getString(R.string.actionbar_item_share), fzz.a(fzn.a(), SpotifyIconV2.SHARE_ANDROID));
        fzk.getClass();
        a2.a(new $$Lambda$OAuVTvnjF975XB3drfT7avFUNc(fzk));
    }

    public final void a(fzn fzn, String str, fzk fzk) {
        fzs a2 = fzn.a((int) R.id.actionbar_item_radio, (CharSequence) fzn.a().getString(ute.a(jva.a(str))), fzz.a(fzn.a(), SpotifyIconV2.RADIO));
        fzk.getClass();
        a2.a(new $$Lambda$OAuVTvnjF975XB3drfT7avFUNc(fzk));
    }

    public final void a(fzn fzn, sso sso, String str, boolean z) {
        this.a.a(fzn, R.id.options_menu_published, sso, str, z);
    }

    public final void a(fzn fzn, boolean z, fzk fzk) {
        Context a2 = fzn.a();
        Resources resources = a2.getResources();
        String string = resources.getString(z ? R.string.action_menu_item_unlike_content_description : R.string.action_menu_item_like_content_description);
        SpotifyIconDrawable spotifyIconDrawable = new SpotifyIconDrawable(a2, z ? SpotifyIconV2.HEART_ACTIVE : SpotifyIconV2.HEART, (float) resources.getDimensionPixelSize(R.dimen.toolbar_icon_size));
        spotifyIconDrawable.a(fr.c(a2, z ? R.color.green : R.color.white));
        fzo a3 = fzn.a(R.id.actionbar_item_save, string).a((Drawable) spotifyIconDrawable);
        fzk.getClass();
        a3.a((Runnable) new $$Lambda$OAuVTvnjF975XB3drfT7avFUNc(fzk));
    }

    public final void a(fzn fzn, boolean z, boolean z2, fzk fzk) {
        Context a2 = fzn.a();
        String string = a2.getResources().getString(z ? R.string.free_tier_toolbar_menu_allow_play : R.string.free_tier_toolbar_menu_dont_play);
        SpotifyIconV2 spotifyIconV2 = z2 ? SpotifyIconV2.BLOCK : z ? SpotifyIconV2.BAN_ACTIVE : SpotifyIconV2.BAN;
        fzs a3 = fzn.a((int) R.id.actionbar_item_ban, (CharSequence) string, fzz.a(fzn.a(), spotifyIconV2, fr.c(a2, z ? R.color.red : R.color.cat_grayscale_55)));
        fzk.getClass();
        a3.a(new $$Lambda$OAuVTvnjF975XB3drfT7avFUNc(fzk));
    }

    public final void b(fzn fzn, fzk fzk) {
        fzs a2 = fzn.a((int) R.id.options_menu_go_to_artist, (int) R.string.context_menu_browse_artist, fzz.a(fzn.a(), SpotifyIconV2.ARTIST));
        fzk.getClass();
        a2.a(new $$Lambda$OAuVTvnjF975XB3drfT7avFUNc(fzk));
    }

    public final void b(fzn fzn, boolean z, fzk fzk) {
        Context a2 = fzn.a();
        fzs a3 = fzn.a((int) R.id.options_menu_save, (CharSequence) a2.getResources().getString(z ? R.string.free_tier_toolbar_menu_unlike : R.string.free_tier_toolbar_menu_like), fzz.a(fzn.a(), z ? SpotifyIconV2.HEART_ACTIVE : SpotifyIconV2.HEART, fr.c(a2, z ? R.color.green : R.color.cat_grayscale_55)));
        fzk.getClass();
        a3.a(new $$Lambda$OAuVTvnjF975XB3drfT7avFUNc(fzk));
    }

    public final void c(fzn fzn, fzk fzk) {
        fzs a2 = fzn.a((int) R.id.options_menu_add_to_playlist, (int) R.string.context_menu_add_to_playlist, fzz.a(fzn.a(), SpotifyIconV2.ADD_TO_PLAYLIST));
        fzk.getClass();
        a2.a(new $$Lambda$OAuVTvnjF975XB3drfT7avFUNc(fzk));
    }

    public final void c(fzn fzn, boolean z, fzk fzk) {
        Context a2 = fzn.a();
        Resources resources = a2.getResources();
        String string = resources.getString(z ? R.string.options_menu_following : R.string.options_menu_follow);
        fzo a3 = fzn.a(R.id.actionbar_item_follow, string);
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
        vgl.b(a2, switchCompat, R.attr.pasteTextAppearanceMetadata);
        switchCompat.setText(string);
        switchCompat.setOnClickListener(new $$Lambda$uzz$zl_1uLCMA0q535pNdp6gckgheA(fzk));
        fzo a4 = a3.a((View) switchCompat);
        fzk.getClass();
        a4.a((Runnable) new $$Lambda$OAuVTvnjF975XB3drfT7avFUNc(fzk));
    }

    public final void d(fzn fzn, fzk fzk) {
        fzs a2 = fzn.a((int) R.id.options_menu_queue_item, (int) R.string.context_menu_add_to_queue, fzz.a(fzn.a(), SpotifyIconV2.QUEUE));
        fzk.getClass();
        a2.a(new $$Lambda$OAuVTvnjF975XB3drfT7avFUNc(fzk));
    }

    public final void d(fzn fzn, boolean z, fzk fzk) {
        Context a2 = fzn.a();
        fzs a3 = fzn.a((int) R.id.actionbar_item_follow, z ? R.string.options_menu_following : R.string.options_menu_follow, fzz.a(fzn.a(), z ? SpotifyIconV2.FOLLOW : SpotifyIconV2.ADDFOLLOW, fr.c(a2, z ? R.color.green : R.color.cat_grayscale_55)));
        fzk.getClass();
        a3.a(new $$Lambda$OAuVTvnjF975XB3drfT7avFUNc(fzk));
    }

    public final void e(fzn fzn, fzk fzk) {
        fzs a2 = fzn.a((int) R.id.options_menu_add_to_home_screen, (int) R.string.options_menu_add_to_home_screen, fzz.a(fzn.a(), SpotifyIconV2.DEVICE_MOBILE));
        fzk.getClass();
        a2.a(new $$Lambda$OAuVTvnjF975XB3drfT7avFUNc(fzk));
    }

    public final void e(fzn fzn, boolean z, fzk fzk) {
        Context a2 = fzn.a();
        fzs a3 = fzn.a((int) R.id.options_menu_save_all_tracks, (CharSequence) a2.getResources().getString(z ? R.string.options_menu_remove_all_tracks_from_collection : R.string.options_menu_add_all_tracks_to_collection), fzz.a(fzn.a(), z ? SpotifyIconV2.HEART_ACTIVE : SpotifyIconV2.HEART, fr.c(a2, z ? R.color.green : R.color.cat_grayscale_55)));
        fzk.getClass();
        a3.a(new $$Lambda$OAuVTvnjF975XB3drfT7avFUNc(fzk));
    }

    public final void f(fzn fzn, fzk fzk) {
        fzs a2 = fzn.a((int) R.id.options_menu_report, (int) R.string.context_menu_report, fzz.a(fzn.a(), SpotifyIconV2.FLAG));
        fzk.getClass();
        a2.a(new $$Lambda$OAuVTvnjF975XB3drfT7avFUNc(fzk));
    }

    public final void g(fzn fzn, fzk fzk) {
        fzs a2 = fzn.a((int) R.id.options_menu_find_friends, (int) R.string.options_menu_find_friends, fzz.a(fzn.a(), SpotifyIconV2.FOLLOW));
        fzk.getClass();
        a2.a(new $$Lambda$OAuVTvnjF975XB3drfT7avFUNc(fzk));
    }
}
