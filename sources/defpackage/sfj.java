package defpackage;

/* renamed from: sfj reason: default package */
public final class sfj implements sfi {
    public sfi a;

    public static sfj a() {
        return new sfj();
    }

    private sfj() {
    }

    public final void onSuggestionClicked(String str, String str2, int i) {
        sfi sfi = this.a;
        if (sfi != null) {
            sfi.onSuggestionClicked(str, str2, i);
        }
    }

    public final void a(String str, int i) {
        sfi sfi = this.a;
        if (sfi != null) {
            sfi.a(str, i);
        }
    }
}
