package defpackage;

import android.content.Context;
import com.google.common.collect.ImmutableList;
import com.spotify.mobile.android.playlist.model.policy.DecorationPolicy;
import com.spotify.mobile.android.playlist.model.policy.Policy;
import com.spotify.music.R;
import io.reactivex.BackpressureStrategy;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.functions.Function;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;

/* renamed from: lrn reason: default package */
public final class lrn implements lrg {
    /* access modifiers changed from: private */
    public static final Policy a;
    /* access modifiers changed from: private */
    public final Context b;
    /* access modifiers changed from: private */
    public final ioo c;
    private final lri<lrf> d;
    private final a<lrf> e = new a<lrf>() {
        public final /* synthetic */ Observable a(Object obj) {
            return Observable.b(((lrf) obj).c());
        }

        public final /* bridge */ /* synthetic */ Observable a(lqv lqv, Set set, Object obj) {
            return Observable.a((Callable<? extends ObservableSource<? extends T>>) new $$Lambda$lrn$1$60_b4VlBBqxUIVk6s5DSCZt4Ss<Object>((lrf) obj, lqv));
        }

        public final /* synthetic */ lqy a(Object obj, boolean z) {
            lrf lrf = (lrf) obj;
            final boolean b = lrf.b();
            final ImmutableList a2 = ImmutableList.a((Collection<? extends E>) lrf.a());
            return new lqy() {
                public final String c() {
                    return "liked_songs";
                }

                public final String a() {
                    return lrn.this.b.getString(R.string.assisted_curation_card_title_songs_you_liked);
                }

                public final String b() {
                    return lrn.d();
                }

                public final List<lqv> d() {
                    return a2;
                }

                public final boolean e() {
                    return b;
                }
            };
        }

        public final Observable<Map<String, lrf>> a(Set<String> set, String str) {
            return lrn.this.c.a(lrn.a).c((Function<? super T, ? extends R>) new $$Lambda$lrn$1$duLxIPEpYYK1AcQeZlh3vxk1lco<Object,Object>(set));
        }

        public final Observable<Map<String, lrf>> a(lqv lqv, Set<String> set) {
            return Observable.c();
        }
    };

    static /* synthetic */ String d() {
        return "liked_songs";
    }

    public final String a() {
        return "liked_songs";
    }

    public final void a(byte[] bArr) {
    }

    public final byte[] b() {
        return new byte[0];
    }

    static {
        DecorationPolicy decorationPolicy = new DecorationPolicy();
        HashMap hashMap = new HashMap();
        hashMap.put("name", Boolean.TRUE);
        hashMap.put("artist", Boolean.TRUE);
        hashMap.put("link", Boolean.TRUE);
        hashMap.put("covers", Boolean.TRUE);
        decorationPolicy.setListAttributes(hashMap);
        decorationPolicy.setAlbumAttributes(hashMap);
        decorationPolicy.setArtistsAttributes(hashMap);
        a = new Policy(decorationPolicy);
    }

    public lrn(Context context, ioo ioo, lrj lrj) {
        this.b = context;
        this.c = ioo;
        this.c.a(vns.e().a("addTime").a());
        this.d = lrj.a(this.e);
    }

    public final wud<List<lqy>> a(Set<String> set, String str) {
        return vun.a((ObservableSource<T>) this.d.a(set, str), BackpressureStrategy.BUFFER);
    }

    public final void a(String str, lqv lqv, Set<String> set) {
        this.d.a(str, lqv, set);
    }

    public final void a(String str, Set<String> set) {
        this.d.a(str, set);
    }

    public final void a(Set<String> set) {
        this.d.a(set);
    }
}
