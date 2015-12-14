package MFES_PROJ;

import org.overture.codegen.runtime.*;

import java.util.*;


@SuppressWarnings("all")
public class Airport {
    private Character id;
    private VDMSeq location;
    private Object direction;

    public Airport(final Character idA, final Number a, final Number b,
        final Object dir) {
        cg_init_Airport_1(idA, a, b, ((Object) dir));
    }

    public Airport() {
    }

    public void cg_init_Airport_1(final Character idA, final Number a,
        final Number b, final Object dir) {
        id = idA;
        location = SeqUtil.seq(a, b);
        direction = dir;

        return;
    }

    public Character getID() {
        return id;
    }

    public VDMSeq getLocation() {
        return Utils.copy(location);
    }

    public Number getX() {
        return ((Number) location.get(0));
    }

    public Number getY() {
        return ((Number) SeqUtil.tail(Utils.copy(location)).get(0));
    }

    public Object getDirection() {
        return direction;
    }

    public String toString() {
        return "Airport{" + "id := " + Utils.toString(id) + ", location := " +
        Utils.toString(location) + ", direction := " +
        Utils.toString(direction) + "}";
    }
}
