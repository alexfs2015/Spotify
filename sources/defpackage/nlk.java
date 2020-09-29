package defpackage;

import com.spotify.mobile.android.util.ui.Lifecycle.a;
import com.spotify.mobile.android.util.ui.Lifecycle.c;
import com.spotify.music.features.homemix.HomeMixFormatListAttributesHelper;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Consumer;
import io.reactivex.internal.functions.Functions;

/* renamed from: nlk reason: default package */
public final class nlk {
    final CompositeDisposable a = new CompositeDisposable();
    final nls b;
    private final HomeMixFormatListAttributesHelper c;
    private final String d;

    public nlk(final oix oix, HomeMixFormatListAttributesHelper homeMixFormatListAttributesHelper, final a aVar, String str, nls nls) {
        this.d = str;
        this.c = homeMixFormatListAttributesHelper;
        this.b = (nls) fay.a(nls);
        aVar.a(new c() {
            public final void c() {
                super.c();
                nlk.this.a.a(Observable.a((ObservableSource<? extends T1>) oix.c(), (ObservableSource<? extends T2>) oix.b(), (BiFunction<? super T1, ? super T2, ? extends R>) $$Lambda$PtKgV6KBRJCtwM5ZttNm5I6IZI.INSTANCE).a(Functions.a()).a(AndroidSchedulers.a()).d((Consumer<? super T>) new $$Lambda$nlk$1$XUfKiJUOSbS1hEZcSx68UNrNLzM<Object>(this)));
            }

            /* access modifiers changed from: private */
            public /* synthetic */ void a(ho hoVar) {
                nlk.a(nlk.this, (ojc) fay.a(hoVar.a), ((ojb) fay.a(hoVar.b)).a());
            }

            public final void a() {
                super.a();
                nlk.this.a.c();
            }

            public final void aP_() {
                super.aP_();
                aVar.b(this);
            }
        });
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=java.util.List, code=java.util.List<uzb>, for r7v0, types: [java.util.List<uzb>, java.util.List] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static /* synthetic */ void a(defpackage.nlk r5, defpackage.ojc r6, java.util.List<defpackage.uzb> r7) {
        /*
            com.spotify.music.features.homemix.HomeMixFormatListAttributesHelper r0 = r5.c
            uyz r6 = r6.a()
            com.spotify.music.features.homemix.models.HomeMix r6 = r0.a(r6)
            com.spotify.music.features.homemix.HomeMixFormatListAttributesHelper r0 = r5.c
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            java.util.Iterator r7 = r7.iterator()
        L_0x0015:
            boolean r2 = r7.hasNext()
            if (r2 == 0) goto L_0x0031
            java.lang.Object r2 = r7.next()
            uzb r2 = (defpackage.uzb) r2
            java.lang.String r3 = r2.getUri()
            java.util.List r4 = r0.a(r2)
            nnd r2 = defpackage.nnd.a(r2, r4)
            r1.put(r3, r2)
            goto L_0x0015
        L_0x0031:
            java.lang.String r7 = r5.d
            java.lang.Object r7 = r1.get(r7)
            nnd r7 = (defpackage.nnd) r7
            if (r6 == 0) goto L_0x0053
            if (r7 == 0) goto L_0x0053
            nls r0 = r5.b
            uzb r1 = r7.a()
            r0.a(r1)
            nls r5 = r5.b
            java.util.Map r6 = r6.homeMixUsersMap()
            java.util.List r7 = r7.b()
            r5.a(r6, r7)
        L_0x0053:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nlk.a(nlk, ojc, java.util.List):void");
    }
}
