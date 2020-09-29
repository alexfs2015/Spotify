package defpackage;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView.u;
import com.google.common.collect.ImmutableMap;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.music.R;
import com.spotify.music.playlist.ui.ItemConfiguration;
import com.spotify.music.playlist.ui.Rows;
import com.spotify.playlist.models.Covers.Size;
import com.spotify.playlist.models.Show;
import com.spotify.playlist.models.Show.MediaType;
import com.squareup.picasso.Picasso;
import java.util.Collections;
import java.util.List;

/* renamed from: ovo reason: default package */
public final class ovo extends androidx.recyclerview.widget.RecyclerView.a<u> implements ovm<ovo> {
    private static int a;
    private static int d;
    private static int e;
    private static int f;
    private final ovr g;
    private final twc<ovg> h;
    /* access modifiers changed from: private */
    public final ovj i;
    private final omp j;
    private final ovh k;
    private final Picasso l;
    private final ugl m;
    private List<vle> n = Collections.emptyList();
    private ItemConfiguration o = ItemConfiguration.r().a();
    private boolean p;

    /* renamed from: ovo$a */
    public interface a {
        ovo a(tvw tvw, who<jor<ovg>> who);
    }

    static {
        Class<ovo> cls = ovo.class;
        a = cls.hashCode() + 1;
        d = cls.hashCode() + 2;
        e = cls.hashCode() + 3;
        f = cls.hashCode() + 4;
    }

    public ovo(Picasso picasso, ovr ovr, defpackage.twc.a<ovg> aVar, ovh ovh, ovj ovj, omp omp, ugl ugl, tvw tvw, who<jor<ovg>> who) {
        this.l = picasso;
        this.g = ovr;
        this.h = aVar.a(tvw, who);
        this.i = ovj;
        this.k = ovh;
        this.j = omp;
        this.m = ugl;
        a(true);
    }

    private static Drawable a(Context context, String str) {
        Integer a2 = a(str);
        return a2 != null ? new ColorDrawable(a2.intValue()) : gaa.i(context);
    }

    private static Integer a(String str) {
        try {
            if (!fbo.a(str)) {
                return Integer.valueOf(Color.parseColor(str));
            }
            return null;
        } catch (IllegalArgumentException e2) {
            Logger.d(e2, "Invalid color %s", str);
            return null;
        }
    }

    public final int a(int i2) {
        vle vle = (vle) this.n.get(i2);
        vkv a2 = vle.a();
        boolean z = (a2 == null || a2.w() == MediaType.AUDIO) ? false : true;
        return (a2 == null || z) ? (vle.b() == null || !this.o.m()) ? z ? e : a : d : f;
    }

    public final /* bridge */ /* synthetic */ androidx.recyclerview.widget.RecyclerView.a a() {
        return this;
    }

    public final u a(ViewGroup viewGroup, int i2) {
        if (i2 == a) {
            ovr ovr = this.g;
            Context context = viewGroup.getContext();
            fqv.b();
            fsc b = fsk.b(context, viewGroup, false);
            LinearLayout linearLayout = new LinearLayout(context);
            int b2 = vfj.b(72.0f, context.getResources());
            linearLayout.setLayoutParams(new LayoutParams(-1, b2));
            linearLayout.setMinimumHeight(b2);
            linearLayout.setOrientation(0);
            linearLayout.setGravity(16);
            linearLayout.addView(b.getView());
            b.getView().setDuplicateParentStateEnabled(true);
            AnonymousClass1 r0 = new ovs(b, new tvx((ViewGroup) b.getView().findViewById(R.id.accessory)), linearLayout) {
                private /* synthetic */ fsc a;
                private /* synthetic */ tvx b;
                private /* synthetic */ LinearLayout c;

                {
                    this.a = r2;
                    this.b = r3;
                    this.c = r4;
                }

                public final View a() {
                    return this.b.b();
                }

                public final void a(View view) {
                    this.b.a(view);
                }

                public final void a(CharSequence charSequence) {
                    this.a.a(charSequence);
                }

                public final void a(List<View> list) {
                    this.b.a(list);
                    this.b.a();
                }

                public final void a(boolean z) {
                    this.a.a(z);
                }

                public final TextView b() {
                    return this.a.b();
                }

                public final void b(CharSequence charSequence) {
                    this.a.b(charSequence);
                }

                public final void b(boolean z) {
                    this.b.a(z);
                }

                public final ImageView c() {
                    return this.a.c();
                }

                public final void c(CharSequence charSequence) {
                    this.a.c(charSequence);
                }

                public final void c(boolean z) {
                    this.a.c(z);
                }

                public final TextView d() {
                    return this.a.d();
                }

                public final View getView() {
                    return this.c;
                }
            };
            fqz.a(r0);
            return fra.a(r0);
        } else if (i2 == d) {
            return fra.a(Rows.b(viewGroup.getContext(), viewGroup));
        } else {
            if (i2 == e) {
                ovr ovr2 = this.g;
                View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.playlist_show_format_video_cell, viewGroup, false);
                TextView textView = (TextView) inflate.findViewById(16908308);
                TextView textView2 = (TextView) inflate.findViewById(16908309);
                ImageView imageView = (ImageView) inflate.findViewById(R.id.key_frame);
                imageView.setColorFilter(R.color.cat_background_blur_tint);
                View findViewById = inflate.findViewById(R.id.labels);
                tvx tvx = new tvx((ViewGroup) inflate.findViewById(R.id.accessory));
                fzy.c(textView);
                fzy.b(textView2);
                fzy.a(findViewById);
                vfz.b(inflate).b(imageView).a(textView, textView2).a();
                AnonymousClass2 r4 = new defpackage.ovr.a(tvx, findViewById, imageView, textView, textView2, inflate) {
                    private /* synthetic */ tvx a;
                    private /* synthetic */ View b;
                    private /* synthetic */ ImageView c;
                    private /* synthetic */ TextView d;
                    private /* synthetic */ TextView e;
                    private /* synthetic */ View f;

                    {
                        this.a = r2;
                        this.b = r3;
                        this.c = r4;
                        this.d = r5;
                        this.e = r6;
                        this.f = r7;
                    }

                    public final View a() {
                        return this.a.b();
                    }

                    public final void a(View view) {
                        this.a.a(view);
                    }

                    public final void a(CharSequence charSequence) {
                        this.d.setText(charSequence);
                    }

                    public final void a(List<View> list) {
                        this.a.a(list);
                        this.a.a();
                    }

                    public final void a(boolean z) {
                        View view = this.b;
                        if (view instanceof vhv) {
                            ((vhv) view).a(z);
                        }
                    }

                    public final TextView b() {
                        return this.d;
                    }

                    public final void b(CharSequence charSequence) {
                        this.e.setText(charSequence);
                    }

                    public final void b(boolean z) {
                        this.a.a(z);
                    }

                    public final ImageView c() {
                        return this.c;
                    }

                    public final void c(CharSequence charSequence) {
                        this.e.setText(charSequence);
                    }

                    public final void c(boolean z) {
                    }

                    public final TextView d() {
                        return this.e;
                    }

                    public final View getView() {
                        return this.f;
                    }
                };
                fqz.a(r4);
                return fra.a(r4);
            } else if (i2 == f) {
                return fra.a(this.m.a(viewGroup));
            } else {
                throw new IllegalArgumentException("Unsupported view type");
            }
        }
    }

    public final void a(u uVar, int i2) {
        this.j.a(i2);
        final vle vle = (vle) this.n.get(i2);
        vkv a2 = vle.a();
        String str = "primary_color";
        if ((a2 == null || a2.w() == MediaType.AUDIO) ? false : true) {
            ImmutableMap c = vle.c();
            uVar.o.getContext();
            this.h.a(uVar, this.o, vle, ovh.a(vle, i2), (b) new b() {
                public final boolean a() {
                    return ovo.this.i.a(vle);
                }

                public final boolean b() {
                    return ovo.this.i.b(vle);
                }
            }, this.p, i2);
            vkv a3 = vle.a();
            if (a3 == null) {
                Assertion.a("Something horrific happen here. Episode cannot be null.");
            } else {
                Context context = uVar.o.getContext();
                defpackage.ovr.a aVar = (defpackage.ovr.a) fqv.a(uVar.o, defpackage.ovr.a.class);
                Drawable a4 = a(context, (String) c.get(str));
                String a5 = vlh.a(a3.b(), a3.c(), (Show) fbp.a(a3.t()), Size.XLARGE);
                this.l.a(!TextUtils.isEmpty(a5) ? Uri.parse(a5) : Uri.EMPTY).a((Object) Integer.valueOf(R.id.image_on_item_in_list_loaded_with_picasso)).a(a4).b().d().a(aVar.c());
                String str2 = (String) c.get("title");
                String str3 = (String) c.get("subtitle");
                if (fbo.a(str2)) {
                    str2 = a3.a();
                }
                aVar.a(str2);
                if (fbo.a(str3)) {
                    str3 = a3.d();
                }
                aVar.b(str3);
            }
        } else {
            ImmutableMap c2 = vle.c();
            uVar.o.getContext();
            ovg a6 = ovh.a(vle, i2);
            Drawable a7 = a(uVar.o.getContext(), (String) c2.get(str));
            this.h.a(uVar, this.o, vle, a6, new b() {
                public final boolean a() {
                    return ovo.this.i.a(vle);
                }

                public final boolean b() {
                    return ovo.this.i.b(vle);
                }
            }, this.p, i2, a7, a7, a7);
        }
    }

    public final void a(ItemConfiguration itemConfiguration) {
        if (this.o != itemConfiguration) {
            this.o = itemConfiguration;
            e();
        }
    }

    public final void a(String str, boolean z) {
        if (this.i.a(str) || this.p != z) {
            e();
        }
        this.p = z;
    }

    public final void a(List<vle> list) {
        this.n = (List) fbp.a(list);
        e();
    }

    public final int b() {
        return this.n.size();
    }

    public final long b(int i2) {
        vle vle = (vle) this.n.get(i2);
        long hashCode = (long) (hashCode() ^ vle.getUri().hashCode());
        String d2 = vle.d();
        return d2 != null ? hashCode ^ ((long) d2.hashCode()) : hashCode;
    }
}
