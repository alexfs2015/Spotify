package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.ImageView;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView.u;
import com.google.common.collect.Lists;
import com.spotify.music.R;
import com.spotify.music.playlist.ui.ItemConfiguration;
import com.spotify.music.playlist.ui.ItemConfiguration.HeartAndBan;
import com.spotify.music.playlist.ui.Rows;
import com.spotify.music.playlist.ui.Rows.AnonymousClass3;
import com.spotify.music.playlist.ui.Rows.AnonymousClass7;
import com.spotify.music.playlist.ui.Rows.RoundedLinearLayout;
import com.spotify.music.playlist.ui.Rows.d;
import com.spotify.music.playlist.ui.Rows.e;
import com.squareup.picasso.Picasso;
import java.util.Arrays;
import java.util.List;

/* renamed from: okr reason: default package */
public class okr extends androidx.recyclerview.widget.RecyclerView.a<u> {
    private static int a;
    private static int d;
    private final Picasso e;
    private final ujc f;
    private final a g;
    private final twc<okq> h;
    private final ugl i;
    private final okn j;
    private List<vle> k = Lists.a();
    private ItemConfiguration l = ItemConfiguration.r().a(HeartAndBan.ONLY_HEART).f(true).a();
    private boolean m;

    /* renamed from: okr$a */
    public interface a extends tvw {
        void a(vle vle, int i);
    }

    static {
        Class<okr> cls = okr.class;
        a = cls.hashCode();
        d = cls.hashCode() + 1;
    }

    public okr(Picasso picasso, ujc ujc, a aVar, who<jor<okq>> who, defpackage.twc.a<okq> aVar2, ugl ugl, okn okn) {
        this.e = picasso;
        this.f = ujc;
        this.g = aVar;
        this.h = aVar2.a(this.g, who);
        this.i = ugl;
        this.j = okn;
        a(true);
    }

    private static void a(View view, int i2) {
        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) view.getLayoutParams();
        marginLayoutParams.leftMargin = i2;
        marginLayoutParams.rightMargin = i2;
        ia.a(marginLayoutParams, i2);
        ia.b(marginLayoutParams, i2);
        view.setLayoutParams(marginLayoutParams);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(vle vle, int i2, View view) {
        this.g.a(vle, i2);
    }

    private static void b(View view, int i2) {
        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) view.getLayoutParams();
        marginLayoutParams.topMargin = i2;
        view.setLayoutParams(marginLayoutParams);
    }

    public final int a(int i2) {
        return ((vle) this.k.get(i2)).a() != null ? d : a;
    }

    public final u a(ViewGroup viewGroup, int i2) {
        if (i2 == a) {
            Context context = viewGroup.getContext();
            fqv.b();
            fsc b = fsk.b(context, viewGroup, false);
            Resources resources = context.getResources();
            int b2 = vfj.b(84.0f, resources);
            int b3 = vfj.b(72.0f, resources);
            int b4 = vfj.b(8.0f, resources);
            int b5 = vfj.b(6.0f, resources);
            int b6 = vfj.b(8.0f, resources);
            int b7 = vfj.b(8.0f, resources);
            RoundedLinearLayout roundedLinearLayout = new RoundedLinearLayout(context);
            roundedLinearLayout.setLayoutParams(new LayoutParams(-1, b2));
            roundedLinearLayout.setMinimumHeight(b2);
            roundedLinearLayout.setOrientation(0);
            roundedLinearLayout.setGravity(16);
            roundedLinearLayout.setBackgroundResource(R.drawable.bg_large_row_rounded);
            roundedLinearLayout.a = b4;
            roundedLinearLayout.b = b5;
            roundedLinearLayout.c = b4;
            roundedLinearLayout.d = b5;
            Arrays.fill(roundedLinearLayout.e, 0, 8, (float) b7);
            ImageView c = b.c();
            ViewGroup.LayoutParams layoutParams = b.c().getLayoutParams();
            layoutParams.height = b3;
            layoutParams.width = b3;
            c.setLayoutParams(layoutParams);
            c.setMinimumHeight(b3);
            c.setMinimumWidth(b3);
            Rows.a((View) b.c(), b6);
            roundedLinearLayout.addView(b.getView());
            b.getView().setDuplicateParentStateEnabled(true);
            AnonymousClass3 r12 = new d(b, roundedLinearLayout) {
                private /* synthetic */ fsc a;
                private /* synthetic */ RoundedLinearLayout b;

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
            fqz.a(r12);
            AnonymousClass7 r11 = new e(r12, new tvx((ViewGroup) r12.getView().findViewById(R.id.accessory))) {
                private /* synthetic */ d a;
                private /* synthetic */ tvx b;

                {
                    this.a = r1;
                    this.b = r2;
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
                    return this.a.getView();
                }
            };
            fqz.a(r11);
            return fra.a(r11);
        } else if (i2 == d) {
            fqy a2 = this.i.a(viewGroup);
            Resources resources2 = viewGroup.getContext().getResources();
            View view = a2.getView();
            view.setBackgroundResource(R.drawable.bg_large_row_rounded);
            a(view, 0);
            b(view, 0);
            MarginLayoutParams marginLayoutParams = (MarginLayoutParams) view.getLayoutParams();
            marginLayoutParams.bottomMargin = 0;
            view.setLayoutParams(marginLayoutParams);
            int b8 = vfj.b(16.0f, resources2);
            a(view.findViewById(R.id.time_label), b8);
            a(view.findViewById(R.id.description), b8);
            View findViewById = view.findViewById(R.id.top_container);
            a(findViewById, b8);
            b(findViewById, b8);
            ucv ucv = (ucv) fqv.a(a2.getView(), ucv.class);
            ucv.h();
            ucv.d(false);
            return fra.a(a2);
        } else {
            throw new IllegalArgumentException("Unsupported view type");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x00e7  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x00f2  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x00fe  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0105  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0127  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x012c  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0140  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x014d  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0157  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x015c  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0185  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x019b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(androidx.recyclerview.widget.RecyclerView.u r22, int r23) {
        /*
            r21 = this;
            r0 = r21
            r9 = r22
            r10 = r23
            okn r1 = r0.j
            if (r1 == 0) goto L_0x0013
            io.reactivex.subjects.BehaviorSubject<java.lang.Integer> r1 = r1.a
            java.lang.Integer r2 = java.lang.Integer.valueOf(r23)
            r1.onNext(r2)
        L_0x0013:
            java.util.List<vle> r1 = r0.k
            java.lang.Object r1 = r1.get(r10)
            r11 = r1
            vle r11 = (defpackage.vle) r11
            vlf r1 = r11.b()
            vkv r2 = r11.a()
            r12 = 0
            r13 = 0
            if (r1 == 0) goto L_0x006c
            okq$a r2 = defpackage.okq.i()
            java.lang.String r3 = r1.getName()
            okq$a r2 = r2.b(r3)
            java.lang.String r1 = r1.getUri()
            okq$a r1 = r2.a(r1)
            okq$a r1 = r1.a(r10)
            java.lang.String r2 = r11.d()
            okq$a r1 = r1.c(r2)
            boolean r2 = r0.m
            okq$a r1 = r1.a(r2)
            com.spotify.music.playlist.ui.ItemConfiguration r2 = r0.l
            com.spotify.music.playlist.ui.ItemConfiguration$HeartAndBan r2 = r2.d()
            com.spotify.music.playlist.ui.ItemConfiguration$HeartAndBan r3 = com.spotify.music.playlist.ui.ItemConfiguration.HeartAndBan.HEART_AND_BAN
            if (r2 != r3) goto L_0x005a
            r2 = 1
            goto L_0x005b
        L_0x005a:
            r2 = 0
        L_0x005b:
            okq$a r1 = r1.b(r2)
            com.google.common.collect.ImmutableMap r2 = r11.c()
            okq$a r1 = r1.a(r2)
            okq r1 = r1.a()
            goto L_0x00a8
        L_0x006c:
            if (r2 == 0) goto L_0x00aa
            okq$a r1 = defpackage.okq.i()
            java.lang.String r3 = r2.a()
            okq$a r1 = r1.b(r3)
            java.lang.String r3 = r2.getUri()
            okq$a r1 = r1.a(r3)
            okq$a r1 = r1.a(r10)
            java.lang.String r3 = r11.d()
            okq$a r1 = r1.c(r3)
            boolean r3 = r0.m
            okq$a r1 = r1.a(r3)
            com.spotify.playlist.models.Show$MediaType r2 = r2.w()
            okq$a r1 = r1.a(r2)
            com.google.common.collect.ImmutableMap r2 = r11.c()
            okq$a r1 = r1.a(r2)
            okq r1 = r1.a()
        L_0x00a8:
            r5 = r1
            goto L_0x00ab
        L_0x00aa:
            r5 = r13
        L_0x00ab:
            twc<okq> r1 = r0.h
            com.spotify.music.playlist.ui.ItemConfiguration r3 = r0.l
            r6 = 0
            r7 = 0
            r2 = r22
            r4 = r11
            r8 = r23
            twc$c r1 = r1.a(r2, r3, r4, r5, r6, r7, r8)
            vlf r2 = r11.b()
            vkv r3 = r11.a()
            android.view.View r4 = r9.o
            android.content.Context r4 = r4.getContext()
            android.view.View r5 = r9.o
            java.lang.Class<fsc> r6 = defpackage.fsc.class
            fqy r5 = defpackage.fqz.a(r5, r6)
            fsc r5 = (defpackage.fsc) r5
            android.widget.ImageView r14 = r5.c()
            -$$Lambda$okr$lpmaG1a5hVlBMHf09SZExrJJTBQ r5 = new -$$Lambda$okr$lpmaG1a5hVlBMHf09SZExrJJTBQ
            r5.<init>(r0, r11, r10)
            r14.setOnClickListener(r5)
            r14.setVisibility(r12)
            boolean r5 = r1.a()
            if (r5 == 0) goto L_0x00f2
            r5 = 2131952717(0x7f13044d, float:1.9541885E38)
            java.lang.String r5 = r4.getString(r5)
            r14.setContentDescription(r5)
            goto L_0x00fc
        L_0x00f2:
            r5 = 2131953393(0x7f1306f1, float:1.9543256E38)
            java.lang.String r5 = r4.getString(r5)
            r14.setContentDescription(r5)
        L_0x00fc:
            if (r2 == 0) goto L_0x0105
            com.spotify.playlist.models.Covers$Size r2 = com.spotify.playlist.models.Covers.Size.NORMAL
            java.lang.String r2 = r11.getImageUri(r2)
            goto L_0x0121
        L_0x0105:
            if (r3 == 0) goto L_0x0120
            com.spotify.playlist.models.Covers r2 = r3.b()
            com.spotify.playlist.models.Covers r5 = r3.c()
            com.spotify.playlist.models.Show r3 = r3.t()
            java.lang.Object r3 = defpackage.fbp.a(r3)
            com.spotify.playlist.models.Show r3 = (com.spotify.playlist.models.Show) r3
            com.spotify.playlist.models.Covers$Size r6 = com.spotify.playlist.models.Covers.Size.NORMAL
            java.lang.String r2 = defpackage.vlh.a(r2, r5, r3, r6)
            goto L_0x0121
        L_0x0120:
            r2 = r13
        L_0x0121:
            vlf r3 = r11.b()
            if (r3 == 0) goto L_0x012c
            java.lang.String r13 = r3.previewId()
            goto L_0x0136
        L_0x012c:
            vkv r3 = r11.a()
            if (r3 == 0) goto L_0x0136
            java.lang.String r13 = r3.g()
        L_0x0136:
            android.view.View r3 = r9.o
            java.lang.Class<ucv> r5 = defpackage.ucv.class
            boolean r3 = defpackage.fqz.c(r3, r5)
            if (r3 == 0) goto L_0x014d
            r3 = 1090519040(0x41000000, float:8.0)
            android.content.res.Resources r5 = r4.getResources()
            int r12 = defpackage.vfj.b(r3, r5)
            r20 = r12
            goto L_0x014f
        L_0x014d:
            r20 = 0
        L_0x014f:
            com.squareup.picasso.Picasso r3 = r0.e
            boolean r5 = android.text.TextUtils.isEmpty(r2)
            if (r5 != 0) goto L_0x015c
            android.net.Uri r2 = android.net.Uri.parse(r2)
            goto L_0x015e
        L_0x015c:
            android.net.Uri r2 = android.net.Uri.EMPTY
        L_0x015e:
            wgr r2 = r3.a(r2)
            android.graphics.drawable.Drawable r3 = defpackage.gaa.i(r4)
            wgr r2 = r2.a(r3)
            ujc r15 = r0.f
            boolean r3 = r1.a()
            java.lang.String r4 = ""
            if (r3 != 0) goto L_0x017d
            boolean r3 = defpackage.fbo.a(r13)
            if (r3 != 0) goto L_0x017d
            r16 = r13
            goto L_0x017f
        L_0x017d:
            r16 = r4
        L_0x017f:
            boolean r3 = defpackage.fbo.a(r13)
            if (r3 != 0) goto L_0x019b
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r13)
            java.lang.String r4 = r11.getUri()
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r17 = r3
            goto L_0x019d
        L_0x019b:
            r17 = r4
        L_0x019d:
            boolean r18 = r1.a()
            r19 = 1
            ujd r1 = defpackage.ujd.a(r14, r15, r16, r17, r18, r19, r20)
            r2.a(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.okr.a(androidx.recyclerview.widget.RecyclerView$u, int):void");
    }

    public final void a(List<vle> list) {
        this.k = list;
        e();
    }

    public final int b() {
        return this.k.size();
    }

    public final long b(int i2) {
        vle vle = (vle) this.k.get(i2);
        long hashCode = (long) (hashCode() ^ vle.getUri().hashCode());
        String d2 = vle.d();
        return d2 != null ? hashCode ^ ((long) d2.hashCode()) : hashCode;
    }

    public final void b(boolean z) {
        if (this.l.g() != z) {
            this.l = this.l.q().e(z).a();
            e();
        }
    }

    public final void c(boolean z) {
        if (this.m != z) {
            this.m = z;
            e();
        }
    }

    public final void d(boolean z) {
        HeartAndBan heartAndBan = z ? HeartAndBan.HEART_AND_BAN : HeartAndBan.ONLY_HEART;
        if (this.l.d() != heartAndBan) {
            this.l = this.l.q().a(heartAndBan).a();
            e();
        }
    }

    public final void e(boolean z) {
        if (this.l.i() != z) {
            this.l = this.l.q().g(z).a();
            e();
        }
    }

    public final void f(boolean z) {
        if (this.l.a() != z) {
            this.l = this.l.q().a(z).a();
            e();
        }
    }

    public final void g(boolean z) {
        if (this.l.b() != z) {
            this.l = this.l.q().b(z).a();
            e();
        }
    }
}
