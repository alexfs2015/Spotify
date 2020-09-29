package defpackage;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView.a;
import androidx.recyclerview.widget.RecyclerView.u;
import com.spotify.music.R;
import com.spotify.music.features.premiumdestination.legacy.ui.OfferViewModel;
import com.spotify.music.features.premiumdestination.legacy.ui.OfferViewModel.OfferType;
import java.util.ArrayList;
import java.util.List;

/* renamed from: phc reason: default package */
public final class phc extends a<phb> implements gjl {
    private final List<OfferViewModel> a = new ArrayList(4);
    private final pha d;
    private final pgz e;

    public final /* synthetic */ void a(u uVar, int i) {
        ((phb) uVar).a((OfferViewModel) this.a.get(i));
    }

    public phc(pha pha, pgz pgz) {
        this.d = pha;
        this.e = pgz;
        List<OfferViewModel> list = this.a;
        OfferViewModel offerViewModel = new OfferViewModel(OfferType.PREMIUM, R.string.offer_premium_trial_title, R.drawable.bg_premium_plan, R.drawable.ic_spotify_logo, R.string.offer_premium_trial_formatted_price, R.string.offer_duration_30_days, R.string.offer_premium_trial_details, R.string.offer_premium_trial_cta, R.string.offer_premium_trial_legal_text, R.string.offer_premium_trial_legal_page_url);
        list.add(offerViewModel);
        List<OfferViewModel> list2 = this.a;
        OfferViewModel offerViewModel2 = new OfferViewModel(OfferType.STUDENT, R.string.offer_student_title, R.drawable.bg_student_plan, R.drawable.ic_student_plan, R.string.offer_student_formatted_price, R.string.offer_duration_per_month, R.string.offer_student_details, R.string.offer_student_cta, R.string.offer_student_legal_text, R.string.offer_student_legal_page_url);
        list2.add(offerViewModel2);
        List<OfferViewModel> list3 = this.a;
        OfferViewModel offerViewModel3 = new OfferViewModel(OfferType.FAMILY, R.string.offer_family_title, R.drawable.bg_family_plan, R.drawable.ic_family_plan, R.string.offer_family_formatted_price, R.string.offer_duration_per_month, R.string.offer_family_details, R.string.offer_family_cta, R.string.offer_premium_legal_text, R.string.offer_family_legal_page_url);
        list3.add(offerViewModel3);
    }

    public final int b() {
        return this.a.size();
    }

    public final /* synthetic */ u a(ViewGroup viewGroup, int i) {
        return new phb(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.premium_offer_item, viewGroup, false), this.d, this.e);
    }
}
