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

/* renamed from: msl reason: default package */
public final class msl implements defpackage.msj.a {
    private static final Policy i;
    public final msr a;
    public final EditPlaylistLogger b;
    public final msj c;
    public final msf d;
    public boolean e;
    public String f;
    public String g;
    public boolean h;
    /* access modifiers changed from: private */
    public final a j;
    /* access modifiers changed from: private */
    public final CompositeDisposable k = new CompositeDisposable();
    private final msq l;
    private final ImageUpload m;
    private final msp n;
    /* access modifiers changed from: private */
    public boolean o;

    /* renamed from: msl$a */
    public static class a extends sgc<mrz> {
        a(com.spotify.mobile.android.util.ui.Lifecycle.a aVar, sgb sgb, sso sso, rmf rmf) {
            super(aVar, sgb, sso, rmf);
        }

        public final /* bridge */ /* synthetic */ boolean a(Object obj) {
            return true;
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

    public msl(msr msr, EditPlaylistLogger editPlaylistLogger, com.spotify.mobile.android.util.ui.Lifecycle.a aVar, mso mso, Scheduler scheduler, hgy hgy, msf msf, mrh mrh, a aVar2, msk msk, vje vje, msq msq, ImageUpload imageUpload, msp msp) {
        msk msk2 = msk;
        this.a = msr;
        this.b = editPlaylistLogger;
        this.d = msf;
        this.j = aVar2;
        msj msj = new msj((Context) msk.a(msk2.a.get(), 1), (sso) msk.a(msk2.b.get(), 2), (rma) msk.a(msk2.c.get(), 3), (ToastieManager) msk.a(msk2.d.get(), 4), (ftm) msk.a(msk2.e.get(), 5), (defpackage.msj.a) msk.a(this, 6));
        this.c = msj;
        this.l = msq;
        this.m = imageUpload;
        this.n = msp;
        final String t = mso.t();
        final defpackage.vje.a a2 = defpackage.vje.a.t().a(true).a(Optional.b(i)).a();
        final vje vje2 = vje;
        final Scheduler scheduler2 = scheduler;
        final hgy hgy2 = hgy;
        final mrh mrh2 = mrh;
        AnonymousClass1 r0 = new c() {
            /* access modifiers changed from: private */
            public /* synthetic */ mrz a(vld vld) {
                msf h = msl.this.d;
                mrz a2 = mrz.a(vld);
                Iterator it = h.a.iterator();
                while (it.hasNext()) {
                    a2 = ((msd) it.next()).a(a2);
                }
                return a2;
            }

            /* access modifiers changed from: private */
            public /* synthetic */ void a(mrh mrh, fqn fqn) {
                String str = "Enabled";
                boolean z = false;
                boolean z2 = str.equalsIgnoreCase((String) fqn.a(hds.a)) || str.equalsIgnoreCase((String) fqn.a(hds.b));
                msl.this.a.j(z2);
                msl.this.a.k(z2);
                msr a2 = msl.this.a;
                if (!mrh.a.a(fqn) && !uix.a(fqn)) {
                    z = true;
                }
                a2.d(z);
            }

            /* access modifiers changed from: private */
            public /* synthetic */ void a(mrz mrz) {
                msl.this.f = mrz.a();
                msl.this.g = mrz.c();
                msl.this.e = mrz.f();
                msl.this.a.a(msl.this.f);
                if (!msl.this.o) {
                    msl.this.a.a(Uri.parse(mrz.b()));
                }
                boolean z = true;
                boolean z2 = !fbo.a(msl.this.g);
                msl.this.a.b(msl.this.g);
                msl.this.a.h(msl.this.e && !z2);
                msl.this.a.c(!msl.this.e && z2);
                msr a2 = msl.this.a;
                if (!msl.this.e || !z2) {
                    z = false;
                }
                a2.i(z);
                msl.this.a.a(msl.this.e);
                msl.this.a.b(msl.this.e);
                msl.this.a.a(mrz.d());
                msl.this.a.g(mrz.d().isEmpty());
                msl.this.a.f(false);
                msl.this.a.e(mrz.e());
            }

            public final void a() {
                msl.this.k.c();
            }

            public final void c() {
                msl.this.a.f(true);
                msl.this.k.a(vje2.a(t, a2).d().c((Function<? super T, ? extends R>) new $$Lambda$msl$1$Y29nMMwPYn_XQgXy3tSK0pDkGbY<Object,Object>(this)).a(wit.a((c<T, R>) msl.this.j, BackpressureStrategy.BUFFER)).a(scheduler2).a((Consumer<? super T>) new $$Lambda$msl$1$20nAXteeQB6cgrVfoTPGXZuUAk<Object>(this), (Consumer<? super Throwable>) $$Lambda$msl$1$BUxZy1daLaj8DZ5ulJUvTIs8Xs4.INSTANCE));
                msl.this.k.a(hgy2.a().a(scheduler2).a((Consumer<? super T>) new $$Lambda$msl$1$jPFak5CIVIpQE7o23Y8pNPVITRM<Object>(this, mrh2), (Consumer<? super Throwable>) $$Lambda$msl$1$fWOu8wnJRJ8gnIQk1Dq89hIP22Y.INSTANCE));
            }
        };
        com.spotify.mobile.android.util.ui.Lifecycle.a aVar3 = aVar;
        aVar.a(r0);
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
            msp r0 = r6.n
            msp$a r1 = r0.b
            android.content.Context r2 = r0.a
            boolean r1 = r1.a(r2, r7)
            r2 = 0
            r3 = 0
            if (r1 == 0) goto L_0x0091
            boolean r1 = defpackage.msp.b(r7)
            java.lang.String r4 = ":"
            r5 = 1
            if (r1 == 0) goto L_0x0049
            msp$a r1 = r0.b
            java.lang.String r7 = r1.a(r7)
            java.lang.String[] r7 = r7.split(r4)
            r1 = r7[r2]
            java.lang.String r4 = "primary"
            boolean r1 = r4.equalsIgnoreCase(r1)
            if (r1 == 0) goto L_0x00be
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            msp$b r0 = r0.c
            java.io.File r0 = r0.getExternalStorageDirectory()
            r1.append(r0)
            java.lang.String r0 = "/"
            r1.append(r0)
            r7 = r7[r5]
            r1.append(r7)
            java.lang.String r7 = r1.toString()
            goto L_0x00bf
        L_0x0049:
            boolean r1 = defpackage.msp.a(r7)
            if (r1 == 0) goto L_0x0068
            msp$a r1 = r0.b
            java.lang.String r7 = r1.a(r7)
            java.lang.String r1 = "content://downloads/public_downloads"
            android.net.Uri r1 = android.net.Uri.parse(r1)
            long r4 = java.lang.Long.parseLong(r7)
            android.net.Uri r7 = android.content.ContentUris.withAppendedId(r1, r4)
            java.lang.String r7 = r0.a(r7, r3, r3)
            goto L_0x00bf
        L_0x0068:
            boolean r1 = defpackage.msp.d(r7)
            if (r1 == 0) goto L_0x00be
            msp$a r1 = r0.b
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
            boolean r1 = defpackage.msp.c(r7)
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
            msf r7 = r6.d
            mse r8 = r7.b
            msi$a r0 = defpackage.msi.c()
            mso r8 = r8.a
            java.lang.String r8 = r8.t()
            msi$a r8 = r0.a(r8)
            msi$a r8 = r8.b(r3)
            msi r8 = r8.a()
            java.util.ArrayList<msd> r7 = r7.a
            r8.a(r7)
            return
        L_0x00f5:
            java.lang.Object[] r7 = new java.lang.Object[r2]
            java.lang.String r8 = "Failed to upload image"
            com.spotify.base.java.logging.Logger.e(r8, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.msl.a(android.net.Uri, com.spotify.music.features.editplaylist.upload.Keymaster):void");
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(Throwable th) {
        Logger.e("Failed to save changes: %s", th);
        this.a.k();
    }

    public final void a() {
        this.b.a(null, "discard-changes-dialog", 0, InteractionType.HIT, UserIntent.CANCEL);
    }

    public final void a(Uri uri) {
        this.o = false;
        this.a.a(uri);
        this.o = true;
        this.k.a(this.l.a().a((Consumer<? super T>) new $$Lambda$msl$wnpLod_xXcruBz94TJ0VyG3zSC4<Object>(this, uri), (Consumer<? super Throwable>) $$Lambda$msl$jorfIwIMZTmoMireUSABTCJQIas.INSTANCE));
    }

    public final void a(vle vle, int i2) {
        this.b.a(null, "item-removed-toast", 0, InteractionType.HIT, UserIntent.UNDO);
        msf msf = this.d;
        if (msf.b.a((String) fbp.a(vle.d())).b(msf.a)) {
            this.a.a(vle, i2);
        }
    }

    public final void a(boolean z) {
        this.a.g(z);
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

    public final void e() {
        if (!this.h) {
            this.h = true;
            this.b.a(null, "toolbar", 0, InteractionType.HIT, UserIntent.SAVE);
            this.a.f(true);
            CompositeDisposable compositeDisposable = this.k;
            msf msf = this.d;
            ArrayList arrayList = new ArrayList(msf.a.size());
            Iterator it = msf.a.iterator();
            while (it.hasNext()) {
                arrayList.add(((msd) it.next()).a(msf.c));
            }
            Completable a2 = arrayList.isEmpty() ? Completable.a() : Completable.a((Iterable<? extends CompletableSource>) arrayList);
            msr msr = this.a;
            msr.getClass();
            compositeDisposable.a(a2.a((Action) new $$Lambda$bWLHilFmEUOvLDNrrfmKj2Q6ayc(msr), (Consumer<? super Throwable>) new $$Lambda$msl$OcNYdrMVijesnD3eabVeK3CmaFA<Object>(this)));
        }
    }
}
