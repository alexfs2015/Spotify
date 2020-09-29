package defpackage;

import android.content.Context;
import com.facebook.share.widget.ShareDialog;
import com.spotify.mobile.android.spotlets.share.AppShareDestination;

/* renamed from: jbs reason: default package */
public final class jbs implements jbr {
    private final Context a;
    private final izr b;
    private final izt c;
    private final jam d;
    private final jar e;
    private final jaw f;

    public jbs(Context context, izr izr, izt izt, jam jam, jar jar, jaw jaw) {
        this.a = context;
        this.b = izr;
        this.c = izt;
        this.d = jam;
        this.e = jar;
        this.f = jaw;
    }

    public final boolean a(AppShareDestination appShareDestination) {
        switch (appShareDestination) {
            case GENERIC_SMS:
                return true;
            case FACEBOOK_MESSENGER:
                return aps.a(aph.class);
            case FACEBOOK_DEFAULT:
            case FACEBOOK_STORIES:
            case FACEBOOK_POPUP:
                return this.d.a(this.a.getPackageManager());
            case FACEBOOK_FEED:
                return ShareDialog.a(apd.class);
            case INSTAGRAM:
                return this.e.a(this.a.getPackageManager());
            case SNAPCHAT_STORIES:
                return this.f.a(this.a.getPackageManager());
            default:
                return new iyz(this.a.getPackageManager()).a(appShareDestination.mPackageNameSpace);
        }
    }
}
