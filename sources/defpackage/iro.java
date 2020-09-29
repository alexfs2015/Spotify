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
import java.util.List;

/* renamed from: iro reason: default package */
public class iro extends uee<CreatorAboutModel> implements fyw, irs, a {
    public RxResolver T;
    public heg U;
    public hvl V;
    public kyi W;
    public fyz X;
    public ruz Y;
    public jwv Z;
    irr a;
    public Picasso aa;
    public rnf ab;
    private CarouselView ac;
    private ExpandableEllipsizeTextView af;
    private View ag;
    private CreatorAboutModel ah;
    private TextView ai;
    private fre aj;
    private fre ak;
    private fre al;
    private fre am;
    private fre an;
    /* access modifiers changed from: private */
    public ArtistUri ao;
    private sih ap;
    private jqb aq;
    private MonthlyListenersView ar;
    /* access modifiers changed from: private */
    public irn as;
    private boolean at;
    public jjf b;

    public final String b(Context context) {
        return "";
    }

    public final /* synthetic */ void a(Parcelable parcelable) {
        CreatorAboutModel creatorAboutModel = (CreatorAboutModel) parcelable;
        this.ah = creatorAboutModel;
        this.W.a(this, creatorAboutModel.name());
        this.ar.a(creatorAboutModel.monthlyListeners(), creatorAboutModel.globalChartPosition());
        this.aq.c(ArtistBioSection.MONTHLY_LISTENERS.mSectionId);
        this.as.a(this.ao.toString(), "about");
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.creator_bio, viewGroup, false);
        ListView listView = (ListView) inflate.findViewById(16908298);
        this.aq = new jqb(p());
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
                        irr irr = iro.this.a;
                        irr.f = i;
                        irn irn = irr.c;
                        i iVar = new i(irr.a.toString(), (long) i, "gallery", null, "swipe");
                        irn.a(iVar);
                    }
                    super.a(recyclerView, sVar, i);
                }
            };
            r6.a = new uwb(n());
            this.ac.a((i) r6);
            this.ac.a((f) new uwa());
            this.aq.a((ListAdapter) new jlv(frameLayout2), (String) null, ArtistBioSection.GALLERY.mSectionId);
        }
        this.af = (ExpandableEllipsizeTextView) layoutInflater.inflate(R.layout.creatorartist_biography, listView, false);
        this.af.setMovementMethod(LinkMovementMethod.getInstance());
        uuu.b(n(), this.af, R.attr.pasteTextAppearanceArticle);
        ViewGroup viewGroup2 = (ViewGroup) layoutInflater.inflate(R.layout.autobiography, listView, false);
        this.ai = (TextView) viewGroup2.findViewById(R.id.autobiography);
        this.ai.setMovementMethod(LinkMovementMethod.getInstance());
        uuu.b(n(), this.ai, R.attr.pasteTextAppearanceArticle);
        fqb.b();
        this.aj = frq.d(n(), listView);
        View view = this.aj.getView();
        view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), n().getResources().getDimensionPixelOffset(R.dimen.std_16dp));
        viewGroup2.addView(this.aj.getView());
        ViewGroup viewGroup3 = (ViewGroup) layoutInflater.inflate(R.layout.social_links, listView, false);
        SpotifyIconDrawable spotifyIconDrawable = new SpotifyIconDrawable(n(), SpotifyIconV2.INSTAGRAM, n().getResources().getDimension(R.dimen.social_link_icon_size));
        fqb.b();
        this.an = frq.d(n(), listView);
        this.an.getView().setVisibility(8);
        this.an.b().setText(R.string.creator_artist_instagram_label);
        this.an.c().setImageDrawable(spotifyIconDrawable);
        this.an.c().getLayoutParams().height = n().getResources().getDimensionPixelOffset(R.dimen.std_24dp);
        this.an.c().getLayoutParams().width = n().getResources().getDimensionPixelOffset(R.dimen.std_24dp);
        viewGroup3.addView(this.an.getView());
        SpotifyIconDrawable spotifyIconDrawable2 = new SpotifyIconDrawable(n(), SpotifyIconV2.TWITTER, n().getResources().getDimension(R.dimen.social_link_icon_size));
        fqb.b();
        this.am = frq.d(n(), listView);
        this.am.getView().setVisibility(8);
        this.am.b().setText(R.string.creator_artist_twitter_label);
        this.am.c().setImageDrawable(spotifyIconDrawable2);
        this.am.c().getLayoutParams().height = n().getResources().getDimensionPixelOffset(R.dimen.std_24dp);
        this.am.c().getLayoutParams().width = n().getResources().getDimensionPixelOffset(R.dimen.std_24dp);
        viewGroup3.addView(this.am.getView());
        SpotifyIconDrawable spotifyIconDrawable3 = new SpotifyIconDrawable(n(), SpotifyIconV2.FACEBOOK, n().getResources().getDimension(R.dimen.social_link_icon_size));
        fqb.b();
        this.al = frq.d(n(), listView);
        this.al.getView().setVisibility(8);
        this.al.b().setText(R.string.creator_artist_facebook_label);
        this.al.c().setImageDrawable(spotifyIconDrawable3);
        this.al.c().getLayoutParams().height = n().getResources().getDimensionPixelOffset(R.dimen.std_24dp);
        this.al.c().getLayoutParams().width = n().getResources().getDimensionPixelOffset(R.dimen.std_24dp);
        viewGroup3.addView(this.al.getView());
        SpotifyIconDrawable spotifyIconDrawable4 = new SpotifyIconDrawable(n(), SpotifyIconV2.COPY, n().getResources().getDimension(R.dimen.social_link_icon_size));
        fqb.b();
        this.ak = frq.d(n(), listView);
        this.ak.getView().setVisibility(8);
        this.ak.b().setText(R.string.creator_artist_wikipedia_label);
        this.ak.c().setImageDrawable(spotifyIconDrawable4);
        this.ak.c().getLayoutParams().height = n().getResources().getDimensionPixelOffset(R.dimen.std_24dp);
        this.ak.c().getLayoutParams().width = n().getResources().getDimensionPixelOffset(R.dimen.std_24dp);
        viewGroup3.addView(this.ak.getView());
        this.aq.a((ListAdapter) new jlv(frameLayout), (String) null, ArtistBioSection.MONTHLY_LISTENERS.mSectionId);
        this.aq.a((ListAdapter) new jlv(this.af), (String) null, ArtistBioSection.BIOGRAPHY.mSectionId);
        this.aq.a((ListAdapter) new jlv(viewGroup2), (String) null, ArtistBioSection.AUTOBIOGRAPHY.mSectionId);
        this.aq.a((ListAdapter) new jlv(viewGroup3), (String) null, ArtistBioSection.SOCIAL_LINKS.mSectionId);
        this.aq.b(new int[0]);
        listView.setAdapter(this.aq);
        return inflate;
    }

    public final void b(Bundle bundle) {
        super.b(bundle);
        this.at = jtc.b(n());
        this.ap = (sih) fay.a(this.i.getParcelable("artist_uri"));
        this.ao = new ArtistUri(this.ap.toString());
        this.as = new irn(this.b);
        c(true);
    }

    public final void z() {
        super.z();
        this.a.b.startWatching();
    }

    public final void A() {
        super.A();
        this.a.b.stopWatching();
    }

    public final void a(boolean z) {
        this.ag.setVisibility(0);
    }

    public final void a(String str, boolean z) {
        a(str, this.al, "social-facebook-link");
        this.al.getView().setVisibility(0);
        this.aq.c(ArtistBioSection.SOCIAL_LINKS.mSectionId);
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

    private void a(final String str, fre fre, final String str2) {
        fre.getView().setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                iro.this.n().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
                irn b2 = iro.this.as;
                i iVar = new i(iro.this.ao.toString(), 0, str2, str, "click");
                b2.a(iVar);
            }
        });
    }

    public final void a(Image image) {
        ((ArtistBiographyImageView) this.ag.findViewById(R.id.biography_image_0)).a(image, this.aa);
    }

    public final void b(Image image) {
        ((ArtistBiographyImageView) this.ag.findViewById(R.id.biography_image_1)).a(image, this.aa);
    }

    public final void a(List<Image> list) {
        iru iru = new iru(this.aa);
        if (list == null) {
            Assertion.b("images passed in is null");
        } else {
            iru.a = list;
        }
        this.ac.a((a) iru);
        this.aq.c(ArtistBioSection.GALLERY.mSectionId);
        this.as.a(this.ao.toString(), "gallery");
    }

    private static CharSequence d(String str) {
        Spannable spannable = (Spannable) jrw.a(str);
        jrx.a(spannable, null);
        return spannable;
    }

    public final void b(String str) {
        this.af.setText(d(str));
        this.aq.c(ArtistBioSection.BIOGRAPHY.mSectionId);
        this.as.a(this.ao.toString(), "biography");
    }

    public final void a(String str, String str2, String str3) {
        this.ai.setText(d(str));
        this.Z.d(this.aj.c(), str2);
        this.aj.a(p().getResources().getString(R.string.posted_by, new Object[]{str3}));
        this.aq.c(ArtistBioSection.AUTOBIOGRAPHY.mSectionId);
        this.as.a(this.ao.toString(), "autobiography");
    }

    public final uef<CreatorAboutModel> ah() {
        irr irr = new irr(new glb(CreatorAboutModel.class, this.ab.a().a(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false).a(), this.T, this.U.b()).resolve(new Request(Request.GET, String.format("hm://creatorabout/v0/artist/%s/about?fields=artist,listenerCount,monthlyListenerRank", new Object[]{this.ao.a}))), vun.a((wrf<T>) this.V.a), this.ao, this.as, this, new irt(this), this.at);
        this.a = irr;
        return this.a;
    }

    public final udr ag() {
        return udt.G;
    }

    public final rdh af() {
        return rdh.a(PageIdentifiers.ARTIST_ABOUT, null);
    }

    public static iro c(String str) {
        fay.a(str);
        sih a2 = ViewUris.aK.a(str);
        iro iro = new iro();
        Bundle bundle = new Bundle();
        bundle.putParcelable("artist_uri", a2);
        iro.g(bundle);
        return iro;
    }

    public final sih ae_() {
        return this.ap;
    }

    public final void aj() {
        irr irr = this.a;
        if (!fax.a(irr.d) && !fax.a(irr.a.toString())) {
            irn irn = irr.c;
            i iVar = new i(irr.a.toString(), 0, "about", null, "screenshot");
            irn.a(iVar);
        }
    }

    public final void ak() {
        if (p() != null) {
            p().invalidateOptionsMenu();
        }
    }

    public final void a(Menu menu) {
        irr irr = this.a;
        if (irr.g != null && !irr.g.isEmpty()) {
            fzb.a(this, menu);
        }
    }

    public final void a(fyt fyt) {
        if (ruy.b(fpu.a((Fragment) this)) && !this.at) {
            this.X.f(fyt, new $$Lambda$iro$Dm9XFAlgKq3y1gQXjyBbhEwVVEU(this));
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void ao() {
        ImmutableList immutableList;
        ruz ruz = this.Y;
        sih sih = this.ap;
        ArtistUri artistUri = this.ao;
        Type type = Type.ARTIST;
        StringBuilder sb = new StringBuilder();
        sb.append(artistUri.b);
        sb.append(type.mSuffix);
        String sb2 = sb.toString();
        irr irr = this.a;
        if (irr.e || irr.g.isEmpty()) {
            immutableList = ImmutableList.d();
        } else {
            ImageModel imageModel = (ImageModel) irr.g.get(irr.f);
            immutableList = imageModel.getModerationUri() == null ? ImmutableList.d() : ImmutableList.a(imageModel.getModerationUri());
        }
        ruz.a(sih, sb2, immutableList);
    }
}
