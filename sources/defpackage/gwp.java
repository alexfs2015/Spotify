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

/* renamed from: gwp reason: default package */
public final class gwp extends gwm<fuj> {
    private final HubsGlueImageDelegate a;

    public final /* bridge */ /* synthetic */ EnumSet a() {
        return super.a();
    }

    public final /* bridge */ /* synthetic */ void a(View view, gzt gzt, a aVar, int[] iArr) {
        super.a(view, gzt, aVar, iArr);
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ void a(fqe fqe, gzt gzt, a aVar, int[] iArr) {
        fuj fuj = (fuj) fqe;
        int length = iArr.length;
        if (length == 0) {
            haq.a(fuj.getView(), gzt, aVar, iArr);
        } else if (length == 1) {
            int i = iArr[0];
            Button button = i != 0 ? i != 1 ? null : fuj.a().a() : fuj.V_();
            if (button != null) {
                haq.a((View) button, (gzt) gzt.children().get(i), aVar);
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
    public final /* synthetic */ void a(fqe fqe, gzt gzt, gum gum, b bVar) {
        fuj fuj = (fuj) fqe;
        fuj.a((CharSequence) gzt.text().title());
        fuj.b((CharSequence) gzt.text().description());
        ImageView b = fuj.a().b();
        if (b != null) {
            String icon = gzt.images().icon();
            gzw main = gzt.images().main();
            if (icon != null) {
                this.a.a(b);
                SpotifyIconDrawable spotifyIconDrawable = null;
                SpotifyIconV2 spotifyIconV2 = (SpotifyIconV2) a.a.a(icon).d();
                if (spotifyIconV2 != null) {
                    spotifyIconDrawable = new SpotifyIconDrawable(fuj.getView().getContext(), spotifyIconV2, (float) uts.b(64.0f, fuj.getView().getResources()));
                    Integer a2 = HubsGlueImageSettings.a(gzt);
                    if (a2 != null) {
                        spotifyIconDrawable.a(a2.intValue());
                    }
                }
                fuj.a().a((Drawable) spotifyIconDrawable);
            } else if (main != null) {
                fuj.a().a(true);
                this.a.a(b, main, HubsGlueImageConfig.CARD);
            }
        }
        List children = gzt.children();
        if (children.size() > 0) {
            fuj.a(true);
            a(fuj.V_(), (gzt) children.get(0), gum);
        } else {
            fuj.a(false);
        }
        if (children.size() >= 2) {
            fuj.a().b(true);
            a(fuj.a().a(), (gzt) children.get(1), gum);
            return;
        }
        fuj.a().b(false);
    }

    public gwp(HubsGlueImageDelegate hubsGlueImageDelegate) {
        super(EnumSet.noneOf(Trait.class), fuj.class);
        this.a = (HubsGlueImageDelegate) fay.a(hubsGlueImageDelegate);
    }

    private static void a(Button button, gzt gzt, gum gum) {
        button.setText(gzt.text().title());
        guj.a(gum, (View) button, gzt);
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ fqe a(Context context, ViewGroup viewGroup, gum gum) {
        fqb.f();
        return fum.a(viewGroup.getContext(), viewGroup);
    }
}
