package defpackage;

import android.content.Context;
import android.content.Intent;
import com.spotify.music.libs.partnerapps.PartnerType;

/* renamed from: kmy reason: default package */
final class kmy implements kmk {
    private final rvv a;
    private final Context b;

    kmy(Context context, rvv rvv) {
        this.b = context;
        this.a = rvv;
    }

    public final void a(kmv kmv) {
        String str;
        boolean z = kmv.a != null;
        if (z) {
            str = kmv.a;
        } else {
            str = PartnerType.GOOGLE_MAPS.mPackageName;
        }
        Intent launchIntentForPackage = this.b.getPackageManager().getLaunchIntentForPackage(str);
        if (launchIntentForPackage != null) {
            this.a.d();
            if (z) {
                launchIntentForPackage.putExtra("com.spotify.music.external.banner.MAPS_PACKAGE_NAME", str);
            }
            this.b.startActivity(launchIntentForPackage);
        }
    }
}
