package message;

import java.util.*;

public final class Mensaje {
    private final String emisor;
    private final String contenido;
    private final Date timestamp;

    public Mensaje(String emisor, String contenido) {
        this.emisor = Objects.requireNonNull(emisor);
        this.contenido = Objects.requireNonNull(contenido);
        this.timestamp = new Date();
    }

    public String emisor() { return emisor; }
    public String contenido() { return contenido; }
    public Date timestamp() { return new Date(timestamp.getTime()); }
}