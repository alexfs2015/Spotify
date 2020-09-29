package defpackage;

/* renamed from: pos reason: default package */
public final class pos {
    public static kjn<pot, poq> a(pot pot) {
        return kjn.a(pot, kjk.a(poq.a("cards", pot.c()), poq.a("banners", pot.a()), poq.a("notes", pot.b())));
    }

    public static kjx<pot, poq> a(pot pot, por por) {
        return (kjx) por.a(new $$Lambda$pos$3nzn1YiQOf_gtelVceUfDBmpXh0(pot), new $$Lambda$pos$hUIbl4ZUQkpKcOMiU8pV6kO1bzA(pot));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kjx a(pot pot, b bVar, b bVar2) {
        if (pot.c() instanceof c) {
            return kjx.a(kjk.a(poq.a(bVar.a, bVar.b, "card-display-unavailable")));
        }
        pou a = pou.a(bVar.a, bVar.b);
        return kjx.a(pot.c(a), kjk.a(poq.a(bVar.a, bVar.b), poq.a("cards", a)));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kjx a(pot pot, b bVar, a aVar) {
        if (pot.a() instanceof c) {
            return kjx.a(kjk.a(poq.a(bVar.a, bVar.b, "npv-showing")));
        }
        pou a = pou.a(bVar.a, bVar.b);
        return kjx.a(pot.a(a), kjk.a(poq.a(bVar.a, bVar.b), poq.a("banners", a)));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kjx a(pot pot, b bVar, c cVar) {
        if (pot.b() instanceof c) {
            return kjx.a(kjk.a(poq.a(bVar.a, bVar.b, "npv-showing")));
        }
        pou a = pou.a(bVar.a, bVar.b);
        return kjx.a(pot.b(pou.a(bVar.a, bVar.b)), kjk.a(poq.a(bVar.a, bVar.b), poq.a("notes", a)));
    }

    private static IllegalStateException a(a aVar) {
        return new IllegalStateException(String.format("dismiss request does not match displayStatus %s: ", new Object[]{aVar.a}));
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00a8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ defpackage.kjx a(defpackage.pot r9, defpackage.por.a r10) {
        /*
            java.lang.String r0 = r10.a
            int r1 = r0.hashCode()
            r2 = -336959801(0xffffffffebea66c7, float:-5.66748E26)
            java.lang.String r3 = "notes"
            java.lang.String r4 = "cards"
            java.lang.String r5 = "banners"
            r6 = 2
            r7 = 0
            r8 = 1
            if (r1 == r2) goto L_0x002f
            r2 = 94431075(0x5a0e763, float:1.5131326E-35)
            if (r1 == r2) goto L_0x0027
            r2 = 105008833(0x6424ec1, float:3.6545204E-35)
            if (r1 == r2) goto L_0x001f
            goto L_0x0037
        L_0x001f:
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0037
            r0 = 2
            goto L_0x0038
        L_0x0027:
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L_0x0037
            r0 = 0
            goto L_0x0038
        L_0x002f:
            boolean r0 = r0.equals(r5)
            if (r0 == 0) goto L_0x0037
            r0 = 1
            goto L_0x0038
        L_0x0037:
            r0 = -1
        L_0x0038:
            if (r0 == 0) goto L_0x00a8
            if (r0 == r8) goto L_0x007c
            if (r0 != r6) goto L_0x006a
            pou r0 = r9.b()
            boolean r0 = r0 instanceof defpackage.pou.a
            if (r0 == 0) goto L_0x0065
            pou$b r10 = new pou$b
            r10.<init>()
            pot r9 = r9.b(r10)
            poq[] r10 = new defpackage.poq[r8]
            pou$b r0 = new pou$b
            r0.<init>()
            poq r0 = defpackage.poq.a(r3, r0)
            r10[r7] = r0
            java.util.Set r10 = defpackage.kjk.a(r10)
            kjx r9 = defpackage.kjx.a(r9, r10)
            return r9
        L_0x0065:
            java.lang.IllegalStateException r9 = a(r10)
            throw r9
        L_0x006a:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.Object[] r0 = new java.lang.Object[r8]
            java.lang.String r10 = r10.a
            r0[r7] = r10
            java.lang.String r10 = "Should only be Card, Banner, or Note Format but is: %s"
            java.lang.String r10 = java.lang.String.format(r10, r0)
            r9.<init>(r10)
            throw r9
        L_0x007c:
            pou r0 = r9.a()
            boolean r0 = r0 instanceof defpackage.pou.a
            if (r0 == 0) goto L_0x00a3
            pou$b r10 = new pou$b
            r10.<init>()
            pot r9 = r9.a(r10)
            poq[] r10 = new defpackage.poq[r8]
            pou$b r0 = new pou$b
            r0.<init>()
            poq r0 = defpackage.poq.a(r5, r0)
            r10[r7] = r0
            java.util.Set r10 = defpackage.kjk.a(r10)
            kjx r9 = defpackage.kjx.a(r9, r10)
            return r9
        L_0x00a3:
            java.lang.IllegalStateException r9 = a(r10)
            throw r9
        L_0x00a8:
            pou r0 = r9.c()
            boolean r0 = r0 instanceof defpackage.pou.a
            if (r0 == 0) goto L_0x00cf
            pou$b r10 = new pou$b
            r10.<init>()
            pot r9 = r9.c(r10)
            poq[] r10 = new defpackage.poq[r8]
            pou$b r0 = new pou$b
            r0.<init>()
            poq r0 = defpackage.poq.a(r4, r0)
            r10[r7] = r0
            java.util.Set r10 = defpackage.kjk.a(r10)
            kjx r9 = defpackage.kjx.a(r9, r10)
            return r9
        L_0x00cf:
            java.lang.IllegalStateException r9 = a(r10)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pos.a(pot, por$a):kjx");
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kjx a(pot pot, b bVar) {
        String str;
        if (!((pot.c() instanceof a) || (pot.a() instanceof a) || (pot.b() instanceof a))) {
            return (kjx) bVar.b.a((gct<b, R_>) new $$Lambda$pos$kdlJ9tsDiWVsx0MOB3LISaTvYNY<b,R_>(pot, bVar), (gct<a, R_>) new $$Lambda$pos$z8S_YzGUzJwT8LPID87cw7wzAuw<a,R_>(pot, bVar), (gct<c, R_>) new $$Lambda$pos$8VvOJwS_SbrCOYnuaHdbPFZXm8<c,R_>(pot, bVar));
        }
        poq[] poqArr = new poq[1];
        prk prk = bVar.a;
        ppb ppb = bVar.b;
        if (pot.c() instanceof a) {
            str = "card-already-showing";
        } else if (pot.a() instanceof a) {
            str = "banner-already-showing";
        } else if (pot.b() instanceof a) {
            str = "note-already-showing";
        } else {
            throw new IllegalStateException("None of the expected formats are displaying");
        }
        poqArr[0] = poq.a(prk, ppb, str);
        return kjx.a(kjk.a(poqArr));
    }
}
