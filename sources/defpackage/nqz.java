package defpackage;

import com.google.common.base.Optional;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import com.spotify.mobile.android.util.ui.Lifecycle.a;
import com.spotify.mobile.android.util.ui.Lifecycle.c;
import com.spotify.music.features.homemix.HomeMixFormatListAttributesHelper;
import com.spotify.playlist.endpoints.policy.playlist.DecorationPolicy;
import com.spotify.playlist.endpoints.policy.playlist.HeaderPolicy;
import com.spotify.playlist.endpoints.policy.playlist.Policy;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Consumer;
import io.reactivex.internal.functions.Functions;

/* renamed from: nqz reason: default package */
public final class nqz {
    /* access modifiers changed from: private */
    public static final a e = a.t().a(Optional.b(Policy.builder().a(DecorationPolicy.builder().a(HeaderPolicy.builder().a(ImmutableMap.b("formatListAttributes", Boolean.TRUE)).c(ImmutableMap.f()).b(ImmutableMap.f()).a()).a()).a())).a();
    final nrh a;
    private final HomeMixFormatListAttributesHelper b;
    /* access modifiers changed from: private */
    public final CompositeDisposable c = new CompositeDisposable();
    private final String d;

    public nqz(final vje vje, HomeMixFormatListAttributesHelper homeMixFormatListAttributesHelper, final a aVar, final String str, String str2, nrh nrh) {
        this.d = str2;
        this.b = homeMixFormatListAttributesHelper;
        this.a = (nrh) fbp.a(nrh);
        aVar.a(new c() {
            /* access modifiers changed from: private */
            public /* synthetic */ void a(vld vld) {
                nqz.a(nqz.this, vld.a(), Lists.a((E[]) vld.getItems()));
            }

            public final void a() {
                super.a();
                nqz.this.c.c();
            }

            public final void aN_() {
                super.aN_();
                aVar.b(this);
            }

            public final void c() {
                super.c();
                nqz.this.c.a(vje.b(str, nqz.e).a(Functions.a()).a(AndroidSchedulers.a()).d((Consumer<? super T>) new $$Lambda$nqz$1$1HfpLxJ4eNiAvTtv7xOVO2ULQlg<Object>(this)));
            }
        });
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=java.util.List, code=java.util.List<vle>, for r7v0, types: [java.util.List, java.util.List<vle>] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static /* synthetic */ void a(defpackage.nqz r5, defpackage.vlc r6, java.util.List<defpackage.vle> r7) {
        /*
            com.spotify.music.features.homemix.HomeMixFormatListAttributesHelper r0 = r5.b
            com.spotify.music.features.homemix.models.HomeMix r6 = r0.a(r6)
            com.spotify.music.features.homemix.HomeMixFormatListAttributesHelper r0 = r5.b
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            java.util.Iterator r7 = r7.iterator()
        L_0x0011:
            boolean r2 = r7.hasNext()
            if (r2 == 0) goto L_0x002d
            java.lang.Object r2 = r7.next()
            vle r2 = (defpackage.vle) r2
            java.lang.String r3 = r2.getUri()
            java.util.List r4 = r0.a(r2)
            nss r2 = defpackage.nss.a(r2, r4)
            r1.put(r3, r2)
            goto L_0x0011
        L_0x002d:
            java.lang.String r7 = r5.d
            java.lang.Object r7 = r1.get(r7)
            nss r7 = (defpackage.nss) r7
            if (r6 == 0) goto L_0x004f
            if (r7 == 0) goto L_0x004f
            nrh r0 = r5.a
            vle r1 = r7.a()
            r0.a(r1)
            nrh r5 = r5.a
            java.util.Map r6 = r6.homeMixUsersMap()
            java.util.List r7 = r7.b()
            r5.a(r6, r7)
        L_0x004f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nqz.a(nqz, vlc, java.util.List):void");
    }
}
