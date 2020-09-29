package defpackage;

import android.view.LayoutInflater;

/* renamed from: ugs reason: default package */
public final class ugs implements wig<ugr> {
    private final wzi<LayoutInflater> a;

    private ugs(wzi<LayoutInflater> wzi) {
        this.a = wzi;
    }

    public static ugs a(wzi<LayoutInflater> wzi) {
        return new ugs(wzi);
    }

    public final /* synthetic */ Object get() {
        return new ugr((LayoutInflater) this.a.get());
    }
}
