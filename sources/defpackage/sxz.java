package defpackage;

import android.os.Handler;
import android.util.SparseIntArray;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrackUtil;
import defpackage.iqu;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: sxz reason: default package */
public abstract class sxz<VH extends iqu<PlayerTrack>> extends iqr<VH> {
    private List<sxx> a = Collections.emptyList();

    public final int a(PlayerTrack[] playerTrackArr, PlayerTrack playerTrack, PlayerTrack[] playerTrackArr2, Handler handler) {
        List<sxx> a2 = a(playerTrackArr, playerTrack, playerTrackArr2);
        juq.a("Carousel adapter tracks", playerTrackArr, playerTrack, playerTrackArr2);
        final ArrayList arrayList = new ArrayList();
        int a3 = jsb.a(this.a, a2, new a() {
            /* access modifiers changed from: private */
            public /* synthetic */ void d(int i) {
                sxz.this.d(i);
            }

            public final void a(int i) {
                arrayList.add(new $$Lambda$sxz$1$MPoio37FQdGN9aLx2X2xxu5VUfc(this, i));
            }

            /* access modifiers changed from: private */
            public /* synthetic */ void d(int i, int i2) {
                sxz.this.c(i, i2);
            }

            public final void a(int i, int i2) {
                arrayList.add(new $$Lambda$sxz$1$ZxyDimADAsMQaF3zB12jW0P4nI(this, i, i2));
            }

            /* access modifiers changed from: private */
            public /* synthetic */ void c(int i) {
                sxz.this.e(i);
            }

            public final void b(int i) {
                arrayList.add(new $$Lambda$sxz$1$v__gkj7uj6yk_ts_hJJvTyfBjZ4(this, i));
            }

            /* access modifiers changed from: private */
            public /* synthetic */ void c(int i, int i2) {
                sxz.this.d(i, i2);
            }

            public final void b(int i, int i2) {
                arrayList.add(new $$Lambda$sxz$1$V3dTUHjbef49Hl6kMHsEXozkPJw(this, i, i2));
            }
        }, new b<sxx>() {
            public final /* synthetic */ boolean compare(Object obj, Object obj2) {
                return PlayerTrackUtil.areTracksEqual(((sxx) obj).a, ((sxx) obj2).a);
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

    private void a(List<sxx> list, List<Runnable> list2, Handler handler) {
        for (Runnable post : list2) {
            handler.post(post);
        }
        for (int i = 0; i < list.size(); i++) {
            for (sxx sxx : this.a) {
                PlayerTrack playerTrack = ((sxx) list.get(i)).a;
                PlayerTrack playerTrack2 = sxx.a;
                if (PlayerTrackUtil.areUidsEqual(playerTrack, playerTrack2) && !playerTrack.equals(playerTrack2)) {
                    d_(i);
                }
            }
        }
    }

    private static List<sxx> a(PlayerTrack[] playerTrackArr, PlayerTrack playerTrack, PlayerTrack[] playerTrackArr2) {
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
            arrayList2.add(new sxx(playerTrack2, a2, i));
        }
        return arrayList2;
    }

    public final int b() {
        return this.a.size();
    }

    public final long b(int i) {
        return (long) ((sxx) this.a.get(i)).b;
    }

    private static int a(PlayerTrack playerTrack) {
        if (playerTrack == null) {
            return -1;
        }
        if (!fax.a(playerTrack.uid())) {
            return playerTrack.uid().hashCode();
        }
        return playerTrack.uri().hashCode();
    }

    public final boolean a() {
        return this.a.isEmpty();
    }

    /* access modifiers changed from: protected */
    public final PlayerTrack f(int i) {
        return ((sxx) this.a.get(i)).a;
    }
}
