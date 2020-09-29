package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView.u;
import com.google.common.collect.Lists;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.music.R;
import com.spotify.music.playlist.ui.Rows.AnonymousClass1;
import com.spotify.music.playlist.ui.Rows.AnonymousClass2;
import com.spotify.playlist.models.Covers.Size;
import com.squareup.picasso.Picasso;
import java.util.List;

/* renamed from: lmt reason: default package */
public class lmt extends androidx.recyclerview.widget.RecyclerView.a<d> implements gjk {
    private static int d;
    private static int e;
    public List<uyz> a = Lists.a();
    /* access modifiers changed from: private */
    public final b f;
    /* access modifiers changed from: private */
    public final Picasso g;
    /* access modifiers changed from: private */
    public final boolean h;
    /* access modifiers changed from: private */
    public final Drawable i;
    /* access modifiers changed from: private */
    public final Drawable j;

    /* renamed from: lmt$a */
    class a extends d {
        public a(ViewGroup viewGroup) {
            View view;
            if (lmt.this.h) {
                Context context = viewGroup.getContext();
                fqb.b();
                fre b = frq.b(context, viewGroup);
                int b2 = uts.b(96.0f, context.getResources());
                int b3 = uts.b(80.0f, context.getResources());
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setLayoutParams(new LayoutParams(-1, b2));
                linearLayout.setMinimumHeight(b2);
                linearLayout.setOrientation(0);
                linearLayout.setGravity(16);
                ImageView c = b.c();
                ViewGroup.LayoutParams layoutParams = b.c().getLayoutParams();
                layoutParams.height = b3;
                layoutParams.width = b3;
                c.setLayoutParams(layoutParams);
                c.setMinimumHeight(b3);
                c.setMinimumWidth(b3);
                linearLayout.addView(b.getView());
                b.getView().setDuplicateParentStateEnabled(true);
                AnonymousClass1 r5 = new com.spotify.music.playlist.ui.Rows.b(b, linearLayout) {
                    private /* synthetic */ fre a;
                    private /* synthetic */ LinearLayout b;

                    {
                        this.a = r1;
                        this.b = r2;
                    }

                    public final TextView b() {
                        return this.a.b();
                    }

                    public final void a(CharSequence charSequence) {
                        this.a.a(charSequence);
                    }

                    public final ImageView c() {
                        return this.a.c();
                    }

                    public final void a(View view) {
                        this.a.a(view);
                    }

                    public final View a() {
                        return this.a.a();
                    }

                    public final void b(boolean z) {
                        this.a.b(z);
                    }

                    public final void a(boolean z) {
                        this.a.a(z);
                    }

                    public final View getView() {
                        return this.b;
                    }

                    public final void c(boolean z) {
                        this.a.c(z);
                    }
                };
                fqf.a(r5);
                view = r5.getView();
            } else {
                fqb.b();
                view = frq.b(viewGroup.getContext(), viewGroup).getView();
            }
            super(view);
        }

        public final void a(uyz uyz, int i) {
            fre fre = (fre) fqf.a(this.o, fre.class);
            fre.a(uyz.getTitle());
            fre.c().setImageDrawable(lmt.this.i);
            this.o.setOnClickListener(new $$Lambda$lmt$a$Ha3tjkCDUQLcub_LbPCtuKaGEgw(this, uyz, i));
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void a(uyz uyz, int i, View view) {
            lmt.this.f.a(uyz, i);
        }
    }

    /* renamed from: lmt$b */
    public interface b {
        void a(uyz uyz, int i);
    }

    /* renamed from: lmt$c */
    class c extends d {
        public c(ViewGroup viewGroup) {
            View view;
            if (lmt.this.h) {
                Context context = viewGroup.getContext();
                fqb.b();
                fri b = frq.b(context, viewGroup, false);
                int b2 = uts.b(96.0f, context.getResources());
                int b3 = uts.b(80.0f, context.getResources());
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setLayoutParams(new LayoutParams(-1, b2));
                linearLayout.setMinimumHeight(b2);
                linearLayout.setOrientation(0);
                linearLayout.setGravity(16);
                ImageView c = b.c();
                ViewGroup.LayoutParams layoutParams = b.c().getLayoutParams();
                layoutParams.height = b3;
                layoutParams.width = b3;
                c.setLayoutParams(layoutParams);
                c.setMinimumHeight(b3);
                c.setMinimumWidth(b3);
                linearLayout.addView(b.getView());
                b.getView().setDuplicateParentStateEnabled(true);
                AnonymousClass2 r6 = new com.spotify.music.playlist.ui.Rows.c(b, linearLayout) {
                    private /* synthetic */ fri a;
                    private /* synthetic */ LinearLayout b;

                    {
                        this.a = r1;
                        this.b = r2;
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
                        this.a.a(view);
                    }

                    public final View a() {
                        return this.a.a();
                    }

                    public final void b(boolean z) {
                        this.a.b(z);
                    }

                    public final void a(boolean z) {
                        this.a.a(z);
                    }

                    public final View getView() {
                        return this.b;
                    }

                    public final void c(boolean z) {
                        this.a.c(z);
                    }
                };
                fqf.a(r6);
                view = r6.getView();
            } else {
                fqb.b();
                view = frq.b(viewGroup.getContext(), viewGroup, false).getView();
            }
            super(view);
        }

        public final void a(uyz uyz, int i) {
            fri fri = (fri) fqf.a(this.o, fri.class);
            fri.a(uyz.getTitle());
            uzd d = uyz.d();
            if (d != null) {
                fri.b(this.o.getContext().getString(R.string.playlist_by_owner, new Object[]{d.c()}));
            }
            ImageView c = fri.c();
            String imageUri = uyz.getImageUri(Size.SMALL);
            if (!fax.a(imageUri)) {
                vsl a2 = lmt.this.g.a(!TextUtils.isEmpty(imageUri) ? Uri.parse(imageUri) : Uri.EMPTY);
                Drawable drawable = c.getDrawable();
                if (drawable == null) {
                    drawable = lmt.this.j;
                }
                a2.a(drawable).b(drawable).a(c);
            } else {
                c.setImageDrawable(lmt.this.j);
            }
            this.o.setOnClickListener(new $$Lambda$lmt$c$iP18FeeNtGwgguektLCLZMKIUc(this, uyz, i));
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void a(uyz uyz, int i, View view) {
            lmt.this.f.a(uyz, i);
        }
    }

    /* renamed from: lmt$d */
    public static abstract class d extends u {
        /* access modifiers changed from: 0000 */
        public abstract void a(uyz uyz, int i);

        public d(View view) {
            super(view);
        }
    }

    public final /* synthetic */ void a(u uVar) {
        d dVar = (d) uVar;
        if (dVar instanceof c) {
            ((fri) fqf.a(((c) dVar).o, fri.class)).c().setImageDrawable(null);
        }
    }

    public final /* synthetic */ void a(u uVar, int i2) {
        ((d) uVar).a((uyz) this.a.get(i2), i2);
    }

    static {
        Class<lmt> cls = lmt.class;
        d = cls.hashCode();
        e = cls.hashCode() + 1;
    }

    public lmt(Context context, b bVar, Picasso picasso, boolean z) {
        this.f = bVar;
        this.g = picasso;
        this.h = z;
        this.i = fzg.a(context, SpotifyIconV2.PLAYLIST_FOLDER);
        this.j = fzg.j(context);
        a(true);
    }

    public final String c(int i2) {
        int a2 = a(i2);
        if (a2 == d) {
            return "playlist";
        }
        if (a2 == e) {
            return "folder";
        }
        throw new IllegalArgumentException("Unsupported view type");
    }

    public final int a(int i2) {
        return ((uyz) this.a.get(i2)).f() ? e : d;
    }

    public final int b() {
        return this.a.size();
    }

    public final long b(int i2) {
        String u = ((uyz) this.a.get(i2)).u();
        if (u != null) {
            return (long) u.hashCode();
        }
        return 0;
    }

    public final /* synthetic */ u a(ViewGroup viewGroup, int i2) {
        if (i2 == d) {
            return new c(viewGroup);
        }
        if (i2 == e) {
            return new a(viewGroup);
        }
        throw new IllegalArgumentException("Unsupported view type");
    }
}
