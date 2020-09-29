package defpackage;

/* renamed from: aed reason: default package */
public final class aed extends adb implements afn {
    private final adn c;
    private final adn d;
    private final afc e = ((afc[]) afv.a(this.c, afc.class, 1))[0];

    public aed(acc acc, acd acd) {
        super(acc, acd);
        String str = "%s:%d";
        this.c = new adn(String.format(str, new Object[]{this.b, Integer.valueOf(0)}));
        this.d = new adn(String.format(str, new Object[]{this.b, Integer.valueOf(1)}));
    }
}
