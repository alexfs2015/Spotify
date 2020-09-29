package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import android.widget.ImageView;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.mobile.android.hubframework.defaults.HubsGlueImageDelegate;
import com.spotify.mobile.android.hubframework.defaults.HubsGlueImageDelegate.ImageConfig;
import com.spotify.mobile.android.hubframework.defaults.HubsGlueImageDelegate.ImageConfig.ImageSize;
import com.spotify.mobile.android.hubframework.defaults.components.custom.HubsGlueImageSettings;
import com.spotify.mobile.android.hubframework.defaults.components.custom.HubsGlueImageSettings.Style;
import com.spotify.mobile.android.util.ui.BadgesFactory;
import com.spotify.music.R;
import com.squareup.picasso.Picasso;

/* renamed from: ham reason: default package */
public final class ham implements HubsGlueImageDelegate {
    private final hap a;
    private final har b;
    private final Picasso c;
    private final BadgesFactory d;

    /* renamed from: ham$1 reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] a = new int[Style.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        static {
            /*
                com.spotify.mobile.android.hubframework.defaults.components.custom.HubsGlueImageSettings$Style[] r0 = com.spotify.mobile.android.hubframework.defaults.components.custom.HubsGlueImageSettings.Style.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                a = r0
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.spotify.mobile.android.hubframework.defaults.components.custom.HubsGlueImageSettings$Style r1 = com.spotify.mobile.android.hubframework.defaults.components.custom.HubsGlueImageSettings.Style.CIRCULAR_WITH_RIPPLE     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x001f }
                com.spotify.mobile.android.hubframework.defaults.components.custom.HubsGlueImageSettings$Style r1 = com.spotify.mobile.android.hubframework.defaults.components.custom.HubsGlueImageSettings.Style.SQUARE_WITH_RIPPLE     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.ham.AnonymousClass1.<clinit>():void");
        }
    }

    ham(Context context, Picasso picasso, BadgesFactory badgesFactory) {
        this.a = new hap(context, SpotifyIconV2.TRACK);
        this.b = new har(context);
        this.c = picasso;
        this.d = badgesFactory;
    }

    private static Uri b(String str) {
        if (!TextUtils.isEmpty(str)) {
            return Uri.parse(str);
        }
        return null;
    }

    public final Drawable a(String str, ImageConfig imageConfig) {
        return this.a.a(str, imageConfig);
    }

    public final Uri a(String str) {
        return b(str);
    }

    public final har a() {
        return this.b;
    }

    public final void a(ImageView imageView) {
        this.c.d(imageView);
    }

    public final void a(ImageView imageView, hcp hcp, ImageConfig imageConfig) {
        vfk vfk = null;
        if (hcp == null) {
            a(imageView);
            imageView.setImageDrawable(null);
            return;
        }
        ImageSize b2 = imageConfig.b();
        Drawable a2 = a(hcp.placeholder(), imageConfig);
        wgr b3 = this.c.a(b(hcp.uri())).a(a2).b(a2);
        int i = AnonymousClass1.a[HubsGlueImageSettings.b(hcp).ordinal()];
        wgz wgz = i != 1 ? i != 2 ? vhc.b() : b2 == ImageSize.LARGE ? this.b.d : this.b.b : b2 == ImageSize.LARGE ? this.b.c : this.b.a;
        wgr a3 = b3.a(wgz);
        Context context = imageView.getContext();
        if (HubsGlueImageSettings.b(hcp) == Style.CIRCULAR) {
            vfk = vgq.a();
        }
        if (hcp.custom().boolValue("verified", false)) {
            vfk = this.d.a(context, gye.a(b2), vfk);
        }
        if (vfk == null) {
            a3.a(imageView);
        } else {
            a3.a(vhj.a(imageView, vfk));
        }
    }

    public final void a(ImageView imageView, String str) {
        SpotifyIconV2 spotifyIconV2 = (SpotifyIconV2) a.a.a(str).a(SpotifyIconV2.TRACK);
        if (spotifyIconV2 != imageView.getTag(R.id.hub_glue_internal_tag_image_icon)) {
            imageView.setImageDrawable(jyz.c(imageView.getContext(), spotifyIconV2));
            imageView.setTag(R.id.hub_glue_internal_tag_image_icon, spotifyIconV2);
        }
    }

    public final Picasso b() {
        return this.c;
    }
}
