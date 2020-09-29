package defpackage;

/* renamed from: upe reason: default package */
public final class upe implements upd {
    private upc a;

    public static upe a() {
        return new upe();
    }

    private upe() {
    }

    public final void a(upc upc) {
        this.a = upc;
    }

    public final void onSuggestionClicked(String str) {
        upc upc = this.a;
        if (upc != null) {
            upc.onSuggestionClicked(str);
        }
    }
}
