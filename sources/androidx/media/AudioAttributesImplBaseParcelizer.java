package androidx.media;

public class AudioAttributesImplBaseParcelizer {
    public static AudioAttributesImplBase read(sc scVar) {
        AudioAttributesImplBase audioAttributesImplBase = new AudioAttributesImplBase();
        audioAttributesImplBase.a = scVar.b(audioAttributesImplBase.a, 1);
        audioAttributesImplBase.b = scVar.b(audioAttributesImplBase.b, 2);
        audioAttributesImplBase.c = scVar.b(audioAttributesImplBase.c, 3);
        audioAttributesImplBase.d = scVar.b(audioAttributesImplBase.d, 4);
        return audioAttributesImplBase;
    }

    public static void write(AudioAttributesImplBase audioAttributesImplBase, sc scVar) {
        scVar.a(audioAttributesImplBase.a, 1);
        scVar.a(audioAttributesImplBase.b, 2);
        scVar.a(audioAttributesImplBase.c, 3);
        scVar.a(audioAttributesImplBase.d, 4);
    }
}
