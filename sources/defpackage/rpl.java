package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import android.widget.TextView.BufferType;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.mobile.android.glue.GlueLayoutTraits.Trait;
import com.spotify.music.R;
import com.spotify.paste.spotifyicon.SpotifyIconDrawable;
import java.util.EnumSet;
import java.util.List;

/* renamed from: rpl reason: default package */
public final class rpl extends defpackage.rnx.a<a> {
    private final vgw a;
    private final who<rpy> b;
    private final boolean c;
    private final boolean d;
    private final who<stq> e;

    /* renamed from: rpl$a */
    static class a extends defpackage.gwi.c.a<View> {
        private Context b;
        private vgw c;
        private who<rpy> d;
        private boolean e;
        private boolean f;
        private who<stq> g;
        private LinearLayout h = ((LinearLayout) this.a.findViewById(R.id.container));
        private ImageView i = ((ImageView) this.a.findViewById(R.id.image));
        private TextView j = ((TextView) this.a.findViewById(R.id.title));
        private TextView k = ((TextView) this.a.findViewById(R.id.shuffle_badge));
        private TextView l = ((TextView) this.a.findViewById(R.id.subtitle));
        private TextView m = ((TextView) this.a.findViewById(R.id.accessoryText));
        private LinearLayout n = ((LinearLayout) this.a.findViewById(R.id.children));
        private TextView o = ((TextView) this.a.findViewById(R.id.low_friction_shuffle_badge));
        private LinearLayout p = ((LinearLayout) this.a.findViewById(R.id.subtitle_container));
        private final SparseArray<gxh<?>> q = new SparseArray<>();
        private vhh<View> r;

        public a(ViewGroup viewGroup, vgw vgw, who<rpy> who, boolean z, boolean z2, who<stq> who2) {
            super(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.free_tier_entity_top_container_component_layout, viewGroup, false));
            this.b = viewGroup.getContext();
            this.c = vgw;
            this.d = who;
            this.e = z;
            this.f = z2;
            this.g = who2;
        }

        private void b(hcm hcm, gwm gwm, b bVar) {
            List children = hcm.children();
            if (!children.isEmpty()) {
                LayoutParams layoutParams = new LayoutParams(-2, -2);
                this.n.removeAllViews();
                for (int i2 = 0; i2 < children.size(); i2++) {
                    hcm hcm2 = (hcm) children.get(i2);
                    int resolve = gwm.h.resolve(hcm2);
                    gxh gxh = (gxh) this.q.get(resolve);
                    if (gxh == null) {
                        gxh = gxh.a(resolve, (ViewGroup) this.n, gwm);
                        gxh.b.setLayoutParams(layoutParams);
                        this.q.put(resolve, gxh);
                    }
                    this.n.addView(gxh.b);
                    gxh.a(i2, hcm2, bVar);
                }
            }
        }

        public final void a(hcm hcm, defpackage.gwi.a<View> aVar, int... iArr) {
        }

        public final void a(hcm hcm, gwm gwm, b bVar) {
            int i2;
            hcp main = hcm.images().main();
            String uri = main != null ? main.uri() : null;
            Drawable a = gaa.a(this.b, (SpotifyIconV2) defpackage.haq.a.a.a(main != null ? main.placeholder() : null).a(SpotifyIconV2.ALBUM), (float) vfj.b(64.0f, this.b.getResources()));
            this.c.a(uri).a(a).b(a).a(this.i);
            String str = "";
            String title = hcm.text().title() != null ? hcm.text().title() : str;
            String subtitle = hcm.text().subtitle() != null ? hcm.text().subtitle() : str;
            String accessory = hcm.text().accessory() != null ? hcm.text().accessory() : str;
            this.j.setText(title);
            this.l.setText(subtitle);
            this.m.setText(accessory);
            hcj bundle = hcm.custom().bundle("track_info");
            if (bundle != null) {
                String subtitle2 = hcm.text().subtitle();
                if (subtitle2 != null && !subtitle2.isEmpty()) {
                    String string = bundle.string("artist_name", str);
                    String string2 = bundle.string("artist_uri", str);
                    boolean boolValue = bundle.boolValue("use_artist_placeholder", false);
                    rpy rpy = (rpy) this.d.get();
                    rpx rpx = new rpx(string2, rpy.a, rpy.b);
                    if (boolValue) {
                        i2 = subtitle2.indexOf("%1$s");
                        if (i2 != -1) {
                            subtitle2 = String.format(subtitle2, new Object[]{string});
                        }
                    } else {
                        i2 = subtitle2.indexOf(string);
                    }
                    SpannableString spannableString = new SpannableString(subtitle2);
                    int length = string.length() + i2;
                    if (i2 != -1) {
                        spannableString.setSpan(rpx, i2, length, 33);
                    }
                    this.l.setMovementMethod(LinkMovementMethod.getInstance());
                    this.l.setText(spannableString, BufferType.SPANNABLE);
                }
            }
            String str2 = "shuffle_badge_text";
            String string3 = hcm.custom().string(str2, str);
            if (string3.isEmpty() || this.f) {
                this.k.setVisibility(8);
            } else {
                SpotifyIconDrawable spotifyIconDrawable = new SpotifyIconDrawable(this.b, SpotifyIconV2.SHUFFLE, (float) vfj.b(12.0f, this.b.getResources()));
                spotifyIconDrawable.a(-16777216);
                this.k.setCompoundDrawablesWithIntrinsicBounds(spotifyIconDrawable, null, null, null);
                this.k.setText(string3);
            }
            if (!hcm.custom().string(str2, str).isEmpty() || !this.e) {
                this.o.setVisibility(8);
            } else {
                ((stq) this.g.get()).a(this.p, this.o);
                this.o.setVisibility(0);
                this.o.setCompoundDrawablesWithIntrinsicBounds(new SpotifyIconDrawable(this.b, SpotifyIconV2.SHUFFLE, (float) vfj.b(12.0f, this.b.getResources())), null, null, null);
            }
            b(hcm, gwm, bVar);
            hcp main2 = hcm.images().main();
            if (main2 != null) {
                String uri2 = main2.uri();
                this.r = new vhh<>(this.h, vhh.a);
                this.c.a(uri2).a((wgz) vhb.a).a((wgx) this.r);
                return;
            }
            Context context = this.b;
            ip.a((View) this.h, vhg.a(context, gb.b(context.getResources(), R.color.gray_background_30, null)));
        }
    }

    public rpl(vgw vgw, who<rpy> who, boolean z, who<stq> who2, boolean z2) {
        this.a = vgw;
        this.b = who;
        this.c = z;
        this.d = z2;
        this.e = who2;
    }

    public final EnumSet<Trait> a() {
        return EnumSet.of(Trait.HEADER);
    }

    public final int b() {
        return R.id.free_tier_entity_top_container_component;
    }

    public final /* synthetic */ defpackage.gwi.c.a b(ViewGroup viewGroup, gwm gwm) {
        a aVar = new a(viewGroup, this.a, this.b, this.c, this.d, this.e);
        return aVar;
    }
}
