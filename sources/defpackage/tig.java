package defpackage;

import android.os.Handler;
import android.util.SparseIntArray;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrackUtil;
import defpackage.ith;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: tig reason: default package */
public abstract class tig<VH extends ith<PlayerTrack>> extends ite<VH> {
    private List<tie> a = Collections.emptyList();

    private static int a(PlayerTrack playerTrack) {
        if (playerTrack == null) {
            return -1;
        }
        return !fbo.a(playerTrack.uid()) ? playerTrack.uid().hashCode() : playerTrack.uri().hashCode();
    }

    private static List<tie> a(PlayerTrack[] playerTrackArr, PlayerTrack playerTrack, PlayerTrack[] playerTrackArr2) {
        ArrayList<PlayerTrack> arrayList = new ArrayList<>();
        if (playerTrackArr != null) {
            arrayList.addAll(Arrays.asList(playerTrackArr));
        }
        if (playerTrack != null) {
            arrayList.add(playerTrack);
        }
        if (playerTrackArr2 != null) {
            arrayList.addAll(Arrays.asList(playerTrackArr2));
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        SparseIntArray sparseIntArray = new SparseIntArray();
        for (PlayerTrack playerTrack2 : arrayList) {
            int a2 = a(playerTrack2);
            int i = sparseIntArray.get(a2, 0) + 1;
            sparseIntArray.put(a2, i);
            arrayList2.add(new tie(playerTrack2, a2, i));
        }
        return arrayList2;
    }

    private void a(List<tie> list, List<Runnable> list2, Handler handler) {
        for (Runnable post : list2) {
            handler.post(post);
        }
        for (int i = 0; i < list.size(); i++) {
            for (tie tie : this.a) {
                PlayerTrack playerTrack = ((tie) list.get(i)).a;
                PlayerTrack playerTrack2 = tie.a;
                if (PlayerTrackUtil.areUidsEqual(playerTrack, playerTrack2) && !playerTrack.equals(playerTrack2)) {
                    d_(i);
                }
            }
        }
    }

    public final int a(PlayerTrack[] playerTrackArr, PlayerTrack playerTrack, PlayerTrack[] playerTrackArr2, Handler handler) {
        List<tie> a2 = a(playerTrackArr, playerTrack, playerTrackArr2);
        jwy.a("Carousel adapter tracks", playerTrackArr, playerTrack, playerTrackArr2);
        final ArrayList arrayList = new ArrayList();
        int a3 = jul.a(this.a, a2, new a() {
            /* access modifiers changed from: private */
            public /* synthetic */ void c(int i) {
                tig.this.e(i);
            }

            /* access modifiers changed from: private */
            public /* synthetic */ void c(int i, int i2) {
                tig.this.d(i, i2);
            }

            /* access modifiers changed from: private */
            public /* synthetic */ void d(int i) {
                tig.this.d(i);
            }

            /* access modifiers changed from: private */
            public /* synthetic */ void d(int i, int i2) {
                tig.this.c(i, i2);
            }

            public final void a(int i) {
                arrayList.add(new $$Lambda$tig$1$B0AoJXl1rjTjfTvq4vI_W0rSzVI(this, i));
            }

            public final void a(int i, int i2) {
                arrayList.add(new $$Lambda$tig$1$irUFPxRfsfjEcLXaKsVJiknCsD4(this, i, i2));
            }

            public final void b(int i) {
                arrayList.add(new $$Lambda$tig$1$qeW6_Enb9EpvStEzQku53uIBy7c(this, i));
            }

            public final void b(int i, int i2) {
                arrayList.add(new $$Lambda$tig$1$xh9_hkXan2pFGmqyBneuHLzNMo(this, i, i2));
            }
        }, new b<tie>() {
            public final /* synthetic */ boolean compare(Object obj, Object obj2) {
                return PlayerTrackUtil.areTracksEqual(((tie) obj).a, ((tie) obj2).a);
            }
        });
        boolean isEmpty = this.a.isEmpty();
        this.a = a2;
        if (a3 == 0) {
            return 0;
        }
        if (isEmpty || a3 >= 3) {
            e();
            return 2;
        }
        a(a2, (List<Runnable>) arrayList, handler);
        return 1;
    }

    public final boolean a() {
        return this.a.isEmpty();
    }

    public final int b() {
        return this.a.size();
    }

    public final long b(int i) {
        return (long) ((tie) this.a.get(i)).b;
    }

    /* access modifiers changed from: protected */
    public final PlayerTrack f(int i) {
        return ((tie) this.a.get(i)).a;
    }
}
