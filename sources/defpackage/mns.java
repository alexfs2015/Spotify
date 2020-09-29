package defpackage;

import android.content.Context;
import android.net.Uri;
import com.google.common.base.Optional;
import com.google.common.collect.ImmutableMap;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.util.ui.Lifecycle.c;
import com.spotify.music.features.editplaylist.EditPlaylistLogger;
import com.spotify.music.features.editplaylist.EditPlaylistLogger.UserIntent;
import com.spotify.music.features.editplaylist.upload.ImageUpload;
import com.spotify.music.loggers.InteractionLogger.InteractionType;
import com.spotify.music.toastie.ToastieManager;
import com.spotify.playlist.endpoints.policy.playlist.DecorationPolicy;
import com.spotify.playlist.endpoints.policy.playlist.HeaderPolicy;
import com.spotify.playlist.endpoints.policy.playlist.ListPolicy;
import com.spotify.playlist.endpoints.policy.playlist.Policy;
import io.reactivex.BackpressureStrategy;
import io.reactivex.Completable;
import io.reactivex.CompletableSource;
import io.reactivex.Scheduler;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: mns reason: default package */
public final class mns implements defpackage.mnq.a {
    private static final Policy i;
    public final mny a;
    public final EditPlaylistLogger b;
    public final mnq c;
    public final mnm d;
    public boolean e;
    public String f;
    public String g;
    public boolean h;
    /* access modifiers changed from: private */
    public final a j;
    /* access modifiers changed from: private */
    public final CompositeDisposable k = new CompositeDisposable();
    private final mnx l;
    private final ImageUpload m;
    private final mnw n;
    /* access modifiers changed from: private */
    public boolean o;

    /* renamed from: mns$a */
    public static class a extends rws<mng> {
        public final /* bridge */ /* synthetic */ boolean a(Object obj) {
            return true;
        }

        a(com.spotify.mobile.android.util.ui.Lifecycle.a aVar, rwr rwr, sih sih, rdh rdh) {
            super(aVar, rwr, sih, rdh);
        }
    }

    static {
        String str = "name";
        String str2 = "collaborative";
        String str3 = "ownedBySelf";
        String str4 = "picture";
        String str5 = "description";
        HeaderPolicy a2 = HeaderPolicy.builder().a(ImmutableMap.g().b(str, Boolean.TRUE).b("isWritable", Boolean.TRUE).b(str2, Boolean.TRUE).b(str3, Boolean.TRUE).b(str4, Boolean.TRUE).b(str5, Boolean.TRUE).b()).b(ImmutableMap.f()).c(ImmutableMap.f()).a();
        String str6 = "rowId";
        ImmutableMap b2 = ImmutableMap.g().b(str, Boolean.TRUE).b("link", Boolean.TRUE).b(str6, Boolean.TRUE).b();
        i = Policy.builder().a(DecorationPolicy.builder().a(a2).a(ListPolicy.builder().a(b2).e(ImmutableMap.g().b(str, Boolean.TRUE).b("username", Boolean.TRUE).b()).b(ImmutableMap.b(str, Boolean.TRUE)).c(ImmutableMap.b(str, Boolean.TRUE)).d(ImmutableMap.b(str, Boolean.TRUE)).a()).a()).a();
    }

    public mns(mny mny, EditPlaylistLogger editPlaylistLogger, com.spotify.mobile.android.util.ui.Lifecycle.a aVar, mnv mnv, Scheduler scheduler, hec hec, mnm mnm, mmo mmo, a aVar2, mnr mnr, uxc uxc, mnx mnx, ImageUpload imageUpload, mnw mnw) {
        mnr mnr2 = mnr;
        this.a = mny;
        this.b = editPlaylistLogger;
        this.d = mnm;
        this.j = aVar2;
        mnq mnq = new mnq((Context) mnr.a(mnr2.a.get(), 1), (sih) mnr.a(mnr2.b.get(), 2), (rdc) mnr.a(mnr2.c.get(), 3), (ToastieManager) mnr.a(mnr2.d.get(), 4), (fss) mnr.a(mnr2.e.get(), 5), (defpackage.mnq.a) mnr.a(this, 6));
        this.c = mnq;
        this.l = mnx;
        this.m = imageUpload;
        this.n = mnw;
        final String t = mnv.t();
        final defpackage.uxc.a a2 = defpackage.uxc.a.t().a(true).a(Optional.b(i)).a();
        final uxc uxc2 = uxc;
        final Scheduler scheduler2 = scheduler;
        final hec hec2 = hec;
        final mmo mmo2 = mmo;
        AnonymousClass1 r0 = new c() {
            public final void c() {
                mns.this.a.f(true);
                mns.this.k.a(uxc2.a(t, a2).d().c((Function<? super T, ? extends R>) new $$Lambda$mns$1$sA_zHkuwPXvKvJbYx8SK7HVbR7U<Object,Object>(this)).a(vun.a((c<T, R>) mns.this.j, BackpressureStrategy.BUFFER)).a(scheduler2).a((Consumer<? super T>) new $$Lambda$mns$1$6ISmGaYIPWzOhVSc_EbMjQ_tPZU<Object>(this), (Consumer<? super Throwable>) $$Lambda$mns$1$8P4j8tnKAzKyjH9Gld4HlWjH2M.INSTANCE));
                mns.this.k.a(hec2.a().a(scheduler2).a((Consumer<? super T>) new $$Lambda$mns$1$RgJBn_pgaHYv4BnF24mHXRQgnhQ<Object>(this, mmo2), (Consumer<? super Throwable>) $$Lambda$mns$1$ft3mcJWQCwizphv4UlyrhOMlLI.INSTANCE));
            }

            /* access modifiers changed from: private */
            public /* synthetic */ mng a(uza uza) {
                mnm h = mns.this.d;
                mng a2 = mng.a(uza);
                Iterator it = h.a.iterator();
                while (it.hasNext()) {
                    a2 = ((mnk) it.next()).a(a2);
                }
                return a2;
            }

            /* access modifiers changed from: private */
            public /* synthetic */ void a(mng mng) {
                mns.this.f = mng.a();
                mns.this.g = mng.c();
                mns.this.e = mng.f();
                mns.this.a.a(mns.this.f);
                if (!mns.this.o) {
                    mns.this.a.a(Uri.parse(mng.b()));
                }
                boolean z = true;
                boolean z2 = !fax.a(mns.this.g);
                mns.this.a.b(mns.this.g);
                mns.this.a.h(mns.this.e && !z2);
                mns.this.a.c(!mns.this.e && z2);
                mny a2 = mns.this.a;
                if (!mns.this.e || !z2) {
                    z = false;
                }
                a2.i(z);
                mns.this.a.a(mns.this.e);
                mns.this.a.b(mns.this.e);
                mns.this.a.a(mng.d());
                mns.this.a.g(mng.d().isEmpty());
                mns.this.a.f(false);
                mns.this.a.e(mng.e());
            }

            public final void a() {
                mns.this.k.c();
            }

            /* access modifiers changed from: private */
            public /* synthetic */ void a(mmo mmo, fpt fpt) {
                String str = "Enabled";
                boolean z = false;
                boolean z2 = str.equalsIgnoreCase((String) fpt.a(haz.a)) || str.equalsIgnoreCase((String) fpt.a(haz.b));
                mns.this.a.j(z2);
                mns.this.a.k(z2);
                mny a2 = mns.this.a;
                if (!mmo.a.a(fpt) && !twu.a(fpt)) {
                    z = true;
                }
                a2.d(z);
            }
        };
        com.spotify.mobile.android.util.ui.Lifecycle.a aVar3 = aVar;
        aVar.a(r0);
    }

    public final void e() {
        Completable completable;
        if (!this.h) {
            this.h = true;
            this.b.a(null, "toolbar", 0, InteractionType.HIT, UserIntent.SAVE);
            this.a.f(true);
            CompositeDisposable compositeDisposable = this.k;
            mnm mnm = this.d;
            ArrayList arrayList = new ArrayList(mnm.a.size());
            Iterator it = mnm.a.iterator();
            while (it.hasNext()) {
                arrayList.add(((mnk) it.next()).a(mnm.c));
            }
            if (arrayList.isEmpty()) {
                completable = Completable.a();
            } else {
                completable = Completable.a((Iterable<? extends CompletableSource>) arrayList);
            }
            mny mny = this.a;
            mny.getClass();
            compositeDisposable.a(completable.a((Action) new $$Lambda$uggKitbWefxYPSQNMXLoeV93aA(mny), (Consumer<? super Throwable>) new $$Lambda$mns$ZzTSjnE0OWlzWnA8ws8wr5_dYjs<Object>(this)));
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(Throwable th) {
        Logger.e("Failed to save changes: %s", th);
        this.a.k();
    }

    public final void a(Uri uri) {
        this.o = false;
        this.a.a(uri);
        this.o = true;
        this.k.a(this.l.a().a((Consumer<? super T>) new $$Lambda$mns$hyhlTAI30Rxx_wm8wjU_dnDEPs<Object>(this, uri), (Consumer<? super Throwable>) $$Lambda$mns$bQL6WcuVpwRWfWd0BN9rZik42Q.INSTANCE));
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00c1  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00cc  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00d5  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00f5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ void a(android.net.Uri r7, com.spotify.music.features.editplaylist.upload.Keymaster r8) {
        /*
            r6 = this;
            mnw r0 = r6.n
            mnw$a r1 = r0.b
            android.content.Context r2 = r0.a
            boolean r1 = r1.a(r2, r7)
            r2 = 0
            r3 = 0
            if (r1 == 0) goto L_0x0091
            boolean r1 = defpackage.mnw.b(r7)
            java.lang.String r4 = ":"
            r5 = 1
            if (r1 == 0) goto L_0x0049
            mnw$a r1 = r0.b
            java.lang.String r7 = r1.a(r7)
            java.lang.String[] r7 = r7.split(r4)
            r1 = r7[r2]
            java.lang.String r4 = "primary"
            boolean r1 = r4.equalsIgnoreCase(r1)
            if (r1 == 0) goto L_0x00be
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            mnw$b r0 = r0.c
            java.io.File r0 = r0.getExternalStorageDirectory()
            r1.append(r0)
            java.lang.String r0 = "/"
            r1.append(r0)
            r7 = r7[r5]
            r1.append(r7)
            java.lang.String r7 = r1.toString()
            goto L_0x00bf
        L_0x0049:
            boolean r1 = defpackage.mnw.a(r7)
            if (r1 == 0) goto L_0x0068
            mnw$a r1 = r0.b
            java.lang.String r7 = r1.a(r7)
            java.lang.String r1 = "content://downloads/public_downloads"
            android.net.Uri r1 = android.net.Uri.parse(r1)
            long r4 = java.lang.Long.parseLong(r7)
            android.net.Uri r7 = android.content.ContentUris.withAppendedId(r1, r4)
            java.lang.String r7 = r0.a(r7, r3, r3)
            goto L_0x00bf
        L_0x0068:
            boolean r1 = defpackage.mnw.d(r7)
            if (r1 == 0) goto L_0x00be
            mnw$a r1 = r0.b
            java.lang.String r7 = r1.a(r7)
            java.lang.String[] r7 = r7.split(r4)
            r1 = r7[r2]
            java.lang.String r4 = "image"
            boolean r1 = r4.equals(r1)
            if (r1 == 0) goto L_0x00be
            android.net.Uri r1 = android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI
            java.lang.String[] r4 = new java.lang.String[r5]
            r7 = r7[r5]
            r4[r2] = r7
            java.lang.String r7 = "_id=?"
            java.lang.String r7 = r0.a(r1, r7, r4)
            goto L_0x00bf
        L_0x0091:
            java.lang.String r1 = r7.getScheme()
            java.lang.String r4 = "content"
            boolean r1 = r4.equalsIgnoreCase(r1)
            if (r1 == 0) goto L_0x00ad
            boolean r1 = defpackage.mnw.c(r7)
            if (r1 == 0) goto L_0x00a8
            java.lang.String r7 = r7.getLastPathSegment()
            goto L_0x00bf
        L_0x00a8:
            java.lang.String r7 = r0.a(r7, r3, r3)
            goto L_0x00bf
        L_0x00ad:
            java.lang.String r0 = r7.getScheme()
            java.lang.String r1 = "file"
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 == 0) goto L_0x00be
            java.lang.String r7 = r7.getPath()
            goto L_0x00bf
        L_0x00be:
            r7 = r3
        L_0x00bf:
            if (r7 == 0) goto L_0x00cc
            com.spotify.music.features.editplaylist.upload.ImageUpload r0 = r6.m
            java.lang.String r8 = r8.token()
            java.lang.String r3 = r0.a(r7, r8)
            goto L_0x00d3
        L_0x00cc:
            java.lang.Object[] r7 = new java.lang.Object[r2]
            java.lang.String r8 = "Failed to open local image file"
            com.spotify.base.java.logging.Logger.e(r8, r7)
        L_0x00d3:
            if (r3 == 0) goto L_0x00f5
            mnm r7 = r6.d
            mnl r8 = r7.b
            mnp$a r0 = defpackage.mnp.c()
            mnv r8 = r8.a
            java.lang.String r8 = r8.t()
            mnp$a r8 = r0.a(r8)
            mnp$a r8 = r8.b(r3)
            mnp r8 = r8.a()
            java.util.ArrayList<mnk> r7 = r7.a
            r8.a(r7)
            return
        L_0x00f5:
            java.lang.Object[] r7 = new java.lang.Object[r2]
            java.lang.String r8 = "Failed to upload image"
            com.spotify.base.java.logging.Logger.e(r8, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mns.a(android.net.Uri, com.spotify.music.features.editplaylist.upload.Keymaster):void");
    }

    public final void a(uzb uzb, int i2) {
        this.b.a(null, "item-removed-toast", 0, InteractionType.HIT, UserIntent.UNDO);
        mnm mnm = this.d;
        if (mnm.b.a((String) fay.a(uzb.d())).b(mnm.a)) {
            this.a.a(uzb, i2);
        }
    }

    public final void a() {
        this.b.a(null, "discard-changes-dialog", 0, InteractionType.HIT, UserIntent.CANCEL);
    }

    public final void b() {
        this.b.a(null, "discard-changes-dialog", 0, InteractionType.HIT, UserIntent.DISCARD);
        this.a.k();
    }

    public final void c() {
        if (this.a.q()) {
            this.a.n();
        } else {
            this.a.m();
        }
    }

    public final void d() {
        if (this.a.r()) {
            this.a.s();
        } else {
            this.a.l();
        }
    }

    public final void a(boolean z) {
        this.a.g(z);
    }
}
