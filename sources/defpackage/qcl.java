package defpackage;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import com.spotify.android.glue.patterns.contextmenu.model.ContextMenuViewModel;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.mobile.android.ui.contextmenu.helper.ContextMenuEvent;
import com.spotify.music.R;
import com.spotify.music.spotlets.radio.service.RadioActionsService;
import com.spotify.music.toastie.ToastieManager;

/* renamed from: qcl reason: default package */
public final class qcl {
    private final jlr a;
    private final Activity b;
    private final uqm c;
    private final sso d;
    private final ContextMenuViewModel e;
    private final jqg f;
    private final szp g;
    private final jvf h;
    private final ToastieManager i;

    private qcl(Activity activity, uqm uqm, sso sso, ContextMenuViewModel contextMenuViewModel, jqg jqg, szp szp, jvf jvf, ToastieManager toastieManager) {
        this.a = (jlr) gih.a(jls.class);
        this.b = activity;
        this.c = uqm;
        this.d = sso;
        this.e = contextMenuViewModel;
        this.f = jqg;
        this.g = szp;
        this.h = jvf;
        this.i = toastieManager;
    }

    public qcl(Activity activity, uqm uqm, sso sso, ContextMenuViewModel contextMenuViewModel, szp szp, jvf jvf, ToastieManager toastieManager) {
        this(activity, uqm, sso, contextMenuViewModel, jqg.a, szp, jvf, toastieManager);
    }

    private Drawable a(SpotifyIconV2 spotifyIconV2) {
        return fzz.a(this.b, spotifyIconV2);
    }

    private fva a(int i2, int i3, SpotifyIconV2 spotifyIconV2) {
        return this.e.a(i2, this.b.getText(i3), a(spotifyIconV2));
    }

    private void a(ContextMenuEvent contextMenuEvent, String str) {
        this.f.a(contextMenuEvent);
        jlr jlr = this.a;
        String str2 = str;
        bg bgVar = new bg(null, this.c.toString(), this.d.toString(), "context-menu", -1, str2, "hit", contextMenuEvent.toString(), (double) jtp.a.a());
        jlr.a(bgVar);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(String str, fva fva) {
        a(ContextMenuEvent.UNFOLLOW_STATION, str);
        new rll(this.b, this.i, this.h).b();
        Activity activity = this.b;
        activity.startService(RadioActionsService.b(activity, str, this.d));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(String str, String str2, fva fva) {
        a(ContextMenuEvent.BROWSE_PLAYLIST, str);
        this.g.a(szk.a(str).b(str2).a());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(String str, fva fva) {
        a(ContextMenuEvent.DELETE_STATION, str);
        Activity activity = this.b;
        activity.startService(RadioActionsService.a((Context) activity, str, this.d));
    }

    private void b(String str, String str2, int i2) {
        a((int) R.id.context_menu_browse_artist, i2, SpotifyIconV2.ARTIST).a((fvc) new $$Lambda$qcl$9Nw8ggQoS1_CaJLIdYJkGZ5GFSU(this, str, str2));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(String str, String str2, fva fva) {
        a(ContextMenuEvent.BROWSE_ARTIST, str);
        this.g.a(szk.a(str).b(str2).a());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void c(String str, String str2, fva fva) {
        a(ContextMenuEvent.BROWSE_ALBUM, str);
        this.g.a(szk.a(str).b(str2).a());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void d(String str, String str2, fva fva) {
        a(ContextMenuEvent.START_RADIO, str);
        this.g.a(szk.a((String) fbp.a(str)).b(str2).a());
    }

    public final void a(String str) {
        a((int) R.id.menu_item_delete_station, (int) R.string.context_menu_delete_station, SpotifyIconV2.X).a((fvc) new $$Lambda$qcl$vL_fyF64jztBtviaHAQlMSZl5Kw(this, str));
    }

    public final void a(String str, fqn fqn, String... strArr) {
        fbp.a(true);
        if (!ute.a(fqn)) {
            a((int) R.id.menu_item_start_station, ute.a(jva.a(strArr[0])), SpotifyIconV2.RADIO).a((fvc) new $$Lambda$qcl$cz91uDTMMcVHcUkSpaB6O4or8hA(this, ute.b(strArr[0]), str));
        }
    }

    public final void a(String str, String str2) {
        b(str, str2, (int) R.string.context_menu_browse_artist);
    }

    public void a(String str, String str2, int i2) {
        a((int) R.id.context_menu_browse_album, i2, SpotifyIconV2.ALBUM).a((fvc) new $$Lambda$qcl$1foRmJF38UzqR3fxypzf5RVtCM(this, str, str2));
    }

    public final void b(String str) {
        a((int) R.id.menu_item_unfollow_station, (int) R.string.context_menu_unfollow_station, SpotifyIconV2.X).a((fvc) new $$Lambda$qcl$GNvzZAgBlOIvkMOQR4LBZ9sFXt4(this, str));
    }

    public final void b(String str, String str2) {
        a((int) R.id.context_menu_browse_playlist, (int) R.string.context_menu_browse_playlist, SpotifyIconV2.PLAYLIST).a((fvc) new $$Lambda$qcl$evpc5dg73Z1LaEYhehNxehxhx8(this, str, str2));
    }
}
