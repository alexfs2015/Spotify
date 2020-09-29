package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.mobile.android.glue.GlueLayoutTraits.Trait;
import com.spotify.mobile.android.hubframework.defaults.HubsGlueImageDelegate;
import com.spotify.mobile.android.hubframework.defaults.components.custom.HubsGlueImageSettings;
import com.spotify.mobile.android.hubframework.defaults.components.glue.HubsGlueImageConfig;
import com.spotify.paste.spotifyicon.SpotifyIconDrawable;
import java.util.EnumSet;
import java.util.List;

/* renamed from: gys reason: default package */
public final class gys extends gyo<fvd> {
    private final HubsGlueImageDelegate a;

    public gys(HubsGlueImageDelegate hubsGlueImageDelegate) {
        super(EnumSet.noneOf(Trait.class), fvd.class);
        this.a = (HubsGlueImageDelegate) fbp.a(hubsGlueImageDelegate);
    }

    private static void a(Button button, hcm hcm, gwm gwm) {
        button.setText(hcm.text().title());
        gwj.a(gwm, (View) button, hcm);
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ fqy a(Context context, ViewGroup viewGroup, gwm gwm) {
        fqv.f();
        return fvg.a(viewGroup.getContext(), viewGroup);
    }

    public final /* bridge */ /* synthetic */ EnumSet a() {
        return super.a();
    }

    public final /* bridge */ /* synthetic */ void a(View view, hcm hcm, a aVar, int[] iArr) {
        super.a(view, hcm, aVar, iArr);
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ void a(fqy fqy, hcm hcm, a aVar, int[] iArr) {
        fvd fvd = (fvd) fqy;
        int length = iArr.length;
        if (length == 0) {
            hdj.a(fvd.getView(), hcm, aVar, iArr);
        } else if (length == 1) {
            int i = iArr[0];
            Button button = i != 0 ? i != 1 ? null : fvd.a().a() : fvd.V_();
            if (button != null) {
                hdj.a((View) button, (hcm) hcm.children().get(i), aVar);
                return;
            }
            StringBuilder sb = new StringBuilder("No child at ");
            sb.append(i);
            sb.append(" position");
            throw new IllegalArgumentException(sb.toString());
        } else {
            throw new UnsupportedOperationException("Empty states have at most one generation of children");
        }
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ void a(fqy fqy, hcm hcm, gwm gwm, b bVar) {
        fvd fvd = (fvd) fqy;
        fvd.a((CharSequence) hcm.text().title());
        fvd.b((CharSequence) hcm.text().description());
        ImageView b = fvd.a().b();
        if (b != null) {
            String icon = hcm.images().icon();
            hcp main = hcm.images().main();
            if (icon != null) {
                this.a.a(b);
                SpotifyIconDrawable spotifyIconDrawable = null;
                SpotifyIconV2 spotifyIconV2 = (SpotifyIconV2) a.a.a(icon).d();
                if (spotifyIconV2 != null) {
                    spotifyIconDrawable = new SpotifyIconDrawable(fvd.getView().getContext(), spotifyIconV2, (float) vfj.b(64.0f, fvd.getView().getResources()));
                    Integer a2 = HubsGlueImageSettings.a(hcm);
                    if (a2 != null) {
                        spotifyIconDrawable.a(a2.intValue());
                    }
                }
                fvd.a().a((Drawable) spotifyIconDrawable);
            } else if (main != null) {
                fvd.a().a(true);
                this.a.a(b, main, HubsGlueImageConfig.CARD);
            }
        }
        List children = hcm.children();
        if (children.size() > 0) {
            fvd.a(true);
            a(fvd.V_(), (hcm) children.get(0), gwm);
        } else {
            fvd.a(false);
        }
        if (children.size() >= 2) {
            fvd.a().b(true);
            a(fvd.a().a(), (hcm) children.get(1), gwm);
            return;
        }
        fvd.a().b(false);
    }
}
