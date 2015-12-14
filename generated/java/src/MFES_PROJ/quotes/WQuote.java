package MFES_PROJ.quotes;

import org.overture.codegen.runtime.*;

import java.util.*;


@SuppressWarnings("all")
public class WQuote {
    private static int hc = 0;
    private static WQuote instance = null;

    public WQuote() {
        if (Utils.equals(hc, 0)) {
            hc = super.hashCode();
        }
    }

    public static WQuote getInstance() {
        if (Utils.equals(instance, null)) {
            instance = new WQuote();
        }

        return instance;
    }

    public int hashCode() {
        return hc;
    }

    public boolean equals(final Object obj) {
        return obj instanceof WQuote;
    }

    public String toString() {
        return "<W>";
    }
}
