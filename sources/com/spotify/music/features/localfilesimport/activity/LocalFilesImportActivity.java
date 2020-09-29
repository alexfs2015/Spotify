package com.spotify.music.features.localfilesimport.activity;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnDismissListener;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import androidx.appcompat.app.ActionBar;
import androidx.viewpager.widget.ViewPager;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.spotify.android.glue.internal.StateListAnimatorTextView;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.base.java.logging.Logger;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.mobile.android.ui.activity.PermissionsRequestActivity;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.music.R;
import com.spotify.music.contentviewstate.view.LoadingView;
import com.spotify.music.features.localfilesimport.adapter.ItemsFragmentAdapter.Page;
import com.spotify.music.features.localfilesimport.model.LocalItem;
import com.spotify.music.features.localfilesimport.model.LocalSourcesResponse;
import com.spotify.music.features.localfilesimport.model.LocalTracks;
import com.spotify.music.libs.viewuri.ViewUris;
import io.reactivex.BackpressureStrategy;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposables;
import io.reactivex.disposables.SerialDisposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import java.io.File;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LocalFilesImportActivity extends kyd implements fsf, fyw, udv {
    /* access modifiers changed from: private */
    public static final String q = ViewUris.bj.toString();
    private static final sih r = ViewUris.bE;
    private View A;
    private ViewPager B;
    private boolean C;
    private final Consumer<a> D = new Consumer() {
        public final void accept(Object obj) {
            LocalFilesImportActivity.this.a((a) obj);
        }
    };
    private final fxn E = new fxn() {
        public final void a(float f) {
        }

        public final void a(boolean z) {
        }

        public final void b(float f) {
        }

        public final void a(String str) {
            LocalFilesImportActivity.this.p.a((CharSequence) str);
        }
    };
    public spi g;
    public jsz h;
    public Scheduler i;
    public Scheduler j;
    public jvr k;
    public kxi l;
    public nqu m;
    public nrc n;
    public final defpackage.nqv.a o = new defpackage.nqv.a() {
        private final Set<C0064a> a = new HashSet();

        public final boolean a() {
            return LocalFilesImportActivity.this.w.isEmpty();
        }

        public final boolean a(LocalItem localItem) {
            return LocalFilesImportActivity.this.w.containsAll(localItem.trackIds());
        }

        public final boolean b(LocalItem localItem) {
            for (String contains : localItem.trackIds()) {
                if (LocalFilesImportActivity.this.w.contains(contains)) {
                    return true;
                }
            }
            return false;
        }

        public final void a(LocalItem localItem, boolean z, C0064a aVar) {
            a(ImmutableList.a(localItem), z, aVar);
        }

        public final void a(ImmutableList<LocalItem> immutableList, boolean z, C0064a aVar) {
            if (z) {
                fdh R_ = immutableList.R_();
                while (R_.hasNext()) {
                    LocalFilesImportActivity.this.w.addAll(((LocalItem) R_.next()).trackIds());
                }
            } else {
                fdh R_2 = immutableList.R_();
                while (R_2.hasNext()) {
                    LocalFilesImportActivity.this.w.removeAll(((LocalItem) R_2.next()).trackIds());
                }
            }
            for (C0064a aVar2 : this.a) {
                if (!aVar2.equals(aVar)) {
                    aVar2.a();
                }
            }
            LocalFilesImportActivity.this.m();
        }

        public final void a(C0064a aVar) {
            this.a.add(aVar);
        }

        public final void b(C0064a aVar) {
            this.a.remove(aVar);
        }
    };
    /* access modifiers changed from: private */
    public ActionBar p;
    private Messaging s;
    private fpt t;
    private final SerialDisposable u = new SerialDisposable();
    private Observable<a> v;
    /* access modifiers changed from: private */
    public final Set<String> w = new HashSet();
    private boolean x;
    private View y;
    private LoadingView z;

    /* renamed from: com.spotify.music.features.localfilesimport.activity.LocalFilesImportActivity$2 reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] a = new int[Status.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0035 */
        static {
            /*
                com.spotify.music.features.localfilesimport.activity.LocalFilesImportActivity$Status[] r0 = com.spotify.music.features.localfilesimport.activity.LocalFilesImportActivity.Status.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                a = r0
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.spotify.music.features.localfilesimport.activity.LocalFilesImportActivity$Status r1 = com.spotify.music.features.localfilesimport.activity.LocalFilesImportActivity.Status.SCANNING     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x001f }
                com.spotify.music.features.localfilesimport.activity.LocalFilesImportActivity$Status r1 = com.spotify.music.features.localfilesimport.activity.LocalFilesImportActivity.Status.HAVE_CONTENT     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x002a }
                com.spotify.music.features.localfilesimport.activity.LocalFilesImportActivity$Status r1 = com.spotify.music.features.localfilesimport.activity.LocalFilesImportActivity.Status.NO_CONTENT_NO_FILES     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0035 }
                com.spotify.music.features.localfilesimport.activity.LocalFilesImportActivity$Status r1 = com.spotify.music.features.localfilesimport.activity.LocalFilesImportActivity.Status.NO_CONTENT_EVERYTHING_IMPORTED     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0040 }
                com.spotify.music.features.localfilesimport.activity.LocalFilesImportActivity$Status r1 = com.spotify.music.features.localfilesimport.activity.LocalFilesImportActivity.Status.NEED_PERMISSIONS     // Catch:{ NoSuchFieldError -> 0x0040 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0040 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0040 }
            L_0x0040:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.spotify.music.features.localfilesimport.activity.LocalFilesImportActivity.AnonymousClass2.<clinit>():void");
        }
    }

    public enum Messaging {
        NONE,
        TOAST,
        DIALOG
    }

    enum Status {
        SCANNING,
        HAVE_CONTENT,
        NO_CONTENT_NO_FILES,
        NO_CONTENT_EVERYTHING_IMPORTED,
        NEED_PERMISSIONS
    }

    static class a {
        final Status a;
        private final ImmutableList<LocalItem> b;

        public a(Status status, LocalItem[] localItemArr) {
            this.a = status;
            this.b = localItemArr != null ? ImmutableList.a((E[]) localItemArr) : null;
        }
    }

    public final void ap_() {
    }

    public final fxn b() {
        return this.E;
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x01c9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r10) {
        /*
            r9 = this;
            super.onCreate(r10)
            fpt r0 = defpackage.fpu.a(r9)
            r9.t = r0
            fpt r0 = r9.t
            boolean r0 = defpackage.nrm.a(r0)
            if (r0 != 0) goto L_0x0015
            r9.finish()
            return
        L_0x0015:
            r0 = 2131623987(0x7f0e0033, float:1.887514E38)
            r9.setContentView(r0)
            r0 = 2131430315(0x7f0b0bab, float:1.8482327E38)
            android.view.View r0 = r9.findViewById(r0)
            r1 = 2131427794(0x7f0b01d2, float:1.8477214E38)
            android.view.View r1 = r9.findViewById(r1)
            r9.y = r1
            r1 = 2131429736(0x7f0b0968, float:1.8481153E38)
            android.view.View r1 = r9.findViewById(r1)
            com.spotify.music.contentviewstate.view.LoadingView r1 = (com.spotify.music.contentviewstate.view.LoadingView) r1
            r9.z = r1
            com.spotify.music.contentviewstate.view.LoadingView r1 = r9.z
            android.view.View r2 = r9.y
            r1.c = r2
            kyv r3 = new kyv
            r3.<init>(r9, r2)
            r1.a = r3
            android.view.View r1 = r9.y
            r2 = 4
            r1.setVisibility(r2)
            com.spotify.music.features.localfilesimport.activity.LocalFilesImportActivity$Status r1 = com.spotify.music.features.localfilesimport.activity.LocalFilesImportActivity.Status.SCANNING
            r9.a(r1)
            android.view.View r1 = r9.y
            r2 = 2131430082(0x7f0b0ac2, float:1.8481855E38)
            android.view.View r1 = r1.findViewById(r2)
            androidx.viewpager.widget.ViewPager r1 = (androidx.viewpager.widget.ViewPager) r1
            r9.B = r1
            android.view.View r1 = r9.y
            r2 = 2131430668(0x7f0b0d0c, float:1.8483043E38)
            android.view.View r1 = r1.findViewById(r2)
            android.common.view.SlidingTabLayout r1 = (android.common.view.SlidingTabLayout) r1
            androidx.viewpager.widget.ViewPager r2 = r9.B
            kf r3 = r9.i()
            fpt r4 = r9.t
            com.spotify.music.features.localfilesimport.adapter.ItemsFragmentAdapter r5 = new com.spotify.music.features.localfilesimport.adapter.ItemsFragmentAdapter
            r6 = 1
            java.lang.Object r3 = defpackage.nqu.a(r3, r6)
            kf r3 = (defpackage.kf) r3
            r7 = 2
            java.lang.Object r7 = defpackage.nqu.a(r9, r7)
            android.content.Context r7 = (android.content.Context) r7
            r8 = 3
            java.lang.Object r4 = defpackage.nqu.a(r4, r8)
            fpt r4 = (defpackage.fpt) r4
            r5.<init>(r3, r7, r4)
            r2.a(r5)
            androidx.viewpager.widget.ViewPager r2 = r9.B
            int r3 = com.spotify.music.features.localfilesimport.adapter.ItemsFragmentAdapter.a
            if (r3 > 0) goto L_0x00a1
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "Requested offscreen page limit "
            r4.<init>(r5)
            r4.append(r3)
            java.lang.String r3 = " too small; defaulting to 1"
            r4.append(r3)
            r3 = 1
        L_0x00a1:
            int r4 = r2.d
            if (r3 == r4) goto L_0x00aa
            r2.d = r3
            r2.b()
        L_0x00aa:
            androidx.viewpager.widget.ViewPager r2 = r9.B
            r1.a(r2)
            java.lang.String r1 = "messaging"
            java.lang.String r2 = "page"
            r3 = 0
            if (r10 != 0) goto L_0x00d2
            android.content.Intent r10 = r9.getIntent()
            java.io.Serializable r2 = r10.getSerializableExtra(r2)
            com.spotify.music.features.localfilesimport.adapter.ItemsFragmentAdapter$Page r2 = (com.spotify.music.features.localfilesimport.adapter.ItemsFragmentAdapter.Page) r2
            androidx.viewpager.widget.ViewPager r4 = r9.B
            int r2 = r2.ordinal()
            r4.b(r2)
            java.io.Serializable r10 = r10.getSerializableExtra(r1)
            com.spotify.music.features.localfilesimport.activity.LocalFilesImportActivity$Messaging r10 = (com.spotify.music.features.localfilesimport.activity.LocalFilesImportActivity.Messaging) r10
            r9.s = r10
            goto L_0x0111
        L_0x00d2:
            androidx.viewpager.widget.ViewPager r4 = r9.B
            com.spotify.music.features.localfilesimport.adapter.ItemsFragmentAdapter$Page r5 = com.spotify.music.features.localfilesimport.adapter.ItemsFragmentAdapter.Page.FOLDERS
            int r5 = r5.ordinal()
            int r2 = r10.getInt(r2, r5)
            r4.b(r2)
            java.io.Serializable r1 = r10.getSerializable(r1)
            com.spotify.music.features.localfilesimport.activity.LocalFilesImportActivity$Messaging r1 = (com.spotify.music.features.localfilesimport.activity.LocalFilesImportActivity.Messaging) r1
            r9.s = r1
            java.lang.String r1 = "num_staged"
            int r1 = r10.getInt(r1)
            java.util.Set<java.lang.String> r2 = r9.w
            r2.clear()
            r2 = 0
        L_0x00f5:
            if (r2 >= r1) goto L_0x0111
            java.util.Set<java.lang.String> r4 = r9.w
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r7 = "staged_item"
            r5.<init>(r7)
            r5.append(r2)
            java.lang.String r5 = r5.toString()
            java.lang.String r5 = r10.getString(r5)
            r4.add(r5)
            int r2 = r2 + 1
            goto L_0x00f5
        L_0x0111:
            s r10 = r9.g()
            androidx.appcompat.app.ActionBar r10 = r10.a()
            java.lang.Object r10 = defpackage.fay.a(r10)
            androidx.appcompat.app.ActionBar r10 = (androidx.appcompat.app.ActionBar) r10
            r9.p = r10
            androidx.appcompat.app.ActionBar r10 = r9.p
            r10.b(r6)
            androidx.appcompat.app.ActionBar r10 = r9.p
            r10.a(r6)
            androidx.appcompat.app.ActionBar r10 = r9.p
            com.spotify.paste.spotifyicon.SpotifyIconDrawable r1 = new com.spotify.paste.spotifyicon.SpotifyIconDrawable
            com.spotify.android.paste.graphics.SpotifyIcon r2 = com.spotify.android.paste.graphics.SpotifyIcon.X_24
            r1.<init>(r9, r2)
            r10.a(r1)
            androidx.appcompat.app.ActionBar r10 = r9.p
            r1 = 0
            r10.a(r1)
            r10 = 2131952889(0x7f1304f9, float:1.9542233E38)
            java.lang.String r10 = r9.getString(r10)
            r1 = 2130969204(0x7f040274, float:1.7547083E38)
            android.graphics.Typeface r1 = defpackage.utw.b(r9, r1)
            java.lang.CharSequence r10 = defpackage.utx.a(r10, r1)
            r9.setTitle(r10)
            android.widget.FrameLayout$LayoutParams r10 = new android.widget.FrameLayout$LayoutParams
            r1 = -1
            r10.<init>(r1, r1)
            int r1 = defpackage.gab.a(r9)
            r10.setMargins(r3, r1, r3, r3)
            r0.setLayoutParams(r10)
            java.lang.String r10 = android.os.Environment.getExternalStorageState()
            java.lang.String r0 = "mounted"
            boolean r0 = r0.equals(r10)
            if (r0 != 0) goto L_0x0176
            java.lang.String r0 = "mounted_ro"
            boolean r10 = r0.equals(r10)
            if (r10 == 0) goto L_0x018d
        L_0x0176:
            java.lang.String r10 = android.os.Environment.DIRECTORY_MUSIC
            java.io.File r10 = android.os.Environment.getExternalStoragePublicDirectory(r10)
            if (r10 == 0) goto L_0x018d
            java.lang.String r0 = r10.getAbsolutePath()
            boolean r0 = defpackage.fax.a(r0)
            if (r0 != 0) goto L_0x018d
            java.lang.String r10 = r10.getAbsolutePath()
            goto L_0x018f
        L_0x018d:
            java.lang.String r10 = ""
        L_0x018f:
            android.net.Uri r0 = android.provider.MediaStore.Audio.Media.INTERNAL_CONTENT_URI
            io.reactivex.Observable r0 = r9.a(r0)
            android.net.Uri r1 = android.provider.MediaStore.Audio.Media.EXTERNAL_CONTENT_URI
            io.reactivex.Observable r1 = r9.a(r1)
            com.google.common.collect.ImmutableSet r10 = com.google.common.collect.ImmutableSet.d(r10)
            io.reactivex.Observable r10 = io.reactivex.Observable.b(r10)
            com.spotify.music.features.localfilesimport.activity.-$$Lambda$LocalFilesImportActivity$-POwwk3Qf6btclZGTOVB1lIKxbI r2 = com.spotify.music.features.localfilesimport.activity.$$Lambda$LocalFilesImportActivity$POwwk3Qf6btclZGTOVB1lIKxbI.INSTANCE
            io.reactivex.Observable r10 = io.reactivex.Observable.a(r0, r1, r10, r2)
            com.spotify.music.features.localfilesimport.activity.-$$Lambda$LocalFilesImportActivity$uEqk2ZAbYHr4iz9N7jzYH2ZEL-o r0 = new com.spotify.music.features.localfilesimport.activity.-$$Lambda$LocalFilesImportActivity$uEqk2ZAbYHr4iz9N7jzYH2ZEL-o
            r0.<init>()
            io.reactivex.Observable r10 = r10.h(r0)
            com.spotify.music.features.localfilesimport.activity.-$$Lambda$LocalFilesImportActivity$iMJG6sYlGGcL2jZglsNXdyDBVas r0 = new com.spotify.music.features.localfilesimport.activity.-$$Lambda$LocalFilesImportActivity$iMJG6sYlGGcL2jZglsNXdyDBVas
            r0.<init>()
            io.reactivex.Observable r10 = r10.h(r0)
            io.reactivex.Scheduler r0 = r9.i
            io.reactivex.Observable r10 = r10.a(r0)
            r9.v = r10
            int r10 = android.os.Build.VERSION.SDK_INT
            r0 = 23
            if (r10 < r0) goto L_0x01dd
            jvr r10 = r9.k
            java.lang.String r0 = "android.permission.READ_EXTERNAL_STORAGE"
            boolean r10 = r10.a(r9, r0)
            if (r10 != 0) goto L_0x01dd
            jvr r10 = r9.k
            java.lang.String[] r1 = new java.lang.String[r6]
            r1[r3] = r0
            r10.a(r9, r1)
            r3 = 1
        L_0x01dd:
            r9.x = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.music.features.localfilesimport.activity.LocalFilesImportActivity.onCreate(android.os.Bundle):void");
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Set a(Set set, Set set2, ImmutableSet immutableSet) {
        HashSet hashSet = new HashSet(3);
        hashSet.addAll(set);
        hashSet.addAll(set2);
        hashSet.addAll(immutableSet);
        Logger.b("Local files: pathsObservable(): %d", Integer.valueOf(hashSet.size()));
        return hashSet;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Incorrect type for immutable var: ssa=java.util.Set, code=java.util.Set<java.lang.String>, for r5v0, types: [java.util.Set, java.util.Set<java.lang.String>] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ io.reactivex.ObservableSource a(java.util.Set<java.lang.String> r5) {
        /*
            r4 = this;
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            int r1 = r5.size()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 0
            r0[r2] = r1
            java.lang.String r1 = "Local files: switching pathsObservable into LocalSourcesResponse: %d"
            com.spotify.base.java.logging.Logger.b(r1, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r5.size()
            r0.<init>(r1)
            java.util.Iterator r5 = r5.iterator()
        L_0x0020:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L_0x0036
            java.lang.Object r1 = r5.next()
            java.lang.String r1 = (java.lang.String) r1
            com.spotify.music.features.localfilesimport.model.LocalSourceJacksonModel r2 = new com.spotify.music.features.localfilesimport.model.LocalSourceJacksonModel
            r3 = 0
            r2.<init>(r1, r3, r3)
            r0.add(r2)
            goto L_0x0020
        L_0x0036:
            nrc r5 = r4.n
            nre r1 = new nre
            r1.<init>(r0)
            io.reactivex.Single r5 = r5.a(r1)
            io.reactivex.Observable r5 = r5.d()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.music.features.localfilesimport.activity.LocalFilesImportActivity.a(java.util.Set):io.reactivex.ObservableSource");
    }

    /* access modifiers changed from: private */
    public /* synthetic */ ObservableSource a(LocalSourcesResponse localSourcesResponse) {
        Logger.b("Local files: switching localSourcesResponse into LocalTracks, success: %s", Boolean.valueOf(localSourcesResponse.isSuccess()));
        return this.n.c(nrd.h().a((List<String>) ImmutableList.a("link.isDuplicate eq false", "inCollection eq false")).a(true).a().i()).c((Function<? super T, ? extends R>) $$Lambda$LocalFilesImportActivity$TCqxoM7GgpFA01XimWShZZGXVXQ.INSTANCE);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ a a(LocalTracks localTracks) {
        boolean z2 = false;
        Logger.b("Local files: switching LocalTracks into StatusAndTracks(): localTracks size() %d, unfiltered: %d", Integer.valueOf(localTracks.getItems().length), Integer.valueOf(localTracks.getUnfilteredLength()));
        if (!(localTracks.getItems().length == 0)) {
            return new a(Status.HAVE_CONTENT, localTracks.getItems());
        }
        if (localTracks.getUnfilteredLength() > 0) {
            z2 = true;
        }
        return new a(z2 ? Status.NO_CONTENT_EVERYTHING_IMPORTED : Status.NO_CONTENT_NO_FILES, localTracks.getItems());
    }

    public void onSaveInstanceState(Bundle bundle) {
        bundle.putSerializable("messaging", this.s);
        ViewPager viewPager = this.B;
        if (viewPager != null) {
            bundle.putInt("page", viewPager.c);
        }
        bundle.putInt("num_staged", this.w.size());
        int i2 = 0;
        for (String str : this.w) {
            StringBuilder sb = new StringBuilder("staged_item");
            int i3 = i2 + 1;
            sb.append(i2);
            bundle.putString(sb.toString(), str);
            i2 = i3;
        }
        super.onSaveInstanceState(bundle);
    }

    public final void a(fyt fyt) {
        String string = getString(R.string.local_files_import_import_button);
        AnonymousClass4 r1 = new OnClickListener() {
            public final void onClick(View view) {
                LocalFilesImportActivity.d(LocalFilesImportActivity.this);
            }
        };
        fyu a2 = fyt.a(R.id.actionbar_item_done, string);
        StateListAnimatorTextView stateListAnimatorTextView = new StateListAnimatorTextView(fyt.a());
        stateListAnimatorTextView.setGravity(17);
        stateListAnimatorTextView.setId(R.id.actionbar_text_post_to);
        stateListAnimatorTextView.setMinHeight(fyt.a().getResources().getDimensionPixelSize(R.dimen.actionbar_item_minimum_height));
        stateListAnimatorTextView.setOnClickListener(r1);
        uuu.b(fyt.a(), stateListAnimatorTextView, R.attr.pasteCustomToolbarButtonStyle);
        stateListAnimatorTextView.setText(string);
        uui.c(stateListAnimatorTextView).a(stateListAnimatorTextView).a();
        LayoutParams layoutParams = new LayoutParams(-2, -2);
        int dimensionPixelSize = fyt.a().getResources().getDimensionPixelSize(R.dimen.actionbar_item_left_right_padding);
        layoutParams.setMargins(dimensionPixelSize, 0, dimensionPixelSize, 0);
        stateListAnimatorTextView.setLayoutParams(layoutParams);
        FrameLayout frameLayout = new FrameLayout(fyt.a());
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        frameLayout.addView(stateListAnimatorTextView);
        a2.a((View) frameLayout);
        this.A = stateListAnimatorTextView;
        this.A.setEnabled(!this.w.isEmpty());
    }

    public final sih ae_() {
        return r;
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == 16908332) {
            if (this.o.a()) {
                finish();
            } else {
                l();
            }
        }
        return super.onOptionsItemSelected(menuItem);
    }

    private void l() {
        new defpackage.fzw.a(this, 2132017711).a((int) R.string.local_files_confirm_abort_dialog_button_ok, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
            public final void onClick(DialogInterface dialogInterface, int i) {
                LocalFilesImportActivity.this.finish();
            }
        }).b(R.string.local_files_confirm_abort_dialog_button_cancel, null).b(R.string.local_files_confirm_abort_dialog_body).a(this, PageIdentifiers.DIALOG_LOCALFILESIMPORT_DISCARD.mPageIdentifier, r.toString()).a().show();
    }

    private void c(int i2) {
        defpackage.fzw.a a2 = new defpackage.fzw.a(this, 2132017711).a((int) R.string.local_files_import_dialog_button_ok, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
            public final void onClick(DialogInterface dialogInterface, int i) {
                LocalFilesImportActivity.this.finish();
            }
        });
        a2.g = new OnDismissListener() {
            public final void onDismiss(DialogInterface dialogInterface) {
                LocalFilesImportActivity.this.finish();
            }
        };
        a2.b(i2).a(this, PageIdentifiers.DIALOG_LOCALFILESIMPORT_OK.mPageIdentifier, r.toString()).a().show();
    }

    /* access modifiers changed from: private */
    public void m() {
        View view = this.A;
        if (view != null) {
            view.setEnabled(!this.w.isEmpty());
        }
    }

    private Observable<Set<String>> a(Uri uri) {
        return new defpackage.vsy.a().a().a(getContentResolver(), this.j).a(uri, null, "is_music != 0", null, null, false).a(vun.a(hdz.a($$Lambda$LocalFilesImportActivity$C9_4BecvY40X97U3ieQkK1jnMLU.INSTANCE, new HashSet(0)), BackpressureStrategy.BUFFER)).a(this.i);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Set a(Cursor cursor) {
        HashSet hashSet = new HashSet(cursor.getCount());
        while (cursor.moveToNext()) {
            String string = cursor.getString(cursor.getColumnIndexOrThrow("_data"));
            if (string == null || string.length() == 0) {
                string = "";
            }
            String parent = new File(string).getParent();
            if (!fax.a(parent)) {
                hashSet.add(parent);
            }
        }
        return hashSet;
    }

    public void onActivityResult(int i2, int i3, Intent intent) {
        super.onActivityResult(i2, i3, intent);
        if (i2 == 4660) {
            this.x = !PermissionsRequestActivity.a(intent).a();
            a(this.x ? Status.NEED_PERMISSIONS : Status.SCANNING);
            if (!this.x) {
                this.u.a(this.v.a(this.D, (Consumer<? super Throwable>) $$Lambda$LocalFilesImportActivity$yTSwbSNWcp6Fj2xGGpGVq4JzbHU.INSTANCE));
            }
        }
    }

    public void onStart() {
        super.onStart();
        if (!this.x) {
            this.u.a(this.v.a(this.D, (Consumer<? super Throwable>) $$Lambda$LocalFilesImportActivity$Qe7C_2xTuNuwCn8Qen66FFTGniM.INSTANCE));
        }
    }

    public void onStop() {
        super.onStop();
        this.u.a(Disposables.b());
    }

    public void onBackPressed() {
        if (this.o.a()) {
            super.onBackPressed();
        } else {
            l();
        }
    }

    public final gjf aj() {
        return PageIdentifiers.LOCALFILESIMPORT;
    }

    private void a(Status status) {
        if (!this.C) {
            int i2 = AnonymousClass2.a[status.ordinal()];
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 == 3) {
                        this.C = true;
                        this.z.c();
                        this.y.setVisibility(8);
                        c((int) R.string.local_files_import_empty_body);
                    } else if (i2 == 4) {
                        this.C = true;
                        this.z.c();
                        this.y.setVisibility(8);
                        c((int) R.string.local_files_import_empty_body_everything_imported);
                    } else if (i2 != 5) {
                        StringBuilder sb = new StringBuilder("Unknown status ");
                        sb.append(status);
                        Assertion.a(sb.toString());
                    } else {
                        this.C = true;
                        this.z.c();
                        this.y.setVisibility(8);
                        c((int) R.string.local_files_import_need_permission_body);
                    }
                } else if (this.z.d()) {
                    this.z.b();
                }
            } else if (!this.z.d()) {
                if (this.z.e()) {
                    this.z.c();
                }
                this.z.a();
            }
        }
    }

    public static Intent a(Context context, fpt fpt) {
        return a(context, fpt, Page.FOLDERS, Messaging.TOAST);
    }

    public static Intent a(Context context, fpt fpt, Page page, Messaging messaging) {
        Intent intent = new Intent(context, LocalFilesImportActivity.class);
        fpu.a(intent, fpt);
        intent.putExtra("page", page);
        intent.putExtra("messaging", messaging);
        return intent;
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        fzb.a((Context) this, (fyw) this, menu);
        return true;
    }

    public final rdh af() {
        return rdh.a(PageIdentifiers.LOCALFILESIMPORT, null);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(a aVar) {
        Logger.b("Local files: status and tracks observable onNext() status %s", aVar.a);
        a(aVar.a);
        m();
    }

    static /* synthetic */ void d(LocalFilesImportActivity localFilesImportActivity) {
        localFilesImportActivity.C = true;
        int size = localFilesImportActivity.w.size();
        if (size > 0) {
            localFilesImportActivity.l.a((String[]) localFilesImportActivity.w.toArray(new String[0]), "local_files_import", false);
            if (localFilesImportActivity.s == Messaging.DIALOG) {
                String quantityString = localFilesImportActivity.getResources().getQuantityString(R.plurals.local_files_imported_dialog_body, size, new Object[]{Integer.valueOf(size)});
                defpackage.fzw.a b = new defpackage.fzw.a(localFilesImportActivity, 2132017711).a((int) R.string.local_files_imported_dialog_dismiss, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        LocalFilesImportActivity.this.finish();
                    }
                }).b(R.string.local_files_imported_dialog_view, new DialogInterface.OnClickListener() {
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        LocalFilesImportActivity.this.g.a(LocalFilesImportActivity.q);
                        LocalFilesImportActivity.this.finish();
                    }
                });
                b.g = new OnDismissListener() {
                    public final void onDismiss(DialogInterface dialogInterface) {
                        LocalFilesImportActivity.this.finish();
                    }
                };
                b.b = quantityString;
                b.a(localFilesImportActivity, PageIdentifiers.DIALOG_LOCALFILESIMPORT_SONGS.mPageIdentifier, r.toString()).a().show();
                return;
            }
            if (localFilesImportActivity.s == Messaging.TOAST) {
                localFilesImportActivity.h.a(SpotifyIconV2.CHECK, localFilesImportActivity.getResources().getQuantityString(R.plurals.toast_imported_to_collection, size, new Object[]{Integer.valueOf(size)}), 0, 0);
            }
            localFilesImportActivity.finish();
        }
    }
}
