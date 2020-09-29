package defpackage;

/* renamed from: vaj reason: default package */
public final class vaj implements vai {
    private vah a;

    private vaj() {
    }

    public static vaj a() {
        return new vaj();
    }

    public final void a(vah vah) {
        this.a = vah;
    }

    public final void onSuggestionClicked(String str) {
        vah vah = this.a;
        if (vah != null) {
            vah.onSuggestionClicked(str);
        }
    }
}
