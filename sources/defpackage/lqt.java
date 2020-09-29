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

/* renamed from: lqt reason: default package */
public class lqt extends androidx.recyclerview.widget.RecyclerView.a<d> {
    private static int d;
    private static int e;
    public List<vlc> a = Lists.a();
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

    /* renamed from: lqt$a */
    class a extends d {
        public a(ViewGroup viewGroup) {
            View view;
            if (lqt.this.h) {
                Context context = viewGroup.getContext();
                fqv.b();
                fry b = fsk.b(context, viewGroup);
                int b2 = vfj.b(96.0f, context.getResources());
                int b3 = vfj.b(80.0f, context.getResources());
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
                    private /* synthetic */ fry a;
                    private /* synthetic */ LinearLayout b;

                    {
                        this.a = r1;
                        this.b = r2;
                    }

                    public final View a() {
                        return this.a.a();
                    }

                    public final void a(View view) {
                        this.a.a(view);
                    }

                    public final void a(CharSequence charSequence) {
                        this.a.a(charSequence);
                    }

                    public final void a(boolean z) {
                        this.a.a(z);
                    }

                    public final TextView b() {
                        return this.a.b();
                    }

                    public final void b(boolean z) {
                        this.a.b(z);
                    }

                    public final ImageView c() {
                        return this.a.c();
                    }

                    public final void c(boolean z) {
                        this.a.c(z);
                    }

                    public final View getView() {
                        return this.b;
                    }
                };
                fqz.a(r5);
                view = r5.getView();
            } else {
                fqv.b();
                view = fsk.b(viewGroup.getContext(), viewGroup).getView();
            }
            super(view);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void a(vlc vlc, int i, View view) {
            lqt.this.f.a(vlc, i);
        }

        public final void a(vlc vlc, int i) {
            fry fry = (fry) fqz.a(this.o, fry.class);
            fry.a(vlc.getTitle());
            fry.c().setImageDrawable(lqt.this.i);
            this.o.setOnClickListener(new $$Lambda$lqt$a$4G7bXPSmHpq0dWO8T7NBgsG5hk(this, vlc, i));
        }
    }

    /* renamed from: lqt$b */
    public interface b {
        void a(vlc vlc, int i);
    }

    /* renamed from: lqt$c */
    class c extends d {
        public c(ViewGroup viewGroup) {
            View view;
            if (lqt.this.h) {
                Context context = viewGroup.getContext();
                fqv.b();
                fsc b = fsk.b(context, viewGroup, false);
                int b2 = vfj.b(96.0f, context.getResources());
                int b3 = vfj.b(80.0f, context.getResources());
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
                    private /* synthetic */ fsc a;
                    private /* synthetic */ LinearLayout b;

                    {
                        this.a = r1;
                        this.b = r2;
                    }

                    public final View a() {
                        return this.a.a();
                    }

                    public final void a(View view) {
                        this.a.a(view);
                    }

                    public final void a(CharSequence charSequence) {
                        this.a.a(charSequence);
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
                        this.a.b(z);
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
                        return this.b;
                    }
                };
                fqz.a(r6);
                view = r6.getView();
            } else {
                fqv.b();
                view = fsk.b(viewGroup.getContext(), viewGroup, false).getView();
            }
            super(view);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void a(vlc vlc, int i, View view) {
            lqt.this.f.a(vlc, i);
        }

        public final void a(vlc vlc, int i) {
            fsc fsc = (fsc) fqz.a(this.o, fsc.class);
            fsc.a(vlc.getTitle());
            vlg d = vlc.d();
            if (d != null) {
                fsc.b(this.o.getContext().getString(R.string.playlist_by_owner, new Object[]{d.c()}));
            }
            ImageView c = fsc.c();
            String imageUri = vlc.getImageUri(Size.SMALL);
            if (!fbo.a(imageUri)) {
                wgr a2 = lqt.this.g.a(!TextUtils.isEmpty(imageUri) ? Uri.parse(imageUri) : Uri.EMPTY);
                Drawable drawable = c.getDrawable();
                if (drawable == null) {
                    drawable = lqt.this.j;
                }
                a2.a(drawable).b(drawable).a(c);
            } else {
                c.setImageDrawable(lqt.this.j);
            }
            this.o.setOnClickListener(new $$Lambda$lqt$c$8FN8W74qqJrJj9wqTkQwytcjYlg(this, vlc, i));
        }
    }

    /* renamed from: lqt$d */
    public static abstract class d extends u {
        public d(View view) {
            super(view);
        }

        /* access modifiers changed from: 0000 */
        public abstract void a(vlc vlc, int i);
    }

    static {
        Class<lqt> cls = lqt.class;
        d = cls.hashCode();
        e = cls.hashCode() + 1;
    }

    public lqt(Context context, b bVar, Picasso picasso, boolean z) {
        this.f = bVar;
        this.g = picasso;
        this.h = z;
        this.i = gaa.a(context, SpotifyIconV2.PLAYLIST_FOLDER);
        this.j = gaa.j(context);
        a(true);
    }

    public final int a(int i2) {
        return ((vlc) this.a.get(i2)).f() ? e : d;
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

    public final /* synthetic */ void a(u uVar) {
        d dVar = (d) uVar;
        if (dVar instanceof c) {
            ((fsc) fqz.a(((c) dVar).o, fsc.class)).c().setImageDrawable(null);
        }
    }

    public final /* synthetic */ void a(u uVar, int i2) {
        ((d) uVar).a((vlc) this.a.get(i2), i2);
    }

    public final int b() {
        return this.a.size();
    }

    public final long b(int i2) {
        String u = ((vlc) this.a.get(i2)).u();
        if (u != null) {
            return (long) u.hashCode();
        }
        return 0;
    }
}
