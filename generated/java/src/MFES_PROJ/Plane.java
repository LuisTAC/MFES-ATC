package MFES_PROJ;

import org.overture.codegen.runtime.*;

import java.util.*;


@SuppressWarnings("all")
public class Plane {
    private Character id;
    private VDMSeq location;
    private VDMSeq destination;
    private Number max_speed;
    private Number speed;
    private Object direction;
    private Boolean achvdGoal = false;

    public Plane(final Character chr, final Number loc_x, final Number loc_y,
        final Number dest_x, final Number dest_y, final Number max,
        final Number speed_init, final Object dir) {
        cg_init_Plane_1(chr, loc_x, loc_y, dest_x, dest_y, max, speed_init,
            ((Object) dir));
    }

    public Plane() {
    }

    public void cg_init_Plane_1(final Character chr, final Number loc_x,
        final Number loc_y, final Number dest_x, final Number dest_y,
        final Number max, final Number speed_init, final Object dir) {
        id = chr;
        location = SeqUtil.seq(loc_x, loc_y);
        destination = SeqUtil.seq(dest_x, dest_y);
        max_speed = max;
        speed = speed_init;
        direction = dir;

        return;
    }

    public Object getDirection() {
        return direction;
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

    public VDMSeq getDestination() {
        return Utils.copy(destination);
    }

    public Number getDestX() {
        return ((Number) destination.get(0));
    }

    public Number getDestY() {
        return ((Number) SeqUtil.tail(Utils.copy(destination)).get(0));
    }

    public Number getMaxSpeed() {
        return max_speed;
    }

    public Number getSpeed() {
        return speed;
    }

    public Boolean getAchvd() {
        return achvdGoal;
    }

    public void rotCW() {
        Object quotePattern_1 = direction;
        Boolean success_1 = Utils.equals(quotePattern_1,
                MFES_PROJ.quotes.NQuote.getInstance());

        if (!(success_1)) {
            Object quotePattern_2 = direction;
            success_1 = Utils.equals(quotePattern_2,
                    MFES_PROJ.quotes.NEQuote.getInstance());

            if (!(success_1)) {
                Object quotePattern_3 = direction;
                success_1 = Utils.equals(quotePattern_3,
                        MFES_PROJ.quotes.EQuote.getInstance());

                if (!(success_1)) {
                    Object quotePattern_4 = direction;
                    success_1 = Utils.equals(quotePattern_4,
                            MFES_PROJ.quotes.SEQuote.getInstance());

                    if (!(success_1)) {
                        Object quotePattern_5 = direction;
                        success_1 = Utils.equals(quotePattern_5,
                                MFES_PROJ.quotes.SQuote.getInstance());

                        if (!(success_1)) {
                            Object quotePattern_6 = direction;
                            success_1 = Utils.equals(quotePattern_6,
                                    MFES_PROJ.quotes.SWQuote.getInstance());

                            if (!(success_1)) {
                                Object quotePattern_7 = direction;
                                success_1 = Utils.equals(quotePattern_7,
                                        MFES_PROJ.quotes.WQuote.getInstance());

                                if (!(success_1)) {
                                    Object quotePattern_8 = direction;
                                    success_1 = Utils.equals(quotePattern_8,
                                            MFES_PROJ.quotes.NWQuote.getInstance());

                                    if (success_1) {
                                        direction = MFES_PROJ.quotes.NQuote.getInstance();
                                    }
                                } else {
                                    direction = MFES_PROJ.quotes.NWQuote.getInstance();
                                }
                            } else {
                                direction = MFES_PROJ.quotes.WQuote.getInstance();
                            }
                        } else {
                            direction = MFES_PROJ.quotes.SWQuote.getInstance();
                        }
                    } else {
                        direction = MFES_PROJ.quotes.SQuote.getInstance();
                    }
                } else {
                    direction = MFES_PROJ.quotes.SEQuote.getInstance();
                }
            } else {
                direction = MFES_PROJ.quotes.EQuote.getInstance();
            }
        } else {
            direction = MFES_PROJ.quotes.NEQuote.getInstance();
        }
    }

    public void rotCCW() {
        Object quotePattern_9 = direction;
        Boolean success_2 = Utils.equals(quotePattern_9,
                MFES_PROJ.quotes.NQuote.getInstance());

        if (!(success_2)) {
            Object quotePattern_10 = direction;
            success_2 = Utils.equals(quotePattern_10,
                    MFES_PROJ.quotes.NWQuote.getInstance());

            if (!(success_2)) {
                Object quotePattern_11 = direction;
                success_2 = Utils.equals(quotePattern_11,
                        MFES_PROJ.quotes.WQuote.getInstance());

                if (!(success_2)) {
                    Object quotePattern_12 = direction;
                    success_2 = Utils.equals(quotePattern_12,
                            MFES_PROJ.quotes.SWQuote.getInstance());

                    if (!(success_2)) {
                        Object quotePattern_13 = direction;
                        success_2 = Utils.equals(quotePattern_13,
                                MFES_PROJ.quotes.SQuote.getInstance());

                        if (!(success_2)) {
                            Object quotePattern_14 = direction;
                            success_2 = Utils.equals(quotePattern_14,
                                    MFES_PROJ.quotes.SEQuote.getInstance());

                            if (!(success_2)) {
                                Object quotePattern_15 = direction;
                                success_2 = Utils.equals(quotePattern_15,
                                        MFES_PROJ.quotes.EQuote.getInstance());

                                if (!(success_2)) {
                                    Object quotePattern_16 = direction;
                                    success_2 = Utils.equals(quotePattern_16,
                                            MFES_PROJ.quotes.NEQuote.getInstance());

                                    if (success_2) {
                                        direction = MFES_PROJ.quotes.NQuote.getInstance();
                                    }
                                } else {
                                    direction = MFES_PROJ.quotes.NEQuote.getInstance();
                                }
                            } else {
                                direction = MFES_PROJ.quotes.EQuote.getInstance();
                            }
                        } else {
                            direction = MFES_PROJ.quotes.SEQuote.getInstance();
                        }
                    } else {
                        direction = MFES_PROJ.quotes.SQuote.getInstance();
                    }
                } else {
                    direction = MFES_PROJ.quotes.SWQuote.getInstance();
                }
            } else {
                direction = MFES_PROJ.quotes.WQuote.getInstance();
            }
        } else {
            direction = MFES_PROJ.quotes.NWQuote.getInstance();
        }
    }

    public void move() {
        Object quotePattern_17 = direction;
        Boolean success_3 = Utils.equals(quotePattern_17,
                MFES_PROJ.quotes.NQuote.getInstance());

        if (!(success_3)) {
            Object quotePattern_18 = direction;
            success_3 = Utils.equals(quotePattern_18,
                    MFES_PROJ.quotes.NEQuote.getInstance());

            if (!(success_3)) {
                Object quotePattern_19 = direction;
                success_3 = Utils.equals(quotePattern_19,
                        MFES_PROJ.quotes.EQuote.getInstance());

                if (!(success_3)) {
                    Object quotePattern_20 = direction;
                    success_3 = Utils.equals(quotePattern_20,
                            MFES_PROJ.quotes.SEQuote.getInstance());

                    if (!(success_3)) {
                        Object quotePattern_21 = direction;
                        success_3 = Utils.equals(quotePattern_21,
                                MFES_PROJ.quotes.SQuote.getInstance());

                        if (!(success_3)) {
                            Object quotePattern_22 = direction;
                            success_3 = Utils.equals(quotePattern_22,
                                    MFES_PROJ.quotes.SWQuote.getInstance());

                            if (!(success_3)) {
                                Object quotePattern_23 = direction;
                                success_3 = Utils.equals(quotePattern_23,
                                        MFES_PROJ.quotes.WQuote.getInstance());

                                if (!(success_3)) {
                                    Object quotePattern_24 = direction;
                                    success_3 = Utils.equals(quotePattern_24,
                                            MFES_PROJ.quotes.NWQuote.getInstance());

                                    if (success_3) {
                                        location = SeqUtil.seq(((Number) location.get(
                                                    0)).longValue() - 1L,
                                                ((Number) SeqUtil.tail(
                                                    Utils.copy(location)).get(0)).longValue() -
                                                1L);
                                    }
                                } else {
                                    location = SeqUtil.seq(((Number) location.get(
                                                0)).longValue() - 1L,
                                            ((Number) SeqUtil.tail(Utils.copy(
                                                    location)).get(0)));
                                }
                            } else {
                                location = SeqUtil.seq(((Number) location.get(0)).longValue() -
                                        1L,
                                        ((Number) SeqUtil.tail(Utils.copy(
                                                location)).get(0)).longValue() +
                                        1L);
                            }
                        } else {
                            location = SeqUtil.seq(((Number) location.get(0)),
                                    ((Number) SeqUtil.tail(Utils.copy(location))
                                                     .get(0)).longValue() + 1L);
                        }
                    } else {
                        location = SeqUtil.seq(((Number) location.get(0)).longValue() +
                                1L,
                                ((Number) SeqUtil.tail(Utils.copy(location))
                                                 .get(0)).longValue() + 1L);
                    }
                } else {
                    location = SeqUtil.seq(((Number) location.get(0)).longValue() +
                            1L,
                            ((Number) SeqUtil.tail(Utils.copy(location)).get(0)));
                }
            } else {
                location = SeqUtil.seq(((Number) location.get(0)).longValue() +
                        1L,
                        ((Number) SeqUtil.tail(Utils.copy(location)).get(0)).longValue() -
                        1L);
            }
        } else {
            location = SeqUtil.seq(((Number) location.get(0)),
                    ((Number) SeqUtil.tail(Utils.copy(location)).get(0)).longValue() -
                    1L);
        }

        checkGoal();
    }

    public void checkGoal() {
        Boolean andResult_14 = false;

        if (Utils.equals(((Number) location.get(0)),
                    ((Number) destination.get(0)))) {
            if (Utils.equals(
                        ((Number) SeqUtil.tail(Utils.copy(location)).get(0)),
                        ((Number) SeqUtil.tail(Utils.copy(destination)).get(0)))) {
                andResult_14 = true;
            }
        }

        achvdGoal = andResult_14;
    }

    public void setDest(final Number a, final Number b) {
        destination = SeqUtil.seq(a, b);
    }

    public String toString() {
        return "Plane{" + "id := " + Utils.toString(id) + ", location := " +
        Utils.toString(location) + ", destination := " +
        Utils.toString(destination) + ", max_speed := " +
        Utils.toString(max_speed) + ", speed := " + Utils.toString(speed) +
        ", direction := " + Utils.toString(direction) + ", achvdGoal := " +
        Utils.toString(achvdGoal) + "}";
    }
}
