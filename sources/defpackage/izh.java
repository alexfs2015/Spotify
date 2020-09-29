package defpackage;

import android.content.Context;
import com.facebook.share.widget.ShareDialog;
import com.spotify.mobile.android.spotlets.share.AppShareDestination;

/* renamed from: izh reason: default package */
public final class izh implements izg {
    private final Context a;
    private final ixg b;
    private final ixi c;
    private final iyb d;
    private final iyg e;
    private final iyl f;

    public izh(Context context, ixg ixg, ixi ixi, iyb iyb, iyg iyg, iyl iyl) {
        this.a = context;
        this.b = ixg;
        this.c = ixi;
        this.d = iyb;
        this.e = iyg;
        this.f = iyl;
    }

    public final boolean a(AppShareDestination appShareDestination) {
        switch (appShareDestination) {
            case GENERIC_SMS:
                return true;
            case FACEBOOK_MESSENGER:
                return ape.a(aot.class);
            case FACEBOOK_DEFAULT:
            case FACEBOOK_STORIES:
            case FACEBOOK_POPUP:
                return this.d.a(this.a.getPackageManager());
            case FACEBOOK_FEED:
                return ShareDialog.a(aop.class);
            case INSTAGRAM:
                return this.e.a(this.a.getPackageManager());
            case SNAPCHAT_STORIES:
                return this.f.a(this.a.getPackageManager());
            default:
                return new iwo(this.a.getPackageManager()).a(appShareDestination.mPackageNameSpace);
        }
    }
}
