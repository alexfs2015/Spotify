package defpackage;

import android.app.Activity;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

/* renamed from: pst reason: default package */
public final class pst {
    final String a;
    final fpt b;
    public final pss c;
    final Random d;
    public final pto e = new pto(10, 39) {
        public final boolean a(PlayerState playerState, PlayerState playerState2) {
            if (!pto.b(playerState, playerState2) && !(!faw.a(playerState.track(), playerState2.track()))) {
                if ((playerState.reverse().length == playerState2.reverse().length && playerState.future().length == playerState2.future().length) ? false : true) {
                    return true;
                }
                return false;
            }
            return true;
        }

        /* JADX WARNING: Removed duplicated region for block: B:40:0x011a  */
        /* JADX WARNING: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void a(com.spotify.mobile.android.cosmos.player.v2.PlayerState r11) {
            /*
                r10 = this;
                pst r0 = defpackage.pst.this
                java.lang.String r0 = r0.a
                java.lang.String r0 = defpackage.uhq.b(r0)
                java.lang.String r1 = r11.entityUri()
                boolean r0 = r1.equals(r0)
                if (r0 == 0) goto L_0x011f
                pst r0 = defpackage.pst.this
                com.spotify.mobile.android.cosmos.player.v2.PlayerTrack r1 = r11.track()
                com.spotify.mobile.android.cosmos.player.v2.PlayerTrack[] r2 = r11.reverse()
                com.spotify.mobile.android.cosmos.player.v2.PlayerTrack[] r3 = r11.future()
                boolean r4 = com.spotify.mobile.android.cosmos.player.v2.PlayerTrackUtil.isAd(r1)
                if (r4 != 0) goto L_0x00e8
                r4 = 0
                if (r1 == 0) goto L_0x00e1
                r5 = 1
                com.spotify.mobile.android.cosmos.player.v2.PlayerTrack[] r6 = new com.spotify.mobile.android.cosmos.player.v2.PlayerTrack[r5]
                r6[r4] = r1
                com.spotify.mobile.android.cosmos.player.v2.PlayerTrack[] r6 = defpackage.pst.b(r6)
                int r6 = r6.length
                if (r6 != 0) goto L_0x0037
                goto L_0x00e1
            L_0x0037:
                com.spotify.mobile.android.cosmos.player.v2.PlayerTrack[] r2 = defpackage.pst.b(r2)
                com.spotify.mobile.android.cosmos.player.v2.PlayerTrack[] r3 = defpackage.pst.b(r3)
                fpt r6 = r0.b
                boolean r6 = defpackage.jsl.c(r6)
                if (r6 == 0) goto L_0x0064
                pss r6 = r0.c
                r6.clear()
                int r6 = r2.length
                int r7 = r3.length
                int r6 = r6 + r7
                int r6 = r6 + r5
                com.spotify.mobile.android.cosmos.player.v2.PlayerTrack[] r6 = new com.spotify.mobile.android.cosmos.player.v2.PlayerTrack[r6]
                int r7 = r2.length
                java.lang.System.arraycopy(r2, r4, r6, r4, r7)
                int r7 = r2.length
                r6[r7] = r1
                int r1 = r2.length
                int r1 = r1 + r5
                int r2 = r3.length
                java.lang.System.arraycopy(r3, r4, r6, r1, r2)
                r0.a(r6)
                goto L_0x00e8
            L_0x0064:
                java.util.HashMap r6 = new java.util.HashMap
                r6.<init>()
                java.lang.String r7 = r1.uid()
                r6.put(r7, r1)
                int r1 = r2.length
                r7 = 0
            L_0x0072:
                if (r7 >= r1) goto L_0x0080
                r8 = r2[r7]
                java.lang.String r9 = r8.uid()
                r6.put(r9, r8)
                int r7 = r7 + 1
                goto L_0x0072
            L_0x0080:
                int r1 = r3.length
            L_0x0081:
                if (r4 >= r1) goto L_0x008f
                r2 = r3[r4]
                java.lang.String r7 = r2.uid()
                r6.put(r7, r2)
                int r4 = r4 + 1
                goto L_0x0081
            L_0x008f:
                pss r1 = r0.c
                int r1 = r1.getCount()
                int r1 = r1 - r5
            L_0x0096:
                if (r1 < 0) goto L_0x00ba
                pss r2 = r0.c
                java.lang.Object r2 = r2.getItem(r1)
                com.spotify.mobile.android.cosmos.player.v2.PlayerTrack r2 = (com.spotify.mobile.android.cosmos.player.v2.PlayerTrack) r2
                java.lang.String r3 = r2.uid()
                boolean r3 = r6.containsKey(r3)
                if (r3 == 0) goto L_0x00b2
                java.lang.String r2 = r2.uid()
                r6.remove(r2)
                goto L_0x00b7
            L_0x00b2:
                pss r3 = r0.c
                r3.remove(r2)
            L_0x00b7:
                int r1 = r1 + -1
                goto L_0x0096
            L_0x00ba:
                java.util.Collection r1 = r6.values()
                java.util.Iterator r1 = r1.iterator()
            L_0x00c2:
                boolean r2 = r1.hasNext()
                if (r2 == 0) goto L_0x00e8
                java.lang.Object r2 = r1.next()
                com.spotify.mobile.android.cosmos.player.v2.PlayerTrack r2 = (com.spotify.mobile.android.cosmos.player.v2.PlayerTrack) r2
                pss r3 = r0.c
                java.util.Random r4 = r0.d
                pss r6 = r0.c
                int r6 = r6.getCount()
                int r6 = r6 + r5
                int r4 = r4.nextInt(r6)
                r3.insert(r2, r4)
                goto L_0x00c2
            L_0x00e1:
                java.lang.Object[] r0 = new java.lang.Object[r4]
                java.lang.String r1 = "Current track does not have any data. Discarding PlayerState event."
                com.spotify.base.java.logging.Logger.d(r1, r0)
            L_0x00e8:
                pst r0 = defpackage.pst.this
                pss r0 = r0.c
                com.spotify.mobile.android.cosmos.player.v2.PlayerTrack r11 = r11.track()
                if (r11 == 0) goto L_0x0110
                java.lang.String r1 = r11.uid()
                boolean r1 = defpackage.fax.a(r1)
                if (r1 != 0) goto L_0x0101
                java.lang.String r11 = r11.uid()
                goto L_0x0112
            L_0x0101:
                java.lang.String r1 = r11.uri()
                boolean r1 = defpackage.fax.a(r1)
                if (r1 != 0) goto L_0x0110
                java.lang.String r11 = r11.uri()
                goto L_0x0112
            L_0x0110:
                java.lang.String r11 = ""
            L_0x0112:
                java.lang.String r1 = r0.a
                boolean r1 = r11.equals(r1)
                if (r1 != 0) goto L_0x011f
                r0.a = r11
                r0.notifyDataSetChanged()
            L_0x011f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.pst.AnonymousClass1.a(com.spotify.mobile.android.cosmos.player.v2.PlayerState):void");
        }
    };

    public pst(Activity activity, String str, sih sih, fpt fpt, jmq jmq, long j) {
        this.a = str;
        this.b = fpt;
        this.c = new pss(activity, sih, fpt, jmq);
        this.d = new Random(j);
    }

    public final void a(PlayerTrack[] playerTrackArr) {
        if (!jsl.c(this.b)) {
            PlayerTrack[] playerTrackArr2 = new PlayerTrack[playerTrackArr.length];
            System.arraycopy(playerTrackArr, 0, playerTrackArr2, 0, playerTrackArr.length);
            Collections.shuffle(Arrays.asList(playerTrackArr2), this.d);
            this.c.addAll(playerTrackArr2);
            return;
        }
        this.c.addAll(playerTrackArr);
    }

    static PlayerTrack[] b(PlayerTrack... playerTrackArr) {
        for (PlayerTrack playerTrack : playerTrackArr) {
            if (a(playerTrack).booleanValue() || b(playerTrack).booleanValue()) {
                return c(playerTrackArr);
            }
        }
        return playerTrackArr;
    }

    private static PlayerTrack[] c(PlayerTrack[] playerTrackArr) {
        ArrayList arrayList = new ArrayList();
        for (PlayerTrack playerTrack : playerTrackArr) {
            if (!a(playerTrack).booleanValue() && !b(playerTrack).booleanValue()) {
                arrayList.add(playerTrack);
            }
        }
        return (PlayerTrack[]) arrayList.toArray(new PlayerTrack[0]);
    }

    private static Boolean a(PlayerTrack playerTrack) {
        return Boolean.valueOf(fax.a((String) playerTrack.metadata().get("title")));
    }

    private static Boolean b(PlayerTrack playerTrack) {
        return Boolean.valueOf(playerTrack.metadata().containsKey("is_queued"));
    }
}
