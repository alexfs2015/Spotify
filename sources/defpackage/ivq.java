package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils.TruncateAt;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.spotify.android.glue.patterns.prettylist.PrettyHeaderView;
import com.spotify.android.glue.patterns.toolbarmenu.ToolbarConfig.d;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.mobile.android.spotlets.eventshub.model.ConcertResult;
import com.spotify.mobile.android.spotlets.eventshub.model.EventResult;
import com.spotify.mobile.android.spotlets.eventshub.model.EventSection;
import com.spotify.mobile.android.spotlets.eventshub.model.EventsHubModel;
import com.spotify.mobile.android.spotlets.eventshub.model.SourceType;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.music.R;
import com.spotify.music.contentviewstate.ContentViewManager;
import com.spotify.music.contentviewstate.ContentViewManager.ContentState;
import com.spotify.music.contentviewstate.ContentViewManager.a;
import com.spotify.music.contentviewstate.view.LoadingView;
import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.music.navigation.NavigationItem;
import com.spotify.music.navigation.NavigationItem.NavigationGroup;
import com.squareup.picasso.Picasso;
import io.reactivex.BackpressureStrategy;
import io.reactivex.Scheduler;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Consumer;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;

/* renamed from: ivq reason: default package */
public class ivq extends jrd implements OnScrollListener, d, NavigationItem, ivx, jqx {
    public static final String a = ViewUris.aa.toString();
    public lbi T;
    public Picasso U;
    public jyx V;
    public jtz W;
    public Scheduler X;
    private ContentViewManager Y;
    private Map<EventSection, ivp> Z;
    private jsm aa;
    private LoadingView ab;
    /* access modifiers changed from: private */
    public fyk<fyq> ac;
    private fvd ad;
    private boolean ae;
    private final CompositeDisposable af = new CompositeDisposable();
    private final OnClickListener ag = new OnClickListener() {
        public final void onClick(View view) {
            ivv ivv = ivq.this.b;
            ivv.a.an();
            ivv.b.a("changelocation", -1, (String) null);
        }
    };
    private String ah;
    private Button ai;
    public ivv b;

    public static ivq a(fqn fqn) {
        ivq ivq = new ivq();
        fqo.a((Fragment) ivq, fqn);
        return ivq;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Boolean bool) {
        ivv ivv = this.b;
        boolean booleanValue = bool.booleanValue();
        boolean z = true;
        if (!booleanValue && !(ivv.d != EventsHubModel.EMPTY)) {
            ivv.b();
            ivv.a.am();
        }
        if (!booleanValue || ivv.e) {
            z = false;
        }
        if (z) {
            ivv.a();
        }
    }

    private Button ao() {
        this.ai = gat.b(p());
        LayoutParams layoutParams = new LayoutParams(-2, -2);
        int a2 = vfj.a(8.0f, p().getResources());
        layoutParams.bottomMargin = a2;
        layoutParams.topMargin = a2;
        this.ai.setLayoutParams(layoutParams);
        this.ai.setText(p().getString(R.string.events_hub_location_button_text));
        this.ai.setOnClickListener(this.ag);
        return this.ai;
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        FrameLayout frameLayout = new FrameLayout(p());
        this.ab = LoadingView.a(layoutInflater);
        frameLayout.addView(this.ab);
        if (jvi.b(p())) {
            this.ac = fyk.b((Context) p()).a().a(ao(), 1).a(true).d(true).a((Fragment) this);
        } else {
            this.ac = fyk.a((Context) p()).a().a(ao(), 1).a(true).d(true).a((Fragment) this);
            this.ac.e().a.a = false;
        }
        ((fyq) this.ac.a()).a(b((Context) p()));
        View view = this.ac.e().b;
        if (view instanceof PrettyHeaderView) {
            ((PrettyHeaderView) view).b(true);
        }
        frameLayout.addView(this.ac.b());
        fqv.f();
        this.ad = fvg.a(p(), null);
        this.ad.getView().setVisibility(8);
        this.ai = this.ad.V_();
        this.ai.setText(p().getString(R.string.events_hub_location_button_text));
        this.ai.setOnClickListener(this.ag);
        frameLayout.addView(this.ad.getView());
        return frameLayout;
    }

    public final void a(View view, Bundle bundle) {
        TextView textView;
        super.a(view, bundle);
        this.Z = new EnumMap(EventSection.class);
        this.aa = new jsm(p());
        EventSection[] eventSectionArr = EventSection.d;
        int length = eventSectionArr.length;
        for (int i = 0; i < length; i++) {
            EventSection eventSection = eventSectionArr[i];
            ivp ivp = new ivp(p(), new ArrayList(), this.V, this.W);
            this.Z.put(eventSection, ivp);
            jsm jsm = this.aa;
            int i2 = eventSection.mTitleStringId;
            int i3 = eventSection.mSectionId;
            kf p = p();
            fbp.a(p);
            Assertion.a(eventSection != null, "EventSection was null in EventsHub when trying to create a footer");
            if (eventSection != EventSection.ALL) {
                textView = null;
            } else {
                textView = gat.a(p);
                vgl.b(p, textView, R.attr.pasteTextAppearanceSecondary);
                textView.setGravity(17);
                textView.setEllipsize(TruncateAt.END);
                textView.setText(p.getString(R.string.events_hub_section_footer_popular));
                int dimensionPixelOffset = p.getResources().getDimensionPixelOffset(R.dimen.eventshub_footer_padding);
                textView.setPadding(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
            }
            jsm.a((ListAdapter) ivp, i2, i3, (View) null, (View) textView);
        }
        this.aa.b(new int[0]);
        a aVar = this.ac.e().a;
        aVar.setAdapter(this.aa);
        this.Y = new a(p(), this.ad, this.ac.b()).a(SpotifyIconV2.EVENTS, R.string.events_hub_choose_location_title, R.string.events_hub_choose_location_body).b(SpotifyIconV2.EVENTS, R.string.events_hub_no_concerts_found_title, R.string.events_hub_no_concerts_found_body).b(R.string.events_hub_not_available_due_to_error_title, R.string.events_hub_not_available_due_to_error_body).a(R.string.error_no_connection_title, R.string.events_hub_not_available_body).a();
        aVar.setOnScrollListener(this);
        aVar.setOnItemClickListener(new OnItemClickListener() {
            public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                Object item = ivq.this.ac.e().a.getAdapter().getItem(i);
                if (item instanceof ConcertResult) {
                    ConcertResult concertResult = (ConcertResult) item;
                    ivq.this.b.a(concertResult, j, concertResult.getSourceType());
                    return;
                }
                if (item instanceof EventResult) {
                    EventResult eventResult = (EventResult) item;
                    ivv ivv = ivq.this.b;
                    SourceType sourceType = eventResult.getSourceType();
                    if (eventResult.isSingleConcert()) {
                        ivv.a(eventResult.getPosterConcertResult(), j, sourceType);
                        return;
                    }
                    Bundle bundle = new Bundle();
                    bundle.putParcelable("event-result-arg", eventResult);
                    bundle.putString("header-image-uri-arg", ivv.d.getHeaderImageUri());
                    ivv.c.a(ViewUris.ab.toString(), bundle);
                }
            }
        });
    }

    public final void a(EventSection eventSection, Object... objArr) {
        String a2 = a(eventSection.mTitleStringId, objArr);
        jsm jsm = this.aa;
        jsm.b(eventSection.mSectionId).b = a2;
        jsm.a();
    }

    public final void a(List<EventResult> list, EventSection eventSection) {
        if (u()) {
            Assertion.a((Object) list);
            Assertion.a((Object) eventSection);
            ivp ivp = (ivp) this.Z.get(eventSection);
            Assertion.a((Object) ivp);
            ivp.clear();
            ivp.addAll(list);
            this.aa.c(eventSection.mSectionId);
        }
    }

    public final void aP_() {
        super.aP_();
        this.af.a(this.T.a().a(BackpressureStrategy.BUFFER).a(this.X).a((Consumer<? super T>) new $$Lambda$ivq$h82wCADf2QG_lW_Jj1gAo_DAi4g<Object>(this), (Consumer<? super Throwable>) $$Lambda$ivq$b352EG8CB6Ellxt0G0VllUxZLmc.INSTANCE));
    }

    public /* synthetic */ Fragment ae() {
        return CC.$default$ae(this);
    }

    public final rmf af() {
        return rmf.a(PageIdentifiers.CONCERTS, null);
    }

    public final uqm ag() {
        return uqo.aj;
    }

    public final NavigationGroup ah() {
        return NavigationGroup.FIND;
    }

    public final void ai() {
        if (u()) {
            this.Y.b((ContentState) null);
            this.ae = true;
        }
    }

    public final void aj() {
        if (u()) {
            this.ad.a(true);
            this.Y.d(true);
            this.ae = true;
        }
    }

    public final void ak() {
        if (u()) {
            this.ad.a(true);
            this.Y.b(true);
            this.ae = true;
        }
    }

    public final void al() {
        if (u()) {
            this.ad.a(false);
            this.Y.c(true);
            this.ae = true;
        }
    }

    public final void am() {
        if (u()) {
            this.ad.a(false);
            this.Y.a(true);
        }
    }

    public final void an() {
        p().startActivity(kpo.a(p(), iwa.b).a);
    }

    public final String b(Context context) {
        return context != null ? context.getString(R.string.events_hub_title) : "";
    }

    public final void b(String str) {
        if (u()) {
            ImageView d = this.ac.d();
            d.clearColorFilter();
            this.U.a(str).a(d);
        }
    }

    public final void c() {
        if (u()) {
            this.Y.a(this.ab);
        }
    }

    public final void c(String str) {
        if (u()) {
            this.ah = str;
            StringBuilder sb = new StringBuilder();
            sb.append(b((Context) p()));
            if (!fbo.a(str)) {
                sb.append(10);
                sb.append(str);
            }
            ((fyq) this.ac.a()).a(sb);
        }
    }

    public final String e() {
        return a;
    }

    public final void h() {
        super.h();
        this.af.c();
        this.b.b();
    }

    public void onScroll(AbsListView absListView, int i, int i2, int i3) {
        for (int i4 = 0; i4 < i2; i4++) {
            if (!this.aa.isEmpty()) {
                this.ac.e().a.getAdapter().getItem(i4);
            }
        }
    }

    public void onScrollStateChanged(AbsListView absListView, int i) {
    }
}
