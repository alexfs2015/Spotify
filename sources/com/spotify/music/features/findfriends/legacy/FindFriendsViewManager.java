package com.spotify.music.features.findfriends.legacy;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewParent;
import android.view.ViewStub;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.LinearLayout;
import android.widget.ListView;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.libs.instrumentation.performance.ViewLoadingTracker;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.SortOption;
import com.spotify.music.R;
import com.spotify.music.contentviewstate.ContentViewManager;
import com.spotify.music.contentviewstate.ContentViewManager.ContentState;
import com.spotify.music.contentviewstate.view.LoadingView;
import com.spotify.music.features.findfriends.legacy.logging.FindFriendsLogger;
import com.spotify.music.features.findfriends.legacy.logging.FindFriendsLogger.UserIntent;
import com.spotify.music.features.findfriends.legacy.model.FindFriendsModel;
import com.spotify.music.follow.FollowManager;
import com.spotify.music.libs.facebook.FacebookPlaceholderActivity;
import com.spotify.music.loggers.InteractionLogger.InteractionType;
import com.spotify.music.util.filterheader.FilterHeaderView;
import com.spotify.music.util.filterheader.FilterHeaderView.a;
import java.util.ArrayList;
import java.util.EnumMap;

public final class FindFriendsViewManager {
    public final FilterHeaderView a;
    public final View b;
    public TabType c;
    final View d;
    final View e;
    final mpm f;
    final FindFriendsLogger g;
    private final ContentViewManager h;
    private final LoadingView i;
    private final ListView j;
    private final LinearLayout k;
    private final mpl l;
    private fpt m;
    private final fuj n;
    private final ViewLoadingTracker o;
    private final EnumMap<TabType, State> p = new EnumMap<>(TabType.class);
    private final a q;
    private final OnClickListener r;
    private OnClickListener s;

    public enum State {
        INIT,
        LOADING,
        EMPTY,
        ERROR,
        OFFLINE,
        DISPLAY_SOURCES_CONNECTED,
        DISPLAY_NO_SOURCES_CONNECTED
    }

    public enum TabType {
        FRIENDS,
        FEATURED;
        
        static final TabType[] c = null;

        static {
            c = values();
        }
    }

    private State a(TabType tabType) {
        return (State) this.p.get(tabType);
    }

    private void b(TabType tabType, State state) {
        this.p.put(tabType, state);
    }

    public FindFriendsViewManager(View view, fpt fpt, FindFriendsLogger findFriendsLogger, ViewLoadingTracker viewLoadingTracker, jww jww, FollowManager followManager, spi spi) {
        View view2 = view;
        for (TabType put : TabType.c) {
            this.p.put(put, State.INIT);
        }
        this.q = new a() {
            public final void a(SortOption sortOption) {
            }

            public final void a(String str) {
                FindFriendsViewManager.this.f.getFilter().filter(str);
                FindFriendsViewManager.this.f.a = !fax.a(str);
            }

            public final void a() {
                FindFriendsViewManager.this.g.a(null, "filter-friends", InteractionType.HIT, UserIntent.FOCUS);
            }
        };
        this.r = new OnClickListener() {
            public final void onClick(View view) {
                if (view == FindFriendsViewManager.this.d) {
                    FindFriendsViewManager.this.a();
                } else if (view == FindFriendsViewManager.this.e) {
                    FindFriendsViewManager.this.b();
                } else {
                    Assertion.a("If you end up here, FindFriends tab architecture is b0rken");
                }
            }
        };
        this.s = new OnClickListener() {
            public final void onClick(View view) {
                Context context = view.getContext();
                context.startActivity(new Intent(context, FacebookPlaceholderActivity.class));
            }
        };
        fay.a(view);
        fay.a(fpt);
        Context context = view.getContext();
        this.m = fpt;
        this.g = findFriendsLogger;
        this.o = viewLoadingTracker;
        this.j = (ListView) view2.findViewById(16908298);
        a aVar = this.q;
        ListView listView = this.j;
        fay.a(context);
        fay.a(aVar);
        fay.a(listView);
        FilterHeaderView filterHeaderView = (FilterHeaderView) LayoutInflater.from(context).inflate(R.layout.header_filter, null);
        filterHeaderView.setId(R.id.findfriends_filter);
        filterHeaderView.b = aVar;
        filterHeaderView.findViewById(R.id.button_sort).setVisibility(8);
        filterHeaderView.a((int) R.string.find_friends_flow_filter);
        FilterHeaderView.a((View) listView, filterHeaderView);
        listView.setOnScrollListener(new OnScrollListener(filterHeaderView) {
            private /* synthetic */ FilterHeaderView a;

            public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
            }

            {
                this.a = r1;
            }

            public final void onScrollStateChanged(AbsListView absListView, int i) {
                this.a.a();
            }
        });
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.findfriends_source_padding);
        filterHeaderView.setPadding(filterHeaderView.getPaddingLeft(), dimensionPixelSize, filterHeaderView.getPaddingRight(), dimensionPixelSize);
        this.a = filterHeaderView;
        fay.a(context);
        Button b2 = fzz.b(context);
        b2.setId(R.id.findfriends_follow_all_button);
        b2.setSingleLine(true);
        int a2 = uts.a(48.0f, context.getResources());
        b2.setPadding(a2, 0, a2, 0);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setId(R.id.findfriends_follow_all_button_wrapper);
        LayoutParams layoutParams = new LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        int a3 = uts.a(15.0f, context.getResources());
        layoutParams.setMargins(0, a3, 0, a3);
        b2.setLayoutParams(layoutParams);
        frameLayout.addView(b2);
        this.b = frameLayout;
        this.j.addHeaderView(this.a);
        Context context2 = context;
        mpm mpm = new mpm(context2, new ArrayList(), this.m, this.b, findFriendsLogger, jww, followManager, spi);
        this.f = mpm;
        mpl mpl = new mpl(context2, new ArrayList(), this.m, findFriendsLogger, jww, followManager, spi);
        this.l = mpl;
        this.d = view2.findViewById(R.id.tab_text_friends);
        this.e = view2.findViewById(R.id.tab_text_features);
        this.d.setOnClickListener(this.r);
        this.e.setOnClickListener(this.r);
        a(true);
        this.k = (LinearLayout) view2.findViewById(R.id.unconnected_views);
        this.k.findViewById(R.id.findfriends_connect_fb_button).setOnClickListener(this.s);
        this.i = (LoadingView) view2.findViewById(R.id.loading_view);
        ViewStub viewStub = (ViewStub) view2.findViewById(R.id.empty_view);
        fqb.f();
        this.n = fum.a(viewStub);
        this.h = new ContentViewManager.a(context, this.n, new View(view.getContext())).b(SpotifyIconV2.ADDFOLLOWERS, R.string.error_general_title, R.string.find_friends_flow_empty).b(R.string.error_general_title, R.string.error_general_body).a(R.string.error_no_connection_title, R.string.follow_offline_body).a();
        a();
    }

    public final void a() {
        if (this.c != TabType.FRIENDS) {
            this.c = TabType.FRIENDS;
            a(a(TabType.FRIENDS));
            a(true);
        }
    }

    public final void b() {
        if (this.c != TabType.FEATURED) {
            this.c = TabType.FEATURED;
            a(a(TabType.FEATURED));
            a(false);
        }
    }

    private void a(boolean z) {
        this.d.setSelected(z);
        this.e.setSelected(!z);
    }

    public final void a(TabType tabType, FindFriendsModel findFriendsModel) {
        fay.a(tabType);
        if (a(findFriendsModel)) {
            a(tabType, State.EMPTY);
            return;
        }
        a(tabType, State.DISPLAY_SOURCES_CONNECTED);
        ArrayAdapter arrayAdapter = tabType == TabType.FRIENDS ? this.f : this.l;
        arrayAdapter.clear();
        arrayAdapter.addAll(findFriendsModel.getResults());
    }

    public final void a(TabType tabType, State state) {
        if (a(tabType) != state) {
            b(tabType, state);
            if (!(this.o.g() || state == State.INIT || state == State.LOADING)) {
                this.o.b();
            }
            if (this.c == tabType) {
                a(state);
            }
        }
    }

    private static boolean a(FindFriendsModel findFriendsModel) {
        return findFriendsModel == null || findFriendsModel.getResults().isEmpty();
    }

    private void c() {
        this.a.a();
        ViewParent parent = this.a.getParent();
        if (parent != null) {
            parent.clearChildFocus(this.a);
        }
    }

    private void a(State state) {
        fay.a(state);
        if (!(state == State.LOADING || state == State.INIT)) {
            this.i.setVisibility(8);
        }
        switch (state) {
            case INIT:
            case LOADING:
                d();
                this.h.b((ContentState) null);
                this.h.a(this.i);
                return;
            case EMPTY:
                d();
                this.h.b((ContentState) null);
                this.h.d(true);
                return;
            case ERROR:
                d();
                this.h.c(true);
                return;
            case DISPLAY_SOURCES_CONNECTED:
                this.k.setVisibility(8);
                c();
                this.h.b((ContentState) null);
                if (this.c == TabType.FRIENDS) {
                    if (this.j.getHeaderViewsCount() == 0) {
                        this.j.setAdapter(null);
                        this.j.addHeaderView(this.a);
                    }
                    this.j.setAdapter(this.f);
                    this.j.setSelection(1);
                    this.g.a(null, "friends-tab", InteractionType.HIT, UserIntent.NAVIGATE_FORWARD);
                } else {
                    this.j.setAdapter(null);
                    this.j.removeHeaderView(this.a);
                    this.j.setAdapter(this.l);
                    this.g.a(null, "featured-tab", InteractionType.HIT, UserIntent.NAVIGATE_FORWARD);
                }
                this.j.setVisibility(0);
                return;
            case DISPLAY_NO_SOURCES_CONNECTED:
                c();
                this.h.b((ContentState) null);
                this.k.setVisibility(0);
                this.j.setAdapter(null);
                this.j.setVisibility(8);
                return;
            case OFFLINE:
                d();
                this.h.a(true);
                return;
            default:
                Assertion.a("If you end up here, FindFriends state architecture is b0rken");
                return;
        }
    }

    private void d() {
        c();
        this.k.setVisibility(8);
        this.j.setVisibility(8);
        this.j.setAdapter(null);
    }
}
