package main;

/**
 *
 * @author KhayyamS
 */
public enum Options {
    FOLD(1),
    CALL(2),
    RAISE(3),
    ALL_IN(4),
    BLUFF_RAISE(5),
    BLUFF_ALL_IN(6),
    YES(7),
    NO(8);

    public final int id;

    private Options(int id) {
        this.id = id;
    }

}
