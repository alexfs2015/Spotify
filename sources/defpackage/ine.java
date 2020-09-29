package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.i;
import com.google.common.base.Optional;
import com.google.common.collect.ImmutableMap;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.base.java.logging.Logger;
import com.spotify.cosmos.android.RxResolver;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.mobile.android.spotlets.collection.logging.CollectionLogger;
import com.spotify.mobile.android.spotlets.collection.logging.CollectionLogger.UserIntent;
import com.spotify.music.R;
import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.music.loggers.InteractionLogger.InteractionType;
import com.spotify.music.navigation.NavigationItem;
import com.spotify.music.navigation.NavigationItem.NavigationGroup;
import java.util.Map;

/* renamed from: ine reason: default package */
public class ine extends jor implements NavigationItem, jol, defpackage.sih.a, spl, udv {
    public RxResolver T;
    public wug U;
    public wug V;
    public kyi W;
    private fpt X;
    private RecyclerView Y;
    private uwh Z;
    public gum a;
    private xag aa;
    private final wue<Optional<Drawable>> ab = new wue<Optional<Drawable>>() {
        public final void onCompleted() {
        }

        public final void onError(Throwable th) {
            Logger.e(th, "Error when observing user drawable", new Object[0]);
            ine.this.p().invalidateOptionsMenu();
        }

        public final /* synthetic */ void onNext(Object obj) {
            ine.this.p().invalidateOptionsMenu();
        }
    };
    private OnClickListener ac = new OnClickListener() {
        private Map<Integer, a> b = ImmutableMap.g().b(Integer.valueOf(R.id.your_library_section_radio), new a() {
            public final String a() {
                ine.this.a(kmf.a(ine.this.p(), pta.Z).a);
                return pta.Z;
            }
        }).b(Integer.valueOf(R.id.your_library_section_made_for_you), new a() {
            public final String a() {
                ine.this.a(kmf.a(ine.this.p(), ViewUris.ap.toString()).a);
                return ViewUris.ap.toString();
            }
        }).b(Integer.valueOf(R.id.your_library_section_albums), new a() {
            public final String a() {
                ine.this.a(kmf.a(ine.this.p(), ini.a).a);
                return ini.a;
            }
        }).b(Integer.valueOf(R.id.your_library_section_songs), new a() {
            public final String a() {
                ine.this.a(kmf.a(ine.this.p(), ino.a).a);
                return ino.a;
            }
        }).b(Integer.valueOf(R.id.your_library_section_artists), new a() {
            public final String a() {
                ine.this.a(kmf.a(ine.this.p(), inl.a).a);
                return inl.a;
            }
        }).b();

        public final void onClick(View view) {
            a aVar = (a) this.b.get(Integer.valueOf(view.getId()));
            if (aVar != null) {
                String a2 = aVar.a();
                if (a2 != null) {
                    ine.this.b.a(a2, "collection-links", InteractionType.HIT, UserIntent.NAVIGATE_FORWARD);
                }
            }
        }
    };
    public CollectionLogger b;

    /* renamed from: ine$a */
    interface a {
        String a();
    }

    public /* synthetic */ Fragment ae() {
        return CC.$default$ae(this);
    }

    public final boolean ai() {
        return true;
    }

    public final String e() {
        return "collection";
    }

    public static ine a(fpt fpt) {
        ine ine = new ine();
        fpu.a((Fragment) ine, fpt);
        return ine;
    }

    public final void b(Bundle bundle) {
        super.b(bundle);
        this.X = fpu.a((Fragment) this);
        c(true);
    }

    public final void z() {
        super.z();
        this.aa = new xag();
        xag xag = this.aa;
        qpj a2 = qpj.a(p(), this.T, this.V, this.U);
        defpackage.hez.a a3 = hez.a(Optional.e(), vun.a(((heg) ggw.a(heg.class)).a()));
        a3.a = 500;
        xag.a(a2.a().a((c<? super T, ? extends R>) a3.a()).a(this.ab));
    }

    public final void A() {
        super.A();
        this.aa.unsubscribe();
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ViewGroup viewGroup2 = (ViewGroup) layoutInflater.inflate(R.layout.recycler_view_layout, viewGroup, false);
        this.X = fpu.a((Fragment) this);
        this.W.a(this, b((Context) p()));
        this.Y = (RecyclerView) viewGroup2.findViewById(16908298);
        this.Y.a((i) gvt.b(p(), this.a));
        this.Z = new uwh(true);
        a(SpotifyIconV2.MIX, (int) R.string.made_for_you_hub_title, (int) R.id.your_library_section_made_for_you);
        if (!this.X.b(ufx.c)) {
            a(SpotifyIconV2.RADIO, (int) R.string.collection_start_stations_title, (int) R.id.your_library_section_radio);
        }
        a(SpotifyIconV2.TRACK, (int) R.string.collection_start_songs_title, (int) R.id.your_library_section_songs);
        a(SpotifyIconV2.ALBUM, (int) R.string.collection_start_albums_title, (int) R.id.your_library_section_albums);
        a(SpotifyIconV2.ARTIST, (int) R.string.collection_start_artists_title, (int) R.id.your_library_section_artists);
        if (uhq.a(this.X)) {
            this.Z.a(false, R.id.your_library_section_radio);
        }
        this.Y.a((androidx.recyclerview.widget.RecyclerView.a) this.Z);
        return viewGroup2;
    }

    public final void d(Bundle bundle) {
        super.d(bundle);
        this.Y.setOnCreateContextMenuListener(this);
    }

    private void a(SpotifyIconV2 spotifyIconV2, int i, int i2) {
        View a2 = iqn.a(p(), spotifyIconV2, i, true);
        a2.setId(i2);
        a2.setOnClickListener(this.ac);
        this.Z.a((androidx.recyclerview.widget.RecyclerView.a<H>) new jlu<H>(a2, true), i2);
    }

    public final sih ae_() {
        return ViewUris.bb;
    }

    public final gjf aj() {
        return PageIdentifiers.COLLECTION;
    }

    public final String b(Context context) {
        fpt fpt = this.X;
        return fpt != null ? context.getString(iqk.a(fpt, R.string.collection_title)) : "";
    }

    public final udr ag() {
        return udt.s;
    }

    public final rdh af() {
        return rdh.a(PageIdentifiers.COLLECTION, null);
    }

    public final NavigationGroup ah() {
        return NavigationGroup.COLLECTION;
    }

    public final boolean ak() {
        this.Y.f(0);
        return true;
    }
}
