package com.spotify.music.contentviewstate;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.music.contentviewstate.view.ContentFrameLayout;
import com.spotify.music.contentviewstate.view.LoadingView;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

public final class ContentViewManager {
    private final Map<ContentState, c> a;
    private final PriorityQueue<c> b;
    private final fuj c;
    private final View d;
    private final Context e;
    private final b f;
    private LoadingView g;
    private c h;

    public enum ContentState {
        NO_NETWORK(Integer.MAX_VALUE),
        SERVICE_ERROR(2147483646),
        SERVICE_WARNING(2147483645),
        EMPTY_CONTENT(2147483644);
        
        public static final ContentState[] e = null;
        final int mPriority;

        static {
            e = values();
        }

        private ContentState(int i) {
            this.mPriority = i;
        }
    }

    static class StateDateComparator implements Serializable, Comparator<c> {
        private static final long serialVersionUID = -3812187713254980877L;

        private StateDateComparator() {
        }

        /* synthetic */ StateDateComparator(byte b) {
            this();
        }

        public /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
            return ((c) obj2).a.mPriority - ((c) obj).a.mPriority;
        }
    }

    public static class a {
        public b a;
        private final List<c> b;
        private final Context c;
        private final fuj d;
        private final View e;

        public a(Context context, fuj fuj, View view) {
            this.b = new ArrayList();
            this.c = context;
            this.d = fuj;
            this.e = view;
        }

        public final a a(int i, int i2) {
            a(ContentState.NO_NETWORK);
            List<c> list = this.b;
            c cVar = new c(ContentState.NO_NETWORK, SpotifyIconV2.OFFLINE, i, i2, 0);
            list.add(cVar);
            return this;
        }

        public final a b(int i, int i2) {
            a(ContentState.SERVICE_ERROR);
            List<c> list = this.b;
            c cVar = new c(ContentState.SERVICE_ERROR, SpotifyIconV2.WARNING, i, i2, 0);
            list.add(cVar);
            return this;
        }

        public final a a(SpotifyIconV2 spotifyIconV2, int i, int i2) {
            a(ContentState.SERVICE_WARNING);
            List<c> list = this.b;
            c cVar = new c(ContentState.SERVICE_WARNING, spotifyIconV2, i, i2, 0);
            list.add(cVar);
            return this;
        }

        public final a b(SpotifyIconV2 spotifyIconV2, int i, int i2) {
            a(ContentState.EMPTY_CONTENT);
            List<c> list = this.b;
            c cVar = new c(ContentState.EMPTY_CONTENT, spotifyIconV2, i, i2, 0);
            list.add(cVar);
            return this;
        }

        private void a(ContentState contentState) {
            for (c cVar : this.b) {
                Assertion.b((Object) contentState, (Object) cVar.a);
            }
        }

        public final ContentViewManager a() {
            ContentViewManager contentViewManager = new ContentViewManager(this.c, this.d, this.e, this.a, 0);
            for (c a2 : this.b) {
                contentViewManager.a.put(a2.a, a2);
            }
            return contentViewManager;
        }

        public a(Context context, ContentFrameLayout<View> contentFrameLayout) {
            this(context, contentFrameLayout.a, contentFrameLayout.c);
        }
    }

    public interface b {
        void a(fuj fuj, ContentState contentState);
    }

    static class c {
        public final ContentState a;
        public final int b;
        public final int c;
        private final SpotifyIconV2 d;
        private WeakReference<Drawable> e;

        /* synthetic */ c(ContentState contentState, SpotifyIconV2 spotifyIconV2, int i, int i2, byte b2) {
            this(contentState, spotifyIconV2, i, i2);
        }

        private c(ContentState contentState, SpotifyIconV2 spotifyIconV2, int i, int i2) {
            this.e = new WeakReference<>(null);
            this.a = contentState;
            this.d = spotifyIconV2;
            this.b = i;
            this.c = i2;
        }

        public final Drawable a(Context context) {
            Drawable drawable = (Drawable) this.e.get();
            if (drawable != null) {
                return drawable;
            }
            Drawable b2 = fzg.b(context, this.d, Float.NaN, true, true, (float) uts.b(32.0f, context.getResources()));
            this.e = new WeakReference<>(b2);
            return b2;
        }

        public final int hashCode() {
            return this.a.mPriority;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof c) || ((c) obj).a.mPriority != this.a.mPriority) {
                return false;
            }
            return true;
        }
    }

    /* synthetic */ ContentViewManager(Context context, fuj fuj, View view, b bVar, byte b2) {
        this(context, fuj, view, bVar);
    }

    private ContentViewManager(Context context, fuj fuj, View view, b bVar) {
        this.a = new EnumMap(ContentState.class);
        this.b = new PriorityQueue<>(ContentState.e.length, new StateDateComparator(0));
        this.e = context;
        this.c = fuj;
        this.d = view;
        this.f = bVar;
        this.c.getView().setVisibility(8);
        this.d.setVisibility(8);
    }

    public final boolean a(ContentState contentState) {
        return this.a.containsKey(contentState);
    }

    private c c(ContentState contentState) {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            c cVar = (c) it.next();
            if (cVar.a == contentState) {
                return cVar;
            }
        }
        return null;
    }

    private void a() {
        if (this.h == null) {
            this.c.getView().setVisibility(8);
            this.d.setVisibility(0);
        } else {
            fuk a2 = this.c.a();
            jtc.b(this.e);
            a2.a(this.h.a(this.e));
            this.c.a(this.e.getText(this.h.b));
            this.c.b(this.e.getText(this.h.c));
            this.c.getView().setVisibility(0);
            this.d.setVisibility(8);
            b bVar = this.f;
            if (bVar != null) {
                bVar.a(this.c, this.h.a);
            }
        }
        LoadingView loadingView = this.g;
        if (loadingView != null) {
            if (loadingView.d()) {
                View b2 = b();
                if (b2 != null) {
                    b2.setVisibility(8);
                    LoadingView loadingView2 = this.g;
                    loadingView2.a = new kyv(loadingView2.getContext(), b2);
                }
                LoadingView loadingView3 = this.g;
                loadingView3.c = b2;
                loadingView3.b();
            }
            this.g = null;
        }
    }

    private View b() {
        if (this.c.getView().getVisibility() == 0) {
            return this.c.getView();
        }
        if (this.d.getVisibility() == 0) {
            return this.d;
        }
        return null;
    }

    public final void a(boolean z) {
        a(ContentState.NO_NETWORK, z);
    }

    public final void b(boolean z) {
        a(ContentState.SERVICE_WARNING, z);
    }

    public final void c(boolean z) {
        a(ContentState.SERVICE_ERROR, true);
    }

    public final void d(boolean z) {
        a(ContentState.EMPTY_CONTENT, true);
    }

    private ContentState c() {
        c cVar = this.h;
        if (cVar == null) {
            return null;
        }
        return cVar.a;
    }

    private void a(ContentState contentState, boolean z) {
        jrh.b("Not called on main looper");
        if (!this.a.containsKey(contentState)) {
            Assertion.b(String.format("You can not set to a state(%s). Set the state among configured(%s)", new Object[]{contentState.name(), this.a.keySet().toString()}));
            return;
        }
        if (z) {
            if (c(contentState) == null) {
                this.b.add(this.a.get(contentState));
            }
            if (c() == contentState) {
                return;
            }
        } else {
            c c2 = c(contentState);
            if (c2 != null) {
                this.b.remove(c2);
                if (c() != contentState) {
                    return;
                }
            }
        }
        this.h = (c) this.b.peek();
        a();
    }

    public final void b(ContentState contentState) {
        jrh.b("Not called on main looper");
        this.b.clear();
        if (contentState != null) {
            a(contentState, true);
            return;
        }
        this.h = null;
        a();
    }

    public final void a(LoadingView loadingView) {
        jrh.b("Not called on main looper");
        this.g = loadingView;
        this.g.c();
        this.g.c = b();
        this.c.getView().setVisibility(8);
        this.d.setVisibility(8);
        this.g.a();
    }
}
