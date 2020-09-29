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

/* renamed from: rgj reason: default package */
public final class rgj extends defpackage.rev.a<a> {
    private final uvf a;
    private final vti<rgw> b;
    private final boolean c;
    private final boolean d;
    private final vti<sjj> e;

    /* renamed from: rgj$a */
    static class a extends defpackage.gui.c.a<View> {
        private Context b;
        private uvf c;
        private vti<rgw> d;
        private boolean e;
        private boolean f;
        private vti<sjj> g;
        private LinearLayout h = ((LinearLayout) this.a.findViewById(R.id.container));
        private ImageView i = ((ImageView) this.a.findViewById(R.id.image));
        private TextView j = ((TextView) this.a.findViewById(R.id.title));
        private TextView k = ((TextView) this.a.findViewById(R.id.shuffle_badge));
        private TextView l = ((TextView) this.a.findViewById(R.id.subtitle));
        private TextView m = ((TextView) this.a.findViewById(R.id.accessoryText));
        private LinearLayout n = ((LinearLayout) this.a.findViewById(R.id.children));
        private TextView o = ((TextView) this.a.findViewById(R.id.low_friction_shuffle_badge));
        private LinearLayout p = ((LinearLayout) this.a.findViewById(R.id.subtitle_container));
        private final SparseArray<gvh<?>> q = new SparseArray<>();
        private uvq<View> r;

        public final void a(gzt gzt, defpackage.gui.a<View> aVar, int... iArr) {
        }

        public a(ViewGroup viewGroup, uvf uvf, vti<rgw> vti, boolean z, boolean z2, vti<sjj> vti2) {
            super(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.free_tier_entity_top_container_component_layout, viewGroup, false));
            this.b = viewGroup.getContext();
            this.c = uvf;
            this.d = vti;
            this.e = z;
            this.f = z2;
            this.g = vti2;
        }

        private void b(gzt gzt, gum gum, b bVar) {
            List children = gzt.children();
            if (!children.isEmpty()) {
                LayoutParams layoutParams = new LayoutParams(-2, -2);
                this.n.removeAllViews();
                for (int i2 = 0; i2 < children.size(); i2++) {
                    gzt gzt2 = (gzt) children.get(i2);
                    int resolve = gum.h.resolve(gzt2);
                    gvh gvh = (gvh) this.q.get(resolve);
                    if (gvh == null) {
                        gvh = gvh.a(resolve, (ViewGroup) this.n, gum);
                        gvh.b.setLayoutParams(layoutParams);
                        this.q.put(resolve, gvh);
                    }
                    this.n.addView(gvh.b);
                    gvh.a(i2, gzt2, bVar);
                }
            }
        }

        public final void a(gzt gzt, gum gum, b bVar) {
            int i2;
            gzw main = gzt.images().main();
            String uri = main != null ? main.uri() : null;
            Drawable a = fzg.a(this.b, (SpotifyIconV2) defpackage.gxx.a.a.a(main != null ? main.placeholder() : null).a(SpotifyIconV2.ALBUM), (float) uts.b(64.0f, this.b.getResources()));
            this.c.a(uri).a(a).b(a).a(this.i);
            String str = "";
            String title = gzt.text().title() != null ? gzt.text().title() : str;
            String subtitle = gzt.text().subtitle() != null ? gzt.text().subtitle() : str;
            String accessory = gzt.text().accessory() != null ? gzt.text().accessory() : str;
            this.j.setText(title);
            this.l.setText(subtitle);
            this.m.setText(accessory);
            gzq bundle = gzt.custom().bundle("track_info");
            if (bundle != null) {
                String subtitle2 = gzt.text().subtitle();
                if (subtitle2 != null && !subtitle2.isEmpty()) {
                    String string = bundle.string("artist_name", str);
                    String string2 = bundle.string("artist_uri", str);
                    boolean boolValue = bundle.boolValue("use_artist_placeholder", false);
                    rgw rgw = (rgw) this.d.get();
                    rgv rgv = new rgv(string2, rgw.a, rgw.b);
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
                        spannableString.setSpan(rgv, i2, length, 33);
                    }
                    this.l.setMovementMethod(LinkMovementMethod.getInstance());
                    this.l.setText(spannableString, BufferType.SPANNABLE);
                }
            }
            String str2 = "shuffle_badge_text";
            String string3 = gzt.custom().string(str2, str);
            if (string3.isEmpty() || this.f) {
                this.k.setVisibility(8);
            } else {
                SpotifyIconDrawable spotifyIconDrawable = new SpotifyIconDrawable(this.b, SpotifyIconV2.SHUFFLE, (float) uts.b(12.0f, this.b.getResources()));
                spotifyIconDrawable.a(-16777216);
                this.k.setCompoundDrawablesWithIntrinsicBounds(spotifyIconDrawable, null, null, null);
                this.k.setText(string3);
            }
            if (!gzt.custom().string(str2, str).isEmpty() || !this.e) {
                this.o.setVisibility(8);
            } else {
                ((sjj) this.g.get()).a(this.p, this.o);
                this.o.setVisibility(0);
                this.o.setCompoundDrawablesWithIntrinsicBounds(new SpotifyIconDrawable(this.b, SpotifyIconV2.SHUFFLE, (float) uts.b(12.0f, this.b.getResources())), null, null, null);
            }
            b(gzt, gum, bVar);
            gzw main2 = gzt.images().main();
            if (main2 != null) {
                String uri2 = main2.uri();
                this.r = new uvq<>(this.h, uvq.a);
                this.c.a(uri2).a((vst) uvk.a).a((vsr) this.r);
                return;
            }
            Context context = this.b;
            ip.a((View) this.h, uvp.a(context, gb.b(context.getResources(), R.color.gray_background_30, null)));
        }
    }

    public final int b() {
        return R.id.free_tier_entity_top_container_component;
    }

    public rgj(uvf uvf, vti<rgw> vti, boolean z, vti<sjj> vti2, boolean z2) {
        this.a = uvf;
        this.b = vti;
        this.c = z;
        this.d = z2;
        this.e = vti2;
    }

    public final EnumSet<Trait> a() {
        return EnumSet.of(Trait.HEADER);
    }

    public final /* synthetic */ defpackage.gui.c.a b(ViewGroup viewGroup, gum gum) {
        a aVar = new a(viewGroup, this.a, this.b, this.c, this.d, this.e);
        return aVar;
    }
}
