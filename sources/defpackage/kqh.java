package defpackage;

import android.content.Context;
import android.content.Intent;
import com.spotify.music.libs.partnerapps.PartnerType;

/* renamed from: kqh reason: default package */
final class kqh implements kpt {
    private final sff a;
    private final Context b;

    kqh(Context context, sff sff) {
        this.b = context;
        this.a = sff;
    }

    public final void a(kqe kqe) {
        boolean z = kqe.a != null;
        String str = z ? kqe.a : PartnerType.GOOGLE_MAPS.mPackageName;
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
