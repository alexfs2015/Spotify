package defpackage;

/* renamed from: iqp reason: default package */
public final class iqp {
    public static String a(uyq uyq) {
        String collectionUri = uyq.getCollectionUri();
        return fax.a(collectionUri) ? uyq.getUri() : collectionUri;
    }

    public static String a(uyr uyr) {
        String collectionUri = uyr.getCollectionUri();
        return (uyr.getNumTracksInCollection() == 0 || fax.a(collectionUri)) ? uyr.getUri() : collectionUri;
    }
}
