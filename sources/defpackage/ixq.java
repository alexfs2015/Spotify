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

/* renamed from: ixq reason: default package */
public final class ixq implements jmy<Void> {
    private final izg b;
    private final ixp c;
    private final Context d;
    private final jjf e;
    private final ixe f;

    public final ContextMenuViewModel a(ContextMenuViewModel contextMenuViewModel, boolean z) {
        return contextMenuViewModel;
    }

    public ixq(Context context, ixp ixp, jjf jjf, ixe ixe, izg izg) {
        this.d = context;
        this.c = ixp;
        this.e = jjf;
        this.f = ixe;
        this.b = izg;
    }

    public final ContextMenuViewModel a(joc<Void> joc) {
        return a();
    }

    public final Observable<ContextMenuViewModel> a(joc<Void> joc, fpt fpt) {
        return Observable.b(a());
    }

    private ContextMenuViewModel a() {
        ContextMenuViewModel contextMenuViewModel = new ContextMenuViewModel();
        contextMenuViewModel.a(this.d.getString(R.string.share_app_facebook_dialog_title));
        a(AppShareDestination.FACEBOOK_STORIES, contextMenuViewModel, AppShareDestination.FACEBOOK_STORIES.a(this.d), 0);
        a(AppShareDestination.FACEBOOK_FEED, contextMenuViewModel, (Drawable) fay.a(fr.a(this.d, (int) R.drawable.share_icn_facebook_newsfeed)), 1);
        return contextMenuViewModel;
    }

    private void a(AppShareDestination appShareDestination, ContextMenuViewModel contextMenuViewModel, Drawable drawable, int i) {
        if (this.b.a(appShareDestination) && appShareDestination.a(this.f.a.e().b)) {
            contextMenuViewModel.a(appShareDestination.mId, (CharSequence) this.d.getString(appShareDestination.mNameStringResId), drawable).d(true).a((fui) new $$Lambda$ixq$ENkjL_DbkPJPkvYCb2w8mCG5i8(this, i));
            a((String) fay.a(this.f.a.e().h()), appShareDestination.mLogId, (long) i);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(int i, fug fug) {
        ixp ixp = this.c;
        if (fug.h() == AppShareDestination.FACEBOOK_STORIES.mId) {
            ixp.b.a(ixp.c.b, AppShareDestination.FACEBOOK_STORIES.mLogId, (long) i);
            ixp.d.startActivity(FacebookStoryShareLoaderActivity.a(ixp.d, (String) fay.a(ixp.c.a.e().h()), ixp.c.a()));
        } else if (fug.h() == AppShareDestination.FACEBOOK_FEED.mId) {
            ixp.b.a(ixp.c.b, AppShareDestination.FACEBOOK_FEED.mLogId, (long) i);
            ixp.d.startActivity(FacebookFeedShareActivity.a(ixp.d, ixp.c));
        }
        ixp.a.a(ContextMenuEvent.SHARE);
    }

    private void a(String str, String str2, long j) {
        jjf jjf = this.e;
        String str3 = str;
        String str4 = str2;
        long j2 = j;
        bf bfVar = new bf("", udt.aQ.toString(), str3, str4, j2, "", ImpressionType.ITEM.toString(), RenderType.LIST.toString(), (double) jrf.a.a());
        jjf.a(bfVar);
    }
}
