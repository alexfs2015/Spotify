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

/* renamed from: gyz reason: default package */
public class gyz implements gxl<PrettyHeaderView> {
    final HubsGlueImageDelegate a;

    /* renamed from: gyz$a */
    public static final class a extends gyz {
        a(HubsGlueImageDelegate hubsGlueImageDelegate) {
            super(hubsGlueImageDelegate);
        }

        public final /* bridge */ /* synthetic */ void a(View view, hcm hcm, defpackage.gwi.a aVar, int[] iArr) {
            gyz.a((PrettyHeaderView) view, hcm, aVar, iArr);
        }

        public final /* bridge */ /* synthetic */ void a(View view, hcm hcm, gwm gwm, defpackage.gwi.b bVar) {
            gyz.super.a((PrettyHeaderView) view, hcm, gwm, bVar);
        }

        /* renamed from: b */
        public final PrettyHeaderView a(ViewGroup viewGroup, gwm gwm) {
            PrettyHeaderView b = gyz.super.a(viewGroup, gwm);
            b.b.b(false);
            return b;
        }
    }

    /* renamed from: gyz$b */
    public static final class b extends gyz {
        b(HubsGlueImageDelegate hubsGlueImageDelegate) {
            super(hubsGlueImageDelegate);
        }

        /* access modifiers changed from: protected */
        public final View a(Context context) {
            HeaderView headerView = new HeaderView(context);
            headerView.b(gyy.a(context));
            return headerView;
        }

        public final /* synthetic */ View a(ViewGroup viewGroup, gwm gwm) {
            return gyz.super.a(viewGroup, gwm);
        }

        public final /* bridge */ /* synthetic */ void a(View view, hcm hcm, defpackage.gwi.a aVar, int[] iArr) {
            gyz.a((PrettyHeaderView) view, hcm, aVar, iArr);
        }

        /* access modifiers changed from: protected */
        public final void a(View view, hcm hcm, gwm gwm) {
            HeaderView headerView = (HeaderView) view;
            ImageView imageView = headerView.b;
            headerView.b.setScaleType(ScaleType.CENTER_CROP);
            this.a.a(imageView, hcm.images().main(), HubsGlueImageConfig.CARD);
            String title = hcm.text().title();
            String subtitle = hcm.text().subtitle();
            String accessory = hcm.text().accessory();
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
                    view2 = gyy.a(headerView.getContext());
                    headerView.b(view2);
                }
                TextView textView = (TextView) view2.findViewById(R.id.hubs_header_metadata);
                textView.setVisibility(0);
                textView.setText(accessory);
            } else {
                headerView.b((View) null);
            }
            hcm hcm2 = (hcm) fdd.a((Iterable<? extends T>) hcm.childGroup("secondary_buttons"), null);
            if (hcm2 != null) {
                hcm decorate = gwm.g.decorate(hcm2);
                hcr target = decorate.target();
                if (target != null && gxr.a(target)) {
                    View view3 = headerView.d;
                    if (view3 == null) {
                        view3 = gyy.a(headerView.getContext());
                        headerView.b(view3);
                    }
                    ToggleButton toggleButton = (ToggleButton) view3.findViewById(R.id.hubs_header_toggle_button);
                    toggleButton.setVisibility(0);
                    gwj.a(gwm, (View) toggleButton, decorate);
                    toggleButton.setTextOff(decorate.text().title());
                    toggleButton.setTextOn(decorate.custom().string("selected_title"));
                    toggleButton.setChecked(gxr.a(decorate));
                    toggleButton.setVisibility(0);
                    gwm.j.a(0, toggleButton, decorate, gwm);
                }
            }
            gwj.a(gwm, (View) imageView, hcm);
        }

        public final /* bridge */ /* synthetic */ void a(View view, hcm hcm, gwm gwm, defpackage.gwi.b bVar) {
            gyz.super.a((PrettyHeaderView) view, hcm, gwm, bVar);
        }

        /* access modifiers changed from: protected */
        public final void a(final PrettyHeaderView prettyHeaderView, Uri uri) {
            ((vhj) gih.a(vhj.class)).a().a(uri).a(vhj.a(prettyHeaderView.c(), (vha) new vha() {
                public final void a(int i) {
                    prettyHeaderView.a(i);
                }
            }));
        }

        /* access modifiers changed from: protected */
        public final boolean b() {
            return true;
        }
    }

    gyz(HubsGlueImageDelegate hubsGlueImageDelegate) {
        this.a = (HubsGlueImageDelegate) fbp.a(hubsGlueImageDelegate);
    }

    public static void a(PrettyHeaderView prettyHeaderView, hcm hcm, defpackage.gwi.a<View> aVar, int... iArr) {
        if (iArr.length == 0) {
            hdj.a((View) prettyHeaderView, hcm, aVar, iArr);
            return;
        }
        List children = hcm.children();
        String str = "Header has no child at the specified index path ";
        if (iArr[0] < 0 || iArr[0] >= children.size()) {
            StringBuilder sb = new StringBuilder(str);
            sb.append(Arrays.toString(iArr));
            throw new IllegalArgumentException(sb.toString());
        }
        hcm hcm2 = (hcm) fbp.a(children.get(iArr[0]));
        if ("secondary_buttons".equals(hcm2.group())) {
            View d = prettyHeaderView.d();
            if (d instanceof HeaderView) {
                hdj.a(((HeaderView) d).d.findViewById(R.id.hubs_header_toggle_button), hcm2, aVar);
            }
            return;
        }
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append(Arrays.toString(iArr));
        throw new IllegalArgumentException(sb2.toString());
    }

    /* access modifiers changed from: protected */
    public View a(Context context) {
        return new TextHeaderView(context);
    }

    public final EnumSet<Trait> a() {
        return EnumSet.noneOf(Trait.class);
    }

    public /* bridge */ /* synthetic */ void a(View view, hcm hcm, defpackage.gwi.a aVar, int[] iArr) {
        a((PrettyHeaderView) view, hcm, aVar, iArr);
    }

    /* access modifiers changed from: protected */
    public void a(View view, hcm hcm, gwm gwm) {
        TextHeaderView textHeaderView = (TextHeaderView) view;
        String title = hcm.text().title();
        String subtitle = hcm.text().subtitle();
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
        this.a.b().a(uri).a(vhj.a(prettyHeaderView.c(), (vha) new vha() {
            public final void a(int i) {
                prettyHeaderView.a(i);
            }
        }));
    }

    public final void a(PrettyHeaderView prettyHeaderView, hcm hcm, gwm gwm, defpackage.gwi.b bVar) {
        a(prettyHeaderView.d(), hcm, gwm);
        hcp main = hcm.images().main();
        if (main != null) {
            a(prettyHeaderView, !TextUtils.isEmpty(main.uri()) ? Uri.parse(main.uri()) : Uri.EMPTY);
            return;
        }
        hcp background = hcm.images().background();
        a(prettyHeaderView, background != null ? Uri.parse(background.uri()) : Uri.EMPTY);
    }

    /* renamed from: b */
    public PrettyHeaderView a(ViewGroup viewGroup, gwm gwm) {
        Context context = viewGroup.getContext();
        PrettyHeaderView prettyHeaderView = new PrettyHeaderView(context, a(context));
        prettyHeaderView.a(!b());
        return prettyHeaderView;
    }

    /* access modifiers changed from: protected */
    public boolean b() {
        return false;
    }
}
