package com.spotify.music.features.localfilesimport.fragment;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Environment;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.FrameLayout.LayoutParams;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.i;
import com.google.common.base.Optional;
import com.google.common.collect.ImmutableList;
import com.moat.analytics.mobile.MoatAdEvent;
import com.spotify.android.paste.graphics.SpotifyIcon;
import com.spotify.base.java.logging.Logger;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.SortOption;
import com.spotify.music.R;
import com.spotify.music.contentviewstate.view.LoadingView;
import com.spotify.music.features.localfilesimport.activity.LocalFilesImportActivity;
import com.spotify.music.features.localfilesimport.model.LocalItem;
import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.music.util.filterheader.FilterHeaderView;
import com.spotify.music.util.filterheader.FilterHeaderView.a;
import com.spotify.paste.spotifyicon.SpotifyIconDrawable;
import com.squareup.picasso.Picasso;
import io.reactivex.Observable;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposables;
import io.reactivex.disposables.SerialDisposable;
import io.reactivex.functions.Consumer;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class ItemsFragment extends jrd {
    public Scheduler T;
    private final List<SortOption> U = new ArrayList();
    private final SortOption V;
    private final SortOption W;
    private final SerialDisposable X;
    private vhx Y;
    /* access modifiers changed from: private */
    public nwy Z;
    public Picasso a;
    /* access modifiers changed from: private */
    public a aa;
    private TextView ab;
    private LoadingView ac;
    private fvd ad;
    private fvd ae;
    /* access modifiers changed from: private */
    public FilterHeaderView af;
    private RecyclerView ag;
    /* access modifiers changed from: private */
    public fxy ah;
    private sso ai;
    /* access modifiers changed from: private */
    public SortOption aj;
    /* access modifiers changed from: private */
    public String ak;
    private Parcelable al;
    private Type am;
    private int an;
    private int ao;
    private final a ap;
    public nxf b;

    /* renamed from: com.spotify.music.features.localfilesimport.fragment.ItemsFragment$4 reason: invalid class name */
    static /* synthetic */ class AnonymousClass4 {
        static final /* synthetic */ int[] a = new int[Type.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(10:0|1|2|3|4|5|6|7|8|10) */
        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        static {
            /*
                com.spotify.music.features.localfilesimport.fragment.ItemsFragment$Type[] r0 = com.spotify.music.features.localfilesimport.fragment.ItemsFragment.Type.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                a = r0
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.spotify.music.features.localfilesimport.fragment.ItemsFragment$Type r1 = com.spotify.music.features.localfilesimport.fragment.ItemsFragment.Type.ALBUMS     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x001f }
                com.spotify.music.features.localfilesimport.fragment.ItemsFragment$Type r1 = com.spotify.music.features.localfilesimport.fragment.ItemsFragment.Type.ARTISTS     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x002a }
                com.spotify.music.features.localfilesimport.fragment.ItemsFragment$Type r1 = com.spotify.music.features.localfilesimport.fragment.ItemsFragment.Type.TRACKS     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0035 }
                com.spotify.music.features.localfilesimport.fragment.ItemsFragment$Type r1 = com.spotify.music.features.localfilesimport.fragment.ItemsFragment.Type.SOURCES     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.spotify.music.features.localfilesimport.fragment.ItemsFragment.AnonymousClass4.<clinit>():void");
        }
    }

    public enum Type {
        ARTISTS,
        ALBUMS,
        SOURCES,
        TRACKS
    }

    public ItemsFragment() {
        String str = "name";
        this.V = new SortOption(str, (int) R.string.sort_order_name);
        this.W = new SortOption(str, (int) R.string.sort_order_title);
        this.X = new SerialDisposable();
        this.ai = ViewUris.bD;
        this.ap = new a() {
            public final void a() {
            }

            public final void a(SortOption sortOption) {
                ItemsFragment.this.aj = sortOption;
                ItemsFragment.this.e();
            }

            public final void a(String str) {
                ItemsFragment.this.ak = str;
                ItemsFragment.this.e();
                if (ItemsFragment.this.af.b()) {
                    ItemsFragment.this.ah.a().b(false);
                }
            }
        };
    }

    public static ItemsFragment a(fqn fqn, Type type) {
        ItemsFragment itemsFragment = new ItemsFragment();
        fqo.a((Fragment) itemsFragment, (fqn) fbp.a(fqn));
        itemsFragment.i.putSerializable(MoatAdEvent.EVENT_TYPE, (Serializable) fbp.a(type));
        return itemsFragment;
    }

    /* access modifiers changed from: private */
    public void a(Throwable th) {
        Logger.e(th, "Failed to get local items: %s", th.getMessage());
        this.ac.b();
    }

    /* access modifiers changed from: private */
    public void a(nxk<? extends LocalItem> nxk) {
        Logger.b("Local files: Got %d items. isAdded() %s", Integer.valueOf(((LocalItem[]) nxk.getItems()).length), Boolean.valueOf(u()));
        if (u()) {
            nwy nwy = this.Z;
            nwy.a = new ArrayList(Arrays.asList((LocalItem[]) nxk.getItems()));
            nwy.e();
            this.ac.b();
            boolean z = ((LocalItem[]) nxk.getItems()).length == 0;
            boolean z2 = nxk.getUnfilteredLength() > 0;
            boolean b2 = this.af.b();
            if (!z) {
                this.ad.getView().setVisibility(8);
                this.Y.a(1);
                this.ag.setVisibility(0);
                this.Y.h(0);
            } else if (b2) {
                this.ad.getView().setVisibility(8);
                this.ag.setVisibility(0);
                this.Y.b(1);
                this.ae.a((CharSequence) a((int) R.string.placeholder_no_result_title, this.ak));
            } else {
                int i = AnonymousClass4.a[this.am.ordinal()];
                if (i == 1) {
                    this.ad.a((CharSequence) a(z2 ? R.string.local_files_import_empty_albums_title_everything_imported : R.string.local_files_import_empty_albums_title));
                    this.ad.b((CharSequence) a((int) R.string.local_files_import_empty_albums_body));
                } else if (i == 2) {
                    this.ad.a((CharSequence) a(z2 ? R.string.local_files_import_empty_artists_title_everything_imported : R.string.local_files_import_empty_artists_title));
                    this.ad.b((CharSequence) a((int) R.string.local_files_import_empty_artists_body));
                } else if (i == 3) {
                    this.ad.a((CharSequence) a(z2 ? R.string.local_files_import_empty_songs_title_everything_imported : R.string.local_files_import_empty_songs_title));
                    this.ad.b((CharSequence) a((int) R.string.local_files_import_empty_songs_body));
                } else if (i != 4) {
                    StringBuilder sb = new StringBuilder("The type ");
                    sb.append(this.am);
                    sb.append(" is unsupported.");
                    Assertion.a(sb.toString());
                } else {
                    this.ad.a((CharSequence) a(z2 ? R.string.local_files_import_empty_folders_title_everything_imported : R.string.local_files_import_empty_folders_title));
                    this.ad.b((CharSequence) a((int) R.string.local_files_import_empty_folders_body));
                }
                this.ag.setVisibility(8);
                this.ad.getView().setVisibility(0);
                this.Y.a(1);
            }
            i d = this.ag.d();
            Parcelable parcelable = this.al;
            if (!(parcelable == null || d == null)) {
                d.a(parcelable);
                this.al = null;
            }
            ae();
            this.ab.setEnabled(true);
        }
    }

    /* access modifiers changed from: private */
    public void ae() {
        if (af()) {
            this.ab.setText(this.ao);
        } else {
            this.ab.setText(this.an);
        }
    }

    /* access modifiers changed from: private */
    public boolean af() {
        ImmutableList a2 = ImmutableList.a((Collection<? extends E>) this.Z.a);
        if (a2 == null || a2.isEmpty()) {
            return false;
        }
        fdz R_ = a2.R_();
        while (R_.hasNext()) {
            if (!this.aa.a((LocalItem) R_.next())) {
                return false;
            }
        }
        return true;
    }

    private Observable<? extends nxk<? extends LocalItem>> c() {
        Optional c = Optional.c(this.aj);
        nxg a2 = nxg.h().a(this.ak).a(c.b() ? Optional.b(juy.a((SortOption) c.c())) : Optional.e()).a(true).a();
        int i = AnonymousClass4.a[this.am.ordinal()];
        String str = "numTracks gt 0";
        String str2 = "inCollection eq false";
        String str3 = "link.isDuplicate eq false";
        if (i == 1) {
            return this.b.a(a2.g().a((List<String>) ImmutableList.a(str)).b(ImmutableList.a(str3, str2)).a().i());
        }
        if (i == 2) {
            return this.b.b(a2.g().a((List<String>) ImmutableList.a(str)).b(ImmutableList.a(str3, str2)).a().i());
        }
        if (i == 3) {
            return this.b.c(a2.g().a((List<String>) ImmutableList.a(str3, str2)).a().i());
        }
        if (i != 4) {
            StringBuilder sb = new StringBuilder("The type ");
            sb.append(this.am);
            sb.append(" is unsupported.");
            return Observable.a(new Throwable(sb.toString()));
        }
        return this.b.d(a2.g().a((List<String>) ImmutableList.a(str)).b(ImmutableList.a(str3, str2)).c(ImmutableList.a(Environment.getExternalStorageDirectory().getAbsolutePath())).a().i());
    }

    /* access modifiers changed from: private */
    public void e() {
        this.X.a(c().a(this.T).a((Consumer<? super T>) new Consumer() {
            public final void accept(Object obj) {
                ItemsFragment.this.a((nxk) obj);
            }
        }, (Consumer<? super Throwable>) new Consumer() {
            public final void accept(Object obj) {
                ItemsFragment.this.a((Throwable) obj);
            }
        }));
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ViewGroup viewGroup2 = (ViewGroup) layoutInflater.inflate(R.layout.fragment_local_files_import, viewGroup, false);
        ViewGroup viewGroup3 = (ViewGroup) viewGroup2.findViewById(R.id.content);
        ViewGroup viewGroup4 = (ViewGroup) viewGroup3.findViewById(R.id.list);
        if (bundle != null) {
            this.al = bundle.getParcelable("list");
        }
        this.ab = (TextView) viewGroup3.findViewById(R.id.select_all_btn);
        this.ab.setEnabled(false);
        this.ab.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                if (ItemsFragment.this.af()) {
                    ItemsFragment.this.aa.a(ImmutableList.a((Collection<? extends E>) ItemsFragment.this.Z.a), false, (C0065a) null);
                } else {
                    ItemsFragment.this.aa.a(ImmutableList.a((Collection<? extends E>) ItemsFragment.this.Z.a), true, (C0065a) null);
                }
            }
        });
        if (this.af == null) {
            this.af = FilterHeaderView.a(layoutInflater, this.ak, this.U, this.aj, this.ap);
        }
        kf kfVar = (kf) fbp.a(p());
        this.af.setBackgroundColor(fr.c(kfVar, R.color.bg_filter));
        this.af.a(this.ai, (gkq) PageIdentifiers.LOCALFILESIMPORT);
        this.af.a((int) R.string.header_filter_hint);
        fyk a2 = fyk.c(kfVar).b().a(null, 0).c((View) this.af).b(true).c(true).a(false).a((Fragment) this);
        this.ah = (fxy) a2.b();
        this.ah.a().b(true);
        fqv.f();
        fvd a3 = fvg.a(kfVar, null);
        a3.a(false);
        a3.b().setSingleLine(false);
        a3.b().setEllipsize(null);
        a3.c().setSingleLine(false);
        a3.c().setEllipsize(null);
        a3.a((CharSequence) kfVar.getString(R.string.placeholder_no_result_title, new Object[]{""}));
        a3.b((CharSequence) kfVar.getString(R.string.placeholder_no_result_body));
        SpotifyIconDrawable spotifyIconDrawable = new SpotifyIconDrawable((Context) kfVar, SpotifyIcon.FLAG_32, (float) kfVar.getResources().getDimensionPixelSize(R.dimen.empty_view_icon_size));
        spotifyIconDrawable.a(vgl.b(kfVar, R.attr.pasteColorPlaceholder));
        a3.a().a((Drawable) spotifyIconDrawable);
        this.ae = a3;
        this.Y = new vhx();
        Context context = (Context) fbp.a(n());
        this.Z = new nwy(context, this.aa, this.a);
        this.Y.a((RecyclerView.a<H>) this.Z, 0);
        this.Y.a((RecyclerView.a<H>) new jog<H>(this.ae.getView(), false), 1);
        this.Y.h(0);
        this.Y.a(false, 1);
        this.ag = a2.f();
        this.ag.setTag(this.ai.toString());
        this.ag.a((i) new LinearLayoutManager(context));
        this.ag.a((RecyclerView.a) this.Y);
        viewGroup4.addView(a2.b(), new LayoutParams(-1, -1));
        fqv.f();
        this.ad = fvg.a(kfVar, viewGroup3);
        this.ad.getView().setVisibility(8);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(13, -1);
        this.ad.getView().setLayoutParams(layoutParams);
        viewGroup3.addView(this.ad.getView());
        viewGroup3.setVisibility(4);
        this.ac = LoadingView.a(layoutInflater, kfVar, viewGroup3);
        viewGroup2.addView(this.ac);
        this.ac.a();
        return viewGroup2;
    }

    public final void aP_() {
        super.aP_();
        e();
    }

    public final void aw_() {
        super.aw_();
        FilterHeaderView filterHeaderView = this.af;
        if (filterHeaderView != null) {
            FilterHeaderView.a(filterHeaderView);
        }
        nwy nwy = this.Z;
        nwy.d.b(nwy.e);
    }

    public final void b(Bundle bundle) {
        super.b(bundle);
        c(false);
        if (this.aa == null) {
            this.aa = ((LocalFilesImportActivity) fbp.a(p())).o;
        }
        this.aa.a((C0065a) new C0065a() {
            public final void a() {
                ItemsFragment.this.ae();
            }
        });
        this.am = (Type) fbp.a(((Bundle) fbp.a(this.i)).getSerializable(MoatAdEvent.EVENT_TYPE));
        SortOption sortOption = this.V;
        int i = AnonymousClass4.a[this.am.ordinal()];
        if (i == 1) {
            this.ai = ViewUris.bG;
            sortOption = new SortOption("artist.name", (int) R.string.sort_order_artist);
            SortOption sortOption2 = this.W;
            sortOption.mSecondarySortOption = sortOption2;
            this.U.add(sortOption2);
            this.U.add(sortOption);
            this.an = R.string.local_files_import_select_all_albums_button;
            this.ao = R.string.local_files_import_deselect_all_albums_button;
        } else if (i == 2) {
            this.ai = ViewUris.bF;
            sortOption = this.V;
            this.U.add(sortOption);
            this.an = R.string.local_files_import_select_all_artists_button;
            this.ao = R.string.local_files_import_deselect_all_artists_button;
        } else if (i == 3) {
            this.ai = ViewUris.bH;
            sortOption = this.W;
            this.U.add(sortOption);
            this.an = R.string.local_files_import_select_all_songs_button;
            this.ao = R.string.local_files_import_deselect_all_songs_button;
        } else if (i != 4) {
            StringBuilder sb = new StringBuilder("The type ");
            sb.append(this.am);
            sb.append(" is unsupported.");
            Assertion.a(sb.toString());
        } else {
            this.ai = ViewUris.bE;
            sortOption = this.V;
            this.U.add(sortOption);
            this.an = R.string.local_files_import_select_all_folders_button;
            this.ao = R.string.local_files_import_deselect_all_folders_button;
        }
        if (this.ak == null) {
            this.ak = "";
        }
        if (this.aj == null) {
            this.aj = sortOption;
        }
    }

    public final void e(Bundle bundle) {
        RecyclerView recyclerView = this.ag;
        if (recyclerView != null) {
            i d = recyclerView.d();
            if (d != null) {
                bundle.putParcelable("list", d.d());
            }
        }
        super.e(bundle);
    }

    public final void h() {
        super.h();
        FilterHeaderView filterHeaderView = this.af;
        if (filterHeaderView != null) {
            filterHeaderView.a();
        }
        this.X.a(Disposables.b());
    }
}
