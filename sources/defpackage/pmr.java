package defpackage;

import android.content.Context;
import com.spotify.mobile.android.ui.activity.upsell.model.Offer;
import com.spotify.music.R;
import io.reactivex.Single;
import java.util.concurrent.TimeUnit;

/* renamed from: pmr reason: default package */
public interface pmr {

    /* renamed from: pmr$-CC reason: invalid class name */
    public final /* synthetic */ class CC {
        public static Single<String> a(Context context, xii<Offer> xii, pnp pnp, xil xil, xii<Offer> xii2, String str, String str2, String str3, String str4, String str5, pns pns, gix gix, fqn fqn, boolean z, boolean z2, String str6, String str7, String str8) {
            String str9;
            String str10;
            String str11;
            String str12;
            gix gix2 = gix;
            String str13 = z ? "premium-destination-hubs-dev" : "premium-destination-hubs";
            String str14 = "SM-G970U";
            String str15 = "samsung-mobile-preload";
            if (pns.a.a()) {
                if (z2) {
                    str11 = str14;
                    str12 = str15;
                } else {
                    str15 = str3;
                    str12 = str4;
                    str11 = str5;
                }
                return ((pni) gix2.a(pni.class)).a(str13, str, str2, str15, str12, str11, str6, str7, str8);
            } else if (pns.c(fqn)) {
                if (z2) {
                    str9 = str14;
                    str10 = str15;
                } else {
                    str15 = str3;
                    str10 = str4;
                    str9 = str5;
                }
                return ((pnh) gix2.a(pnh.class)).a(str13, str, str2, str15, str10, str9, str6, str7, str8);
            } else {
                xii<Offer> xii3 = xii;
                xil xil2 = xil;
                xii<Offer> xii4 = xii2;
                Context context2 = context;
                pnp pnp2 = pnp;
                return wit.a(xii.c(2, TimeUnit.SECONDS, xil).c(xii2).a().c($$Lambda$pmr$x_iDUhevRlsTfpcdFb7NWWyqjzI.INSTANCE).a((xiy<? super T, ? extends xim<? extends R>>) new $$Lambda$pmr$4q0rdvuMBXxKrQmvbCyKCfVJq60<Object,Object>(pnp, context)));
            }
        }

        public static /* synthetic */ Integer a(Offer offer) {
            return Offer.AD_TARGETING_KEY_30_DAY_TRIAL.equals(offer.adTargetingKey()) ? Integer.valueOf(R.raw.premium_page_hubs_30dt) : Integer.valueOf(R.raw.premium_page_hubs);
        }
    }
}
