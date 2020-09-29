package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnLongClickListener;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView.u;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.music.R;
import com.spotify.music.playlist.ui.ItemConfiguration;
import com.spotify.music.playlist.ui.ItemConfiguration.HeartAndBan;
import com.spotify.music.playlist.ui.Rows.a;
import com.spotify.paste.spotifyicon.SpotifyIconDrawable;
import com.spotify.playlist.models.Covers.Size;
import com.spotify.playlist.models.Show;
import com.squareup.picasso.Picasso;
import java.util.Collections;
import java.util.List;

/* renamed from: tkl reason: default package */
public final class tkl<T> implements tkk<T> {
    private final Picasso a;
    private final tkg b;
    private final tvx c;
    private final twi d;
    private final boolean e;
    private final tjy<T> f;
    private final tke g;
    private final twz h;

    tkl(Picasso picasso, tkg tkg, tvx tvx, twi twi, boolean z, tjz<T> tjz, twz twz, tke tke, vti<jmf<T>> vti) {
        this.a = picasso;
        this.b = tkg;
        this.c = tvx;
        this.d = twi;
        this.e = z;
        this.f = new tjy<>(tjz.a, tjz.b, vti);
        this.g = tke;
        this.h = twz;
    }

    public final c a(u uVar, ItemConfiguration itemConfiguration, uzb uzb, T t, final boolean z, boolean z2, int i) {
        return a(uVar, itemConfiguration, uzb, t, (b) new b() {
            public final boolean b() {
                return false;
            }

            public final boolean a() {
                return z;
            }
        }, z2, i);
    }

    public final c a(u uVar, ItemConfiguration itemConfiguration, uzb uzb, T t, b bVar, boolean z, int i) {
        u uVar2 = uVar;
        Context context = uVar2.o.getContext();
        return a(uVar2, itemConfiguration, uzb, t, bVar, z, i, fzg.i(context), fzg.c(context), fzg.m(context));
    }

    /* JADX WARNING: type inference failed for: r15v2, types: [android.view.View$OnClickListener] */
    /* JADX WARNING: type inference failed for: r15v3, types: [-$$Lambda$PJzh9GLHJR3cXwLv6UIZ2byvHag] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x01a4  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x01ab  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x02ad  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.tkk.c a(androidx.recyclerview.widget.RecyclerView.u r23, com.spotify.music.playlist.ui.ItemConfiguration r24, defpackage.uzb r25, T r26, defpackage.tkk.b r27, boolean r28, int r29, android.graphics.drawable.Drawable r30, android.graphics.drawable.Drawable r31, android.graphics.drawable.Drawable r32) {
        /*
            r22 = this;
            r6 = r22
            r7 = r23
            r8 = r24
            r9 = r25
            r10 = r26
            r11 = r29
            uzc r12 = r25.b()
            uys r13 = r25.a()
            android.view.View r14 = r7.o
            android.view.View r0 = r7.o
            r1 = 2131430159(0x7f0b0b0f, float:1.8482011E38)
            r0.setId(r1)
            android.view.View r0 = r7.o
            r0.setTag(r9)
            android.content.Context r15 = r14.getContext()
            java.lang.Class<frh> r0 = defpackage.frh.class
            fqe r0 = defpackage.fqb.a(r14, r0)
            r5 = r0
            frh r5 = (defpackage.frh) r5
            java.lang.String r0 = r25.getTitle()
            boolean r1 = r24.a()
            if (r1 == 0) goto L_0x0072
            int r1 = r11 + 1
            boolean r2 = defpackage.uur.a(r15)
            if (r2 == 0) goto L_0x005a
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            java.lang.String r0 = " ."
            r2.append(r0)
            r2.append(r1)
            java.lang.String r0 = r2.toString()
            r5.a(r0)
            goto L_0x0075
        L_0x005a:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            java.lang.String r1 = ". "
            r2.append(r1)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r5.a(r0)
            goto L_0x0075
        L_0x0072:
            r5.a(r0)
        L_0x0075:
            tkg r0 = r6.b
            boolean r1 = r24.c()
            boolean r2 = r24.b()
            java.lang.String r0 = r0.a(r9, r1, r2)
            r5.b(r0)
            if (r13 == 0) goto L_0x008b
            r16 = 1
            goto L_0x008d
        L_0x008b:
            r16 = 0
        L_0x008d:
            if (r16 == 0) goto L_0x0099
            com.spotify.playlist.models.Show$MediaType r0 = r13.w()
            com.spotify.playlist.models.Show$MediaType r1 = com.spotify.playlist.models.Show.MediaType.AUDIO
            if (r0 == r1) goto L_0x0099
            r2 = 1
            goto L_0x009a
        L_0x0099:
            r2 = 0
        L_0x009a:
            boolean r0 = b(r12, r13)
            boolean r1 = a(r8, r12)
            if (r12 == 0) goto L_0x00b2
            boolean r17 = r12.isCurrentlyPlayable()
            if (r17 != 0) goto L_0x00b2
            boolean r17 = r12.isPremiumOnly()
            if (r17 == 0) goto L_0x00b2
            r3 = 1
            goto L_0x00b3
        L_0x00b2:
            r3 = 0
        L_0x00b3:
            android.widget.TextView r4 = r5.d()
            defpackage.jxb.b(r15, r4, r3)
            android.widget.TextView r3 = r5.d()
            defpackage.jxb.a(r15, r3, r0)
            if (r12 == 0) goto L_0x00d2
            boolean r0 = r12.is19plus()
            if (r0 == 0) goto L_0x00d2
            android.widget.TextView r0 = r5.d()
            java.lang.String r3 = "19"
            defpackage.jxb.a(r15, r0, r3)
        L_0x00d2:
            android.widget.TextView r0 = r5.d()
            r3 = 2131953281(0x7f130681, float:1.9543029E38)
            java.lang.String r3 = r15.getString(r3)
            defpackage.jxb.a(r15, r0, r1, r3)
            boolean r4 = r27.a()
            boolean r0 = r27.b()
            if (r12 == 0) goto L_0x0168
            boolean r1 = r24.m()
            if (r1 == 0) goto L_0x0168
            java.lang.Class<com.spotify.music.playlist.ui.Rows$f> r1 = com.spotify.music.playlist.ui.Rows.f.class
            boolean r1 = defpackage.fqf.c(r14, r1)
            if (r1 == 0) goto L_0x0168
            java.lang.Class<com.spotify.music.playlist.ui.Rows$f> r1 = com.spotify.music.playlist.ui.Rows.f.class
            fqe r1 = defpackage.fqb.a(r14, r1)
            com.spotify.music.playlist.ui.Rows$f r1 = (com.spotify.music.playlist.ui.Rows.f) r1
            android.widget.TextView r3 = r1.e()
            r19 = r2
            r2 = 2131953311(0x7f13069f, float:1.954309E38)
            java.lang.String r2 = r15.getString(r2)
            boolean r20 = r24.o()
            if (r20 == 0) goto L_0x011c
            java.lang.String r7 = " "
            r3.setText(r7)
            defpackage.jxb.a(r15, r3, r2)
            goto L_0x011f
        L_0x011c:
            r3.setText(r2)
        L_0x011f:
            if (r0 == 0) goto L_0x013f
            boolean r2 = r24.p()
            if (r2 == 0) goto L_0x013f
            r2 = 2131953309(0x7f13069d, float:1.9543085E38)
            java.lang.String r2 = r15.getString(r2)
            r1.a(r2)
            r2 = 2131953310(0x7f13069e, float:1.9543087E38)
            java.lang.String r2 = r15.getString(r2)
            r1.b(r2)
            r1.g()
            goto L_0x0142
        L_0x013f:
            r1.f()
        L_0x0142:
            if (r0 == 0) goto L_0x0160
            boolean r0 = r24.n()
            if (r0 == 0) goto L_0x0160
            r0 = 2131953308(0x7f13069c, float:1.9543083E38)
            java.lang.String r0 = r15.getString(r0)
            r1.c(r0)
            r1.h()
            -$$Lambda$tkl$SHRg5XP-z1J7wZo99bxxQvvloaU r0 = new -$$Lambda$tkl$SHRg5XP-z1J7wZo99bxxQvvloaU
            r0.<init>(r6, r11, r9)
            r1.a(r0)
            goto L_0x016a
        L_0x0160:
            r1.i()
            r3 = 0
            r1.a(r3)
            goto L_0x016b
        L_0x0168:
            r19 = r2
        L_0x016a:
            r3 = 0
        L_0x016b:
            r5.a(r4)
            boolean r7 = a(r8, r12, r13)
            r5.c(r7)
            r0 = r22
            r1 = r23
            r8 = r19
            r2 = r24
            r17 = r3
            r19 = r7
            r7 = 0
            r3 = r25
            r7 = r4
            r18 = r12
            r12 = 1
            r4 = r26
            r21 = r5
            r5 = r29
            r0.a(r1, r2, r3, (T) r4, r5)
            com.spotify.music.playlist.ui.ItemConfiguration$LongClickAction r0 = r24.e()
            com.spotify.music.playlist.ui.ItemConfiguration$LongClickAction r1 = com.spotify.music.playlist.ui.ItemConfiguration.LongClickAction.SHOW_CONTEXT_MENU
            if (r0 != r1) goto L_0x019d
            if (r10 == 0) goto L_0x019d
            r0 = 1
            goto L_0x019e
        L_0x019d:
            r0 = 0
        L_0x019e:
            android.view.View r1 = r21.getView()
            if (r0 == 0) goto L_0x01ab
            tjy<T> r0 = r6.f
            android.view.View$OnLongClickListener r3 = r0.b(r10)
            goto L_0x01ad
        L_0x01ab:
            r3 = r17
        L_0x01ad:
            r1.setOnLongClickListener(r3)
            java.lang.String r0 = ""
            if (r13 == 0) goto L_0x028c
            java.lang.Class<tqs> r1 = defpackage.tqs.class
            boolean r1 = defpackage.fqf.c(r14, r1)
            if (r1 == 0) goto L_0x028c
            java.lang.Class<tqs> r1 = defpackage.tqs.class
            fqe r1 = defpackage.fqb.a(r14, r1)
            r14 = r1
            tqs r14 = (defpackage.tqs) r14
            com.spotify.playlist.models.Show r1 = r13.t()
            if (r1 == 0) goto L_0x01d3
            com.spotify.playlist.models.Show r0 = r13.t()
            java.lang.String r0 = r0.a()
        L_0x01d3:
            tvx r1 = r6.c
            if (r7 == 0) goto L_0x01db
            if (r28 == 0) goto L_0x01db
            r2 = 1
            goto L_0x01dc
        L_0x01db:
            r2 = 0
        L_0x01dc:
            r1.a(r14, r2)
            defpackage.tvx.a(r14, r13)
            tvx r1 = r6.c
            r1.a(r14, r13)
            boolean r1 = r24.k()
            if (r1 == 0) goto L_0x01f4
            java.lang.String r1 = a(r25)
            r14.a(r1)
        L_0x01f4:
            twi r1 = r6.d
            r2 = 0
            java.lang.String r0 = r1.a(r0, r13, r7, r2)
            r14.c(r0)
            android.widget.TextView r0 = r21.d()
            a(r15, r0, r8)
            android.widget.TextView r0 = r21.d()
            uzf$f r1 = new uzf$f
            r1.<init>()
            defpackage.jrv.a(r15, r0, r1)
            tjy<T> r0 = r6.f
            android.view.View$OnLongClickListener r10 = r0.b(r10)
            -$$Lambda$tkl$095r8Txo50Hudd7LGCwSE_qAEYI r15 = new -$$Lambda$tkl$095r8Txo50Hudd7LGCwSE_qAEYI
            r0 = r15
            r1 = r22
            r2 = r8
            r3 = r10
            r4 = r29
            r5 = r25
            r0.<init>(r1, r2, r3, r4, r5)
            boolean r0 = r24.l()
            if (r0 == 0) goto L_0x0233
            r10.getClass()
            -$$Lambda$PJzh9GLHJR3cXwLv6UIZ2byvHag r15 = new -$$Lambda$PJzh9GLHJR3cXwLv6UIZ2byvHag
            r15.<init>(r10)
        L_0x0233:
            r14.a(r15)
            android.view.View r0 = r14.getView()
            r0.setOnLongClickListener(r10)
            -$$Lambda$tkl$CsALHwYUqWAY5HP1MIMjadv1Sos r0 = new -$$Lambda$tkl$CsALHwYUqWAY5HP1MIMjadv1Sos
            r0.<init>(r6, r11, r9, r7)
            r14.b(r0)
            if (r8 != 0) goto L_0x0286
            r14.h(r12)
            -$$Lambda$tkl$OdMp8FELlgo5syTOjwNG0mvtuh8 r0 = new -$$Lambda$tkl$OdMp8FELlgo5syTOjwNG0mvtuh8
            r0.<init>(r6, r11, r9)
            r14.e(r0)
            boolean r0 = r6.e
            if (r0 == 0) goto L_0x0274
            boolean r0 = r13.k()
            defpackage.tvx.b(r14, r0)
            -$$Lambda$tkl$tpCXeLu7moG7fCXzXsdki_grNVg r0 = new -$$Lambda$tkl$tpCXeLu7moG7fCXzXsdki_grNVg
            r0.<init>(r6, r11, r9)
            defpackage.tvx.a(r14, r0)
            tvx r0 = r6.c
            java.lang.String r1 = r13.getUri()
            uzf r2 = r13.u()
            r0.a(r1, r14, r2)
            goto L_0x0345
        L_0x0274:
            boolean r0 = r13.k()
            r14.i(r0)
            tvx r0 = r6.c
            uzf r1 = r13.u()
            r0.a(r14, r1)
            goto L_0x0345
        L_0x0286:
            r0 = 0
            r14.h(r0)
            goto L_0x0345
        L_0x028c:
            android.view.View r1 = r21.getView()
            -$$Lambda$tkl$hjKwvNA56YyPfeMtDSRZrBqbSgA r2 = new -$$Lambda$tkl$hjKwvNA56YyPfeMtDSRZrBqbSgA
            r2.<init>(r6, r11, r9)
            r1.setOnClickListener(r2)
            r1 = r18
            uzf r1 = a(r1, r13)
            android.widget.TextView r2 = r21.d()
            defpackage.jrv.a(r15, r2, r1)
            java.lang.Class<frp> r1 = defpackage.frp.class
            boolean r1 = defpackage.fqf.c(r14, r1)
            if (r1 == 0) goto L_0x0345
            java.lang.Class<frp> r1 = defpackage.frp.class
            fqe r1 = defpackage.fqb.a(r14, r1)
            frp r1 = (defpackage.frp) r1
            android.widget.ImageView r1 = r1.c()
            boolean r2 = r24.m()
            if (r2 == 0) goto L_0x0324
            java.lang.String r2 = a(r25)
            java.lang.String r3 = b(r25)
            com.squareup.picasso.Picasso r4 = r6.a
            boolean r5 = android.text.TextUtils.isEmpty(r2)
            if (r5 != 0) goto L_0x02d4
            android.net.Uri r2 = android.net.Uri.parse(r2)
            goto L_0x02d6
        L_0x02d4:
            android.net.Uri r2 = android.net.Uri.EMPTY
        L_0x02d6:
            vsl r2 = r4.a(r2)
            android.graphics.drawable.Drawable r4 = defpackage.fzg.i(r15)
            vsl r2 = r2.a(r4)
            twz r4 = r6.h
            if (r19 != 0) goto L_0x02ee
            boolean r5 = defpackage.fax.a(r3)
            if (r5 != 0) goto L_0x02ee
            r5 = r3
            goto L_0x02ef
        L_0x02ee:
            r5 = r0
        L_0x02ef:
            boolean r7 = defpackage.fax.a(r3)
            if (r7 != 0) goto L_0x0308
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r3)
            java.lang.String r3 = r25.d()
            r0.append(r3)
            java.lang.String r0 = r0.toString()
        L_0x0308:
            r3 = 0
            r7 = 0
            r23 = r1
            r24 = r4
            r25 = r5
            r26 = r0
            r27 = r19
            r28 = r3
            r29 = r7
            txa r0 = defpackage.txa.a(r23, r24, r25, r26, r27, r28, r29)
            r2.a(r0)
            r0 = 0
            r1.setVisibility(r0)
            goto L_0x0345
        L_0x0324:
            r0 = 0
            boolean r2 = r24.j()
            if (r2 == 0) goto L_0x0340
            r2 = r23
            if (r8 == 0) goto L_0x0332
            r3 = r32
            goto L_0x0339
        L_0x0332:
            if (r16 == 0) goto L_0x0337
            r3 = r31
            goto L_0x0339
        L_0x0337:
            r3 = r30
        L_0x0339:
            r6.a(r2, r9, r3)
            r1.setVisibility(r0)
            goto L_0x0345
        L_0x0340:
            r0 = 8
            r1.setVisibility(r0)
        L_0x0345:
            tkc$a r0 = new tkc$a
            r0.<init>()
            r1 = r19
            tkk$c$a r0 = r0.a(r1)
            tkk$c r0 = r0.a()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tkl.a(androidx.recyclerview.widget.RecyclerView$u, com.spotify.music.playlist.ui.ItemConfiguration, uzb, java.lang.Object, tkk$b, boolean, int, android.graphics.drawable.Drawable, android.graphics.drawable.Drawable, android.graphics.drawable.Drawable):tkk$c");
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void g(int i, uzb uzb, View view) {
        this.g.e(i, uzb);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(boolean z, OnLongClickListener onLongClickListener, int i, uzb uzb, View view) {
        if (z) {
            onLongClickListener.onLongClick(view);
        } else {
            this.g.a(i, uzb);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(int i, uzb uzb, boolean z, View view) {
        this.g.a(i, uzb, z);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void f(int i, uzb uzb, View view) {
        this.g.d(i, uzb);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void e(int i, uzb uzb, View view) {
        this.g.d(i, uzb);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void d(int i, uzb uzb, View view) {
        this.g.a(i, uzb);
    }

    private void a(u uVar, uzb uzb, Drawable drawable) {
        frp frp = (frp) fqb.a(uVar.o, frp.class);
        String a2 = a(uzb);
        this.a.a(!TextUtils.isEmpty(a2) ? Uri.parse(a2) : Uri.EMPTY).a((Object) Integer.valueOf(R.id.image_on_item_in_list_loaded_with_picasso)).a(drawable).b(drawable).a(frp.c());
    }

    private void a(u uVar, ItemConfiguration itemConfiguration, uzb uzb, T t, int i) {
        uzc b2 = uzb.b();
        uys a2 = uzb.a();
        View view = uVar.o;
        boolean c2 = fqf.c(view, a.class);
        if (c2 && b2 != null && itemConfiguration.d() == HeartAndBan.HEART_AND_BAN) {
            ((a) fqb.a(view, a.class)).a(this.f.a(b2.inCollection(), b2.isBanned(), t, new $$Lambda$tkl$Crnbc153rlNRCJthCw0y1edmoQ(this, i, uzb), new $$Lambda$tkl$N6oF0Rmiy9vOuFLl8Z3YPW5bZQA(this, i, uzb), itemConfiguration.i()));
        } else if (c2 && b2 != null && itemConfiguration.d() == HeartAndBan.ONLY_HEART) {
            ((a) fqb.a(view, a.class)).a(this.f.a(b2.inCollection(), t, new $$Lambda$tkl$6KHQC5B2bbLNTI1H_fBFOfYxry8(this, i, uzb)));
        } else if (b2 != null || a2 != null) {
            List a3 = this.f.a(t);
            if (c2) {
                ((a) fqb.a(view, a.class)).a(a3);
            } else if (!a3.isEmpty()) {
                ((fqz) fqb.a(view, fqz.class)).a((View) a3.get(0));
            } else {
                ((fqz) fqb.a(view, fqz.class)).a(null);
            }
        } else if (c2) {
            ((a) fqb.a(view, a.class)).a(Collections.emptyList());
        } else {
            ((fqz) fqb.a(view, fqz.class)).a(null);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void c(int i, uzb uzb, View view) {
        this.g.b(i, uzb);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(int i, uzb uzb, View view) {
        this.g.c(i, uzb);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(int i, uzb uzb, View view) {
        this.g.b(i, uzb);
    }

    private static boolean b(uzc uzc, uys uys) {
        if (uzc == null && uys == null) {
            return false;
        }
        return uzc != null ? uzc.isExplicit() : uys.i();
    }

    private static boolean a(ItemConfiguration itemConfiguration, uzc uzc) {
        return itemConfiguration.f() && uzc != null && uzc.hasLyrics();
    }

    private static boolean a(ItemConfiguration itemConfiguration, uzc uzc, uys uys) {
        if (uzc == null && uys == null) {
            return false;
        }
        return uzc != null ? (uzc.isBanned() && itemConfiguration.h()) || !uzc.isCurrentlyPlayable() || (uzc.isExplicit() && itemConfiguration.g()) : !uys.k() || (uys.i() && itemConfiguration.g());
    }

    private static void a(Context context, TextView textView, boolean z) {
        int b2 = uts.b(16.0f, context.getResources());
        if (z) {
            jwu.a(context, textView, 0, 0, new $$Lambda$tkl$5WAmqk7P2jr1RBoB0l8KU6ZheUg(context, b2));
        } else {
            jwu.a(textView, 0, 0);
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ SpotifyIconDrawable a(Context context, int i) {
        SpotifyIconDrawable spotifyIconDrawable = new SpotifyIconDrawable(context, SpotifyIconV2.VIDEO, (float) i);
        spotifyIconDrawable.a(fr.c(context, R.color.gray_70));
        return spotifyIconDrawable;
    }

    private static String a(uzb uzb) {
        uzc b2 = uzb.b();
        uys a2 = uzb.a();
        if (b2 != null) {
            return uzb.getImageUri(Size.NORMAL);
        }
        if (a2 != null) {
            return uze.a(a2.b(), a2.c(), (Show) fay.a(a2.t()), Size.NORMAL);
        }
        return null;
    }

    private static String b(uzb uzb) {
        uzc b2 = uzb.b();
        if (b2 != null) {
            return b2.previewId();
        }
        uys a2 = uzb.a();
        if (a2 != null) {
            return a2.g();
        }
        return null;
    }

    private static uzf a(uzc uzc, uys uys) {
        if (uzc == null && uys == null) {
            return new f();
        }
        return uzc != null ? uzc.getOfflineState() : uys.u();
    }
}
