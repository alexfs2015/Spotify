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

/* renamed from: ptp reason: default package */
public final class ptp {
    private final jjf a;
    private final Activity b;
    private final udr c;
    private final sih d;
    private final ContextMenuViewModel e;
    private final jnu f;
    private final spi g;
    private final jsz h;
    private final ToastieManager i;

    public ptp(Activity activity, udr udr, sih sih, ContextMenuViewModel contextMenuViewModel, spi spi, jsz jsz, ToastieManager toastieManager) {
        this(activity, udr, sih, contextMenuViewModel, jnu.a, spi, jsz, toastieManager);
    }

    private ptp(Activity activity, udr udr, sih sih, ContextMenuViewModel contextMenuViewModel, jnu jnu, spi spi, jsz jsz, ToastieManager toastieManager) {
        this.a = (jjf) ggw.a(jjg.class);
        this.b = activity;
        this.c = udr;
        this.d = sih;
        this.e = contextMenuViewModel;
        this.f = jnu;
        this.g = spi;
        this.h = jsz;
        this.i = toastieManager;
    }

    public final void a(String str, fpt fpt, String... strArr) {
        fay.a(true);
        if (!uhq.a(fpt)) {
            a((int) R.id.menu_item_start_station, uhq.a(jst.a(strArr[0])), SpotifyIconV2.RADIO).a((fui) new $$Lambda$ptp$lUQKcfOcfTRRVxsTvoTiezQL1s(this, uhq.c(strArr[0]), str));
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void d(String str, String str2, fug fug) {
        a(ContextMenuEvent.START_RADIO, str);
        this.g.a(spd.a((String) fay.a(str)).b(str2).a());
    }

    public final void a(String str) {
        a((int) R.id.menu_item_delete_station, (int) R.string.context_menu_delete_station, SpotifyIconV2.X).a((fui) new $$Lambda$ptp$rSZs4ecNTTQ5trkrPbSL1P67qek(this, str));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(String str, fug fug) {
        a(ContextMenuEvent.DELETE_STATION, str);
        Activity activity = this.b;
        activity.startService(RadioActionsService.a((Context) activity, str, this.d));
    }

    public final void b(String str) {
        a((int) R.id.menu_item_unfollow_station, (int) R.string.context_menu_unfollow_station, SpotifyIconV2.X).a((fui) new $$Lambda$ptp$u5wJ5bVIXeygdbiT43XcLEpg(this, str));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(String str, fug fug) {
        a(ContextMenuEvent.UNFOLLOW_STATION, str);
        new rcn(this.b, this.i, this.h).b();
        Activity activity = this.b;
        activity.startService(RadioActionsService.b(activity, str, this.d));
    }

    public void a(String str, String str2, int i2) {
        a((int) R.id.context_menu_browse_album, i2, SpotifyIconV2.ALBUM).a((fui) new $$Lambda$ptp$ad2fY0z5P65yiU8EnrTe72qGxY(this, str, str2));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void c(String str, String str2, fug fug) {
        a(ContextMenuEvent.BROWSE_ALBUM, str);
        this.g.a(spd.a(str).b(str2).a());
    }

    public final void a(String str, String str2) {
        b(str, str2, (int) R.string.context_menu_browse_artist);
    }

    private void b(String str, String str2, int i2) {
        a((int) R.id.context_menu_browse_artist, i2, SpotifyIconV2.ARTIST).a((fui) new $$Lambda$ptp$WrgoIVrEK6LBW8O_RzfNTGZgU(this, str, str2));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(String str, String str2, fug fug) {
        a(ContextMenuEvent.BROWSE_ARTIST, str);
        this.g.a(spd.a(str).b(str2).a());
    }

    public final void b(String str, String str2) {
        a((int) R.id.context_menu_browse_playlist, (int) R.string.context_menu_browse_playlist, SpotifyIconV2.PLAYLIST).a((fui) new $$Lambda$ptp$iujHB9pJznD9_kUTIej9C0ulkuM(this, str, str2));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(String str, String str2, fug fug) {
        a(ContextMenuEvent.BROWSE_PLAYLIST, str);
        this.g.a(spd.a(str).b(str2).a());
    }

    private fug a(int i2, int i3, SpotifyIconV2 spotifyIconV2) {
        return this.e.a(i2, this.b.getText(i3), a(spotifyIconV2));
    }

    private Drawable a(SpotifyIconV2 spotifyIconV2) {
        return fzf.a(this.b, spotifyIconV2);
    }

    private void a(ContextMenuEvent contextMenuEvent, String str) {
        this.f.a(contextMenuEvent);
        jjf jjf = this.a;
        String str2 = str;
        bh bhVar = new bh(null, this.c.toString(), this.d.toString(), "context-menu", -1, str2, "hit", contextMenuEvent.toString(), (double) jrf.a.a());
        jjf.a(bhVar);
    }
}
