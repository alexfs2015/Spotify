package defpackage;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.TextView;
import android.widget.ToggleButton;
import com.spotify.android.glue.patterns.prettylist.PrettyHeaderView;
import com.spotify.mobile.android.glue.GlueLayoutTraits.Trait;
import com.spotify.mobile.android.hubframework.defaults.HubsGlueImageDelegate;
import com.spotify.mobile.android.hubframework.defaults.components.glue.HubsGlueImageConfig;
import com.spotify.music.R;
import com.spotify.paste.widgets.HeaderView;
import com.spotify.paste.widgets.TextHeaderView;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.List;

/* renamed from: gws reason: default package */
public class gws implements gvl<PrettyHeaderView> {
    final HubsGlueImageDelegate a;

    /* renamed from: gws$a */
    public static final class a extends gws {
        public final /* bridge */ /* synthetic */ void a(View view, gzt gzt, defpackage.gui.a aVar, int[] iArr) {
            gws.a((PrettyHeaderView) view, gzt, aVar, iArr);
        }

        public final /* bridge */ /* synthetic */ void a(View view, gzt gzt, gum gum, defpackage.gui.b bVar) {
            gws.super.a((PrettyHeaderView) view, gzt, gum, bVar);
        }

        public a(HubsGlueImageDelegate hubsGlueImageDelegate) {
            super(hubsGlueImageDelegate);
        }

        /* renamed from: b */
        public final PrettyHeaderView a(ViewGroup viewGroup, gum gum) {
            PrettyHeaderView b = gws.super.a(viewGroup, gum);
            b.b.b(false);
            return b;
        }
    }

    /* renamed from: gws$b */
    public static final class b extends gws {
        /* access modifiers changed from: protected */
        public final boolean b() {
            return true;
        }

        public final /* synthetic */ View a(ViewGroup viewGroup, gum gum) {
            return gws.super.a(viewGroup, gum);
        }

        public final /* bridge */ /* synthetic */ void a(View view, gzt gzt, defpackage.gui.a aVar, int[] iArr) {
            gws.a((PrettyHeaderView) view, gzt, aVar, iArr);
        }

        public final /* bridge */ /* synthetic */ void a(View view, gzt gzt, gum gum, defpackage.gui.b bVar) {
            gws.super.a((PrettyHeaderView) view, gzt, gum, bVar);
        }

        public b(HubsGlueImageDelegate hubsGlueImageDelegate) {
            super(hubsGlueImageDelegate);
        }

        /* access modifiers changed from: protected */
        public final View a(Context context) {
            HeaderView headerView = new HeaderView(context);
            headerView.b(gwr.a(context));
            return headerView;
        }

        /* access modifiers changed from: protected */
        public final void a(View view, gzt gzt, gum gum) {
            HeaderView headerView = (HeaderView) view;
            ImageView imageView = headerView.b;
            headerView.b.setScaleType(ScaleType.CENTER_CROP);
            this.a.a(imageView, gzt.images().main(), HubsGlueImageConfig.CARD);
            String title = gzt.text().title();
            String subtitle = gzt.text().subtitle();
            String accessory = gzt.text().accessory();
            if (!TextUtils.isEmpty(title) || !TextUtils.isEmpty(subtitle)) {
                headerView.a((CharSequence) title);
                headerView.b((CharSequence) subtitle);
            } else {
                headerView.a((CharSequence) null);
                headerView.b((CharSequence) null);
            }
            if (!TextUtils.isEmpty(accessory)) {
                View view2 = headerView.d;
                if (view2 == null) {
                    view2 = gwr.a(headerView.getContext());
                    headerView.b(view2);
                }
                TextView textView = (TextView) view2.findViewById(R.id.hubs_header_metadata);
                textView.setVisibility(0);
                textView.setText(accessory);
            } else {
                headerView.b((View) null);
            }
            gzt gzt2 = (gzt) fcl.a((Iterable<? extends T>) gzt.childGroup("secondary_buttons"), null);
            if (gzt2 != null) {
                gzt decorate = gum.g.decorate(gzt2);
                gzy target = decorate.target();
                if (target != null && gvq.a(target)) {
                    View view3 = headerView.d;
                    if (view3 == null) {
                        view3 = gwr.a(headerView.getContext());
                        headerView.b(view3);
                    }
                    ToggleButton toggleButton = (ToggleButton) view3.findViewById(R.id.hubs_header_toggle_button);
                    toggleButton.setVisibility(0);
                    guj.a(gum, (View) toggleButton, decorate);
                    toggleButton.setTextOff(decorate.text().title());
                    toggleButton.setTextOn(decorate.custom().string("selected_title"));
                    toggleButton.setChecked(gvq.a(decorate));
                    toggleButton.setVisibility(0);
                    gum.j.a(0, toggleButton, decorate, gum);
                }
            }
            guj.a(gum, (View) imageView, gzt);
        }

        /* access modifiers changed from: protected */
        public final void a(final PrettyHeaderView prettyHeaderView, Uri uri) {
            ((uvt) ggw.a(uvt.class)).a().a(uri).a(uvt.a(prettyHeaderView.c(), (uvj) new uvj() {
                public final void a(int i) {
                    prettyHeaderView.a(i);
                }
            }));
        }
    }

    /* access modifiers changed from: protected */
    public boolean b() {
        return false;
    }

    public /* bridge */ /* synthetic */ void a(View view, gzt gzt, defpackage.gui.a aVar, int[] iArr) {
        a((PrettyHeaderView) view, gzt, aVar, iArr);
    }

    public gws(HubsGlueImageDelegate hubsGlueImageDelegate) {
        this.a = (HubsGlueImageDelegate) fay.a(hubsGlueImageDelegate);
    }

    public final EnumSet<Trait> a() {
        return EnumSet.noneOf(Trait.class);
    }

    /* renamed from: b */
    public PrettyHeaderView a(ViewGroup viewGroup, gum gum) {
        Context context = viewGroup.getContext();
        PrettyHeaderView prettyHeaderView = new PrettyHeaderView(context, a(context));
        prettyHeaderView.a(!b());
        return prettyHeaderView;
    }

    public final void a(PrettyHeaderView prettyHeaderView, gzt gzt, gum gum, defpackage.gui.b bVar) {
        a(prettyHeaderView.d(), gzt, gum);
        gzw main = gzt.images().main();
        if (main != null) {
            a(prettyHeaderView, !TextUtils.isEmpty(main.uri()) ? Uri.parse(main.uri()) : Uri.EMPTY);
            return;
        }
        gzw background = gzt.images().background();
        a(prettyHeaderView, background != null ? Uri.parse(background.uri()) : Uri.EMPTY);
    }

    /* access modifiers changed from: protected */
    public View a(Context context) {
        return new TextHeaderView(context);
    }

    /* access modifiers changed from: protected */
    public void a(View view, gzt gzt, gum gum) {
        TextHeaderView textHeaderView = (TextHeaderView) view;
        String title = gzt.text().title();
        String subtitle = gzt.text().subtitle();
        if (!TextUtils.isEmpty(title) || !TextUtils.isEmpty(subtitle)) {
            textHeaderView.a(title);
            textHeaderView.b(subtitle);
            return;
        }
        textHeaderView.a(null);
        textHeaderView.b(null);
    }

    /* access modifiers changed from: protected */
    public void a(final PrettyHeaderView prettyHeaderView, Uri uri) {
        prettyHeaderView.b.a(fr.c(prettyHeaderView.getContext(), R.color.cat_black_40));
        this.a.b().a(uri).a(uvt.a(prettyHeaderView.c(), (uvj) new uvj() {
            public final void a(int i) {
                prettyHeaderView.a(i);
            }
        }));
    }

    public static void a(PrettyHeaderView prettyHeaderView, gzt gzt, defpackage.gui.a<View> aVar, int... iArr) {
        if (iArr.length == 0) {
            haq.a((View) prettyHeaderView, gzt, aVar, iArr);
            return;
        }
        List children = gzt.children();
        String str = "Header has no child at the specified index path ";
        if (iArr[0] < 0 || iArr[0] >= children.size()) {
            StringBuilder sb = new StringBuilder(str);
            sb.append(Arrays.toString(iArr));
            throw new IllegalArgumentException(sb.toString());
        }
        gzt gzt2 = (gzt) fay.a(children.get(iArr[0]));
        if ("secondary_buttons".equals(gzt2.group())) {
            View d = prettyHeaderView.d();
            if (d instanceof HeaderView) {
                haq.a(((HeaderView) d).d.findViewById(R.id.hubs_header_toggle_button), gzt2, aVar);
            }
            return;
        }
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append(Arrays.toString(iArr));
        throw new IllegalArgumentException(sb2.toString());
    }
}
