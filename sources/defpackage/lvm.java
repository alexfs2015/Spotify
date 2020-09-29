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

/* renamed from: lvm reason: default package */
public final class lvm implements lvf {
    /* access modifiers changed from: private */
    public static final Policy a;
    /* access modifiers changed from: private */
    public final Context b;
    /* access modifiers changed from: private */
    public final irb c;
    private final lvh<lve> d;
    private final a<lve> e = new a<lve>() {
        public final /* synthetic */ Observable a(Object obj) {
            return Observable.b(((lve) obj).c());
        }

        public final Observable<Map<String, lve>> a(Set<String> set, String str) {
            return lvm.this.c.a(lvm.a).c((Function<? super T, ? extends R>) new $$Lambda$lvm$1$OfAXt_dh7R38WdjvIyQswoWIRyg<Object,Object>(set));
        }

        public final Observable<Map<String, lve>> a(luu luu, Set<String> set) {
            return Observable.c();
        }

        public final /* bridge */ /* synthetic */ Observable a(luu luu, Set set, Object obj) {
            return Observable.a((Callable<? extends ObservableSource<? extends T>>) new $$Lambda$lvm$1$8HVEBzfw4nHHxw2XViMrXTyX4A<Object>((lve) obj, luu));
        }

        public final /* synthetic */ lux a(Object obj, boolean z) {
            lve lve = (lve) obj;
            final boolean b = lve.b();
            final ImmutableList a2 = ImmutableList.a((Collection<? extends E>) lve.a());
            return new lux() {
                public final String a() {
                    return lvm.this.b.getString(R.string.assisted_curation_card_title_songs_you_liked);
                }

                public final String b() {
                    return lvm.d();
                }

                public final String c() {
                    return "liked_songs";
                }

                public final List<luu> d() {
                    return a2;
                }

                public final boolean e() {
                    return b;
                }
            };
        }
    };

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

    public lvm(Context context, irb irb, lvi lvi) {
        this.b = context;
        this.c = irb;
        this.c.a(way.e().a("addTime").a());
        this.d = lvi.a(this.e);
    }

    static /* synthetic */ String d() {
        return "liked_songs";
    }

    public final String a() {
        return "liked_songs";
    }

    public final xii<List<lux>> a(Set<String> set, String str) {
        return wit.a((ObservableSource<T>) this.d.a(set, str), BackpressureStrategy.BUFFER);
    }

    public final void a(String str, Set<String> set) {
        this.d.a(str, set);
    }

    public final void a(String str, luu luu, Set<String> set) {
        this.d.a(str, luu, set);
    }

    public final void a(Set<String> set) {
        this.d.a(set);
    }

    public final void a(byte[] bArr) {
    }

    public final byte[] b() {
        return new byte[0];
    }
}
