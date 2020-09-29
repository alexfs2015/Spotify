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

/* renamed from: ooi reason: default package */
public final class ooi extends androidx.recyclerview.widget.RecyclerView.a<u> implements gjk, oog<ooi> {
    private static int a;
    private static int d;
    private static int e;
    private static int f;
    private final ool g;
    private final tkk<ooa> h;
    /* access modifiers changed from: private */
    public final ood i;
    private final ofl j;
    private final oob k;
    private final Picasso l;
    private final tui m;
    private List<uzb> n = Collections.emptyList();
    private ItemConfiguration o = ItemConfiguration.r().a();
    private boolean p;

    /* renamed from: ooi$a */
    public interface a {
        ooi a(tke tke, vti<jmf<ooa>> vti);
    }

    public final /* bridge */ /* synthetic */ androidx.recyclerview.widget.RecyclerView.a a() {
        return this;
    }

    static {
        Class<ooi> cls = ooi.class;
        a = cls.hashCode() + 1;
        d = cls.hashCode() + 2;
        e = cls.hashCode() + 3;
        f = cls.hashCode() + 4;
    }

    public ooi(Picasso picasso, ool ool, defpackage.tkk.a<ooa> aVar, oob oob, ood ood, ofl ofl, tui tui, tke tke, vti<jmf<ooa>> vti) {
        this.l = picasso;
        this.g = ool;
        this.h = aVar.a(tke, vti);
        this.i = ood;
        this.k = oob;
        this.j = ofl;
        this.m = tui;
        a(true);
    }

    public final void a(List<uzb> list) {
        this.n = (List) fay.a(list);
        e();
    }

    public final int b() {
        return this.n.size();
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

    public final String c(int i2) {
        int a2 = a(i2);
        if (a2 == a) {
            return "item";
        }
        if (a2 == d) {
            return "preview_item";
        }
        if (a2 == e) {
            return "video";
        }
        if (a2 == f) {
            return "podcast_row";
        }
        throw new IllegalArgumentException("Unsupported view type");
    }

    public final long b(int i2) {
        uzb uzb = (uzb) this.n.get(i2);
        long hashCode = (long) (hashCode() ^ uzb.getUri().hashCode());
        String d2 = uzb.d();
        return d2 != null ? hashCode ^ ((long) d2.hashCode()) : hashCode;
    }

    public final int a(int i2) {
        uzb uzb = (uzb) this.n.get(i2);
        uys a2 = uzb.a();
        boolean z = (a2 == null || a2.w() == MediaType.AUDIO) ? false : true;
        if (a2 != null && !z) {
            return f;
        }
        if (uzb.b() == null || !this.o.m()) {
            return z ? e : a;
        }
        return d;
    }

    public final u a(ViewGroup viewGroup, int i2) {
        if (i2 == a) {
            ool ool = this.g;
            Context context = viewGroup.getContext();
            fqb.b();
            fri b = frq.b(context, viewGroup, false);
            LinearLayout linearLayout = new LinearLayout(context);
            int b2 = uts.b(72.0f, context.getResources());
            linearLayout.setLayoutParams(new LayoutParams(-1, b2));
            linearLayout.setMinimumHeight(b2);
            linearLayout.setOrientation(0);
            linearLayout.setGravity(16);
            linearLayout.addView(b.getView());
            b.getView().setDuplicateParentStateEnabled(true);
            AnonymousClass1 r0 = new oom(b, new tkf((ViewGroup) b.getView().findViewById(R.id.accessory)), linearLayout) {
                private /* synthetic */ fri a;
                private /* synthetic */ tkf b;
                private /* synthetic */ LinearLayout c;

                {
                    this.a = r2;
                    this.b = r3;
                    this.c = r4;
                }

                public final TextView b() {
                    return this.a.b();
                }

                public final TextView d() {
                    return this.a.d();
                }

                public final void a(CharSequence charSequence) {
                    this.a.a(charSequence);
                }

                public final void b(CharSequence charSequence) {
                    this.a.b(charSequence);
                }

                public final void c(CharSequence charSequence) {
                    this.a.c(charSequence);
                }

                public final ImageView c() {
                    return this.a.c();
                }

                public final void a(View view) {
                    this.b.a(view);
                }

                public final View a() {
                    return this.b.b();
                }

                public final void b(boolean z) {
                    this.b.a(z);
                }

                public final void a(boolean z) {
                    this.a.a(z);
                }

                public final View getView() {
                    return this.c;
                }

                public final void c(boolean z) {
                    this.a.c(z);
                }

                public final void a(List<View> list) {
                    this.b.a(list);
                    this.b.a();
                }
            };
            fqf.a(r0);
            return fqg.a(r0);
        } else if (i2 == d) {
            return fqg.a(Rows.b(viewGroup.getContext(), viewGroup));
        } else {
            if (i2 == e) {
                ool ool2 = this.g;
                View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.playlist_show_format_video_cell, viewGroup, false);
                TextView textView = (TextView) inflate.findViewById(16908308);
                TextView textView2 = (TextView) inflate.findViewById(16908309);
                ImageView imageView = (ImageView) inflate.findViewById(R.id.key_frame);
                imageView.setColorFilter(R.color.cat_background_blur_tint);
                View findViewById = inflate.findViewById(R.id.labels);
                tkf tkf = new tkf((ViewGroup) inflate.findViewById(R.id.accessory));
                fze.c(textView);
                fze.b(textView2);
                fze.a(findViewById);
                uui.b(inflate).b(imageView).a(textView, textView2).a();
                AnonymousClass2 r4 = new defpackage.ool.a(tkf, findViewById, imageView, textView, textView2, inflate) {
                    private /* synthetic */ tkf a;
                    private /* synthetic */ View b;
                    private /* synthetic */ ImageView c;
                    private /* synthetic */ TextView d;
                    private /* synthetic */ TextView e;
                    private /* synthetic */ View f;

                    public final void c(boolean z) {
                    }

                    {
                        this.a = r2;
                        this.b = r3;
                        this.c = r4;
                        this.d = r5;
                        this.e = r6;
                        this.f = r7;
                    }

                    public final void a(View view) {
                        this.a.a(view);
                    }

                    public final View a() {
                        return this.a.b();
                    }

                    public final void b(boolean z) {
                        this.a.a(z);
                    }

                    public final void a(boolean z) {
                        View view = this.b;
                        if (view instanceof uwf) {
                            ((uwf) view).a(z);
                        }
                    }

                    public final void a(List<View> list) {
                        this.a.a(list);
                        this.a.a();
                    }

                    public final ImageView c() {
                        return this.c;
                    }

                    public final TextView b() {
                        return this.d;
                    }

                    public final TextView d() {
                        return this.e;
                    }

                    public final void a(CharSequence charSequence) {
                        this.d.setText(charSequence);
                    }

                    public final void b(CharSequence charSequence) {
                        this.e.setText(charSequence);
                    }

                    public final void c(CharSequence charSequence) {
                        this.e.setText(charSequence);
                    }

                    public final View getView() {
                        return this.f;
                    }
                };
                fqf.a(r4);
                return fqg.a(r4);
            } else if (i2 == f) {
                return fqg.a(this.m.a(viewGroup));
            } else {
                throw new IllegalArgumentException("Unsupported view type");
            }
        }
    }

    public final void a(u uVar, int i2) {
        this.j.a(i2);
        final uzb uzb = (uzb) this.n.get(i2);
        uys a2 = uzb.a();
        String str = "primary_color";
        if ((a2 == null || a2.w() == MediaType.AUDIO) ? false : true) {
            ImmutableMap c = uzb.c();
            uVar.o.getContext();
            this.h.a(uVar, this.o, uzb, oob.a(uzb, i2), (b) new b() {
                public final boolean a() {
                    return ooi.this.i.a(uzb);
                }

                public final boolean b() {
                    return ooi.this.i.b(uzb);
                }
            }, this.p, i2);
            uys a3 = uzb.a();
            if (a3 == null) {
                Assertion.a("Something horrific happen here. Episode cannot be null.");
            } else {
                Context context = uVar.o.getContext();
                defpackage.ool.a aVar = (defpackage.ool.a) fqb.a(uVar.o, defpackage.ool.a.class);
                Drawable a4 = a(context, (String) c.get(str));
                String a5 = uze.a(a3.b(), a3.c(), (Show) fay.a(a3.t()), Size.XLARGE);
                this.l.a(!TextUtils.isEmpty(a5) ? Uri.parse(a5) : Uri.EMPTY).a((Object) Integer.valueOf(R.id.image_on_item_in_list_loaded_with_picasso)).a(a4).b().d().a(aVar.c());
                String str2 = (String) c.get("title");
                String str3 = (String) c.get("subtitle");
                if (fax.a(str2)) {
                    str2 = a3.a();
                }
                aVar.a(str2);
                if (fax.a(str3)) {
                    str3 = a3.d();
                }
                aVar.b(str3);
            }
        } else {
            ImmutableMap c2 = uzb.c();
            uVar.o.getContext();
            ooa a6 = oob.a(uzb, i2);
            Drawable a7 = a(uVar.o.getContext(), (String) c2.get(str));
            this.h.a(uVar, this.o, uzb, a6, new b() {
                public final boolean a() {
                    return ooi.this.i.a(uzb);
                }

                public final boolean b() {
                    return ooi.this.i.b(uzb);
                }
            }, this.p, i2, a7, a7, a7);
        }
    }

    private static Drawable a(Context context, String str) {
        Integer a2 = a(str);
        if (a2 != null) {
            return new ColorDrawable(a2.intValue());
        }
        return fzg.i(context);
    }

    private static Integer a(String str) {
        try {
            if (!fax.a(str)) {
                return Integer.valueOf(Color.parseColor(str));
            }
            return null;
        } catch (IllegalArgumentException e2) {
            Logger.d(e2, "Invalid color %s", str);
            return null;
        }
    }
}
