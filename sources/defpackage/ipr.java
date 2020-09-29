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

/* renamed from: ipr reason: default package */
public class ipr extends jrd implements NavigationItem, jqx, defpackage.sso.a, szs, uqq {
    public RxResolver T;
    public xil U;
    public xil V;
    public lbr W;
    private fqn X;
    private RecyclerView Y;
    private vhx Z;
    public gwm a;
    private xok aa;
    private final xij<Optional<Drawable>> ab = new xij<Optional<Drawable>>() {
        public final void onCompleted() {
        }

        public final void onError(Throwable th) {
            Logger.e(th, "Error when observing user drawable", new Object[0]);
            ipr.this.p().invalidateOptionsMenu();
        }

        public final /* synthetic */ void onNext(Object obj) {
            ipr.this.p().invalidateOptionsMenu();
        }
    };
    private OnClickListener ac = new OnClickListener() {
        private Map<Integer, a> b = ImmutableMap.g().b(Integer.valueOf(R.id.your_library_section_radio), new a() {
            public final String a() {
                ipr.this.a(kpo.a(ipr.this.p(), qbw.Z).a);
                return qbw.Z;
            }
        }).b(Integer.valueOf(R.id.your_library_section_made_for_you), new a() {
            public final String a() {
                ipr.this.a(kpo.a(ipr.this.p(), ViewUris.ao.toString()).a);
                return ViewUris.ao.toString();
            }
        }).b(Integer.valueOf(R.id.your_library_section_albums), new a() {
            public final String a() {
                ipr.this.a(kpo.a(ipr.this.p(), ipv.a).a);
                return ipv.a;
            }
        }).b(Integer.valueOf(R.id.your_library_section_songs), new a() {
            public final String a() {
                ipr.this.a(kpo.a(ipr.this.p(), iqb.a).a);
                return iqb.a;
            }
        }).b(Integer.valueOf(R.id.your_library_section_artists), new a() {
            public final String a() {
                ipr.this.a(kpo.a(ipr.this.p(), ipy.a).a);
                return ipy.a;
            }
        }).b();

        public final void onClick(View view) {
            a aVar = (a) this.b.get(Integer.valueOf(view.getId()));
            if (aVar != null) {
                String a2 = aVar.a();
                if (a2 != null) {
                    ipr.this.b.a(a2, "collection-links", InteractionType.HIT, UserIntent.NAVIGATE_FORWARD);
                }
            }
        }
    };
    public CollectionLogger b;

    /* renamed from: ipr$a */
    interface a {
        String a();
    }

    public static ipr a(fqn fqn) {
        ipr ipr = new ipr();
        fqo.a((Fragment) ipr, fqn);
        return ipr;
    }

    private void a(SpotifyIconV2 spotifyIconV2, int i, int i2) {
        View a2 = ita.a(p(), spotifyIconV2, i, true);
        a2.setId(i2);
        a2.setOnClickListener(this.ac);
        this.Z.a((androidx.recyclerview.widget.RecyclerView.a<H>) new jog<H>(a2, true), i2);
    }

    public final void A() {
        super.A();
        this.aa.unsubscribe();
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ViewGroup viewGroup2 = (ViewGroup) layoutInflater.inflate(R.layout.recycler_view_layout, viewGroup, false);
        this.X = fqo.a((Fragment) this);
        this.W.a(this, b((Context) p()));
        this.Y = (RecyclerView) viewGroup2.findViewById(16908298);
        this.Y.a((i) gxu.b(p(), this.a));
        this.Z = new vhx(true);
        a(SpotifyIconV2.MIX, (int) R.string.made_for_you_hub_title, (int) R.id.your_library_section_made_for_you);
        if (!this.X.b(url.c)) {
            a(SpotifyIconV2.RADIO, (int) R.string.collection_start_stations_title, (int) R.id.your_library_section_radio);
        }
        a(SpotifyIconV2.TRACK, (int) R.string.collection_start_songs_title, (int) R.id.your_library_section_songs);
        a(SpotifyIconV2.ALBUM, (int) R.string.collection_start_albums_title, (int) R.id.your_library_section_albums);
        a(SpotifyIconV2.ARTIST, (int) R.string.collection_start_artists_title, (int) R.id.your_library_section_artists);
        if (ute.a(this.X)) {
            this.Z.a(false, R.id.your_library_section_radio);
        }
        this.Y.a((androidx.recyclerview.widget.RecyclerView.a) this.Z);
        return viewGroup2;
    }

    public /* synthetic */ Fragment ae() {
        return CC.$default$ae(this);
    }

    public final sso ae_() {
        return ViewUris.ba;
    }

    public final rmf af() {
        return rmf.a(PageIdentifiers.COLLECTION, null);
    }

    public final uqm ag() {
        return uqo.s;
    }

    public final NavigationGroup ah() {
        return NavigationGroup.COLLECTION;
    }

    public final boolean ai() {
        return true;
    }

    public final gkq aj() {
        return PageIdentifiers.COLLECTION;
    }

    public final boolean ak() {
        this.Y.f(0);
        return true;
    }

    public final String b(Context context) {
        fqn fqn = this.X;
        return fqn != null ? context.getString(isx.a(fqn, R.string.collection_title)) : "";
    }

    public final void b(Bundle bundle) {
        super.b(bundle);
        this.X = fqo.a((Fragment) this);
        c(true);
    }

    public final void d(Bundle bundle) {
        super.d(bundle);
        this.Y.setOnCreateContextMenuListener(this);
    }

    public final String e() {
        return "collection";
    }

    public final void z() {
        super.z();
        this.aa = new xok();
        xok xok = this.aa;
        qxs a2 = qxs.a(p(), this.T, this.V, this.U);
        defpackage.hhv.a a3 = hhv.a(Optional.e(), wit.a(((hhc) gih.a(hhc.class)).a()));
        a3.a = 500;
        xok.a(a2.a().a((c<? super T, ? extends R>) a3.a()).a(this.ab));
    }
}
