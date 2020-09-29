package defpackage;

/* renamed from: itc reason: default package */
public final class itc {
    public static String a(vkt vkt) {
        String collectionUri = vkt.getCollectionUri();
        return fbo.a(collectionUri) ? vkt.getUri() : collectionUri;
    }

    public static String a(vku vku) {
        String collectionUri = vku.getCollectionUri();
        return (vku.getNumTracksInCollection() == 0 || fbo.a(collectionUri)) ? vku.getUri() : collectionUri;
    }
}
