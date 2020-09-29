package defpackage;

import android.view.LayoutInflater;

/* renamed from: tup reason: default package */
public final class tup implements vua<tuo> {
    private final wlc<LayoutInflater> a;

    private tup(wlc<LayoutInflater> wlc) {
        this.a = wlc;
    }

    public static tup a(wlc<LayoutInflater> wlc) {
        return new tup(wlc);
    }

    public final /* synthetic */ Object get() {
        return new tuo((LayoutInflater) this.a.get());
    }
}
