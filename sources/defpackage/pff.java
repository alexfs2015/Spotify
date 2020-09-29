package defpackage;

import android.content.Context;
import com.spotify.mobile.android.ui.activity.upsell.model.Offer;
import com.spotify.music.R;
import io.reactivex.Single;
import java.util.concurrent.TimeUnit;

/* renamed from: pff reason: default package */
public interface pff {

    /* renamed from: pff$-CC reason: invalid class name */
    public final /* synthetic */ class CC {
        public static /* synthetic */ Integer a(Offer offer) {
            if (Offer.AD_TARGETING_KEY_30_DAY_TRIAL.equals(offer.adTargetingKey())) {
                return Integer.valueOf(R.raw.premium_page_hubs_30dt);
            }
            return Integer.valueOf(R.raw.premium_page_hubs);
        }

        public static Single<String> a(Context context, wud<Offer> wud, pgd pgd, wug wug, wud<Offer> wud2, String str, String str2, String str3, String str4, String str5, pgr pgr, ghm ghm, fpt fpt, boolean z, boolean z2, String str6, String str7, String str8) {
            String str9;
            String str10;
            String str11;
            String str12;
            ghm ghm2 = ghm;
            String str13 = z ? "premium-destination-hubs-dev" : "premium-destination-hubs";
            String str14 = "SM-G970U";
            String str15 = "samsung-mobile-preload";
            if (pgr.a.a()) {
                if (z2) {
                    str11 = str14;
                    str12 = str15;
                } else {
                    str15 = str3;
                    str12 = str4;
                    str11 = str5;
                }
                return ((pfw) ghm2.a(pfw.class)).a(str13, str, str2, str15, str12, str11, str6, str7, str8);
            } else if (pgr.g(fpt)) {
                if (z2) {
                    str9 = str14;
                    str10 = str15;
                } else {
                    str15 = str3;
                    str10 = str4;
                    str9 = str5;
                }
                return ((pfv) ghm2.a(pfv.class)).a(str13, str, str2, str15, str10, str9, str6, str7, str8);
            } else {
                wud<Offer> wud3 = wud;
                wug wug2 = wug;
                wud<Offer> wud4 = wud2;
                Context context2 = context;
                pgd pgd2 = pgd;
                return vun.a(wud.c(2, TimeUnit.SECONDS, wug).c(wud2).a().c($$Lambda$pff$c7ifP33C3FQ5Yo7XHr41WnQYbXo.INSTANCE).a((wut<? super T, ? extends wuh<? extends R>>) new $$Lambda$pff$U8QM8NN92Ztglnn_VzMgkbI9_KY<Object,Object>(pgd, context)));
            }
        }
    }
}
