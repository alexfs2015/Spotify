package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Spannable;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.a;
import androidx.recyclerview.widget.RecyclerView.f;
import androidx.recyclerview.widget.RecyclerView.i;
import androidx.recyclerview.widget.RecyclerView.s;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.google.common.collect.ImmutableList;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.cosmos.android.RxResolver;
import com.spotify.cosmos.router.Request;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.mobile.android.spotlets.creatorartist.model.ArtistBioSection;
import com.spotify.mobile.android.spotlets.creatorartist.model.CreatorAboutModel;
import com.spotify.mobile.android.spotlets.creatorartist.model.Image;
import com.spotify.mobile.android.spotlets.creatorartist.model.ImageModel;
import com.spotify.mobile.android.spotlets.creatorartist.view.ArtistBiographyImageView;
import com.spotify.mobile.android.ui.view.ExpandableEllipsizeTextView;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.music.R;
import com.spotify.music.artist.uri.ArtistUri;
import com.spotify.music.artist.uri.ArtistUri.Type;
import com.spotify.music.features.artistbio.view.MonthlyListenersView;
import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.paste.spotifyicon.SpotifyIconDrawable;
import com.spotify.paste.widgets.carousel.CarouselLayoutManager;
import com.spotify.paste.widgets.carousel.CarouselLayoutManager.MeasureMode;
import com.spotify.paste.widgets.carousel.CarouselView;
import com.squareup.picasso.Picasso;
import java.text.NumberFormat;
import java.util.List;
import java.util.Locale;

/* renamed from: itr reason: default package */
public class itr extends mis<CreatorAboutModel> implements fzq, itv, a {
    public RxResolver T;
    public hhc U;
    public hxx V;
    public lbr W;
    public fzt X;
    public sej Y;
    public jyx Z;
    itu a;
    public Picasso aa;
    public rwl ab;
    private CarouselView ac;
    private ExpandableEllipsizeTextView af;
    private View ag;
    private CreatorAboutModel ah;
    private TextView ai;
    private fry aj;
    private fry ak;
    private fry al;
    private fry am;
    private fry an;
    /* access modifiers changed from: private */
    public ArtistUri ao;
    private sso ap;
    private jsm aq;
    private MonthlyListenersView ar;
    /* access modifiers changed from: private */
    public itq as;
    private boolean at;
    public jlr b;

    private void a(final String str, fry fry, final String str2) {
        fry.getView().setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                itr.this.n().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
                itq b2 = itr.this.as;
                i iVar = new i(itr.this.ao.toString(), 0, str2, str, "click");
                b2.a(iVar);
            }
        });
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void ao() {
        ImmutableList immutableList;
        sej sej = this.Y;
        sso sso = this.ap;
        ArtistUri artistUri = this.ao;
        Type type = Type.ARTIST;
        StringBuilder sb = new StringBuilder();
        sb.append(artistUri.b);
        sb.append(type.mSuffix);
        String sb2 = sb.toString();
        itu itu = this.a;
        if (itu.e || itu.g.isEmpty()) {
            immutableList = ImmutableList.d();
        } else {
            ImageModel imageModel = (ImageModel) itu.g.get(itu.f);
            immutableList = imageModel.getModerationUri() == null ? ImmutableList.d() : ImmutableList.a(imageModel.getModerationUri());
        }
        sej.a(sso, sb2, immutableList);
    }

    public static itr c(String str) {
        fbp.a(str);
        sso a2 = ViewUris.aJ.a(str);
        itr itr = new itr();
        Bundle bundle = new Bundle();
        bundle.putParcelable("artist_uri", a2);
        itr.g(bundle);
        return itr;
    }

    private static CharSequence d(String str) {
        Spannable spannable = (Spannable) jug.a(str);
        juh.a(spannable, null);
        return spannable;
    }

    public final void A() {
        super.A();
        this.a.b.stopWatching();
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.creator_bio, viewGroup, false);
        ListView listView = (ListView) inflate.findViewById(16908298);
        this.aq = new jsm(p());
        FrameLayout frameLayout = (FrameLayout) layoutInflater.inflate(R.layout.creatorartist_monthlylisteners, new FrameLayout(n()), true);
        this.ar = (MonthlyListenersView) frameLayout.findViewById(R.id.monthly_listeners_view);
        ((LayoutParams) this.ar.getLayoutParams()).topMargin = n().getResources().getDimensionPixelOffset(R.dimen.std_16dp);
        this.ag = inflate.findViewById(R.id.creatorbio_landscape_gallery);
        if (!this.at) {
            FrameLayout frameLayout2 = (FrameLayout) layoutInflater.inflate(R.layout.artist_carousel, listView, false);
            this.ac = (CarouselView) frameLayout2.findViewById(R.id.cover_art_carousel);
            AnonymousClass2 r6 = new CarouselLayoutManager(MeasureMode.SQUARE) {
                public final void a(RecyclerView recyclerView, s sVar, int i) {
                    if (this.b != i) {
                        itu itu = itr.this.a;
                        itu.f = i;
                        itq itq = itu.c;
                        i iVar = new i(itu.a.toString(), (long) i, "gallery", null, "swipe");
                        itq.a(iVar);
                    }
                    super.a(recyclerView, sVar, i);
                }
            };
            r6.a = new vhr(n());
            this.ac.a((i) r6);
            this.ac.a((f) new vhq());
            this.aq.a((ListAdapter) new joh(frameLayout2), (String) null, ArtistBioSection.GALLERY.mSectionId);
        }
        this.af = (ExpandableEllipsizeTextView) layoutInflater.inflate(R.layout.creatorartist_biography, listView, false);
        this.af.setMovementMethod(LinkMovementMethod.getInstance());
        vgl.b(n(), this.af, R.attr.pasteTextAppearanceArticle);
        ViewGroup viewGroup2 = (ViewGroup) layoutInflater.inflate(R.layout.autobiography, listView, false);
        this.ai = (TextView) viewGroup2.findViewById(R.id.autobiography);
        this.ai.setMovementMethod(LinkMovementMethod.getInstance());
        vgl.b(n(), this.ai, R.attr.pasteTextAppearanceArticle);
        fqv.b();
        this.aj = fsk.d(n(), listView);
        View view = this.aj.getView();
        view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), n().getResources().getDimensionPixelOffset(R.dimen.std_16dp));
        viewGroup2.addView(this.aj.getView());
        ViewGroup viewGroup3 = (ViewGroup) layoutInflater.inflate(R.layout.social_links, listView, false);
        SpotifyIconDrawable spotifyIconDrawable = new SpotifyIconDrawable(n(), SpotifyIconV2.INSTAGRAM, n().getResources().getDimension(R.dimen.social_link_icon_size));
        fqv.b();
        this.an = fsk.d(n(), listView);
        this.an.getView().setVisibility(8);
        this.an.b().setText(R.string.creator_artist_instagram_label);
        this.an.c().setImageDrawable(spotifyIconDrawable);
        this.an.c().getLayoutParams().height = n().getResources().getDimensionPixelOffset(R.dimen.std_24dp);
        this.an.c().getLayoutParams().width = n().getResources().getDimensionPixelOffset(R.dimen.std_24dp);
        viewGroup3.addView(this.an.getView());
        SpotifyIconDrawable spotifyIconDrawable2 = new SpotifyIconDrawable(n(), SpotifyIconV2.TWITTER, n().getResources().getDimension(R.dimen.social_link_icon_size));
        fqv.b();
        this.am = fsk.d(n(), listView);
        this.am.getView().setVisibility(8);
        this.am.b().setText(R.string.creator_artist_twitter_label);
        this.am.c().setImageDrawable(spotifyIconDrawable2);
        this.am.c().getLayoutParams().height = n().getResources().getDimensionPixelOffset(R.dimen.std_24dp);
        this.am.c().getLayoutParams().width = n().getResources().getDimensionPixelOffset(R.dimen.std_24dp);
        viewGroup3.addView(this.am.getView());
        SpotifyIconDrawable spotifyIconDrawable3 = new SpotifyIconDrawable(n(), SpotifyIconV2.FACEBOOK, n().getResources().getDimension(R.dimen.social_link_icon_size));
        fqv.b();
        this.al = fsk.d(n(), listView);
        this.al.getView().setVisibility(8);
        this.al.b().setText(R.string.creator_artist_facebook_label);
        this.al.c().setImageDrawable(spotifyIconDrawable3);
        this.al.c().getLayoutParams().height = n().getResources().getDimensionPixelOffset(R.dimen.std_24dp);
        this.al.c().getLayoutParams().width = n().getResources().getDimensionPixelOffset(R.dimen.std_24dp);
        viewGroup3.addView(this.al.getView());
        SpotifyIconDrawable spotifyIconDrawable4 = new SpotifyIconDrawable(n(), SpotifyIconV2.COPY, n().getResources().getDimension(R.dimen.social_link_icon_size));
        fqv.b();
        this.ak = fsk.d(n(), listView);
        this.ak.getView().setVisibility(8);
        this.ak.b().setText(R.string.creator_artist_wikipedia_label);
        this.ak.c().setImageDrawable(spotifyIconDrawable4);
        this.ak.c().getLayoutParams().height = n().getResources().getDimensionPixelOffset(R.dimen.std_24dp);
        this.ak.c().getLayoutParams().width = n().getResources().getDimensionPixelOffset(R.dimen.std_24dp);
        viewGroup3.addView(this.ak.getView());
        this.aq.a((ListAdapter) new joh(frameLayout), (String) null, ArtistBioSection.MONTHLY_LISTENERS.mSectionId);
        this.aq.a((ListAdapter) new joh(this.af), (String) null, ArtistBioSection.BIOGRAPHY.mSectionId);
        this.aq.a((ListAdapter) new joh(viewGroup2), (String) null, ArtistBioSection.AUTOBIOGRAPHY.mSectionId);
        this.aq.a((ListAdapter) new joh(viewGroup3), (String) null, ArtistBioSection.SOCIAL_LINKS.mSectionId);
        this.aq.b(new int[0]);
        listView.setAdapter(this.aq);
        return inflate;
    }

    public final /* synthetic */ void a(Parcelable parcelable) {
        CreatorAboutModel creatorAboutModel = (CreatorAboutModel) parcelable;
        this.ah = creatorAboutModel;
        this.W.a(this, creatorAboutModel.name());
        MonthlyListenersView monthlyListenersView = this.ar;
        int monthlyListeners = creatorAboutModel.monthlyListeners();
        int globalChartPosition = creatorAboutModel.globalChartPosition();
        if (globalChartPosition > 0) {
            monthlyListenersView.b.setText(MonthlyListenersView.a(globalChartPosition));
            monthlyListenersView.c.setVisibility(0);
        }
        if (monthlyListeners > 0) {
            monthlyListenersView.a.setText(NumberFormat.getInstance(Locale.getDefault()).format((long) monthlyListeners));
            monthlyListenersView.setVisibility(0);
        }
        this.aq.c(ArtistBioSection.MONTHLY_LISTENERS.mSectionId);
        this.as.a(this.ao.toString(), "about");
    }

    public final void a(Menu menu) {
        itu itu = this.a;
        if (itu.g != null && !itu.g.isEmpty()) {
            fzv.a(this, menu);
        }
    }

    public final void a(Image image) {
        ((ArtistBiographyImageView) this.ag.findViewById(R.id.biography_image_0)).a(image, this.aa);
    }

    public final void a(fzn fzn) {
        if (sei.b(fqo.a((Fragment) this)) && !this.at) {
            this.X.f(fzn, new $$Lambda$itr$Uy_4rNIBuFbx5jkNL7rzdbBMRF4(this));
        }
    }

    public final void a(String str, String str2, String str3) {
        this.ai.setText(d(str));
        this.Z.d(this.aj.c(), str2);
        this.aj.a(p().getResources().getString(R.string.posted_by, new Object[]{str3}));
        this.aq.c(ArtistBioSection.AUTOBIOGRAPHY.mSectionId);
        this.as.a(this.ao.toString(), "autobiography");
    }

    public final void a(String str, boolean z) {
        a(str, this.al, "social-facebook-link");
        this.al.getView().setVisibility(0);
        this.aq.c(ArtistBioSection.SOCIAL_LINKS.mSectionId);
    }

    public final void a(List<Image> list) {
        itx itx = new itx(this.aa);
        if (list == null) {
            Assertion.b("images passed in is null");
        } else {
            itx.a = list;
        }
        this.ac.a((a) itx);
        this.aq.c(ArtistBioSection.GALLERY.mSectionId);
        this.as.a(this.ao.toString(), "gallery");
    }

    public final void a(boolean z) {
        this.ag.setVisibility(0);
    }

    public final sso ae_() {
        return this.ap;
    }

    public final rmf af() {
        return rmf.a(PageIdentifiers.ARTIST_ABOUT, null);
    }

    public final uqm ag() {
        return uqo.G;
    }

    public final mit<CreatorAboutModel> ah() {
        itu itu = new itu(new gmp(CreatorAboutModel.class, this.ab.a().a(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false).a(), this.T, this.U.b()).resolve(new Request(Request.GET, String.format("hm://creatorabout/v0/artist/%s/about?fields=artist,listenerCount,monthlyListenerRank", new Object[]{this.ao.a}))), wit.a((xfk<T>) this.V.a), this.ao, this.as, this, new itw(this), this.at);
        this.a = itu;
        return this.a;
    }

    public final void aj() {
        itu itu = this.a;
        if (!fbo.a(itu.d) && !fbo.a(itu.a.toString())) {
            itq itq = itu.c;
            i iVar = new i(itu.a.toString(), 0, "about", null, "screenshot");
            itq.a(iVar);
        }
    }

    public final void ak() {
        if (p() != null) {
            p().invalidateOptionsMenu();
        }
    }

    public final String b(Context context) {
        return "";
    }

    public final void b(Bundle bundle) {
        super.b(bundle);
        this.at = jvi.b(n());
        this.ap = (sso) fbp.a(this.i.getParcelable("artist_uri"));
        this.ao = new ArtistUri(this.ap.toString());
        this.as = new itq(this.b);
        c(true);
    }

    public final void b(Image image) {
        ((ArtistBiographyImageView) this.ag.findViewById(R.id.biography_image_1)).a(image, this.aa);
    }

    public final void b(String str) {
        this.af.setText(d(str));
        this.aq.c(ArtistBioSection.BIOGRAPHY.mSectionId);
        this.as.a(this.ao.toString(), "biography");
    }

    public final void b(String str, boolean z) {
        a(str, this.an, "social-instagram-link");
        this.an.getView().setVisibility(0);
        this.aq.c(ArtistBioSection.SOCIAL_LINKS.mSectionId);
    }

    public final void c(String str, boolean z) {
        a(str, this.am, "social-twitter-link");
        this.am.getView().setVisibility(0);
        this.aq.c(ArtistBioSection.SOCIAL_LINKS.mSectionId);
    }

    public final void d(String str, boolean z) {
        a(str, this.ak, "social-wikipedia-link");
        this.ak.getView().setVisibility(0);
        this.aq.c(ArtistBioSection.SOCIAL_LINKS.mSectionId);
    }

    public final void z() {
        super.z();
        this.a.b.startWatching();
    }
}
