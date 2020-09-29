package defpackage;

import com.google.common.base.Optional;
import com.google.common.collect.ImmutableMap;
import com.spotify.mobile.android.playlist.model.policy.DecorationPolicy;
import com.spotify.mobile.android.playlist.model.policy.ListPolicy;
import com.spotify.mobile.android.playlist.model.policy.Policy;
import com.spotify.music.features.yourlibrary.musicpages.datasource.SortOrder;
import io.reactivex.Observable;
import io.reactivex.functions.Function;

/* renamed from: que reason: default package */
public final class que extends qvb {
    private static final Policy a;
    private final a c;
    private final ioi d;
    private final qxq e;

    /* renamed from: que$1 reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] a = new int[SortOrder.values().length];

        static {
            try {
                a[SortOrder.RECENTLY_PLAYED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    /* renamed from: que$a */
    public static abstract class a {
        public static final a a = new a().a(true).b(false).c(false).a(Optional.e()).a();

        /* renamed from: que$a$a reason: collision with other inner class name */
        public static abstract class C0075a {
            public abstract C0075a a(Optional<SortOrder> optional);

            public abstract C0075a a(boolean z);

            public abstract a a();

            public abstract C0075a b(boolean z);

            public abstract C0075a c(boolean z);
        }

        public abstract boolean a();

        public abstract boolean b();

        public abstract boolean c();

        public abstract Optional<SortOrder> d();

        public abstract C0075a e();
    }

    static {
        ListPolicy listPolicy = new ListPolicy();
        String str = "link";
        String str2 = "collectionLink";
        String str3 = "name";
        String str4 = "portraits";
        String str5 = "isFollowed";
        String str6 = "isBanned";
        String str7 = "numTracksInCollection";
        listPolicy.setListAttributes(ImmutableMap.g().b("addTime", Boolean.TRUE).b(str, Boolean.TRUE).b(str2, Boolean.TRUE).b(str3, Boolean.TRUE).b(str4, Boolean.TRUE).b(str5, Boolean.TRUE).b(str6, Boolean.TRUE).b(str7, Boolean.TRUE).b());
        DecorationPolicy decorationPolicy = new DecorationPolicy();
        decorationPolicy.setListPolicy(listPolicy);
        a = new Policy(decorationPolicy);
    }

    public que(a aVar, qsr qsr, ioi ioi, qxq qxq) {
        super(qsr);
        this.c = aVar;
        this.d = ioi;
        this.e = qxq;
        boolean z = true;
        if (aVar.a() && !aVar.b()) {
            this.d.a(true);
        }
        if (aVar.a() || !aVar.b()) {
            z = false;
        }
        if (z) {
            this.d.a(false);
        }
        this.d.a(vns.e().a("name").a());
    }

    /* access modifiers changed from: protected */
    public final Observable<qun> a(qum qum) {
        vns vns;
        int a2 = qum.a();
        this.d.a(Integer.valueOf(a2), Integer.valueOf(this.b.c));
        this.d.b = qum.c().b();
        this.d.a(false, ((Boolean) fav.a(qum.c().d().get("available_offline_only"), Boolean.FALSE)).booleanValue(), false);
        if (this.c.d().b()) {
            SortOrder sortOrder = (SortOrder) this.c.d().c();
            if (AnonymousClass1.a[sortOrder.ordinal()] == 1) {
                vns = vns.e().a("recentlyPlayedRank").a(vns.e().a("addTime").a()).a();
            } else {
                StringBuilder sb = new StringBuilder("Sort order not supported: ");
                sb.append(sortOrder);
                throw new AssertionError(sb.toString());
            }
        } else {
            vns = qum.c().c();
        }
        if (vns != null) {
            this.d.a(vns);
        }
        boolean booleanValue = ((Boolean) fav.a(qum.e(), Boolean.FALSE)).booleanValue();
        boolean c2 = this.c.c();
        Observable b = this.d.a(a);
        $$Lambda$que$s0cRbPc8Cm_W8KEZW9rRCZUyn3E r0 = new $$Lambda$que$s0cRbPc8Cm_W8KEZW9rRCZUyn3E(this, a2, booleanValue, c2, qum);
        return b.c((Function<? super T, ? extends R>) r0);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x005f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ defpackage.qun a(int r21, boolean r22, boolean r23, defpackage.qum r24, defpackage.uyy r25) {
        /*
            r20 = this;
            java.lang.Object[] r0 = r25.getItems()
            uyr[] r0 = (defpackage.uyr[]) r0
            com.google.common.collect.ImmutableList$a r1 = com.google.common.collect.ImmutableList.g()
            r2 = 0
            r3 = 0
        L_0x000c:
            int r4 = r0.length
            if (r3 >= r4) goto L_0x00a1
            r4 = r0[r3]
            int r18 = r21 + r3
            r15 = r20
            qxq r5 = r15.e
            int r6 = r4.getNumTracksInCollection()
            java.lang.String r7 = r4.getUri()
            java.lang.String r8 = ""
            r9 = r22 ^ 1
            r10 = 1
            if (r6 <= 0) goto L_0x0052
            boolean r11 = r5.f
            if (r11 == 0) goto L_0x003f
            android.content.Context r8 = r5.a
            android.content.res.Resources r8 = r8.getResources()
            r11 = 2131820586(0x7f11002a, float:1.9273891E38)
            java.lang.Object[] r12 = new java.lang.Object[r10]
            java.lang.Integer r13 = java.lang.Integer.valueOf(r6)
            r12[r2] = r13
            java.lang.String r8 = r8.getQuantityString(r11, r6, r12)
        L_0x003f:
            boolean r6 = r5.e
            if (r6 == 0) goto L_0x0052
            java.lang.String r6 = r4.getCollectionUri()
            boolean r11 = defpackage.fax.a(r6)
            if (r11 != 0) goto L_0x0052
            r16 = r6
            r13 = r8
            r8 = 1
            goto L_0x0056
        L_0x0052:
            r16 = r7
            r13 = r8
            r8 = r9
        L_0x0056:
            boolean r6 = r13.isEmpty()
            if (r6 == 0) goto L_0x005f
            com.spotify.music.features.yourlibrary.musicpages.item.MusicItem$Type r6 = com.spotify.music.features.yourlibrary.musicpages.item.MusicItem.Type.ARTIST
            goto L_0x0061
        L_0x005f:
            com.spotify.music.features.yourlibrary.musicpages.item.MusicItem$Type r6 = com.spotify.music.features.yourlibrary.musicpages.item.MusicItem.Type.ARTIST_TWO_LINES
        L_0x0061:
            r7 = r6
            fdr r5 = r5.c
            java.lang.String r6 = r4.getUri()
            com.google.common.hash.HashCode r5 = r5.a(r6)
            long r5 = r5.c()
            boolean r9 = r4.isFollowed()
            java.lang.String r12 = r4.getName()
            java.lang.String r14 = r4.getUri()
            com.spotify.playlist.models.Covers$Size r10 = com.spotify.playlist.models.Covers.Size.NORMAL
            java.lang.String r17 = r4.getImageUri(r10)
            int r19 = r4.getAddTime()
            uzf r4 = r4.getOfflineState()
            r10 = r23
            r11 = r22
            r15 = r16
            r16 = r17
            r17 = r19
            r19 = r4
            com.spotify.music.features.yourlibrary.musicpages.item.MusicItem r4 = com.spotify.music.features.yourlibrary.musicpages.item.MusicItem.a(r5, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            r1.c(r4)
            int r3 = r3 + 1
            goto L_0x000c
        L_0x00a1:
            boolean r5 = r25.isLoading()
            int r6 = r25.getUnrangedLength()
            com.google.common.collect.ImmutableList r8 = r1.a()
            com.spotify.music.features.yourlibrary.musicpages.item.MusicItem r10 = com.spotify.music.features.yourlibrary.musicpages.item.MusicItem.p
            r7 = r21
            r9 = r24
            qun r0 = defpackage.quo.a(r5, r6, r7, r8, r9, r10)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.que.a(int, boolean, boolean, qum, uyy):qun");
    }
}
