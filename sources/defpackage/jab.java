package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.spotify.android.glue.patterns.contextmenu.model.ContextMenuViewModel;
import com.spotify.mobile.android.spotlets.share.AppShareDestination;
import com.spotify.mobile.android.spotlets.share.facebook.FacebookFeedShareActivity;
import com.spotify.mobile.android.spotlets.share.stories.ui.FacebookStoryShareLoaderActivity;
import com.spotify.mobile.android.ui.contextmenu.helper.ContextMenuEvent;
import com.spotify.music.R;
import com.spotify.music.loggers.ImpressionLogger.ImpressionType;
import com.spotify.music.loggers.ImpressionLogger.RenderType;
import io.reactivex.Observable;

/* renamed from: jab reason: default package */
public final class jab implements jpk<Void> {
    private final jbr b;
    private final jaa c;
    private final Context d;
    private final jlr e;
    private final izp f;

    public jab(Context context, jaa jaa, jlr jlr, izp izp, jbr jbr) {
        this.d = context;
        this.c = jaa;
        this.e = jlr;
        this.f = izp;
        this.b = jbr;
    }

    private ContextMenuViewModel a() {
        ContextMenuViewModel contextMenuViewModel = new ContextMenuViewModel();
        contextMenuViewModel.a(this.d.getString(R.string.share_app_facebook_dialog_title));
        a(AppShareDestination.FACEBOOK_STORIES, contextMenuViewModel, AppShareDestination.FACEBOOK_STORIES.a(this.d), 0);
        a(AppShareDestination.FACEBOOK_FEED, contextMenuViewModel, (Drawable) fbp.a(fr.a(this.d, (int) R.drawable.share_icn_facebook_newsfeed)), 1);
        return contextMenuViewModel;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(int i, fva fva) {
        jaa jaa = this.c;
        if (fva.h() == AppShareDestination.FACEBOOK_STORIES.mId) {
            jaa.b.a(jaa.c.b, AppShareDestination.FACEBOOK_STORIES.mLogId, (long) i);
            jaa.d.startActivity(FacebookStoryShareLoaderActivity.a(jaa.d, (String) fbp.a(jaa.c.a.e().h()), jaa.c.a()));
        } else if (fva.h() == AppShareDestination.FACEBOOK_FEED.mId) {
            jaa.b.a(jaa.c.b, AppShareDestination.FACEBOOK_FEED.mLogId, (long) i);
            jaa.d.startActivity(FacebookFeedShareActivity.a(jaa.d, jaa.c));
        }
        jaa.a.a(ContextMenuEvent.SHARE);
    }

    private void a(AppShareDestination appShareDestination, ContextMenuViewModel contextMenuViewModel, Drawable drawable, int i) {
        if (this.b.a(appShareDestination) && appShareDestination.a(this.f.a.e().b)) {
            contextMenuViewModel.a(appShareDestination.mId, (CharSequence) this.d.getString(appShareDestination.mNameStringResId), drawable).d(true).a((fvc) new $$Lambda$jab$L__O14qrMj1j6IwSCTfptsWs0ss(this, i));
            a((String) fbp.a(this.f.a.e().h()), appShareDestination.mLogId, (long) i);
        }
    }

    private void a(String str, String str2, long j) {
        jlr jlr = this.e;
        String str3 = str;
        String str4 = str2;
        long j2 = j;
        be beVar = new be("", uqo.aQ.toString(), str3, str4, j2, "", ImpressionType.ITEM.toString(), RenderType.LIST.toString(), (double) jtp.a.a());
        jlr.a(beVar);
    }

    public final ContextMenuViewModel a(ContextMenuViewModel contextMenuViewModel, boolean z) {
        return contextMenuViewModel;
    }

    public final ContextMenuViewModel a(jqo<Void> jqo) {
        return a();
    }

    public final Observable<ContextMenuViewModel> a(jqo<Void> jqo, fqn fqn) {
        return Observable.b(a());
    }
}
