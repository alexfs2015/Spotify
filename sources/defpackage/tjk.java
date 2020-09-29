package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.google.common.collect.ImmutableList;
import com.spotify.music.features.playlistentity.configuration.ItemListConfiguration;
import com.spotify.music.playlist.ui.ItemConfiguration;
import io.reactivex.Completable;
import io.reactivex.CompletableSource;
import java.util.List;

/* renamed from: tjk reason: default package */
public final class tjk implements tjj, tjq {
    private static int a = tjk.class.hashCode();
    private final oog<tjr> b;
    private final tjn c;
    private final onu d = a.a(this.b);
    private uwh e;

    public final void a(Bundle bundle) {
    }

    public final void b(Bundle bundle) {
    }

    public tjk(a aVar, oew oew, a aVar2, tjo tjo, ItemListConfiguration itemListConfiguration) {
        tjn tjn = new tjn((a) tjo.a(tjo.a.get(), 1), (heg) tjo.a(tjo.b.get(), 2), (a) tjo.a(tjo.c.get(), 3), (rbg) tjo.a(tjo.d.get(), 4), (String) tjo.a(tjo.e.get(), 5), (ItemListConfiguration) tjo.a(itemListConfiguration, 6));
        this.c = tjn;
        this.b = aVar.a(this.c, new $$Lambda$tjk$BEDrZMzmoyEUECV5Yf4JrWu8IQ(this));
        oew.a(a);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ jmf e() {
        return this.c;
    }

    public final Completable a() {
        tjn tjn = this.c;
        return Completable.b((Iterable<? extends CompletableSource>) ImmutableList.a(tjn.d, tjn.c.a()));
    }

    public final void a(a aVar) {
        this.c.a(aVar);
    }

    public final void az_() {
        this.c.a((tjj) this);
    }

    public final void c() {
        this.c.a((tjj) null);
    }

    public final void d() {
        tjn tjn = this.c;
        tjn.a.c();
        tjn.b.a();
        tjn.c.b();
    }

    public final void a(LayoutInflater layoutInflater, ViewGroup viewGroup, uwh uwh) {
        this.e = uwh;
        uwh.a(this.b.a(), a);
    }

    public final void a(uyz uyz, List<uzb> list) {
        this.b.a(list);
        this.e.a(true, a);
    }

    public final void a(String str, boolean z) {
        this.d.a(str, z);
    }

    public final void a(ItemConfiguration itemConfiguration) {
        this.d.a(itemConfiguration);
    }
}
