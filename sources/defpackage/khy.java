package defpackage;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.Toast;
import androidx.fragment.app.Fragment;
import com.spotify.mobile.android.spotlets.share.v2.ShareCapability;
import com.spotify.mobile.android.wrapped2019.stories.sharing.ShareOptionMenuItem;
import com.spotify.music.R;
import io.reactivex.Scheduler;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Consumer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* renamed from: khy reason: default package */
public class khy extends wib {
    private static final Set<Integer> V = new LinkedHashSet(Arrays.asList(new Integer[]{Integer.valueOf(R.id.share_app_instagram_stories), Integer.valueOf(R.id.share_app_facebook_stories_explicitly), Integer.valueOf(R.id.share_app_snapchat_stories), Integer.valueOf(R.id.share_app_twitter), Integer.valueOf(R.id.share_app_more)}));
    public kht T;
    public Scheduler U;
    private final CompositeDisposable X = new CompositeDisposable();
    public jca a;
    public khw b;

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Throwable th) {
        Toast.makeText(o(), o().getText(R.string.share_failed), 0).show();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(jdz jdz, View view) {
        CompositeDisposable compositeDisposable = this.X;
        kht kht = this.T;
        compositeDisposable.a(kht.c.a(jdz, jdz.f().contains(ShareCapability.STORY) ? kht.b : kht.a).a((Consumer<? super Throwable>) new $$Lambda$khy$74ti9FHgPc9ZEJHz3J4_unGug7c<Object>(this)).a(this.U).d());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(khu khu) {
        kht kht = this.T;
        kht.a = khu.b();
        kht.b = khu.c();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(View view) {
        if (this.t != null) {
            this.t.a().b((Fragment) this).b();
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(Throwable th) {
        Toast.makeText(o(), th.toString(), 0).show();
    }

    public static khy c() {
        return new khy();
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.sharing_preview_fragment, viewGroup, false);
    }

    public final void a(View view, Bundle bundle) {
        LinearLayout linearLayout = (LinearLayout) ip.d(view, (int) R.id.share_options_holder);
        List<jdz> a2 = this.a.a();
        ArrayList<jdz> arrayList = new ArrayList<>(V.size());
        for (jdz jdz : a2) {
            if (V.contains(Integer.valueOf(jdz.a()))) {
                arrayList.add(jdz);
            }
        }
        for (jdz jdz2 : arrayList) {
            Integer valueOf = Integer.valueOf(jdz2.b());
            Drawable c = jdz2.c();
            ShareOptionMenuItem shareOptionMenuItem = new ShareOptionMenuItem(o());
            shareOptionMenuItem.c.setImageDrawable(c);
            shareOptionMenuItem.b.setText(valueOf.intValue());
            linearLayout.addView(shareOptionMenuItem);
            shareOptionMenuItem.setOnClickListener(new $$Lambda$khy$P74PtZ5KFGpoYmMSjMtc_wLUIxE(this, jdz2));
        }
        ip.d(view, (int) R.id.close_button).setOnClickListener(new $$Lambda$khy$Iez8ZHwy2VRs1uK8kXB_PB5x_Cc(this));
        this.X.a(this.b.a().a((Consumer<? super T>) new $$Lambda$khy$2lDhtT18aI_lg4hQYVqGq12zkVU<Object>(this), (Consumer<? super Throwable>) new $$Lambda$khy$4TXUfchmnJOIuHKqo9zMacoNgg<Object>(this)));
    }

    public final void aw_() {
        super.aw_();
        this.X.bd_();
    }
}
