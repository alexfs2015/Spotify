package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.music.R;

/* renamed from: pcb reason: default package */
final class pcb {
    private final pch a;
    private final rll b;

    public pcb(pch pch, rll rll) {
        this.a = pch;
        this.b = rll;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(fzk fzk) {
        this.a.c();
        fzk.onClick();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(String str, DialogInterface dialogInterface, int i) {
        this.a.f(str);
        dialogInterface.dismiss();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(String str, fzk fzk, DialogInterface dialogInterface, int i) {
        this.a.e(str);
        fzk.onClick();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(String str, fzn fzn, String str2, fzk fzk) {
        this.a.d(str);
        Context a2 = fzn.a();
        fts.a(a2, a2.getString(R.string.playlist_confirm_deletion_playlist_title), a2.getString(R.string.playlist_confirm_deletion_body, new Object[]{str2})).a(a2.getString(R.string.playlist_confirm_deletion_button_delete), new $$Lambda$pcb$S9__SZqKm6RUW38YAOrK9yAJlcU(this, str, fzk)).b(a2.getString(R.string.playlist_confirm_deletion_button_cancel), new $$Lambda$pcb$2pGTEztd5wOYC18WZ7Ty4T3__Zc(this, str)).a().a();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(String str, hec hec) {
        this.a.a(str);
        hec.a(str);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(String str, hec hec, String str2) {
        this.a.c(str);
        hec.a(str, str2);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(String str, boolean z, fzk fzk) {
        this.a.c(str, z);
        fzk.onClick();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(fzk fzk) {
        this.a.b();
        fzk.onClick();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(String str, hec hec) {
        this.a.b(str);
        hec.c(str);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(String str, boolean z, fzk fzk) {
        this.a.b(str, z);
        fzk.onClick();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void c(String str, boolean z, fzk fzk) {
        this.a.a(str, z);
        if (z) {
            this.b.b();
        } else {
            this.b.a();
        }
        fzk.onClick();
    }

    public final void a(fzn fzn, fzk fzk) {
        fzn.a((int) R.id.toolbar_menu_sort, (CharSequence) fzn.a().getString(R.string.playlist_toolbar_sort), fzz.a(fzn.a(), SpotifyIconV2.SORT)).a(new $$Lambda$pcb$wIFv9MK0BYGX47_saIaf5A0Qcc(this, fzk));
    }

    public final void a(fzn fzn, hec hec, String str) {
        fzn.a((int) R.id.options_menu_edit_playlist, (int) R.string.playlist_options_menu_edit, fzz.a(fzn.a(), SpotifyIconV2.EDIT)).a(new $$Lambda$pcb$IAtazpFLYACYXhA00Ne6U7DVD2w(this, str, hec));
    }

    public final void a(fzn fzn, hec hec, String str, String str2) {
        fzn.a((int) R.id.options_menu_rename_playlist, (int) R.string.playlist_options_menu_rename, fzz.a(fzn.a(), SpotifyIconV2.EDIT)).a(new $$Lambda$pcb$X_wk3OO1zaebWcG_IjharSfBSYE(this, str, hec, str2));
    }

    public final void a(fzn fzn, String str, String str2, fzk fzk) {
        fzs a2 = fzn.a((int) R.id.options_menu_delete_playlist, (int) R.string.context_menu_delete_playlist, fzz.a(fzn.a(), SpotifyIconV2.X));
        $$Lambda$pcb$AwggKdf3XaVrsZW6dXWfR_Pfh04 r1 = new $$Lambda$pcb$AwggKdf3XaVrsZW6dXWfR_Pfh04(this, str, fzn, str2, fzk);
        a2.a(r1);
    }

    public final void a(fzn fzn, String str, boolean z, fzk fzk) {
        fzn.a((int) R.id.options_menu_follow_playlist, z ? R.string.playlist_options_menu_unfollow : R.string.playlist_options_menu_follow, fzz.a(fzn.a(), z ? SpotifyIconV2.X : SpotifyIconV2.PLUS)).a(new $$Lambda$pcb$UP48K6rU04ZYFavEur8CuWwWc4(this, str, z, fzk));
    }

    public final void b(fzn fzn, fzk fzk) {
        fzn.a((int) R.id.toolbar_menu_find, (CharSequence) fzn.a().getString(R.string.playlist_toolbar_find), fzz.a(fzn.a(), SpotifyIconV2.SEARCH)).a(new $$Lambda$pcb$1f_CNOdoxG4s2UqJOJgT10Bq7o(this, fzk));
    }

    public final void b(fzn fzn, hec hec, String str) {
        fzn.a((int) R.id.options_menu_add_songs_to_playlist, (int) R.string.playlist_options_menu_add_songs, fzz.a(fzn.a(), SpotifyIconV2.PLUS_ALT)).a(new $$Lambda$pcb$xZMGB4phsZsHAuoCkSKAIEuHKPo(this, str, hec));
    }

    public final void b(fzn fzn, String str, boolean z, fzk fzk) {
        fzn.a((int) R.id.options_menu_collaborative, z ? R.string.playlist_options_menu_uncollaborative : R.string.playlist_options_menu_collaborative, fzz.a(fzn.a(), SpotifyIconV2.COLLABORATIVE_PLAYLIST)).a(new $$Lambda$pcb$8RdNtdymBPtRfKjrFvwq3zNY4DU(this, str, z, fzk));
    }

    public final void c(fzn fzn, String str, boolean z, fzk fzk) {
        fzn.a((int) R.id.options_menu_publish, z ? R.string.playlist_options_menu_unpublish : R.string.playlist_options_menu_publish, fzz.a(fzn.a(), z ? SpotifyIconV2.LOCKED : SpotifyIconV2.LOCKED_ACTIVE)).a(new $$Lambda$pcb$Ct_5VMoaTfWhUbIbjBIukJjzWSM(this, str, z, fzk));
    }
}
