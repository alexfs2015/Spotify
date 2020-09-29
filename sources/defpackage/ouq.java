package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.music.R;

/* renamed from: ouq reason: default package */
final class ouq {
    private final ouw a;
    private final rcn b;

    public ouq(ouw ouw, rcn rcn) {
        this.a = ouw;
        this.b = rcn;
    }

    public final void a(fyt fyt, String str, boolean z, fyq fyq) {
        fyt.a((int) R.id.options_menu_follow_playlist, z ? R.string.playlist_options_menu_unfollow : R.string.playlist_options_menu_follow, fzf.a(fyt.a(), z ? SpotifyIconV2.X : SpotifyIconV2.PLUS)).a(new $$Lambda$ouq$RT_CuERfnVXHZl9j93tVp4bs(this, str, z, fyq));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void c(String str, boolean z, fyq fyq) {
        this.a.a(str, z);
        if (z) {
            this.b.b();
        } else {
            this.b.a();
        }
        fyq.onClick();
    }

    public final void b(fyt fyt, String str, boolean z, fyq fyq) {
        fyt.a((int) R.id.options_menu_collaborative, z ? R.string.playlist_options_menu_uncollaborative : R.string.playlist_options_menu_collaborative, fzf.a(fyt.a(), SpotifyIconV2.COLLABORATIVE_PLAYLIST)).a(new $$Lambda$ouq$paCI3byjZZwN7JUCMfxllyej7v0(this, str, z, fyq));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(String str, boolean z, fyq fyq) {
        this.a.b(str, z);
        fyq.onClick();
    }

    public final void c(fyt fyt, String str, boolean z, fyq fyq) {
        fyt.a((int) R.id.options_menu_publish, z ? R.string.playlist_options_menu_unpublish : R.string.playlist_options_menu_publish, fzf.a(fyt.a(), z ? SpotifyIconV2.LOCKED : SpotifyIconV2.LOCKED_ACTIVE)).a(new $$Lambda$ouq$yjHqfT3mPXZTb3nxBc6O5l74vA(this, str, z, fyq));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(String str, boolean z, fyq fyq) {
        this.a.c(str, z);
        fyq.onClick();
    }

    public final void a(fyt fyt, String str, String str2, fyq fyq) {
        fyy a2 = fyt.a((int) R.id.options_menu_delete_playlist, (int) R.string.context_menu_delete_playlist, fzf.a(fyt.a(), SpotifyIconV2.X));
        $$Lambda$ouq$WdUmpQWhQWqwg7MHJcot6b8wDnA r1 = new $$Lambda$ouq$WdUmpQWhQWqwg7MHJcot6b8wDnA(this, str, fyt, str2, fyq);
        a2.a(r1);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(String str, fyt fyt, String str2, fyq fyq) {
        this.a.d(str);
        Context a2 = fyt.a();
        fsy.a(a2, a2.getString(R.string.playlist_confirm_deletion_playlist_title), a2.getString(R.string.playlist_confirm_deletion_body, new Object[]{str2})).a(a2.getString(R.string.playlist_confirm_deletion_button_delete), new $$Lambda$ouq$teCKKuiBrTXD_xb8wXt55lo(this, str, fyq)).b(a2.getString(R.string.playlist_confirm_deletion_button_cancel), new $$Lambda$ouq$XjFMixVZvwZNf2VMETku2qB3rs(this, str)).a().a();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(String str, fyq fyq, DialogInterface dialogInterface, int i) {
        this.a.e(str);
        fyq.onClick();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(String str, DialogInterface dialogInterface, int i) {
        this.a.f(str);
        dialogInterface.dismiss();
    }

    public final void a(fyt fyt, hbj hbj, String str, String str2) {
        fyt.a((int) R.id.options_menu_rename_playlist, (int) R.string.playlist_options_menu_rename, fzf.a(fyt.a(), SpotifyIconV2.EDIT)).a(new $$Lambda$ouq$a7HDccitMUXaLos7GRnHRpEvxs(this, str, hbj, str2));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(String str, hbj hbj, String str2) {
        this.a.c(str);
        hbj.a(str, str2);
    }

    public final void a(fyt fyt, hbj hbj, String str) {
        fyt.a((int) R.id.options_menu_edit_playlist, (int) R.string.playlist_options_menu_edit, fzf.a(fyt.a(), SpotifyIconV2.EDIT)).a(new $$Lambda$ouq$h4hnUt_1RWRHQVG2vGaJWl6qDig(this, str, hbj));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(String str, hbj hbj) {
        this.a.b(str);
        hbj.c(str);
    }

    public final void b(fyt fyt, hbj hbj, String str) {
        fyt.a((int) R.id.options_menu_add_songs_to_playlist, (int) R.string.playlist_options_menu_add_songs, fzf.a(fyt.a(), SpotifyIconV2.PLUS_ALT)).a(new $$Lambda$ouq$tMdLZYaukPgvLF_uybV_22ay3qM(this, str, hbj));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(String str, hbj hbj) {
        this.a.a(str);
        hbj.a(str);
    }

    public final void a(fyt fyt, fyq fyq) {
        fyt.a((int) R.id.toolbar_menu_sort, (CharSequence) fyt.a().getString(R.string.playlist_toolbar_sort), fzf.a(fyt.a(), SpotifyIconV2.SORT)).a(new $$Lambda$ouq$Mvrl5ZbctgNVuOUtUcEkm7LXv0g(this, fyq));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(fyq fyq) {
        this.a.b();
        fyq.onClick();
    }

    public final void b(fyt fyt, fyq fyq) {
        fyt.a((int) R.id.toolbar_menu_find, (CharSequence) fyt.a().getString(R.string.playlist_toolbar_find), fzf.a(fyt.a(), SpotifyIconV2.SEARCH)).a(new $$Lambda$ouq$IMb01bMlP2NelpuaUVdyWlk29XE(this, fyq));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(fyq fyq) {
        this.a.c();
        fyq.onClick();
    }
}
