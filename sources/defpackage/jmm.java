package defpackage;

import com.spotify.mobile.android.spotlets.share.AppShareDestination;
import com.spotify.mobile.android.ui.contextmenu.ContextMenuHelper;

/* renamed from: jmm reason: default package */
public final class jmm {
    private final ContextMenuHelper a;
    private final izg b;

    public jmm(ContextMenuHelper contextMenuHelper, izg izg) {
        this.a = contextMenuHelper;
        this.b = izg;
    }

    public final iwz a(AppShareDestination appShareDestination) {
        return new $$Lambda$jmm$w9shbHzvhE9w67ka13Dt3M3SDw(this, appShareDestination);
    }

    private static boolean a(AppShareDestination appShareDestination, a aVar) {
        return appShareDestination.a(aVar.a) && appShareDestination.a(aVar.d.a.e().b);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(AppShareDestination appShareDestination, a aVar, long j) {
        AppShareDestination appShareDestination2 = appShareDestination;
        a aVar2 = aVar;
        if (this.b.a(appShareDestination2)) {
            switch (appShareDestination) {
                case GENERIC_SMS:
                    this.a.a(j, aVar2.d, aVar2.e, aVar2.b);
                    break;
                case FACEBOOK_MESSENGER:
                    a b2 = aVar2.c.b(AppShareDestination.FACEBOOK_MESSENGER.mPackageNameSpace);
                    if (b2 != null) {
                        this.a.a(j, AppShareDestination.FACEBOOK_MESSENGER, b2, aVar2.d, aVar2.b);
                    }
                    return;
                case FACEBOOK_DEFAULT:
                    if (a(appShareDestination, aVar)) {
                        this.a.a(j, appShareDestination, aVar2.d, aVar2.b);
                    }
                    return;
                case FACEBOOK_POPUP:
                    if (a(appShareDestination, aVar)) {
                        this.a.b(j, appShareDestination, aVar2.d, aVar2.b);
                    }
                    return;
                case FACEBOOK_FEED:
                    boolean a2 = appShareDestination2.a(aVar2.a);
                    boolean a3 = appShareDestination2.a(aVar2.d.a.e().b);
                    boolean a4 = AppShareDestination.FACEBOOK_DEFAULT.a(aVar2.a);
                    boolean a5 = AppShareDestination.FACEBOOK_DEFAULT.a(aVar2.d.a.e().b);
                    if ((a2 && a3) || (a4 && !a5 && a3)) {
                        this.a.c(j, appShareDestination, aVar2.d, aVar2.b);
                    }
                    return;
                case FACEBOOK_STORIES:
                    if (a(appShareDestination, aVar)) {
                        this.a.d(j, appShareDestination, aVar2.d, aVar2.b);
                    }
                    return;
                case INSTAGRAM:
                    boolean a6 = AppShareDestination.INSTAGRAM.a(aVar2.a);
                    boolean a7 = AppShareDestination.INSTAGRAM.a(aVar2.d.a.e().b);
                    if (a6 && a7) {
                        this.a.e(j, AppShareDestination.INSTAGRAM, aVar2.d, aVar2.b);
                    }
                    return;
                case SNAPCHAT_STORIES:
                    boolean a8 = AppShareDestination.SNAPCHAT_STORIES.a(aVar2.a);
                    boolean a9 = AppShareDestination.SNAPCHAT_STORIES.a(aVar2.d.a.e().b);
                    if (a8 && a9) {
                        this.a.f(j, AppShareDestination.SNAPCHAT_STORIES, aVar2.d, aVar2.b);
                    }
                    return;
                default:
                    iwo iwo = aVar2.c;
                    boolean a10 = appShareDestination2.a(aVar2.a);
                    boolean a11 = appShareDestination2.a(aVar2.d.a.e().b);
                    if (a10 && a11) {
                        a b3 = iwo.b(appShareDestination2.mPackageNameSpace);
                        if (b3 != null) {
                            this.a.a(j, appShareDestination, b3, aVar2.d, aVar2.e, aVar2.b);
                            break;
                        }
                    }
                    break;
            }
        }
    }
}
